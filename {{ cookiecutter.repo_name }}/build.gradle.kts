// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

  extra["kotlin_version"] = "1.8.21"
  extra["composeVersion"] = "1.4.7"
  extra["minSdkVersion"] = 21
  extra["compileSdkVersion"] = 33
  extra["targetSdkVersion"] = extra["compileSdkVersion"]

  repositories {
    google()
    mavenCentral()
  }

  dependencies {
    classpath("com.android.tools.build:gradle:8.0.2")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${rootProject.extra["kotlin_version"]}")

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle.kts files
  }
}

allprojects {
  repositories {
    google()
    mavenCentral()
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}
