# DialogButtonBar

`DialogButtonBar` is the button bar of a COUI alert dialog, mirroring ColorOS's `COUIButtonBarLayout`. Its defining behaviour is **automatic vertical stacking**: the bar measures its own labels, and as soon as one of them is too wide to fit in its cell, the whole bar flips from a horizontal row to a vertical stack instead of squeezing or ellipsizing the text.

On ColorOS 17 every button is a **capsule pill** (`Widget.COUI.Button.Large.ButtonNew.Secondary`): 44dp tall, fully rounded, filled with couiColorContainer8 and labelled in couiColorLabelPrimary. The two tiers lay the pills out differently, and the buttons appear in the **opposite order**.

## Import

```kotlin
import io.github.a1b2d56.opaline.layout.DialogButtonBar
import io.github.a1b2d56.opaline.layout.DialogButtonBarAction
import io.github.a1b2d56.opaline.layout.DialogButtonBarDefaults
import io.github.a1b2d56.opaline.layout.DialogButtonBarRole
```

## Basic Usage

Pass the actions by role, not by position — the bar decides where each one goes:

```kotlin
OverlayDialog(
    show = showDialog,
    title = "Dialog Title",
    summary = "A dialog with a COUI button bar.",
    onDismissRequest = { showDialog = false },
) {
    DialogButtonBar(
        negative = DialogButtonBarAction(text = "Cancel", onClick = { showDialog = false }),
        positive = DialogButtonBarAction(text = "Confirm", onClick = { showDialog = false }),
    )
}
```

Two short labels stay side by side. Long labels flip the bar to a stack automatically, with no extra configuration:

```kotlin
DialogButtonBar(
    negative = DialogButtonBarAction(text = "Not Now", onClick = { showDialog = false }),
    positive = DialogButtonBarAction(
        text = "Delete Backup And Local Copies",
        onClick = { showDialog = false },
    ),
)
```

A third, neutral action is also supported. COUI **always** stacks a three-button bar, regardless of how short the labels are:

```kotlin
DialogButtonBar(
    negative = DialogButtonBarAction(text = "Cancel", onClick = { showDialog = false }),
    positive = DialogButtonBarAction(text = "Save", onClick = { showDialog = false }),
    neutral = DialogButtonBarAction(text = "Discard", onClick = { showDialog = false }),
)
```

## The Stacking Rule

The bar reproduces `COUIButtonBarLayout.onMeasure`. It stays **horizontal only when all three of these hold**:

1. Every label fits in its pill, and
2. there are exactly two buttons, and
3. there is no recommend button (never the case here — see [Limitations](#limitations)).

In every other case the bar stacks. In particular, a three-button bar and a single-button bar both take the vertical path.

Pill width comes from `needSetButVertical`: the bar width — clamped to `DialogDefaults.MaxWidth` (`coui_dialog_max_width`, 392dp) — is split evenly between the buttons, and each cell then loses its two text paddings and its outer and inner cell paddings:

```
available = min(392.dp, barWidth) / buttonCount
            - ButtonHorizontalPadding * 2 - CellPaddingOuter - CellPaddingInner
```

A label wider than `available` forces the flip. Labels are measured single-line with a `TextMeasurer` against the resolved `textStyle`, matching COUI's raw paint measurement.

Set `dynamicLayout = false` to pin the bar horizontal, like `COUIButtonBarLayout.setDynamicLayout(false)`.

## Order and Layout

Button order reverses between tiers, matching `resortButton`:

| Tier | Order |
| :--- | :--- |
| Horizontal | negative → neutral → positive (left to right) |
| Vertical | neutral → positive → negative (top to bottom) |

So the negative (cancel) action sits on the **left** when horizontal but at the **bottom** when stacked.

Each pill sits in a cell padded by `coui_alert_dialog_button_parent_padding_*`:

| Tier | Cell padding |
| :--- | :--- |
| Horizontal | 16dp on the bar's outer edge, 4dp towards the neighbour (an 8dp gap), 4dp top, 16dp bottom |
| Vertical | 16dp on both sides, 4dp top, 4dp bottom (16dp under the last pill) |

ColorOS 17 draws no dividers between pills. `showDivider = true` adds a 0.33dp hairline between stacked pills.

The neutral (third) pill uses the error tint (`COUIAlertDialogBottomButtonSecondary.Last`); pass `neutralColors` to change it.

## Recommended Button

Pass `recommended` to promote one button to a primary pill filled with the theme color, as `COUIButtonBarLayout.setRecommendButtonId` does. It works in both layouts and does not change whether the bar stacks:

```kotlin
DialogButtonBar(
    negative = DialogButtonBarAction(text = "Cancel", onClick = { /* ... */ }),
    positive = DialogButtonBarAction(text = "Update", onClick = { /* ... */ }),
    recommended = DialogButtonBarRole.Positive,
)
```

## Properties

### DialogButtonBar Properties

| Property        | Type                   | Description                                                                 | Default                                          | Required |
| :-------------- | :--------------------- | :-------------------------------------------------------------------------- | :----------------------------------------------- | :------- |
| negative        | DialogButtonBarAction? | The negative (cancel) action; hidden when null                              | -                                                | Yes      |
| positive        | DialogButtonBarAction? | The positive (confirm) action; hidden when null                             | -                                                | Yes      |
| modifier        | Modifier               | Modifier applied to the bar                                                 | Modifier                                         | No       |
| neutral         | DialogButtonBarAction? | The neutral (third) action; hidden when null                                | null                                             | No       |
| recommended     | DialogButtonBarRole?   | The role drawn as the highlighted primary pill; none when null              | null                                             | No       |
| dynamicLayout   | Boolean                | Whether the bar may stack itself; false pins it horizontal                  | true                                             | No       |
| showDivider     | Boolean                | Whether hairlines are drawn between stacked pills                           | false                                            | No       |
| hasContentAbove | Boolean                | Whether a title, message or custom panel sits above the bar                 | true                                             | No       |
| colors          | TextButtonColors       | Colors of the negative and positive pills                                   | DialogButtonBarDefaults.buttonColors()           | No       |
| neutralColors   | TextButtonColors       | Colors of the neutral pill                                                  | DialogButtonBarDefaults.neutralButtonColors()    | No       |
| recommendedColors | TextButtonColors     | Colors of the recommended pill                                              | DialogButtonBarDefaults.recommendedButtonColors() | No      |
| dividerColor    | Color                  | Color of the optional hairlines                                             | OpalineTheme.colorScheme.dividerLine                | No       |
| textStyle       | TextStyle              | Label text style, also used to measure labels for the stacking decision     | OpalineTheme.textStyles.button                      | No       |

### DialogButtonBarAction Properties

| Property | Type       | Description                        | Default | Required |
| :------- | :--------- | :--------------------------------- | :------ | :------- |
| text     | String     | The button label                   | -       | Yes      |
| enabled  | Boolean    | Whether the button is enabled      | true    | No       |
| onClick  | () -> Unit | Invoked when the button is clicked | -       | Yes      |

### DialogButtonBarDefaults Object

| Property                        | Type | Description                                                         | Value   |
| :------------------------------ | :--- | :------------------------------------------------------------------ | :------ |
| ButtonHorizontalPadding         | Dp   | Horizontal text padding inside a pill                               | 12.dp   |
| ButtonMinHeight                 | Dp   | Minimum height of a pill (`coui_btn_large_height_min`)              | 44.dp   |
| ButtonCornerRadius              | Dp   | Corner radius of a pill (full capsule)                              | 22.dp   |
| CellPaddingOuter                | Dp   | Cell padding on the bar's outer edge                                | 16.dp   |
| CellPaddingInner                | Dp   | Cell padding towards a neighbouring pill                            | 4.dp    |
| CellPaddingTop                  | Dp   | Cell padding above a pill                                           | 4.dp    |
| CellPaddingBottom               | Dp   | Cell padding under the last row                                     | 16.dp   |
| RowButtonPaddingVertical        | Dp   | Vertical text padding of a pill in the horizontal tier              | 4.dp    |
| StackedButtonPaddingVertical    | Dp   | Vertical text padding of a stacked pill                             | 4.dp    |
| StackedButtonPaddingTopExtra    | Dp   | Extra top padding of the top pill when nothing sits above           | 0.dp    |
| StackedButtonPaddingBottomExtra | Dp   | Extra bottom padding of the bottom pill                             | 0.dp    |
| StackedBarMarginTop             | Dp   | Top margin of a stacked bar holding more than one button            | 0.dp    |
| StackedDividerThickness         | Dp   | Thickness of the optional hairline between stacked pills            | 0.33.dp |
| StackedDividerInsetHorizontal   | Dp   | Horizontal inset of the optional hairline                           | 16.dp   |

| Function              | Description                                                                 |
| :-------------------- | :-------------------------------------------------------------------------- |
| buttonColors()        | couiColorContainer8 fill with couiColorLabelPrimary text                    |
| neutralButtonColors() | The same fill with couiColorError text                                      |
| recommendedButtonColors() | Primary pill: couiColorLabelTheme fill with white text                  |

## Behavior Notes

- **The bar carries the panel inset.** The last row of cells has 16dp of bottom padding, so the dialog panel needs no bottom padding of its own.
- **Pills press-scale.** `ButtonNew` keeps `scaleEnable=true`, so pills shrink slightly when pressed, like other COUI buttons.

## Limitations

The ColorOS 17 glass material on the pills (`drawableMaterialEffect`) is not drawn; see `OpalineMaterial` in `opaline-blur`.
