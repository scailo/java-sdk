#!/bin/bash

rm -rf lib/build
rm -rf lib/src/main/java/build
rm -rf lib/src/main/java/com/google
./gradlew --stop
# ./gradlew :lib:build --refresh-dependencies
./gradlew clean :lib:build --no-configuration-cache --refresh-dependencies