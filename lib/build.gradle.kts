plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
    signing
}

group = "com.scailo"

// Dynamic Versioning Logic
version = System.getenv("GITHUB_REF_NAME")?.removePrefix("v") 
          ?: project.findProperty("version")?.toString() 
          ?: "0.0.1-SNAPSHOT"

java {
    withSourcesJar()
    withJavadocJar()
}

// Fixes the duplicate entry error
tasks.withType<Jar>().configureEach {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

repositories {
    mavenCentral()
}

dependencies {
    val grpcVersion = "1.60.0"
    api("com.google.protobuf:protobuf-kotlin:4.29.3")
    api("com.google.protobuf:protobuf-java:4.29.3")
    api("io.grpc:grpc-kotlin-stub:1.4.1")
    api("io.grpc:grpc-protobuf:$grpcVersion")
    api("io.grpc:grpc-stub:$grpcVersion")
    api("io.grpc:grpc-api:$grpcVersion")
    implementation("build.buf:protovalidate:1.1.0")    
    implementation("javax.annotation:javax.annotation-api:1.3.2")
}

// Safety guard: Handles the duplicate entry error
tasks.withType<Jar>().configureEach {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "scailo-sdk"

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
}

// Standard signing block - Gradle will look for 
// 'signing.keyId', 'signing.password', and 'signing.secretKeyRingFile'
signing {
    sign(publishing.publications["mavenJava"])
}