# Icon System

Opaline's icons are the ones ColorOS 17 draws. `opaline-ui` carries the few its own components need
(`OpalineIcons.Basic`); `opaline-icons` adds the icons of the system and its apps
(`OpalineIcons.System`). Every icon has a single weight, as on the system.

## Installation

```kotlin
// build.gradle.kts
commonMain.dependencies {
    implementation("io.github.a1b2d56.opaline:opaline-ui:<version>")
    // OpalineIcons.System
    implementation("io.github.a1b2d56.opaline:opaline-icons:<version>")
}
```

## Usage

Each icon is an extension property in its own file, so import the ones you use:

```kotlin
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.DevicePhone
import io.github.a1b2d56.opaline.icon.system.Settings

Icon(
    imageVector = OpalineIcons.System.Settings,
    contentDescription = "Settings",
    modifier = Modifier.size(24.dp),
)

// Device icons are two-tone: the screen area is drawn at a lower opacity of the tint.
Icon(
    imageVector = OpalineIcons.System.DevicePhone,
    contentDescription = "Phone",
    tint = OpalineTheme.colorScheme.primary,
)
```

Most icons are drawn on a 24dp grid; a few keep the size the system uses (`PasswordShow` and
`PasswordHide` are 34dp, `Search` and `DoNotDisturb` 20dp). `Icon` tints them with the content
color unless you pass `tint`.

## Available Icons

### Basic Icons

Basic icons ship with `opaline-ui` and are the ones Opaline's own components draw: chevrons, the check mark, search and close. Below is the complete list:

| Icon Name | Icon |
|---|---|
| `ArrowRight` | <img src="/icons/basic/ArrowRight.svg" width="24" height="24" /> |
| `ArrowUpDown` | <img src="/icons/basic/ArrowUpDown.svg" width="24" height="24" /> |
| `Check` | <img src="/icons/basic/Check.svg" width="24" height="24" /> |
| `Close` | <img src="/icons/basic/Close.svg" width="24" height="24" /> |
| `Search` | <img src="/icons/basic/Search.svg" width="24" height="24" /> |
| `SearchCleanup` | <img src="/icons/basic/SearchCleanup.svg" width="24" height="24" /> |
| `Sidebar` | <img src="/icons/basic/Sidebar.svg" width="24" height="24" /> |

### System Icons

System icons ship with `opaline-icons` and are the icons ColorOS 17 and its apps draw: the volume panel, connected devices, Settings, and the toolbars of Files, Contacts, Messages, Notes, Photos, Recorder and Clock. Some are two-tone; the lighter layer keeps its relative opacity when tinted. Below is the complete list:

| Icon Name | Icon |
|---|---|
| `Add` | <img src="/icons/system/Add.svg" width="24" height="24" /> |
| `AddContact` | <img src="/icons/system/AddContact.svg" width="24" height="24" /> |
| `AddFolder` | <img src="/icons/system/AddFolder.svg" width="24" height="24" /> |
| `Alarm` | <img src="/icons/system/Alarm.svg" width="24" height="24" /> |
| `Album` | <img src="/icons/system/Album.svg" width="24" height="24" /> |
| `ArrowDown` | <img src="/icons/system/ArrowDown.svg" width="24" height="24" /> |
| `ArrowDropDown` | <img src="/icons/system/ArrowDropDown.svg" width="24" height="24" /> |
| `ArrowUp` | <img src="/icons/system/ArrowUp.svg" width="24" height="24" /> |
| `Back` | <img src="/icons/system/Back.svg" width="24" height="24" /> |
| `Backspace` | <img src="/icons/system/Backspace.svg" width="24" height="24" /> |
| `BellFill` | <img src="/icons/system/BellFill.svg" width="24" height="24" /> |
| `Birthday` | <img src="/icons/system/Birthday.svg" width="24" height="24" /> |
| `BlockContact` | <img src="/icons/system/BlockContact.svg" width="24" height="24" /> |
| `BrightnessHigh` | <img src="/icons/system/BrightnessHigh.svg" width="24" height="24" /> |
| `BrightnessLow` | <img src="/icons/system/BrightnessLow.svg" width="24" height="24" /> |
| `Brush` | <img src="/icons/system/Brush.svg" width="24" height="24" /> |
| `Calendar` | <img src="/icons/system/Calendar.svg" width="24" height="24" /> |
| `Call` | <img src="/icons/system/Call.svg" width="24" height="24" /> |
| `CallFill` | <img src="/icons/system/CallFill.svg" width="24" height="24" /> |
| `Camera` | <img src="/icons/system/Camera.svg" width="24" height="24" /> |
| `Cancel` | <img src="/icons/system/Cancel.svg" width="24" height="24" /> |
| `Captions` | <img src="/icons/system/Captions.svg" width="24" height="24" /> |
| `CaptionsOff` | <img src="/icons/system/CaptionsOff.svg" width="24" height="24" /> |
| `Checklist` | <img src="/icons/system/Checklist.svg" width="24" height="24" /> |
| `ChevronBackward` | <img src="/icons/system/ChevronBackward.svg" width="24" height="24" /> |
| `ChevronForward` | <img src="/icons/system/ChevronForward.svg" width="24" height="24" /> |
| `Clear` | <img src="/icons/system/Clear.svg" width="24" height="24" /> |
| `Cloud` | <img src="/icons/system/Cloud.svg" width="24" height="24" /> |
| `CloudDone` | <img src="/icons/system/CloudDone.svg" width="24" height="24" /> |
| `CloudFill` | <img src="/icons/system/CloudFill.svg" width="24" height="24" /> |
| `CloudSync` | <img src="/icons/system/CloudSync.svg" width="24" height="24" /> |
| `CloudUpload` | <img src="/icons/system/CloudUpload.svg" width="24" height="24" /> |
| `Contacts` | <img src="/icons/system/Contacts.svg" width="24" height="24" /> |
| `Copy` | <img src="/icons/system/Copy.svg" width="24" height="24" /> |
| `Crop` | <img src="/icons/system/Crop.svg" width="24" height="24" /> |
| `Cut` | <img src="/icons/system/Cut.svg" width="24" height="24" /> |
| `Delete` | <img src="/icons/system/Delete.svg" width="24" height="24" /> |
| `DeselectAll` | <img src="/icons/system/DeselectAll.svg" width="24" height="24" /> |
| `DeviceAirConditioner` | <img src="/icons/system/DeviceAirConditioner.svg" width="24" height="24" /> |
| `DeviceBand` | <img src="/icons/system/DeviceBand.svg" width="24" height="24" /> |
| `DeviceCamera` | <img src="/icons/system/DeviceCamera.svg" width="24" height="24" /> |
| `DeviceCar` | <img src="/icons/system/DeviceCar.svg" width="24" height="24" /> |
| `DeviceDesktop` | <img src="/icons/system/DeviceDesktop.svg" width="24" height="24" /> |
| `DeviceEarbudLeft` | <img src="/icons/system/DeviceEarbudLeft.svg" width="24" height="24" /> |
| `DeviceEarbudRight` | <img src="/icons/system/DeviceEarbudRight.svg" width="24" height="24" /> |
| `DeviceEarbuds` | <img src="/icons/system/DeviceEarbuds.svg" width="24" height="24" /> |
| `DeviceEarbudsCase` | <img src="/icons/system/DeviceEarbudsCase.svg" width="24" height="24" /> |
| `DeviceFan` | <img src="/icons/system/DeviceFan.svg" width="24" height="24" /> |
| `DeviceKeyboard` | <img src="/icons/system/DeviceKeyboard.svg" width="24" height="24" /> |
| `DeviceLamp` | <img src="/icons/system/DeviceLamp.svg" width="24" height="24" /> |
| `DeviceLaptop` | <img src="/icons/system/DeviceLaptop.svg" width="24" height="24" /> |
| `DeviceNeckband` | <img src="/icons/system/DeviceNeckband.svg" width="24" height="24" /> |
| `DevicePhone` | <img src="/icons/system/DevicePhone.svg" width="24" height="24" /> |
| `DeviceScooter` | <img src="/icons/system/DeviceScooter.svg" width="24" height="24" /> |
| `DeviceSpeaker` | <img src="/icons/system/DeviceSpeaker.svg" width="24" height="24" /> |
| `DeviceStylus` | <img src="/icons/system/DeviceStylus.svg" width="24" height="24" /> |
| `DeviceTablet` | <img src="/icons/system/DeviceTablet.svg" width="24" height="24" /> |
| `DeviceTv` | <img src="/icons/system/DeviceTv.svg" width="24" height="24" /> |
| `DeviceWasher` | <img src="/icons/system/DeviceWasher.svg" width="24" height="24" /> |
| `DeviceWatch` | <img src="/icons/system/DeviceWatch.svg" width="24" height="24" /> |
| `DeviceWaterHeater` | <img src="/icons/system/DeviceWaterHeater.svg" width="24" height="24" /> |
| `Disable` | <img src="/icons/system/Disable.svg" width="24" height="24" /> |
| `Dislike` | <img src="/icons/system/Dislike.svg" width="24" height="24" /> |
| `DoNotDisturb` | <img src="/icons/system/DoNotDisturb.svg" width="24" height="24" /> |
| `Document` | <img src="/icons/system/Document.svg" width="24" height="24" /> |
| `Done` | <img src="/icons/system/Done.svg" width="24" height="24" /> |
| `Download` | <img src="/icons/system/Download.svg" width="24" height="24" /> |
| `Draw` | <img src="/icons/system/Draw.svg" width="24" height="24" /> |
| `Edit` | <img src="/icons/system/Edit.svg" width="24" height="24" /> |
| `Email` | <img src="/icons/system/Email.svg" width="24" height="24" /> |
| `EmailFill` | <img src="/icons/system/EmailFill.svg" width="24" height="24" /> |
| `Expand` | <img src="/icons/system/Expand.svg" width="24" height="24" /> |
| `Export` | <img src="/icons/system/Export.svg" width="24" height="24" /> |
| `Favorites` | <img src="/icons/system/Favorites.svg" width="24" height="24" /> |
| `FavoritesFill` | <img src="/icons/system/FavoritesFill.svg" width="24" height="24" /> |
| `Feedback` | <img src="/icons/system/Feedback.svg" width="24" height="24" /> |
| `Filter` | <img src="/icons/system/Filter.svg" width="24" height="24" /> |
| `Flag` | <img src="/icons/system/Flag.svg" width="24" height="24" /> |
| `Flashlight` | <img src="/icons/system/Flashlight.svg" width="24" height="24" /> |
| `Flight` | <img src="/icons/system/Flight.svg" width="24" height="24" /> |
| `Folder` | <img src="/icons/system/Folder.svg" width="24" height="24" /> |
| `ForceStop` | <img src="/icons/system/ForceStop.svg" width="24" height="24" /> |
| `Forward` | <img src="/icons/system/Forward.svg" width="24" height="24" /> |
| `Gift` | <img src="/icons/system/Gift.svg" width="24" height="24" /> |
| `Globe` | <img src="/icons/system/Globe.svg" width="24" height="24" /> |
| `GridView` | <img src="/icons/system/GridView.svg" width="24" height="24" /> |
| `Group` | <img src="/icons/system/Group.svg" width="24" height="24" /> |
| `Help` | <img src="/icons/system/Help.svg" width="24" height="24" /> |
| `History` | <img src="/icons/system/History.svg" width="24" height="24" /> |
| `Home` | <img src="/icons/system/Home.svg" width="24" height="24" /> |
| `Image` | <img src="/icons/system/Image.svg" width="24" height="24" /> |
| `Import` | <img src="/icons/system/Import.svg" width="24" height="24" /> |
| `Info` | <img src="/icons/system/Info.svg" width="24" height="24" /> |
| `Install` | <img src="/icons/system/Install.svg" width="24" height="24" /> |
| `KeyMeta` | <img src="/icons/system/KeyMeta.svg" width="24" height="24" /> |
| `Keyboard` | <img src="/icons/system/Keyboard.svg" width="24" height="24" /> |
| `Label` | <img src="/icons/system/Label.svg" width="24" height="24" /> |
| `Like` | <img src="/icons/system/Like.svg" width="24" height="24" /> |
| `Link` | <img src="/icons/system/Link.svg" width="24" height="24" /> |
| `ListView` | <img src="/icons/system/ListView.svg" width="24" height="24" /> |
| `Location` | <img src="/icons/system/Location.svg" width="24" height="24" /> |
| `Lock` | <img src="/icons/system/Lock.svg" width="24" height="24" /> |
| `Menu` | <img src="/icons/system/Menu.svg" width="24" height="24" /> |
| `Merge` | <img src="/icons/system/Merge.svg" width="24" height="24" /> |
| `Messages` | <img src="/icons/system/Messages.svg" width="24" height="24" /> |
| `MessagesFill` | <img src="/icons/system/MessagesFill.svg" width="24" height="24" /> |
| `Mic` | <img src="/icons/system/Mic.svg" width="24" height="24" /> |
| `MoreHorizontal` | <img src="/icons/system/MoreHorizontal.svg" width="24" height="24" /> |
| `MoreVertical` | <img src="/icons/system/MoreVertical.svg" width="24" height="24" /> |
| `Navigate` | <img src="/icons/system/Navigate.svg" width="24" height="24" /> |
| `Next` | <img src="/icons/system/Next.svg" width="24" height="24" /> |
| `Notebook` | <img src="/icons/system/Notebook.svg" width="24" height="24" /> |
| `Notes` | <img src="/icons/system/Notes.svg" width="24" height="24" /> |
| `Open` | <img src="/icons/system/Open.svg" width="24" height="24" /> |
| `PasswordHide` | <img src="/icons/system/PasswordHide.svg" width="24" height="24" /> |
| `PasswordShow` | <img src="/icons/system/PasswordShow.svg" width="24" height="24" /> |
| `Paste` | <img src="/icons/system/Paste.svg" width="24" height="24" /> |
| `Pause` | <img src="/icons/system/Pause.svg" width="24" height="24" /> |
| `Pets` | <img src="/icons/system/Pets.svg" width="24" height="24" /> |
| `PhoneStorage` | <img src="/icons/system/PhoneStorage.svg" width="24" height="24" /> |
| `Pin` | <img src="/icons/system/Pin.svg" width="24" height="24" /> |
| `Play` | <img src="/icons/system/Play.svg" width="24" height="24" /> |
| `Power` | <img src="/icons/system/Power.svg" width="24" height="24" /> |
| `QrCode` | <img src="/icons/system/QrCode.svg" width="24" height="24" /> |
| `Recent` | <img src="/icons/system/Recent.svg" width="24" height="24" /> |
| `Redo` | <img src="/icons/system/Redo.svg" width="24" height="24" /> |
| `Refresh` | <img src="/icons/system/Refresh.svg" width="24" height="24" /> |
| `RemoveContact` | <img src="/icons/system/RemoveContact.svg" width="24" height="24" /> |
| `Rename` | <img src="/icons/system/Rename.svg" width="24" height="24" /> |
| `Replace` | <img src="/icons/system/Replace.svg" width="24" height="24" /> |
| `Restore` | <img src="/icons/system/Restore.svg" width="24" height="24" /> |
| `RingerRing` | <img src="/icons/system/RingerRing.svg" width="24" height="24" /> |
| `RingerSilent` | <img src="/icons/system/RingerSilent.svg" width="24" height="24" /> |
| `RingerVibrate` | <img src="/icons/system/RingerVibrate.svg" width="24" height="24" /> |
| `Scan` | <img src="/icons/system/Scan.svg" width="24" height="24" /> |
| `SdCard` | <img src="/icons/system/SdCard.svg" width="24" height="24" /> |
| `Search` | <img src="/icons/system/Search.svg" width="24" height="24" /> |
| `SeekBackward` | <img src="/icons/system/SeekBackward.svg" width="24" height="24" /> |
| `SeekForward` | <img src="/icons/system/SeekForward.svg" width="24" height="24" /> |
| `SelectAll` | <img src="/icons/system/SelectAll.svg" width="24" height="24" /> |
| `Send` | <img src="/icons/system/Send.svg" width="24" height="24" /> |
| `SensorsOff` | <img src="/icons/system/SensorsOff.svg" width="24" height="24" /> |
| `Settings` | <img src="/icons/system/Settings.svg" width="24" height="24" /> |
| `SettingsAboutDevice` | <img src="/icons/system/SettingsAboutDevice.svg" width="24" height="24" /> |
| `SettingsAccessibility` | <img src="/icons/system/SettingsAccessibility.svg" width="24" height="24" /> |
| `SettingsAccounts` | <img src="/icons/system/SettingsAccounts.svg" width="24" height="24" /> |
| `SettingsApps` | <img src="/icons/system/SettingsApps.svg" width="24" height="24" /> |
| `SettingsBattery` | <img src="/icons/system/SettingsBattery.svg" width="24" height="24" /> |
| `SettingsBluetooth` | <img src="/icons/system/SettingsBluetooth.svg" width="24" height="24" /> |
| `SettingsCloud` | <img src="/icons/system/SettingsCloud.svg" width="24" height="24" /> |
| `SettingsConnections` | <img src="/icons/system/SettingsConnections.svg" width="24" height="24" /> |
| `SettingsDisplay` | <img src="/icons/system/SettingsDisplay.svg" width="24" height="24" /> |
| `SettingsEmergency` | <img src="/icons/system/SettingsEmergency.svg" width="24" height="24" /> |
| `SettingsFoldable` | <img src="/icons/system/SettingsFoldable.svg" width="24" height="24" /> |
| `SettingsLocation` | <img src="/icons/system/SettingsLocation.svg" width="24" height="24" /> |
| `SettingsMobileNetwork` | <img src="/icons/system/SettingsMobileNetwork.svg" width="24" height="24" /> |
| `SettingsNotifications` | <img src="/icons/system/SettingsNotifications.svg" width="24" height="24" /> |
| `SettingsPersonalization` | <img src="/icons/system/SettingsPersonalization.svg" width="24" height="24" /> |
| `SettingsPrivacy` | <img src="/icons/system/SettingsPrivacy.svg" width="24" height="24" /> |
| `SettingsSecurity` | <img src="/icons/system/SettingsSecurity.svg" width="24" height="24" /> |
| `SettingsSound` | <img src="/icons/system/SettingsSound.svg" width="24" height="24" /> |
| `SettingsSystem` | <img src="/icons/system/SettingsSystem.svg" width="24" height="24" /> |
| `SettingsWallpaper` | <img src="/icons/system/SettingsWallpaper.svg" width="24" height="24" /> |
| `SettingsWellbeing` | <img src="/icons/system/SettingsWellbeing.svg" width="24" height="24" /> |
| `SettingsWifi` | <img src="/icons/system/SettingsWifi.svg" width="24" height="24" /> |
| `Share` | <img src="/icons/system/Share.svg" width="24" height="24" /> |
| `Shield` | <img src="/icons/system/Shield.svg" width="24" height="24" /> |
| `Shopping` | <img src="/icons/system/Shopping.svg" width="24" height="24" /> |
| `Sim1` | <img src="/icons/system/Sim1.svg" width="24" height="24" /> |
| `Sim2` | <img src="/icons/system/Sim2.svg" width="24" height="24" /> |
| `Sort` | <img src="/icons/system/Sort.svg" width="24" height="24" /> |
| `SplitHorizontal` | <img src="/icons/system/SplitHorizontal.svg" width="24" height="24" /> |
| `SplitVertical` | <img src="/icons/system/SplitVertical.svg" width="24" height="24" /> |
| `Star` | <img src="/icons/system/Star.svg" width="24" height="24" /> |
| `StarFill` | <img src="/icons/system/StarFill.svg" width="24" height="24" /> |
| `StarOff` | <img src="/icons/system/StarOff.svg" width="24" height="24" /> |
| `Stopwatch` | <img src="/icons/system/Stopwatch.svg" width="24" height="24" /> |
| `Store` | <img src="/icons/system/Store.svg" width="24" height="24" /> |
| `Sync` | <img src="/icons/system/Sync.svg" width="24" height="24" /> |
| `TextBox` | <img src="/icons/system/TextBox.svg" width="24" height="24" /> |
| `Timer` | <img src="/icons/system/Timer.svg" width="24" height="24" /> |
| `Todo` | <img src="/icons/system/Todo.svg" width="24" height="24" /> |
| `Touch` | <img src="/icons/system/Touch.svg" width="24" height="24" /> |
| `Translate` | <img src="/icons/system/Translate.svg" width="24" height="24" /> |
| `Trim` | <img src="/icons/system/Trim.svg" width="24" height="24" /> |
| `Tune` | <img src="/icons/system/Tune.svg" width="24" height="24" /> |
| `Undo` | <img src="/icons/system/Undo.svg" width="24" height="24" /> |
| `Uninstall` | <img src="/icons/system/Uninstall.svg" width="24" height="24" /> |
| `Unlock` | <img src="/icons/system/Unlock.svg" width="24" height="24" /> |
| `Unpin` | <img src="/icons/system/Unpin.svg" width="24" height="24" /> |
| `Video` | <img src="/icons/system/Video.svg" width="24" height="24" /> |
| `VideoCallFill` | <img src="/icons/system/VideoCallFill.svg" width="24" height="24" /> |
| `VoiceToText` | <img src="/icons/system/VoiceToText.svg" width="24" height="24" /> |
| `Voicemail` | <img src="/icons/system/Voicemail.svg" width="24" height="24" /> |
| `VolumeAccessibility` | <img src="/icons/system/VolumeAccessibility.svg" width="24" height="24" /> |
| `VolumeAlarm` | <img src="/icons/system/VolumeAlarm.svg" width="24" height="24" /> |
| `VolumeAlarmMute` | <img src="/icons/system/VolumeAlarmMute.svg" width="24" height="24" /> |
| `VolumeAssistant` | <img src="/icons/system/VolumeAssistant.svg" width="24" height="24" /> |
| `VolumeBluetooth` | <img src="/icons/system/VolumeBluetooth.svg" width="24" height="24" /> |
| `VolumeBluetoothMute` | <img src="/icons/system/VolumeBluetoothMute.svg" width="24" height="24" /> |
| `VolumeCall` | <img src="/icons/system/VolumeCall.svg" width="24" height="24" /> |
| `VolumeHeadphones` | <img src="/icons/system/VolumeHeadphones.svg" width="24" height="24" /> |
| `VolumeHeadphonesMute` | <img src="/icons/system/VolumeHeadphonesMute.svg" width="24" height="24" /> |
| `VolumeHigh` | <img src="/icons/system/VolumeHigh.svg" width="24" height="24" /> |
| `VolumeLow` | <img src="/icons/system/VolumeLow.svg" width="24" height="24" /> |
| `VolumeMedia` | <img src="/icons/system/VolumeMedia.svg" width="24" height="24" /> |
| `VolumeMediaMute` | <img src="/icons/system/VolumeMediaMute.svg" width="24" height="24" /> |
| `VolumeNotification` | <img src="/icons/system/VolumeNotification.svg" width="24" height="24" /> |
| `VolumeNotificationMute` | <img src="/icons/system/VolumeNotificationMute.svg" width="24" height="24" /> |
| `VolumeRinger` | <img src="/icons/system/VolumeRinger.svg" width="24" height="24" /> |
| `VolumeRingerMute` | <img src="/icons/system/VolumeRingerMute.svg" width="24" height="24" /> |
| `VolumeVibrate` | <img src="/icons/system/VolumeVibrate.svg" width="24" height="24" /> |
| `VolumeVoice` | <img src="/icons/system/VolumeVoice.svg" width="24" height="24" /> |
| `Vpn` | <img src="/icons/system/Vpn.svg" width="24" height="24" /> |
| `Warning` | <img src="/icons/system/Warning.svg" width="24" height="24" /> |
| `WindowInfo` | <img src="/icons/system/WindowInfo.svg" width="24" height="24" /> |
| `WorldClock` | <img src="/icons/system/WorldClock.svg" width="24" height="24" /> |

