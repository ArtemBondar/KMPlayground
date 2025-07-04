plugins {
    kotlin("multiplatform") version "2.0.0"
    id("com.android.application") version "8.3.0"
    id("org.jetbrains.compose") version "1.6.10"
}

group = "com.example"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

kotlin {
    jvmToolchain(17)
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    jvm("desktop")
    jvm("server")
    js(IR) {
        browser {
            binaries.executable()
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.activity:activity-compose:1.9.0")
            }
        }
        val iosMain by creating {
            dependsOn(commonMain)
        }
        val iosX64Main by getting { dependsOn(iosMain) }
        val iosArm64Main by getting { dependsOn(iosMain) }
        val iosSimulatorArm64Main by getting { dependsOn(iosMain) }
        val desktopMain by getting {
            dependencies {
                implementation(compose.preview)
            }
        }
        val serverMain by getting
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
            }
        }
    }
}

android {
    namespace = "com.example.composeapp"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.composeapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
