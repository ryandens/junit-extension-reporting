plugins {
    id("com.diffplug.spotless") version "5.3.0"
}

allprojects {
    apply(plugin = "com.diffplug.spotless")
    apply<JavaPlugin>()
    spotless {
        java {
            googleJavaFormat("1.9")
        }
        kotlinGradle {
            ktlint()
        }
    }

    repositories {
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
