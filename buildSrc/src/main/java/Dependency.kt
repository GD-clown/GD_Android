object Dependency {
    object AndroidX {
        const val CORE_KTK = "androidx.core:core-ktx:${Versions.AndroidX.CORE_KTK}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.AndroidX.APPCOMPAT}"
        const val CONSTRAINTLAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.CONSTRAINTLAYOUT}"
    }

    object Google {
        const val MATERAIL = "com.google.android.material:material:${Versions.Google.MATERAIL}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.Test.JUNIT}"
    }

    object AndroidTest {
        const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.AndroidTest.ANDROID_JUNIT}"
        const val ANDROID_ESPRESSO =
            "androidx.test.espresso:espresso-core:${Versions.AndroidTest.ANDROID_ESPRESSO}"
    }
}