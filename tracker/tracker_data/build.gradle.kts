@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kotlinKapt)
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.kotlindebolsillo.tracker_data"
}

dependencies {
    implementation(project(":core"))
    implementation(project(":tracker:tracker_domain"))

    implementation(libs.okhttp)
    implementation(libs.retrofit)
    implementation(libs.okhttp.logging.interceptor)
    implementation(libs.moshi.converter)

    kapt(libs.room.compiler)
    implementation(libs.room.ktx)
    implementation(libs.room.runtime)
}