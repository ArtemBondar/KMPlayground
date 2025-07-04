# KMPlayground

This project is a Kotlin Multiplatform (KMP) template showcasing Compose Multiplatform across a number of targets.
It currently uses **Kotlin 2.0** and **Compose Multiplatform 1.6.10** and builds for:

- Android
- iOS
- Desktop (JVM)
- Web (JS)
- Server (JVM)

## Project layout

```
build.gradle.kts      // build configuration
settings.gradle.kts   // project settings
src/
  commonMain/         // shared UI and logic
  commonTest/         // shared tests
  androidMain/        // Android Activity
  iosMain/            // iOS UIViewController
  desktopMain/        // desktop application entry point
  jsMain/             // web entry point
  serverMain/         // simple JVM server
```

## Building

Use Gradle to run tasks for each platform. A few useful examples:

```bash
# build everything
gradle build

# run the desktop app
gradle desktopRun

# start the server
gradle serverRun
```

For Android or iOS you will need the respective SDKs installed. Web can be served with `gradle jsBrowserDevelopmentRun`.

In environments without cached dependencies, Gradle may fail to resolve plugins due to network restrictions.

## Sample feature

The shared `App` composable demonstrates a simple counter using `CounterState` from `commonMain`.
This logic and UI are reused by all targets to highlight the benefits of KMP.
