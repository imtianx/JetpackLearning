/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/6/4 5:25 PM
 */

object Versions {
    const val android_plugin = "3.2.0"
    const val android_sdk_compile = 28
    const val android_sdk_min = 15
    const val android_sdk_target = 28
    const val android_sdk_support = "28.0.0"

    const val kotlin = "1.2.71"

    const val constraintlayout = "1.1.0"

    const val appcompat = "1.0.0"
    const val lifecycle = "2.0.0"
    const val databinding_compiler = "3.2.0"

    const val navigation = "1.0.0-alpha06"

}

object Deps {

    val android_plugin = "com.android.tools.build:gradle:${Versions.android_plugin}"

    // android: appcompat,design...
    val appcompat_v7 = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val design = "com.android.support:design:${Versions.android_sdk_support}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"


    // kotlin
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    /**
     * architecture componets deps @see :
     *
     * @see : https://developer.android.com/topic/libraries/architecture/adding-components
     */

    // lifecycle
    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"


    // databinding
    val databinding_compile = "androidx.databinding:databinding-compiler:${Versions.databinding_compiler}"


    // navigation
    val navigation_plugin = "android.arch.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    val navigation_fragment = "android.arch.navigation:navigation-fragment:${Versions.navigation}"
    val navigation_ui = "android.arch.navigation:navigation-ui:${Versions.navigation}"


}


