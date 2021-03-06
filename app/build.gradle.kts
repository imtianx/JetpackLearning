import com.android.build.gradle.ProguardFiles.getDefaultProguardFile
import org.gradle.kotlin.dsl.kotlin
import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")

    kotlin("android")
    kotlin("kapt")

    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs")

}

android {

    compileSdkVersion(Versions.android_sdk_compile)

    defaultConfig {
        applicationId = "cn.imtianx.jetpacklearning"
        minSdkVersion(Versions.android_sdk_min)
        targetSdkVersion(Versions.android_sdk_target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    dataBinding {
        isEnabled = true
    }
    kapt {
        generateStubs = true
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Deps.kotlin_stdlib_jdk7)
    implementation(Deps.appcompat_v7)
    implementation(Deps.constraintlayout)

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-alpha3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha3")

    implementation(Deps.lifecycle_extensions)

    kapt(Deps.databinding_compile)

    implementation(Deps.navigation_fragment)
    implementation(Deps.navigation_ui)

    // material is the design library for AndroidX
    implementation(Deps.design_material)
}
