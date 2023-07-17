import io.spring.gradle.dependencymanagement.org.codehaus.plexus.interpolation.os.Os

plugins {
    kotlin("jvm")
}

dependencies {
}

tasks.named<Jar>("jar") {
    enabled = false
}