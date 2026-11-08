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
    ":example36",
    ":example51",
    ":example52",
    ":example53",
    ":example54",
    ":example55",
    ":example61",
    ":example62",
    ":example63",
    ":example64",
    ":example65"
)
