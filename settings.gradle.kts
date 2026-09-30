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

rootProject.name = "Week05BasicWidgets"
include(
    ":example31",
    ":example32",
    ":example33",
    ":example34",
    ":example35",
    ":example36"
)
