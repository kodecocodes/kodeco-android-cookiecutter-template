plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  val minSdkVersion: Int by rootProject.extra
  val compileSdkVersion: Int by rootProject.extra
  val targetSdkVersion: Int by rootProject.extra

  compileSdk = compileSdkVersion

  defaultConfig {
    applicationId = "{{ cookiecutter.full_package_namespace }}"
    minSdk = minSdkVersion
    targetSdk = targetSdkVersion
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(
          getDefaultProguardFile("proguard-android.txt"),
          "${project.rootDir}proguard-rules.pro"
      )
    }
  }

  buildFeatures {
    compose = true
  }

  val composeVersion: String by rootProject.extra

  composeOptions {
    kotlinCompilerExtensionVersion = composeVersion
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  namespace = "{{ cookiecutter.full_package_namespace }}"
}

dependencies {
  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

  // Kotlin
  implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")

  // Support Libraries
  implementation("androidx.appcompat:appcompat:1.6.1")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")

  // Testing Dependencies
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

  // SplashScreen compat library
  implementation("androidx.core:core-splashscreen:1.0.1")

  // Compose
  val composeBom = platform("androidx.compose:compose-bom:2023.04.01")
  implementation(composeBom)
  androidTestImplementation(composeBom)

  // Compose - Material Design 3
  implementation("androidx.compose.material3:material3")

  // Compose - Android Studio Preview support
  implementation("androidx.compose.ui:ui-tooling-preview")
  debugImplementation("androidx.compose.ui:ui-tooling")

  // Compose - UI Tests
  androidTestImplementation("androidx.compose.ui:ui-test-junit4")
  debugImplementation("androidx.compose.ui:ui-test-manifest")

  // Compose - Optional - Integration with activities
  implementation("androidx.activity:activity-compose:1.7.2")
  // Compose - Optional - Integration with ViewModels
  implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
  // Compose - Optional - Integration with LiveData
  implementation("androidx.compose.runtime:runtime-livedata")
  // Compose - Optional - Integration with RxJava
  implementation("androidx.compose.runtime:runtime-rxjava2")


  // TUTORIAL DEPENDENCIES HERE


}
