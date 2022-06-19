plugins {
    java
}

group = "io.factory"
version = "0.1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.9")
    }
}

tasks.test {
    useJUnitPlatform()
}
