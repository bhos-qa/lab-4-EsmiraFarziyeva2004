plugins {
    java
    id("jacoco")
    id("org.sonarqube") version "3.3" 
}

group = "bhos-qa" 
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral() 
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.2") 
}

// JaCoCo configuration
jacoco {
    toolVersion = "0.8.9" 
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true) 
        html.required.set(true) 
    }
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

// SonarQube configuration
sonarqube {
    properties {
        property("sonar.projectKey", "bhos-qa_lab-3-EsmiraFarziyeva2004")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.login", "29a300f5cc16200a0d11b85c41f406a005e767e7")
        property("sonar.sources", "src/main/java") 
        property("sonar.java.binaries", "build/classes/java/main")
        property("sonar.java.libraries", "build/libs/*.jar")
        property("sonar.coverage.jacoco.xmlReportPaths", "build/reports/jacoco/test/jacocoTestReport.xml")
    }
}
