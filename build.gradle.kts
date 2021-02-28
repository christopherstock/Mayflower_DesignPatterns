import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.30"
    application
    id("io.gitlab.arturbosch.detekt").version("1.15.0")
}

group = "me.stock"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter {
        content {
            // just allow to include kotlinx projects
            // detekt needs 'kotlinx-html' for the html report
            includeGroup("org.jetbrains.kotlinx")
        }
    }
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}

detekt {
    // preconfigure defaults
    buildUponDefaultConfig = true
    // point to your custom config defining rules to run, overwriting default behavior
    config = files("$projectDir/config/detekt.yml")
    // a way of suppressing issues before introducing detekt
    baseline = file("$projectDir/config/baseline.xml")

    reports {
        // observe findings in your browser with structure and code snippets
        html.enabled = true
        // checkstyle like format mainly for integrations like Jenkins
        xml.enabled = true
        // similar to the console output, contains issue signature to manually edit baseline files
        txt.enabled = true
        // standardized SARIF format (https://sarifweb.azurewebsites.net/)
        // to support integrations with Github Code Scanning
        sarif.enabled = true
    }
}
