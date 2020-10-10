plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}
group = "intelligabble"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
    implementation(project(":shared"))
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")

    // Jetpack dependencies
    implementation("androidx.compose.ui:ui:1.0.0-alpha04")
    // Tooling support (Previews, etc.)
    implementation("androidx.ui:ui-tooling:1.0.0-alpha04")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:1.0.0-alpha04")
    // Material Design
    implementation("androidx.compose.material:material:1.0.0-alpha04")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:1.0.0-alpha04")
    implementation("androidx.compose.material:material-icons-extended:1.0.0-alpha04")
    // Integration with observables
    implementation("androidx.compose.runtime:runtime-livedata:1.0.0-alpha04")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.0.0-alpha04")

}
android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "aj.intelligabble.android"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }
    composeOptions {
        kotlinCompilerVersion = "1.4.0"
        kotlinCompilerExtensionVersion = "1.0.0-alpha04"
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs += arrayOf("-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check")
    }
}