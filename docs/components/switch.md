# Switch

`Switch` is a basic toggle component in Opaline used to switch between two states. It provides an interactive switch control with animation effects, suitable for enabling and disabling settings.

<div style="position: relative; height: 100px; border-radius: 10px; overflow: hidden; border: 1px solid #777;">
    <iframe id="demoIframe" style="position: absolute; top: 0; left: 0; width: 100%; height: 100%; border: none;" src="../compose/index.html?id=switch" title="Demo" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin"></iframe>
</div>

## Import

```kotlin
import io.github.a1b2d56.opaline.basic.Switch
```

## Basic Usage

The Switch component can be used to toggle between two states:

```kotlin
var checked by remember { mutableStateOf(false) }

Switch(
    checked = checked,
    onCheckedChange = { checked = it }
)
```

## Component States

### Disabled State

```kotlin
var checked by remember { mutableStateOf(false) }

Switch(
    checked = checked,
    onCheckedChange = { checked = it },
    enabled = false
)
```

### Loading State

While `isLoading` is true, the thumb shrinks away and is replaced by a spinning gradient arc; touch input is swallowed until loading ends:

```kotlin
var checked by remember { mutableStateOf(true) }
var isLoading by remember { mutableStateOf(true) }

Switch(
    checked = checked,
    onCheckedChange = { checked = it },
    isLoading = isLoading
)
```

## Properties

### Switch Properties

| Property Name   | Type                 | Description                        | Default Value                 | Required |
| --------------- | -------------------- | ---------------------------------- | ----------------------------- | -------- |
| checked         | Boolean              | Whether the switch is checked      | -                             | Yes      |
| onCheckedChange | ((Boolean) -> Unit)? | Callback when switch state changes; `null` = non-interactive | -   | Yes      |
| modifier        | Modifier             | Modifier applied to the switch     | Modifier                      | No       |
| colors          | SwitchColors         | Color configuration for the switch | SwitchDefaults.switchColors() | No       |
| enabled         | Boolean              | Whether the switch is interactive  | true                          | No       |
| isLoading       | Boolean              | Whether the switch is in the COUI loading state: the thumb shrinks away and is replaced by a spinning gradient arc; touch is swallowed | false | No       |

### SwitchDefaults Object

The SwitchDefaults object provides the geometry, drag behavior and default colors of the Switch.

#### Constants

| Constant Name          | Type               | Value                       | Description                                                       |
| ---------------------- | ------------------ | --------------------------- | ----------------------------------------------------------------- |
| TrackWidth             | Dp                 | 44.dp                       | Track width (ColorOS 17 `bar_width`)                              |
| TrackHeight            | Dp                 | 24.dp                       | Track height                                                      |
| ThumbSize              | Dp                 | 18.dp                       | Thumb diameter                                                    |
| DragOverscrollFactor   | Float              | 0.55                        | How far the thumb follows the finger past either end while dragged |
| DragSettleSpec         | AnimationSpec\<Dp> | critically damped spring    | Spring that settles the thumb after a drag                        |

Tapping toggles the switch; dragging the thumb follows the finger and toggles if it is released on
the other half of the track, as on ColorOS 17.

#### Methods

| Method Name    | Type         | Description                                 |
| -------------- | ------------ | ------------------------------------------- |
| switchColors() | SwitchColors | Creates default color config for the switch |

### SwitchColors Class

| Property Name               | Type  | Description                             | Default Value | Required |
| --------------------------- | ----- | --------------------------------------- | ------------- | -------- |
| checkedThumbColor           | Color | Thumb color when checked                | -             | Yes      |
| uncheckedThumbColor         | Color | Thumb color when unchecked              | -             | Yes      |
| disabledCheckedThumbColor   | Color | Thumb color when disabled and checked   | -             | Yes      |
| disabledUncheckedThumbColor | Color | Thumb color when disabled and unchecked | -             | Yes      |
| checkedTrackColor           | Color | Track color when checked                | -             | Yes      |
| uncheckedTrackColor         | Color | Track color when unchecked (defaults to `colorScheme.controls`) | -             | Yes      |
| disabledCheckedTrackColor   | Color | Track color when disabled and checked   | -             | Yes      |
| disabledUncheckedTrackColor | Color | Track color when disabled and unchecked | -             | Yes      |

## Advanced Usage

### Custom Colors

```kotlin
var checked by remember { mutableStateOf(false) }

Switch(
    checked = checked,
    onCheckedChange = { checked = it },
    colors = SwitchDefaults.switchColors(
        checkedTrackColor = Color.Red,
        checkedThumbColor = Color.White
    )
)
```

### Using with Text

```kotlin
var checked by remember { mutableStateOf(false) }

Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.padding(16.dp)
) {
    Switch(
        checked = checked,
        onCheckedChange = { checked = it }
    )
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = if (checked) "Enabled" else "Disabled")
}
```

### Using in Lists

```kotlin
val options = listOf("Airplane Mode", "Bluetooth", "Location Services")
val checkedStates = remember { mutableStateListOf(false, true, false) }

LazyColumn {
    items(options.size) { index ->
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = options[index])
            Switch(
                checked = checkedStates[index],
                onCheckedChange = { checkedStates[index] = it }
            )
        }
    }
}
```

### Clickable List Row

```kotlin
data class Option(val text: String, var isSelected: Boolean)
val options = remember {
    mutableStateListOf(
        Option("Airplane Mode", false),
        Option("Bluetooth", true),
        Option("Location Services", false)
    )
}

LazyColumn {
    items(options.size) { index ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    options[index] = options[index].copy(
                        isSelected = !options[index].isSelected
                    )
                }
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = options[index].text)
            Switch(
                checked = options[index].isSelected,
                onCheckedChange = { 
                    options[index] = options[index].copy(
                        isSelected = !options[index].isSelected
                    )
                }
            )
        }
    }
}
```