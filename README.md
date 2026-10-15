# MAD Practical 2: Basic Android UI & ConstraintLayout Exploration

**Course:** Mobile Application Development (MAD)  
**Enrollment No:** 25012012037 
**Package Name:** `package com.example.a25012012037_mad_pra2`

---

## 📱 Project Overview

This project is part of the **Mobile Application Development (MAD)** lab curriculum. It demonstrates the fundamentals of building an Android application from scratch, configuring the **Android Manifest**, designing a responsive user interface using **ConstraintLayout**, customizing view attributes (colors, text size, positioning), and setting up unit and instrumented tests.

---

## 🎯 Objectives & Features

- **UI Design with ConstraintLayout:** Create a responsive layout where UI elements adapt gracefully to various screen dimensions.
- **View Customization:** Configure `TextView` attributes including custom text, text size (`20sp`), text color (`holo_blue_dark`), and background coloring (`holo_orange_light`).
- **Activity & Manifest Configuration:** Define `MainActivity` as the default launcher activity with customized window input and application themes.
- **Testing Integration:** Provide test suites for both local unit testing (JUnit) and device-level instrumented testing (AndroidX Test Runner).

---

## 📂 Project Structure & Key Files

| File | Purpose | Description |
| :--- | :--- | :--- |
| **`activity_main.xml`** | UI Layout | Defines the visual structure using `ConstraintLayout` with a light orange background and a centrally positioned `TextView` with custom styling. |
| **`AndroidManifest.xml`** | App Manifest | Registers `MainActivity` with the `MAIN` action and `LAUNCHER` category, declares application theme, and backup rules. |
| **`ExampleUnitTest.kt`** | Local Unit Test | Host-based unit test executed on the JVM to test standalone logic (e.g., math assertion `2 + 2 = 4`). |
| **`ExampleInstrumentedTest.kt`** | Instrumented Test | Device-based test validating Android application context and package name integrity (`com.example.a25012012037_mad_pra2`). |

---

## 🎨 UI Component Details (`activity_main.xml`)

| Property | Value | Description |
| :--- | :--- | :--- |
| **Root Layout** | `ConstraintLayout` | Container with ID `@+id/main` and light orange background (`@android:color/holo_orange_light`). |
| **View Component** | `TextView` | Centered text element displaying `"Hello Wrodl"`. |
| **Text Size** | `20sp` | Scaled-pixel size for accessible and readable typography. |
| **Text Color** | `@android:color/holo_blue_dark` | Dark blue shade for strong visual contrast against the orange canvas. |
| **Constraints** | Top, Bottom, Start, End to parent | Centers the TextView vertically and horizontally (`bias: 0.5`). |

---

## 🚀 How to Run the App

1. **Clone or Open Project:**
   - Open **Android Studio**.
   - Select **Open** and choose the `MAD_25012012037_prac2` project directory.
2. **Gradle Sync:**
   - Wait for Gradle to download dependencies and build the project index.
3. **Run on Device/Emulator:**
   - Select an Android Virtual Device (AVD) or connect a physical Android device with USB debugging enabled.
   - Click the green **Run** button (`Shift + F10`).

---

## 🧪 Running Tests

- **Local Unit Tests:**
  ```bash
  ./gradlew test
