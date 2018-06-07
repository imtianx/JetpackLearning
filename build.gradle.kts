// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Deps.android_plugin)
        classpath(Deps.kotlin_gradle_plugin)
        classpath(Deps.navigation_plugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

val clean = task("clean") {
    delete(rootProject.buildDir)
}
val type: Delete by clean.extra


// test gpg
