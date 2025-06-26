plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id ("kotlin-android")
    id ("dagger.hilt.android.plugin")
    id("kotlin-kapt")

//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.firebaseapp.charlieandroidblog.hilt_example"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.firebaseapp.charlieandroidblog.hilt_example"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

//android {
//    namespace = "com.firebaseapp.charlieandroidblog.hilt_example"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.firebaseapp.charlieandroidblog.hilt_example"
//        minSdk = 33
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
//    buildFeatures {
//        compose = true
//    }
//}

dependencies {


    implementation("com.google.dagger:hilt-android:2.55")
    implementation(libs.hilt.android.testing)
    kapt("com.google.dagger:hilt-compiler:2.55")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.55")
//    androidTestAnnotationProcessor("com.google.dagger:hilt-compiler:2.55.2")
    testImplementation("com.google.dagger:hilt-android-testing:2.55")
    testAnnotationProcessor("com.google.dagger:hilt-compiler:2.55")
    testImplementation ("org.robolectric:robolectric:2")

    testImplementation("com.google.dagger:hilt-android-testing:2.56.2")
    // ...with Kotlin.
    kaptTest("com.google.dagger:hilt-android-compiler:2.56.2")
    // ...with Java.
    testAnnotationProcessor("com.google.dagger:hilt-android-compiler:2.56.2")

    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")


    // For instrumented tests.
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.56.2")
    // ...with Kotlin.
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.56.2")
    // ...with Java.
    androidTestAnnotationProcessor("com.google.dagger:hilt-android-compiler:2.56.2")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}
