plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    // Standard Protobuf 4.x
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

// Ensure the compiler sees the generated code correctly
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
            groupId = "com.github.scailo"
            artifactId = "java-sdk"
        }
    }
}