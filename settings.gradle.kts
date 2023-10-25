pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CaloriesTracker"
include(":app")
include(":core")
include(":core-ui")
include(":onboarding:onboarding_domain")
include(":onboarding:onboarding_presentation")
include(":tracker:tracker_presentation")
include(":tracker:tracker_data")
include(":tracker:tracker_domain")
