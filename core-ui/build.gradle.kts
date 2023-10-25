@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.kotlindebolsillo.core_ui"
}