pluginManagement {
    val springBootVersion: String by settings
    val ktlintVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val jibVersion: String by settings
    val kotlinVersion: String by settings

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagementVersion)
                "org.jlleitschuh.gradle.ktlint" -> useVersion(ktlintVersion)
                "org.jetbrains.kotlin.plugin.jpa" -> useVersion(kotlinVersion)
                "com.google.cloud.tools.jib" -> useVersion(jibVersion)
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.kapt" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
            }
        }
    }
}

rootProject.name = "reactive"

includeProject(":netty", "src/netty")
includeProject(":reactive", "src/reactive")

fun includeProject(name: String, projectPath: String) {
    include(name)
    project(name).projectDir = file(projectPath)
}