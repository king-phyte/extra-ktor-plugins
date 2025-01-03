import com.gradle.enterprise.gradleplugin.GradleEnterpriseExtension
import io.github.flaxoos.ktor.extensions.ossrhPassword
import io.github.flaxoos.ktor.extensions.ossrhUsername
import org.gradle.api.tasks.testing.logging.TestExceptionFormat.SHORT
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
import org.gradle.api.tasks.testing.logging.TestLogging
import org.gradle.api.tasks.testing.logging.TestStackTraceFilter
import ru.vyarus.gradle.plugin.python.PythonExtension

plugins {
    alias(libs.plugins.nexusPublish)
    id(
        libs.plugins.dokka
            .get()
            .pluginId,
    )
    id("ru.vyarus.mkdocs-build") version "3.0.0"
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username = ossrhUsername
            password = ossrhPassword
        }
    }
}

allprojects {
    group = "io.github.flaxoos"
    version = project.property("version") as String
}

subprojects {
    tasks.find { it.name == "build" }?.dependsOn(tasks.named("ktlintFormat"))

    tasks.withType(Test::class) {
        testLogging {
            info {
                testDetails()
            }
        }
    }

    extensions.findByType(GradleEnterpriseExtension::class)?.apply {
        buildScan {
            termsOfServiceUrl = "https://gradle.com/terms-of-service"
            termsOfServiceAgree = "yes"
        }
    }
}

mkdocs {
    sourcesDir = layout.projectDirectory.dir("documentation/mkdocs").toString()
    python.scope = PythonExtension.Scope.USER
}

tasks.withType<org.jetbrains.dokka.gradle.DokkaCollectorTask>().configureEach {
    outputDirectory.set(file("$rootDir/documentation/mkdocs/docs/dokka"))
}

fun TestLogging.testDetails() {
    events = setOf(PASSED, SKIPPED, FAILED)
    showStandardStreams = true
    exceptionFormat = SHORT
    stackTraceFilters = setOf(TestStackTraceFilter.GROOVY)
}
