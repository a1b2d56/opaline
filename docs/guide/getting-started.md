# Getting Started

Supported platforms: **Android** / **Desktop (JVM)** / **iOS** / **WasmJs** / **Js** / **macOS (Native)**

::: warning
This library is experimental, and APIs may change in future versions without notice.
:::

## Adding Dependencies

To use Opaline in your project, follow these steps to add dependencies:

### Gradle (Kotlin DSL)

1. Add the following to the root `settings.gradle.kts` file (usually already included):

```kotlin
repositories {
    mavenCentral()
}
```

2. Check the latest version on Maven Central:
   [![Maven Central](https://img.shields.io/maven-central/v/io.github.a1b2d56.opaline/opaline-ui)](https://search.maven.org/search?q=g:io.github.a1b2d56.opaline)

3. Add dependencies to your project's `build.gradle.kts`:

Opaline is composed of several modules that can be used independently:

| Module             | Description                                          |
| ------------------ | ---------------------------------------------------- |
| `opaline-ui`         | Core UI component library                            |
| `opaline-preference` | Preference components library, depends on `opaline-ui` |
| `opaline-icons`      | ColorOS 17 icon set, can be used independently       |
| `opaline-blur`       | Blur effect library, can be used independently       |
| `opaline-squircle`   | Squircle shapes library, can be used independently   |
| `opaline-nav`        | Navigation library, can be used independently        |
| `opaline-shader`     | Low-level runtime shader / render effect abstraction |

- For Compose Multiplatform projects:

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("io.github.a1b2d56.opaline:opaline-ui:<version>")
            // Optional: Add opaline-preference for preference components
            implementation("io.github.a1b2d56.opaline:opaline-preference:<version>")
            // Optional: Add opaline-icons for more icons
            implementation("io.github.a1b2d56.opaline:opaline-icons:<version>")
            // Optional: Add opaline-blur for blur effects
            implementation("io.github.a1b2d56.opaline:opaline-blur:<version>")
            // Optional: Add opaline-squircle for squircle (smooth rounded corner) shapes
            implementation("io.github.a1b2d56.opaline:opaline-squircle:<version>")
            // Optional: Add opaline-nav for navigation
            implementation("io.github.a1b2d56.opaline:opaline-nav:<version>")
        }
    }
}
```

- For Android Compose projects:

```kotlin
dependencies {
    implementation("io.github.a1b2d56.opaline:opaline-ui-android:<version>")
    // Optional: Add opaline-preference for preference components
    implementation("io.github.a1b2d56.opaline:opaline-preference-android:<version>")
    // Optional: Add opaline-icons for more icons
    implementation("io.github.a1b2d56.opaline:opaline-icons-android:<version>")
    // Optional: Add opaline-blur for blur effects (requires minSdk 33)
    implementation("io.github.a1b2d56.opaline:opaline-blur-android:<version>")
    // Optional: Add opaline-squircle for squircle (smooth rounded corner) shapes
    implementation("io.github.a1b2d56.opaline:opaline-squircle-android:<version>")
    // Optional: Add opaline-nav for navigation
    implementation("io.github.a1b2d56.opaline:opaline-nav-android:<version>")
}
```

- For other projects, add platform-specific dependencies as needed:

```kotlin
implementation("io.github.a1b2d56.opaline:opaline-ui-iosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-ui-iossimulatorarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-ui-macosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-ui-desktop:<version>")
implementation("io.github.a1b2d56.opaline:opaline-ui-wasmjs:<version>")
implementation("io.github.a1b2d56.opaline:opaline-ui-js:<version>")
// Optional: Add opaline-preference
implementation("io.github.a1b2d56.opaline:opaline-preference-iosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-preference-iossimulatorarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-preference-macosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-preference-desktop:<version>")
implementation("io.github.a1b2d56.opaline:opaline-preference-wasmjs:<version>")
implementation("io.github.a1b2d56.opaline:opaline-preference-js:<version>")
// Optional: Add opaline-blur
implementation("io.github.a1b2d56.opaline:opaline-blur-iosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-blur-iossimulatorarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-blur-macosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-blur-desktop:<version>")
implementation("io.github.a1b2d56.opaline:opaline-blur-wasmjs:<version>")
implementation("io.github.a1b2d56.opaline:opaline-blur-js:<version>")
// Optional: Add opaline-nav
implementation("io.github.a1b2d56.opaline:opaline-nav-iosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-nav-iossimulatorarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-nav-macosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-nav-desktop:<version>")
implementation("io.github.a1b2d56.opaline:opaline-nav-wasmjs:<version>")
implementation("io.github.a1b2d56.opaline:opaline-nav-js:<version>")
// Optional: Add opaline-icons
implementation("io.github.a1b2d56.opaline:opaline-icons-iosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-icons-iossimulatorarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-icons-macosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-icons-desktop:<version>")
implementation("io.github.a1b2d56.opaline:opaline-icons-wasmjs:<version>")
implementation("io.github.a1b2d56.opaline:opaline-icons-js:<version>")
// Optional: Add opaline-squircle
implementation("io.github.a1b2d56.opaline:opaline-squircle-iosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-squircle-iossimulatorarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-squircle-macosarm64:<version>")
implementation("io.github.a1b2d56.opaline:opaline-squircle-desktop:<version>")
implementation("io.github.a1b2d56.opaline:opaline-squircle-wasmjs:<version>")
implementation("io.github.a1b2d56.opaline:opaline-squircle-js:<version>")
```

## Basic Usage

### Applying the Opaline Theme

```kotlin
@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    // Available modes: System, Light, Dark, MonetSystem, MonetLight, MonetDark
    val controller = remember { ThemeController(ColorSchemeMode.System) }
    return OpalineTheme(
        controller = controller,
        content = content
    )
}
```

### Using the Opaline Scaffold

```kotlin
Scaffold(
    topBar = {
        // TopBar
    },
    bottomBar = {
        // BottomBar
    },
    floatingActionButton = {
        // FloatingActionButton
    },
    floatingToolbar = {
        // FloatingToolbar
    }
) {
    // Content...
}
```

::: warning
The Scaffold component provides a suitable container for cross-platform popup windows.
Components such as `OverlayDialog`, `OverlayDropdownPreference`, `OverlaySpinnerPreference`, and `OverlayListPopup` are
all implemented based on this and therefore need to be wrapped by this component.
:::

## API Documentation

- View the [API Documentation](/dokka/index.html){target="\_blank"},
  generated using Dokka, which contains detailed information about all APIs.
