// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package utils

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.Add
import io.github.a1b2d56.opaline.icon.system.AddContact
import io.github.a1b2d56.opaline.icon.system.AddFolder
import io.github.a1b2d56.opaline.icon.system.Alarm
import io.github.a1b2d56.opaline.icon.system.Album
import io.github.a1b2d56.opaline.icon.system.ArrowDown
import io.github.a1b2d56.opaline.icon.system.ArrowDropDown
import io.github.a1b2d56.opaline.icon.system.ArrowUp
import io.github.a1b2d56.opaline.icon.system.Back
import io.github.a1b2d56.opaline.icon.system.Backspace
import io.github.a1b2d56.opaline.icon.system.BellFill
import io.github.a1b2d56.opaline.icon.system.Birthday
import io.github.a1b2d56.opaline.icon.system.BlockContact
import io.github.a1b2d56.opaline.icon.system.BrightnessHigh
import io.github.a1b2d56.opaline.icon.system.BrightnessLow
import io.github.a1b2d56.opaline.icon.system.Brush
import io.github.a1b2d56.opaline.icon.system.Calendar
import io.github.a1b2d56.opaline.icon.system.Call
import io.github.a1b2d56.opaline.icon.system.CallFill
import io.github.a1b2d56.opaline.icon.system.Camera
import io.github.a1b2d56.opaline.icon.system.Cancel
import io.github.a1b2d56.opaline.icon.system.Captions
import io.github.a1b2d56.opaline.icon.system.CaptionsOff
import io.github.a1b2d56.opaline.icon.system.Checklist
import io.github.a1b2d56.opaline.icon.system.ChevronBackward
import io.github.a1b2d56.opaline.icon.system.ChevronForward
import io.github.a1b2d56.opaline.icon.system.Clear
import io.github.a1b2d56.opaline.icon.system.Cloud
import io.github.a1b2d56.opaline.icon.system.CloudDone
import io.github.a1b2d56.opaline.icon.system.CloudFill
import io.github.a1b2d56.opaline.icon.system.CloudSync
import io.github.a1b2d56.opaline.icon.system.CloudUpload
import io.github.a1b2d56.opaline.icon.system.Contacts
import io.github.a1b2d56.opaline.icon.system.Copy
import io.github.a1b2d56.opaline.icon.system.Crop
import io.github.a1b2d56.opaline.icon.system.Cut
import io.github.a1b2d56.opaline.icon.system.Delete
import io.github.a1b2d56.opaline.icon.system.DeselectAll
import io.github.a1b2d56.opaline.icon.system.DeviceAirConditioner
import io.github.a1b2d56.opaline.icon.system.DeviceBand
import io.github.a1b2d56.opaline.icon.system.DeviceCamera
import io.github.a1b2d56.opaline.icon.system.DeviceCar
import io.github.a1b2d56.opaline.icon.system.DeviceDesktop
import io.github.a1b2d56.opaline.icon.system.DeviceEarbudLeft
import io.github.a1b2d56.opaline.icon.system.DeviceEarbudRight
import io.github.a1b2d56.opaline.icon.system.DeviceEarbuds
import io.github.a1b2d56.opaline.icon.system.DeviceEarbudsCase
import io.github.a1b2d56.opaline.icon.system.DeviceFan
import io.github.a1b2d56.opaline.icon.system.DeviceKeyboard
import io.github.a1b2d56.opaline.icon.system.DeviceLamp
import io.github.a1b2d56.opaline.icon.system.DeviceLaptop
import io.github.a1b2d56.opaline.icon.system.DeviceNeckband
import io.github.a1b2d56.opaline.icon.system.DevicePhone
import io.github.a1b2d56.opaline.icon.system.DeviceScooter
import io.github.a1b2d56.opaline.icon.system.DeviceSpeaker
import io.github.a1b2d56.opaline.icon.system.DeviceStylus
import io.github.a1b2d56.opaline.icon.system.DeviceTablet
import io.github.a1b2d56.opaline.icon.system.DeviceTv
import io.github.a1b2d56.opaline.icon.system.DeviceWasher
import io.github.a1b2d56.opaline.icon.system.DeviceWatch
import io.github.a1b2d56.opaline.icon.system.DeviceWaterHeater
import io.github.a1b2d56.opaline.icon.system.Disable
import io.github.a1b2d56.opaline.icon.system.Dislike
import io.github.a1b2d56.opaline.icon.system.DoNotDisturb
import io.github.a1b2d56.opaline.icon.system.Document
import io.github.a1b2d56.opaline.icon.system.Done
import io.github.a1b2d56.opaline.icon.system.Download
import io.github.a1b2d56.opaline.icon.system.Draw
import io.github.a1b2d56.opaline.icon.system.Edit
import io.github.a1b2d56.opaline.icon.system.Email
import io.github.a1b2d56.opaline.icon.system.EmailFill
import io.github.a1b2d56.opaline.icon.system.Expand
import io.github.a1b2d56.opaline.icon.system.Export
import io.github.a1b2d56.opaline.icon.system.Favorites
import io.github.a1b2d56.opaline.icon.system.FavoritesFill
import io.github.a1b2d56.opaline.icon.system.Feedback
import io.github.a1b2d56.opaline.icon.system.Filter
import io.github.a1b2d56.opaline.icon.system.Flag
import io.github.a1b2d56.opaline.icon.system.Flashlight
import io.github.a1b2d56.opaline.icon.system.Flight
import io.github.a1b2d56.opaline.icon.system.Folder
import io.github.a1b2d56.opaline.icon.system.ForceStop
import io.github.a1b2d56.opaline.icon.system.Forward
import io.github.a1b2d56.opaline.icon.system.Gift
import io.github.a1b2d56.opaline.icon.system.Globe
import io.github.a1b2d56.opaline.icon.system.GridView
import io.github.a1b2d56.opaline.icon.system.Group
import io.github.a1b2d56.opaline.icon.system.Help
import io.github.a1b2d56.opaline.icon.system.History
import io.github.a1b2d56.opaline.icon.system.Home
import io.github.a1b2d56.opaline.icon.system.Image
import io.github.a1b2d56.opaline.icon.system.Import
import io.github.a1b2d56.opaline.icon.system.Info
import io.github.a1b2d56.opaline.icon.system.Install
import io.github.a1b2d56.opaline.icon.system.KeyMeta
import io.github.a1b2d56.opaline.icon.system.Keyboard
import io.github.a1b2d56.opaline.icon.system.Label
import io.github.a1b2d56.opaline.icon.system.Like
import io.github.a1b2d56.opaline.icon.system.Link
import io.github.a1b2d56.opaline.icon.system.ListView
import io.github.a1b2d56.opaline.icon.system.Location
import io.github.a1b2d56.opaline.icon.system.Lock
import io.github.a1b2d56.opaline.icon.system.Menu
import io.github.a1b2d56.opaline.icon.system.Merge
import io.github.a1b2d56.opaline.icon.system.Messages
import io.github.a1b2d56.opaline.icon.system.MessagesFill
import io.github.a1b2d56.opaline.icon.system.Mic
import io.github.a1b2d56.opaline.icon.system.MoreHorizontal
import io.github.a1b2d56.opaline.icon.system.MoreVertical
import io.github.a1b2d56.opaline.icon.system.Navigate
import io.github.a1b2d56.opaline.icon.system.Next
import io.github.a1b2d56.opaline.icon.system.Notebook
import io.github.a1b2d56.opaline.icon.system.Notes
import io.github.a1b2d56.opaline.icon.system.Open
import io.github.a1b2d56.opaline.icon.system.PasswordHide
import io.github.a1b2d56.opaline.icon.system.PasswordShow
import io.github.a1b2d56.opaline.icon.system.Paste
import io.github.a1b2d56.opaline.icon.system.Pause
import io.github.a1b2d56.opaline.icon.system.Pets
import io.github.a1b2d56.opaline.icon.system.PhoneStorage
import io.github.a1b2d56.opaline.icon.system.Pin
import io.github.a1b2d56.opaline.icon.system.Play
import io.github.a1b2d56.opaline.icon.system.Power
import io.github.a1b2d56.opaline.icon.system.QrCode
import io.github.a1b2d56.opaline.icon.system.Recent
import io.github.a1b2d56.opaline.icon.system.Redo
import io.github.a1b2d56.opaline.icon.system.Refresh
import io.github.a1b2d56.opaline.icon.system.RemoveContact
import io.github.a1b2d56.opaline.icon.system.Rename
import io.github.a1b2d56.opaline.icon.system.Replace
import io.github.a1b2d56.opaline.icon.system.Restore
import io.github.a1b2d56.opaline.icon.system.RingerRing
import io.github.a1b2d56.opaline.icon.system.RingerSilent
import io.github.a1b2d56.opaline.icon.system.RingerVibrate
import io.github.a1b2d56.opaline.icon.system.Scan
import io.github.a1b2d56.opaline.icon.system.SdCard
import io.github.a1b2d56.opaline.icon.system.Search
import io.github.a1b2d56.opaline.icon.system.SeekBackward
import io.github.a1b2d56.opaline.icon.system.SeekForward
import io.github.a1b2d56.opaline.icon.system.SelectAll
import io.github.a1b2d56.opaline.icon.system.Send
import io.github.a1b2d56.opaline.icon.system.SensorsOff
import io.github.a1b2d56.opaline.icon.system.Settings
import io.github.a1b2d56.opaline.icon.system.SettingsAboutDevice
import io.github.a1b2d56.opaline.icon.system.SettingsAccessibility
import io.github.a1b2d56.opaline.icon.system.SettingsAccounts
import io.github.a1b2d56.opaline.icon.system.SettingsApps
import io.github.a1b2d56.opaline.icon.system.SettingsBattery
import io.github.a1b2d56.opaline.icon.system.SettingsBluetooth
import io.github.a1b2d56.opaline.icon.system.SettingsCloud
import io.github.a1b2d56.opaline.icon.system.SettingsConnections
import io.github.a1b2d56.opaline.icon.system.SettingsDisplay
import io.github.a1b2d56.opaline.icon.system.SettingsEmergency
import io.github.a1b2d56.opaline.icon.system.SettingsFoldable
import io.github.a1b2d56.opaline.icon.system.SettingsLocation
import io.github.a1b2d56.opaline.icon.system.SettingsMobileNetwork
import io.github.a1b2d56.opaline.icon.system.SettingsNotifications
import io.github.a1b2d56.opaline.icon.system.SettingsPersonalization
import io.github.a1b2d56.opaline.icon.system.SettingsPrivacy
import io.github.a1b2d56.opaline.icon.system.SettingsSecurity
import io.github.a1b2d56.opaline.icon.system.SettingsSound
import io.github.a1b2d56.opaline.icon.system.SettingsSystem
import io.github.a1b2d56.opaline.icon.system.SettingsWallpaper
import io.github.a1b2d56.opaline.icon.system.SettingsWellbeing
import io.github.a1b2d56.opaline.icon.system.SettingsWifi
import io.github.a1b2d56.opaline.icon.system.Share
import io.github.a1b2d56.opaline.icon.system.Shield
import io.github.a1b2d56.opaline.icon.system.Shopping
import io.github.a1b2d56.opaline.icon.system.Sim1
import io.github.a1b2d56.opaline.icon.system.Sim2
import io.github.a1b2d56.opaline.icon.system.Sort
import io.github.a1b2d56.opaline.icon.system.SplitHorizontal
import io.github.a1b2d56.opaline.icon.system.SplitVertical
import io.github.a1b2d56.opaline.icon.system.Star
import io.github.a1b2d56.opaline.icon.system.StarFill
import io.github.a1b2d56.opaline.icon.system.StarOff
import io.github.a1b2d56.opaline.icon.system.Stopwatch
import io.github.a1b2d56.opaline.icon.system.Store
import io.github.a1b2d56.opaline.icon.system.Sync
import io.github.a1b2d56.opaline.icon.system.TextBox
import io.github.a1b2d56.opaline.icon.system.Timer
import io.github.a1b2d56.opaline.icon.system.Todo
import io.github.a1b2d56.opaline.icon.system.Touch
import io.github.a1b2d56.opaline.icon.system.Translate
import io.github.a1b2d56.opaline.icon.system.Trim
import io.github.a1b2d56.opaline.icon.system.Tune
import io.github.a1b2d56.opaline.icon.system.Undo
import io.github.a1b2d56.opaline.icon.system.Uninstall
import io.github.a1b2d56.opaline.icon.system.Unlock
import io.github.a1b2d56.opaline.icon.system.Unpin
import io.github.a1b2d56.opaline.icon.system.Video
import io.github.a1b2d56.opaline.icon.system.VideoCallFill
import io.github.a1b2d56.opaline.icon.system.VoiceToText
import io.github.a1b2d56.opaline.icon.system.Voicemail
import io.github.a1b2d56.opaline.icon.system.VolumeAccessibility
import io.github.a1b2d56.opaline.icon.system.VolumeAlarm
import io.github.a1b2d56.opaline.icon.system.VolumeAlarmMute
import io.github.a1b2d56.opaline.icon.system.VolumeAssistant
import io.github.a1b2d56.opaline.icon.system.VolumeBluetooth
import io.github.a1b2d56.opaline.icon.system.VolumeBluetoothMute
import io.github.a1b2d56.opaline.icon.system.VolumeCall
import io.github.a1b2d56.opaline.icon.system.VolumeHeadphones
import io.github.a1b2d56.opaline.icon.system.VolumeHeadphonesMute
import io.github.a1b2d56.opaline.icon.system.VolumeHigh
import io.github.a1b2d56.opaline.icon.system.VolumeLow
import io.github.a1b2d56.opaline.icon.system.VolumeMedia
import io.github.a1b2d56.opaline.icon.system.VolumeMediaMute
import io.github.a1b2d56.opaline.icon.system.VolumeNotification
import io.github.a1b2d56.opaline.icon.system.VolumeNotificationMute
import io.github.a1b2d56.opaline.icon.system.VolumeRinger
import io.github.a1b2d56.opaline.icon.system.VolumeRingerMute
import io.github.a1b2d56.opaline.icon.system.VolumeVibrate
import io.github.a1b2d56.opaline.icon.system.VolumeVoice
import io.github.a1b2d56.opaline.icon.system.Vpn
import io.github.a1b2d56.opaline.icon.system.Warning
import io.github.a1b2d56.opaline.icon.system.WindowInfo
import io.github.a1b2d56.opaline.icon.system.WorldClock

val OpalineIcons.All: List<ImageVector>
    get() = listOf(
        OpalineIcons.System.Add,
        OpalineIcons.System.AddContact,
        OpalineIcons.System.AddFolder,
        OpalineIcons.System.Alarm,
        OpalineIcons.System.Album,
        OpalineIcons.System.ArrowDown,
        OpalineIcons.System.ArrowDropDown,
        OpalineIcons.System.ArrowUp,
        OpalineIcons.System.Back,
        OpalineIcons.System.Backspace,
        OpalineIcons.System.BellFill,
        OpalineIcons.System.Birthday,
        OpalineIcons.System.BlockContact,
        OpalineIcons.System.BrightnessHigh,
        OpalineIcons.System.BrightnessLow,
        OpalineIcons.System.Brush,
        OpalineIcons.System.Calendar,
        OpalineIcons.System.Call,
        OpalineIcons.System.CallFill,
        OpalineIcons.System.Camera,
        OpalineIcons.System.Cancel,
        OpalineIcons.System.Captions,
        OpalineIcons.System.CaptionsOff,
        OpalineIcons.System.Checklist,
        OpalineIcons.System.ChevronBackward,
        OpalineIcons.System.ChevronForward,
        OpalineIcons.System.Clear,
        OpalineIcons.System.Cloud,
        OpalineIcons.System.CloudDone,
        OpalineIcons.System.CloudFill,
        OpalineIcons.System.CloudSync,
        OpalineIcons.System.CloudUpload,
        OpalineIcons.System.Contacts,
        OpalineIcons.System.Copy,
        OpalineIcons.System.Crop,
        OpalineIcons.System.Cut,
        OpalineIcons.System.Delete,
        OpalineIcons.System.DeselectAll,
        OpalineIcons.System.DeviceAirConditioner,
        OpalineIcons.System.DeviceBand,
        OpalineIcons.System.DeviceCamera,
        OpalineIcons.System.DeviceCar,
        OpalineIcons.System.DeviceDesktop,
        OpalineIcons.System.DeviceEarbudLeft,
        OpalineIcons.System.DeviceEarbudRight,
        OpalineIcons.System.DeviceEarbuds,
        OpalineIcons.System.DeviceEarbudsCase,
        OpalineIcons.System.DeviceFan,
        OpalineIcons.System.DeviceKeyboard,
        OpalineIcons.System.DeviceLamp,
        OpalineIcons.System.DeviceLaptop,
        OpalineIcons.System.DeviceNeckband,
        OpalineIcons.System.DevicePhone,
        OpalineIcons.System.DeviceScooter,
        OpalineIcons.System.DeviceSpeaker,
        OpalineIcons.System.DeviceStylus,
        OpalineIcons.System.DeviceTablet,
        OpalineIcons.System.DeviceTv,
        OpalineIcons.System.DeviceWasher,
        OpalineIcons.System.DeviceWatch,
        OpalineIcons.System.DeviceWaterHeater,
        OpalineIcons.System.Disable,
        OpalineIcons.System.Dislike,
        OpalineIcons.System.DoNotDisturb,
        OpalineIcons.System.Document,
        OpalineIcons.System.Done,
        OpalineIcons.System.Download,
        OpalineIcons.System.Draw,
        OpalineIcons.System.Edit,
        OpalineIcons.System.Email,
        OpalineIcons.System.EmailFill,
        OpalineIcons.System.Expand,
        OpalineIcons.System.Export,
        OpalineIcons.System.Favorites,
        OpalineIcons.System.FavoritesFill,
        OpalineIcons.System.Feedback,
        OpalineIcons.System.Filter,
        OpalineIcons.System.Flag,
        OpalineIcons.System.Flashlight,
        OpalineIcons.System.Flight,
        OpalineIcons.System.Folder,
        OpalineIcons.System.ForceStop,
        OpalineIcons.System.Forward,
        OpalineIcons.System.Gift,
        OpalineIcons.System.Globe,
        OpalineIcons.System.GridView,
        OpalineIcons.System.Group,
        OpalineIcons.System.Help,
        OpalineIcons.System.History,
        OpalineIcons.System.Home,
        OpalineIcons.System.Image,
        OpalineIcons.System.Import,
        OpalineIcons.System.Info,
        OpalineIcons.System.Install,
        OpalineIcons.System.KeyMeta,
        OpalineIcons.System.Keyboard,
        OpalineIcons.System.Label,
        OpalineIcons.System.Like,
        OpalineIcons.System.Link,
        OpalineIcons.System.ListView,
        OpalineIcons.System.Location,
        OpalineIcons.System.Lock,
        OpalineIcons.System.Menu,
        OpalineIcons.System.Merge,
        OpalineIcons.System.Messages,
        OpalineIcons.System.MessagesFill,
        OpalineIcons.System.Mic,
        OpalineIcons.System.MoreHorizontal,
        OpalineIcons.System.MoreVertical,
        OpalineIcons.System.Navigate,
        OpalineIcons.System.Next,
        OpalineIcons.System.Notebook,
        OpalineIcons.System.Notes,
        OpalineIcons.System.Open,
        OpalineIcons.System.PasswordHide,
        OpalineIcons.System.PasswordShow,
        OpalineIcons.System.Paste,
        OpalineIcons.System.Pause,
        OpalineIcons.System.Pets,
        OpalineIcons.System.PhoneStorage,
        OpalineIcons.System.Pin,
        OpalineIcons.System.Play,
        OpalineIcons.System.Power,
        OpalineIcons.System.QrCode,
        OpalineIcons.System.Recent,
        OpalineIcons.System.Redo,
        OpalineIcons.System.Refresh,
        OpalineIcons.System.RemoveContact,
        OpalineIcons.System.Rename,
        OpalineIcons.System.Replace,
        OpalineIcons.System.Restore,
        OpalineIcons.System.RingerRing,
        OpalineIcons.System.RingerSilent,
        OpalineIcons.System.RingerVibrate,
        OpalineIcons.System.Scan,
        OpalineIcons.System.SdCard,
        OpalineIcons.System.Search,
        OpalineIcons.System.SeekBackward,
        OpalineIcons.System.SeekForward,
        OpalineIcons.System.SelectAll,
        OpalineIcons.System.Send,
        OpalineIcons.System.SensorsOff,
        OpalineIcons.System.Settings,
        OpalineIcons.System.SettingsAboutDevice,
        OpalineIcons.System.SettingsAccessibility,
        OpalineIcons.System.SettingsAccounts,
        OpalineIcons.System.SettingsApps,
        OpalineIcons.System.SettingsBattery,
        OpalineIcons.System.SettingsBluetooth,
        OpalineIcons.System.SettingsCloud,
        OpalineIcons.System.SettingsConnections,
        OpalineIcons.System.SettingsDisplay,
        OpalineIcons.System.SettingsEmergency,
        OpalineIcons.System.SettingsFoldable,
        OpalineIcons.System.SettingsLocation,
        OpalineIcons.System.SettingsMobileNetwork,
        OpalineIcons.System.SettingsNotifications,
        OpalineIcons.System.SettingsPersonalization,
        OpalineIcons.System.SettingsPrivacy,
        OpalineIcons.System.SettingsSecurity,
        OpalineIcons.System.SettingsSound,
        OpalineIcons.System.SettingsSystem,
        OpalineIcons.System.SettingsWallpaper,
        OpalineIcons.System.SettingsWellbeing,
        OpalineIcons.System.SettingsWifi,
        OpalineIcons.System.Share,
        OpalineIcons.System.Shield,
        OpalineIcons.System.Shopping,
        OpalineIcons.System.Sim1,
        OpalineIcons.System.Sim2,
        OpalineIcons.System.Sort,
        OpalineIcons.System.SplitHorizontal,
        OpalineIcons.System.SplitVertical,
        OpalineIcons.System.Star,
        OpalineIcons.System.StarFill,
        OpalineIcons.System.StarOff,
        OpalineIcons.System.Stopwatch,
        OpalineIcons.System.Store,
        OpalineIcons.System.Sync,
        OpalineIcons.System.TextBox,
        OpalineIcons.System.Timer,
        OpalineIcons.System.Todo,
        OpalineIcons.System.Touch,
        OpalineIcons.System.Translate,
        OpalineIcons.System.Trim,
        OpalineIcons.System.Tune,
        OpalineIcons.System.Undo,
        OpalineIcons.System.Uninstall,
        OpalineIcons.System.Unlock,
        OpalineIcons.System.Unpin,
        OpalineIcons.System.Video,
        OpalineIcons.System.VideoCallFill,
        OpalineIcons.System.VoiceToText,
        OpalineIcons.System.Voicemail,
        OpalineIcons.System.VolumeAccessibility,
        OpalineIcons.System.VolumeAlarm,
        OpalineIcons.System.VolumeAlarmMute,
        OpalineIcons.System.VolumeAssistant,
        OpalineIcons.System.VolumeBluetooth,
        OpalineIcons.System.VolumeBluetoothMute,
        OpalineIcons.System.VolumeCall,
        OpalineIcons.System.VolumeHeadphones,
        OpalineIcons.System.VolumeHeadphonesMute,
        OpalineIcons.System.VolumeHigh,
        OpalineIcons.System.VolumeLow,
        OpalineIcons.System.VolumeMedia,
        OpalineIcons.System.VolumeMediaMute,
        OpalineIcons.System.VolumeNotification,
        OpalineIcons.System.VolumeNotificationMute,
        OpalineIcons.System.VolumeRinger,
        OpalineIcons.System.VolumeRingerMute,
        OpalineIcons.System.VolumeVibrate,
        OpalineIcons.System.VolumeVoice,
        OpalineIcons.System.Vpn,
        OpalineIcons.System.Warning,
        OpalineIcons.System.WindowInfo,
        OpalineIcons.System.WorldClock,
    )
