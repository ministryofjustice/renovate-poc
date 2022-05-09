plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "4.1.4"
  kotlin("plugin.spring") version "1.6.20"
}

configurations {
  testImplementation { exclude(group = "org.junit.vintage") }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  testImplementation("org.mockito:mockito-inline:4.5.1")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks {
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
      jvmTarget = "17"
    }
  }
}
