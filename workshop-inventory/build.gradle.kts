plugins {
    id("io.factory.java-application-conventions")
}

group = "io.factory.workshop"
version = "0.1.0-SNAPSHOT"

java.sourceSets["main"].java {
    srcDir("$buildDir/generated/src/main/java")
}

tasks.openApiGenerate {
    generatorName.set("spring")
    inputSpec.set("$rootDir/openapi.yaml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("io.factory.workshop.web.api")
    invokerPackage.set("io.factory.workshop.web.invoker")
    modelPackage.set("io.factory.workshop.web.dto")
    generateModelTests.set(false)
    generateModelDocumentation.set(false)
    generateApiDocumentation.set(false)
    generateApiTests.set(false)
    configOptions.put("dateLibrary", "java8")
    configOptions.put("annotationLibrary", "none")
    configOptions.put("documentationProvider", "none")
    configOptions.put("interfaceOnly", "true")
    configOptions.put("useSwaggerUI", "false")
    configOptions.put("openApiNullable", "false")
}

dependencies {
    implementation("javax.validation:validation-api")
    implementation("com.google.guava:guava:31.1-jre")
}