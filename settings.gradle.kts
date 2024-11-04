pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral() {
            content {
                includeGroup("com.google.dagger")
                includeGroup("com.google.dagger.hilt.android")
            }
        }
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

rootProject.name = "GithubManager"
include(":app")
include(":core:model")
include(":feature:userlist")
include(":feature:userdetails")
include(":core:network")
include(":core:data:")
