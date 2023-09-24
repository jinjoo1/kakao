plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.task_kakao"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.task_kakao"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures { viewBinding = true }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.github.bumptech.glide:transformations:4.16.0")


    //프래그먼트
    implementation ("androidx.fragment:fragment-ktx:1.6.1")


    //retrofit관련
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")

    //이미지 로드 그래들
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")

    //코틀린 스탠다드 라이브러리
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.0")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.0")

    //리사이클러뷰
    implementation ("androidx.recyclerview:recyclerview:1.3.1")


}