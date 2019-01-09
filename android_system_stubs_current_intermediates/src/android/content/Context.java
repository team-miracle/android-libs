/*
* Copyright (C) 2006 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.content;
public abstract class Context
{
public  Context() { throw new RuntimeException("Stub!"); }
public abstract  android.content.res.AssetManager getAssets();
public abstract  android.content.res.Resources getResources();
public abstract  android.content.pm.PackageManager getPackageManager();
public abstract  android.content.ContentResolver getContentResolver();
public abstract  android.os.Looper getMainLooper();
public  java.util.concurrent.Executor getMainExecutor() { throw new RuntimeException("Stub!"); }
public abstract  android.content.Context getApplicationContext();
public  void registerComponentCallbacks(android.content.ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
public  void unregisterComponentCallbacks(android.content.ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
public final  java.lang.CharSequence getText(int resId) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(int resId) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(int resId, java.lang.Object... formatArgs) { throw new RuntimeException("Stub!"); }
public final  int getColor(int id) { throw new RuntimeException("Stub!"); }
public final  android.graphics.drawable.Drawable getDrawable(int id) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getColorStateList(int id) { throw new RuntimeException("Stub!"); }
public abstract  void setTheme(int resid);
@android.view.ViewDebug.ExportedProperty(deepExport=true)
public abstract  android.content.res.Resources.Theme getTheme();
public final  android.content.res.TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray obtainStyledAttributes(int resid, int[] attrs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.ClassLoader getClassLoader();
public abstract  java.lang.String getPackageName();
public abstract  android.content.pm.ApplicationInfo getApplicationInfo();
public abstract  java.lang.String getPackageResourcePath();
public abstract  java.lang.String getPackageCodePath();
public abstract  android.content.SharedPreferences getSharedPreferences(java.lang.String name, int mode);
public abstract  boolean moveSharedPreferencesFrom(android.content.Context sourceContext, java.lang.String name);
public abstract  boolean deleteSharedPreferences(java.lang.String name);
public abstract  java.io.FileInputStream openFileInput(java.lang.String name) throws java.io.FileNotFoundException;
public abstract  java.io.FileOutputStream openFileOutput(java.lang.String name, int mode) throws java.io.FileNotFoundException;
public abstract  boolean deleteFile(java.lang.String name);
public abstract  java.io.File getFileStreamPath(java.lang.String name);
public abstract  java.io.File getDataDir();
public abstract  java.io.File getFilesDir();
public abstract  java.io.File getNoBackupFilesDir();
public abstract  java.io.File getExternalFilesDir(java.lang.String type);
public abstract  java.io.File[] getExternalFilesDirs(java.lang.String type);
public abstract  java.io.File getObbDir();
public abstract  java.io.File[] getObbDirs();
public abstract  java.io.File getCacheDir();
public abstract  java.io.File getCodeCacheDir();
public abstract  java.io.File getExternalCacheDir();
public abstract  java.io.File getPreloadsFileCache();
public abstract  java.io.File[] getExternalCacheDirs();
public abstract  java.io.File[] getExternalMediaDirs();
public abstract  java.lang.String[] fileList();
public abstract  java.io.File getDir(java.lang.String name, int mode);
public abstract  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory);
public abstract  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory, android.database.DatabaseErrorHandler errorHandler);
public abstract  boolean moveDatabaseFrom(android.content.Context sourceContext, java.lang.String name);
public abstract  boolean deleteDatabase(java.lang.String name);
public abstract  java.io.File getDatabasePath(java.lang.String name);
public abstract  java.lang.String[] databaseList();
@java.lang.Deprecated()
public abstract  android.graphics.drawable.Drawable getWallpaper();
@java.lang.Deprecated()
public abstract  android.graphics.drawable.Drawable peekWallpaper();
@java.lang.Deprecated()
public abstract  int getWallpaperDesiredMinimumWidth();
@java.lang.Deprecated()
public abstract  int getWallpaperDesiredMinimumHeight();
@java.lang.Deprecated()
public abstract  void setWallpaper(android.graphics.Bitmap bitmap) throws java.io.IOException;
@java.lang.Deprecated()
public abstract  void setWallpaper(java.io.InputStream data) throws java.io.IOException;
@java.lang.Deprecated()
public abstract  void clearWallpaper() throws java.io.IOException;
public abstract  void startActivity(android.content.Intent intent);
public abstract  void startActivity(android.content.Intent intent, android.os.Bundle options);
public abstract  void startActivities(android.content.Intent[] intents);
public abstract  void startActivities(android.content.Intent[] intents, android.os.Bundle options);
public abstract  void startIntentSender(android.content.IntentSender intent, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws android.content.IntentSender.SendIntentException;
public abstract  void startIntentSender(android.content.IntentSender intent, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, android.os.Bundle options) throws android.content.IntentSender.SendIntentException;
public abstract  void sendBroadcast(android.content.Intent intent);
public abstract  void sendBroadcast(android.content.Intent intent, java.lang.String receiverPermission);
public abstract  void sendBroadcast(android.content.Intent intent, java.lang.String receiverPermission, android.os.Bundle options);
public abstract  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission);
public abstract  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras);
public abstract  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission, android.os.Bundle options, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras);
public abstract  void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user);
public abstract  void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, java.lang.String receiverPermission);
public abstract  void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, java.lang.String receiverPermission, android.os.Bundle options);
public abstract  void sendOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, java.lang.String receiverPermission, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras);
@java.lang.Deprecated()
public abstract  void sendStickyBroadcast(android.content.Intent intent);
@java.lang.Deprecated()
public abstract  void sendStickyOrderedBroadcast(android.content.Intent intent, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras);
@java.lang.Deprecated()
public abstract  void removeStickyBroadcast(android.content.Intent intent);
@java.lang.Deprecated()
public abstract  void sendStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user);
@java.lang.Deprecated()
public abstract  void sendStickyOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras);
@java.lang.Deprecated()
public abstract  void removeStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user);
public abstract  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter);
public abstract  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, int flags);
public abstract  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, java.lang.String broadcastPermission, android.os.Handler scheduler);
public abstract  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, java.lang.String broadcastPermission, android.os.Handler scheduler, int flags);
public abstract  void unregisterReceiver(android.content.BroadcastReceiver receiver);
public abstract  android.content.ComponentName startService(android.content.Intent service);
public abstract  android.content.ComponentName startForegroundService(android.content.Intent service);
public abstract  boolean stopService(android.content.Intent service);
public abstract  boolean bindService(android.content.Intent service, android.content.ServiceConnection conn, int flags);
@java.lang.SuppressWarnings(value={"unused"})
public  boolean bindServiceAsUser(android.content.Intent service, android.content.ServiceConnection conn, int flags, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public abstract  void unbindService(android.content.ServiceConnection conn);
public abstract  boolean startInstrumentation(android.content.ComponentName className, java.lang.String profileFile, android.os.Bundle arguments);
public abstract  java.lang.Object getSystemService(java.lang.String name);
@java.lang.SuppressWarnings(value={"unchecked"})
public final <T> T getSystemService(java.lang.Class<T> serviceClass) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getSystemServiceName(java.lang.Class<?> serviceClass);
public abstract  int checkPermission(java.lang.String permission, int pid, int uid);
public abstract  int checkCallingPermission(java.lang.String permission);
public abstract  int checkCallingOrSelfPermission(java.lang.String permission);
public abstract  int checkSelfPermission(java.lang.String permission);
public abstract  void enforcePermission(java.lang.String permission, int pid, int uid, java.lang.String message);
public abstract  void enforceCallingPermission(java.lang.String permission, java.lang.String message);
public abstract  void enforceCallingOrSelfPermission(java.lang.String permission, java.lang.String message);
public abstract  void grantUriPermission(java.lang.String toPackage, android.net.Uri uri, int modeFlags);
public abstract  void revokeUriPermission(android.net.Uri uri, int modeFlags);
public abstract  void revokeUriPermission(java.lang.String toPackage, android.net.Uri uri, int modeFlags);
public abstract  int checkUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags);
public abstract  int checkCallingUriPermission(android.net.Uri uri, int modeFlags);
public abstract  int checkCallingOrSelfUriPermission(android.net.Uri uri, int modeFlags);
public abstract  int checkUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags);
public abstract  void enforceUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags, java.lang.String message);
public abstract  void enforceCallingUriPermission(android.net.Uri uri, int modeFlags, java.lang.String message);
public abstract  void enforceCallingOrSelfUriPermission(android.net.Uri uri, int modeFlags, java.lang.String message);
public abstract  void enforceUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags, java.lang.String message);
public abstract  android.content.Context createPackageContext(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public  android.content.Context createPackageContextAsUser(java.lang.String packageName, int flags, android.os.UserHandle user) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public abstract  android.content.Context createContextForSplit(java.lang.String splitName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.Context createConfigurationContext(android.content.res.Configuration overrideConfiguration);
public abstract  android.content.Context createDisplayContext(android.view.Display display);
public abstract  android.content.Context createDeviceProtectedStorageContext();
public abstract  android.content.Context createCredentialProtectedStorageContext();
public  boolean isRestricted() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDeviceProtectedStorage();
public abstract  boolean isCredentialProtectedStorage();
public static final java.lang.String ACCESSIBILITY_SERVICE = "accessibility";
public static final java.lang.String ACCOUNT_SERVICE = "account";
public static final java.lang.String ACTIVITY_SERVICE = "activity";
public static final java.lang.String ALARM_SERVICE = "alarm";
public static final java.lang.String APPWIDGET_SERVICE = "appwidget";
public static final java.lang.String APP_OPS_SERVICE = "appops";
public static final java.lang.String AUDIO_SERVICE = "audio";
public static final java.lang.String BACKUP_SERVICE = "backup";
public static final java.lang.String BATTERY_SERVICE = "batterymanager";
public static final int BIND_ABOVE_CLIENT = 8;
public static final int BIND_ADJUST_WITH_ACTIVITY = 128;
public static final int BIND_ALLOW_OOM_MANAGEMENT = 16;
public static final int BIND_AUTO_CREATE = 1;
public static final int BIND_DEBUG_UNBIND = 2;
public static final int BIND_EXTERNAL_SERVICE = -2147483648;
public static final int BIND_IMPORTANT = 64;
public static final int BIND_NOT_FOREGROUND = 4;
public static final int BIND_WAIVE_PRIORITY = 32;
public static final java.lang.String BLUETOOTH_SERVICE = "bluetooth";
public static final java.lang.String CAMERA_SERVICE = "camera";
public static final java.lang.String CAPTIONING_SERVICE = "captioning";
public static final java.lang.String CARRIER_CONFIG_SERVICE = "carrier_config";
public static final java.lang.String CLIPBOARD_SERVICE = "clipboard";
public static final java.lang.String COMPANION_DEVICE_SERVICE = "companiondevice";
public static final java.lang.String CONNECTIVITY_SERVICE = "connectivity";
public static final java.lang.String CONSUMER_IR_SERVICE = "consumer_ir";
public static final java.lang.String CONTEXTHUB_SERVICE = "contexthub";
public static final int CONTEXT_IGNORE_SECURITY = 2;
public static final int CONTEXT_INCLUDE_CODE = 1;
public static final int CONTEXT_RESTRICTED = 4;
public static final java.lang.String CROSS_PROFILE_APPS_SERVICE = "crossprofileapps";
public static final java.lang.String DEVICE_POLICY_SERVICE = "device_policy";
public static final java.lang.String DISPLAY_SERVICE = "display";
public static final java.lang.String DOWNLOAD_SERVICE = "download";
public static final java.lang.String DROPBOX_SERVICE = "dropbox";
public static final java.lang.String EUICC_CARD_SERVICE = "euicc_card";
public static final java.lang.String EUICC_SERVICE = "euicc";
public static final java.lang.String FINGERPRINT_SERVICE = "fingerprint";
public static final java.lang.String HARDWARE_PROPERTIES_SERVICE = "hardware_properties";
public static final java.lang.String HDMI_CONTROL_SERVICE = "hdmi_control";
public static final java.lang.String INPUT_METHOD_SERVICE = "input_method";
public static final java.lang.String INPUT_SERVICE = "input";
public static final java.lang.String IPSEC_SERVICE = "ipsec";
public static final java.lang.String JOB_SCHEDULER_SERVICE = "jobscheduler";
public static final java.lang.String KEYGUARD_SERVICE = "keyguard";
public static final java.lang.String LAUNCHER_APPS_SERVICE = "launcherapps";
public static final java.lang.String LAYOUT_INFLATER_SERVICE = "layout_inflater";
public static final java.lang.String LOCATION_SERVICE = "location";
public static final java.lang.String MEDIA_PROJECTION_SERVICE = "media_projection";
public static final java.lang.String MEDIA_ROUTER_SERVICE = "media_router";
public static final java.lang.String MEDIA_SESSION_SERVICE = "media_session";
public static final java.lang.String MIDI_SERVICE = "midi";
public static final int MODE_APPEND = 32768;
public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;
@java.lang.Deprecated()
public static final int MODE_MULTI_PROCESS = 4;
public static final int MODE_NO_LOCALIZED_COLLATORS = 16;
public static final int MODE_PRIVATE = 0;
@java.lang.Deprecated()
public static final int MODE_WORLD_READABLE = 1;
@java.lang.Deprecated()
public static final int MODE_WORLD_WRITEABLE = 2;
public static final java.lang.String NETWORK_SCORE_SERVICE = "network_score";
public static final java.lang.String NETWORK_STATS_SERVICE = "netstats";
public static final java.lang.String NFC_SERVICE = "nfc";
public static final java.lang.String NOTIFICATION_SERVICE = "notification";
public static final java.lang.String NSD_SERVICE = "servicediscovery";
public static final java.lang.String OEM_LOCK_SERVICE = "oem_lock";
public static final java.lang.String PERSISTENT_DATA_BLOCK_SERVICE = "persistent_data_block";
public static final java.lang.String POWER_SERVICE = "power";
public static final java.lang.String PRINT_SERVICE = "print";
public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
public static final java.lang.String RESTRICTIONS_SERVICE = "restrictions";
public static final java.lang.String SEARCH_SERVICE = "search";
public static final java.lang.String SECURE_ELEMENT_SERVICE = "secure_element";
public static final java.lang.String SENSOR_SERVICE = "sensor";
public static final java.lang.String SHORTCUT_SERVICE = "shortcut";
public static final java.lang.String STATS_MANAGER = "stats";
public static final java.lang.String STORAGE_SERVICE = "storage";
public static final java.lang.String STORAGE_STATS_SERVICE = "storagestats";
public static final java.lang.String SYSTEM_HEALTH_SERVICE = "systemhealth";
public static final java.lang.String SYSTEM_UPDATE_SERVICE = "system_update";
public static final java.lang.String TELECOM_SERVICE = "telecom";
public static final java.lang.String TELEPHONY_SERVICE = "phone";
public static final java.lang.String TELEPHONY_SUBSCRIPTION_SERVICE = "telephony_subscription_service";
public static final java.lang.String TEXT_CLASSIFICATION_SERVICE = "textclassification";
public static final java.lang.String TEXT_SERVICES_MANAGER_SERVICE = "textservices";
public static final java.lang.String TV_INPUT_SERVICE = "tv_input";
public static final java.lang.String UI_MODE_SERVICE = "uimode";
public static final java.lang.String USAGE_STATS_SERVICE = "usagestats";
public static final java.lang.String USB_SERVICE = "usb";
public static final java.lang.String USER_SERVICE = "user";
public static final java.lang.String VIBRATOR_SERVICE = "vibrator";
public static final java.lang.String VR_SERVICE = "vrmanager";
public static final java.lang.String WALLPAPER_SERVICE = "wallpaper";
public static final java.lang.String WIFI_AWARE_SERVICE = "wifiaware";
public static final java.lang.String WIFI_P2P_SERVICE = "wifip2p";
public static final java.lang.String WIFI_RTT_RANGING_SERVICE = "wifirtt";
@java.lang.Deprecated()
public static final java.lang.String WIFI_RTT_SERVICE = "rttmanager";
public static final java.lang.String WIFI_SCANNING_SERVICE = "wifiscanner";
public static final java.lang.String WIFI_SERVICE = "wifi";
public static final java.lang.String WINDOW_SERVICE = "window";
}
