object Dependency {
    object AndroidX {
        const val CORE_KTK = "androidx.core:core-ktx:${Versions.AndroidX.CORE_KTK}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.AndroidX.APPCOMPAT}"
        const val CONSTRAINTLAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.CONSTRAINTLAYOUT}"
    }

    object Google {
        const val MATERAIL = "com.google.android.material:material:${Versions.Google.MATERAIL}"
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.Google.HILT}"
        const val HILT_ANDROID_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.Google.HILT}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.Test.JUNIT}"
    }

    object AndroidTest {
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.AndroidTest.ANDROID_JUNIT}"
        const val ANDROID_ESPRESSO =
            "androidx.test.espresso:espresso-core:${Versions.AndroidTest.ANDROID_ESPRESSO}"
    }

    object Libraries {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Libraries.RETROFIT}"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.Libraries.RETROFIT}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.Libraries.OKHTTP}"
    }
}