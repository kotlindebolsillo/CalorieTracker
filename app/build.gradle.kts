@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kotlinKapt)
}

android {
    namespace = "com.kotlindebolsillo.calorietracker"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = libs.versions.app.id.get()
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = libs.versions.versionCode.get().toInt()
        versionName = libs.versions.versionName.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get().toString()
    }
    packaging { resources.excludes.add("META-INF/*") }
}

dependencies {

    implementation(libs.compose.compiler)
    implementation(libs.compose.ui)
    implementation(libs.compose.tooling.preview)
    implementation(libs.compose.navigation)
    implementation(libs.compose.material)
    implementation(libs.compose.hilt.navigation)
    implementation(libs.compose.runtime)
    implementation(libs.compose.viewmodel)
    implementation(libs.compose.activity)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.google.material)

    implementation(libs.coil)

    implementation(libs.retrofit)
    implementation(libs.moshi.converter)
    implementation(libs.okhttp.logging.interceptor)
    implementation(libs.okhttp)

    kapt(libs.room.compiler)
    implementation(libs.room.ktx)
    implementation(libs.room.runtime)

    testImplementation(libs.junit4)
    testImplementation(libs.androidx.test.ext.junit)
    testImplementation(libs.google.truth)
    testImplementation(libs.coroutine.test)
    testImplementation(libs.turbine)
    testImplementation(libs.compose.ui.test)
    testImplementation(libs.mock)
    testImplementation(libs.mock.webserver)

    androidTestImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.google.truth)
    androidTestImplementation(libs.coroutine.test)
    androidTestImplementation(libs.turbine)
    androidTestImplementation(libs.compose.ui.test)
    androidTestImplementation(libs.mock.android)
    androidTestImplementation(libs.mock.webserver)
    androidTestImplementation(libs.hilt.testing)
    kaptAndroidTest(libs.hilt.compiler)
    androidTestImplementation(libs.test.runner)

    implementation(project(":core"))
    implementation(project(":core-ui"))
    implementation(project(":onboarding:onboarding_presentation"))
    implementation(project(":onboarding:onboarding_domain"))
    implementation(project(":tracker:tracker_presentation"))
    implementation(project(":tracker:tracker_data"))
    implementation(project(":tracker:tracker_domain"))
}