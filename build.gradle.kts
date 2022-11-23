plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

group = "io.github.koalaplot"
version = "0.2.1"

kotlin {
    explicitApi()
    jvm()

    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.ui)
                implementation(compose.animation)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutines")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$kotlinCoroutines")
            }
        }

        named("commonTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        named("jvmMain") {
            dependencies {
                implementation(compose.material)
            }
        }
    }
}
