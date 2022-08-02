import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    id("org.springframework.boot") version "2.3.0.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    kotlin("jvm") version "1.4.20"
    kotlin("plugin.spring") version "1.4.20"
}

group = "com.ort"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
    getByName("test").java.srcDirs("src/test")
    getByName("main").resources.srcDirs("src/main/resources")
    getByName("test").resources.srcDirs("src/test/resources")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation("org.thymeleaf:thymeleaf:3.0.9.RELEASE")
    implementation("org.thymeleaf:thymeleaf-spring4:3.0.9.RELEASE")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect:2.3.0")
    // jsoup
    implementation("org.jsoup:jsoup:1.10.3")
    // dbflute
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") {
        exclude("com.zaxxer:HikariCP")
    }
    implementation("org.apache.tomcat:tomcat-jdbc:9.0.10")
    implementation("org.dbflute:dbflute-runtime:1.2.1")
    implementation("org.apache.httpcomponents:httpclient")
    // mysql
    implementation("mysql:mysql-connector-java:8.0.25")


    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }

}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}
