# Mobile Application Development — Practical 2

A native Android application built with Kotlin in Android Studio, demonstrating fundamental Android application architecture, layout structures, and build configuration using the Gradle Kotlin DSL (`.kts`).

---

## Table of Contents
- [Aim & Objectives](#aim--objectives)
- [Tech Stack & Environment](#tech-stack--environment)
- [Project Architecture & Tree](#project-architecture--tree)
- [Key Components](#key-components)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Build & Run](#build--run)
- [Student & Developer Information](#student--developer-information)

---

## Aim & Objectives
* Understand the core directory and file structure of an Android Studio project.
* Configure application dependencies and build scripts using Gradle Kotlin DSL (`build.gradle.kts`) and Version Catalogs (`libs.versions.toml`).
* Implement an entry-point activity lifecycle using `MainActivity.kt`.
* Construct UI components using XML layouts (`activity_main.xml`) with integrated day/night theme configurations.

---

## Tech Stack & Environment

| Property | Details |
| :--- | :--- |
| **IDE** | Android Studio |
| **Language** | Kotlin |
| **Build Configuration** | Gradle Kotlin DSL (`build.gradle.kts`) |
| **Dependency Catalog** | `gradle/libs.versions.toml`[cite: 7] |
| **Package Name** | `com.example.a25012012037_mad_pra2`[cite: 7] |
| **Target Platform** | Android (Phone & Tablet) |

---

## Project Architecture & Tree

```text
25012012037_MAD_PRA2/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/a25012012037_mad_pra2/
│   │   │   │   └── MainActivity.kt             # Application entry point and Activity lifecycle logic
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml       # User interface layout definition
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml              # Base color palette declarations
│   │   │   │   │   ├── strings.xml             # UI string resources
│   │   │   │   │   └── themes.xml              # Light theme styles
│   │   │   │   ├── values-night/
│   │   │   │   │   └── themes.xml              # Dark mode theme overrides
│   │   │   │   ├── drawable/                   # Vector graphics and launcher backgrounds
│   │   │   │   ├── mipmap-*/                   # Multi-density app launcher icons (hdpi, mdpi, xhdpi, etc.)
│   │   │   │   └── xml/                        # Data extraction and backup rules
│   │   │   └── AndroidManifest.xml             # App permissions, intent-filters, and package metadata
│   │   ├── androidTest/                        # Instrumented Android UI and integration tests
│   │   └── test/                               # Local unit tests
│   ├── build.gradle.kts                        # App module-level dependencies and SDK settings
│   └── .gitignore
├── gradle/
│   ├── wrapper/                                # Gradle wrapper binaries and properties
│   └── libs.versions.toml                      # Centralized dependencies and plugin version catalog
├── build.gradle.kts                            # Top-level project build script
├── settings.gradle.kts                         # Repository definitions and project settings
├── gradlew / gradlew.bat                       # Gradle wrapper execution scripts (Unix / Windows)
└── README.md
