plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
    signing // Required for Maven Central
}

group = "com.scailo"

// --- DYNAMIC VERSIONING LOGIC ---
// 1. Check if we're in GitHub Actions (GITHUB_REF_NAME is set on tags)
// 2. Otherwise, check for a project property (-Pversion=...)
// 3. Default to a local-only SNAPSHOT
version = System.getenv("GITHUB_REF_NAME")?.removePrefix("v") 
          ?: project.findProperty("version")?.toString() 
          ?: "0.0.1-SNAPSHOT"

java {
    // 2. Maven Central requires these two extra JARs
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    val grpcVersion = "1.60.0"

    api("com.google.protobuf:protobuf-kotlin:4.29.3")
    api("com.google.protobuf:protobuf-java:4.29.3")

    // gRPC
    api("io.grpc:grpc-kotlin-stub:1.4.1")
    api("io.grpc:grpc-protobuf:$grpcVersion")
    api("io.grpc:grpc-stub:$grpcVersion")
    api("io.grpc:grpc-api:$grpcVersion")

    implementation("build.buf:protovalidate:1.1.0")    
    implementation("javax.annotation:javax.annotation-api:1.3.2")
}

sourceSets {
    main {
        kotlin { srcDirs("src/main/java") }
        java { srcDirs("src/main/java") }
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "scailo-sdk"

            // 3. Mandatory POM Metadata
            pom {
                name.set("Scailo Java SDK")
                description.set("Official Java SDK for the Scailo Platform.")
                url.set("https://scailo.com")
                
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("scailo")
                        name.set("Scailo Engineering")
                        email.set("engineering@scailo.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/scailo/java-sdk.git")
                    developerConnection.set("scm:git:ssh://github.com:scailo/java-sdk.git")
                    url.set("https://github.com/scailo/java-sdk")
                }
            }
        }
    }

    // 4. Point to the modern Central Portal
    repositories {
        maven {
            name = "CentralPortal"
            url = uri("https://central.sonatype.com/api/v1/publisher/deployments/maven")
            credentials {
                username = System.getenv("CENTRAL_USERNAME")
                password = System.getenv("CENTRAL_PASSWORD")
            }
        }
    }
}

// 5. Signing configuration for automation
signing {
    val signingKey = System.getenv("GPG_PRIVATE_KEY")
    val signingPassword = System.getenv("GPG_PASSPHRASE")
    if (!signingKey.isNullOrBlank()) {
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign(publishing.publications["mavenJava"])
    }
}