plugins {
    `kotlin-dsl`
    `maven-publish` // Allows you to create a "package"

    kotlin("jvm") version "2.0.0" apply false
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf:protobuf-kotlin:3.24.0")
    implementation("io.grpc:grpc-kotlin-stub:1.5.0")
    implementation("io.grpc:grpc-protobuf:1.58.0")
    implementation("com.google.protobuf:protobuf-java-util:3.24.0")
}

group = "com.scailo"
version = "0.1.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}