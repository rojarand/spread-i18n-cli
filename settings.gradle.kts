pluginManagement {
    repositories {
        maven ( "https://dl.bintray.com/kotlin/kotlin-eap")
        mavenCentral()
        maven ( "https://plugins.gradle.org/m2/" )
    }
}
rootProject.name = "spread-i18n-cli"

includeBuild("../spread-i18n-core")

