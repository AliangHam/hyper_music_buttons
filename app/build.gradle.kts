plugins {
    id("com.android.application")
}

android {
    namespace = "com.ham.music_buttomBlock"
        compileSdk = 36

    defaultConfig {
        applicationId = "com.ham.music_buttomBlock"
        minSdk = 35
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    signingConfigs {
        create("release") {
            storeFile = file(System.getProperty("user.home") + "/jks/aliangham.jks")
            storePassword = "3I9KyI3a6g1Js2"
            keyAlias = "aliangham"
            keyPassword = "gh5c7r93StTIHZ"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }
        debug {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    packaging {
        resources {
            merges += "META-INF/xposed/java_init.list"
            merges += "META-INF/xposed/module.prop"
            merges += "META-INF/xposed/scope.list"
        }
    }
}

dependencies {
    compileOnly("io.github.libxposed:api:102.0.0")
    compileOnly("androidx.annotation:annotation:1.9.1")
}
