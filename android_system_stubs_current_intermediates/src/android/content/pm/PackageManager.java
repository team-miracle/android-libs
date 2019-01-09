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

package android.content.pm;
public abstract class PackageManager
{
public static class NameNotFoundException
  extends android.util.AndroidException
{
public  NameNotFoundException() { throw new RuntimeException("Stub!"); }
public  NameNotFoundException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static interface OnPermissionsChangedListener
{
public abstract  void onPermissionsChanged(int uid);
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface PermissionFlags
{
}
public abstract static class DexModuleRegisterCallback
{
public  DexModuleRegisterCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onDexModuleRegistered(java.lang.String dexModulePath, boolean success, java.lang.String message);
}
public  PackageManager() { throw new RuntimeException("Stub!"); }
public abstract  android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.PackageInfo getPackageInfo(android.content.pm.VersionedPackage versionedPackage, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] names);
public abstract  java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] names);
public abstract  android.content.Intent getLaunchIntentForPackage(java.lang.String packageName);
public abstract  android.content.Intent getLeanbackLaunchIntentForPackage(java.lang.String packageName);
public abstract  int[] getPackageGids(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  int[] getPackageGids(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  int getPackageUid(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags);
public abstract  android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName component, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName component, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName component, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName component, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags);
public abstract  java.util.List<android.content.pm.PackageInfo> getPackagesHoldingPermissions(java.lang.String[] permissions, int flags);
public abstract  java.util.List<android.content.pm.PackageInfo> getInstalledPackagesAsUser(int flags, int userId);
public abstract  int checkPermission(java.lang.String permName, java.lang.String pkgName);
public abstract  boolean isPermissionRevokedByPolicy(java.lang.String permName, java.lang.String pkgName);
public abstract  boolean addPermission(android.content.pm.PermissionInfo info);
public abstract  boolean addPermissionAsync(android.content.pm.PermissionInfo info);
public abstract  void removePermission(java.lang.String name);
public abstract  void grantRuntimePermission(java.lang.String packageName, java.lang.String permissionName, android.os.UserHandle user);
public abstract  void revokeRuntimePermission(java.lang.String packageName, java.lang.String permissionName, android.os.UserHandle user);
@android.content.pm.PackageManager.PermissionFlags()
public abstract  int getPermissionFlags(java.lang.String permissionName, java.lang.String packageName, android.os.UserHandle user);
public abstract  void updatePermissionFlags(java.lang.String permissionName, java.lang.String packageName, @android.content.pm.PackageManager.PermissionFlags()
int flagMask, @android.content.pm.PackageManager.PermissionFlags()
int flagValues, android.os.UserHandle user);
public abstract  int checkSignatures(java.lang.String pkg1, java.lang.String pkg2);
public abstract  int checkSignatures(int uid1, int uid2);
public abstract  java.lang.String[] getPackagesForUid(int uid);
public abstract  java.lang.String getNameForUid(int uid);
public abstract  java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags);
public abstract  java.util.List<android.content.pm.InstantAppInfo> getInstantApps();
public abstract  android.graphics.drawable.Drawable getInstantAppIcon(java.lang.String packageName);
public abstract  boolean isInstantApp();
public abstract  boolean isInstantApp(java.lang.String packageName);
public abstract  int getInstantAppCookieMaxBytes();
public abstract  byte[] getInstantAppCookie();
public abstract  void clearInstantAppCookie();
public abstract  void updateInstantAppCookie(byte[] cookie);
public abstract  java.lang.String[] getSystemSharedLibraryNames();
public abstract  java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibraries(int flags);
public abstract  android.content.pm.ChangedPackages getChangedPackages(int sequenceNumber);
public abstract  android.content.pm.FeatureInfo[] getSystemAvailableFeatures();
public abstract  boolean hasSystemFeature(java.lang.String name);
public abstract  boolean hasSystemFeature(java.lang.String name, int version);
public abstract  android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName caller, android.content.Intent[] specifics, android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent intent, int flags);
public  java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceiversAsUser(android.content.Intent intent, int flags, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public abstract  android.content.pm.ResolveInfo resolveService(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent intent, int flags);
public abstract  android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags);
public abstract  java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String processName, int uid, int flags);
public abstract  android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String targetPackage, int flags);
public abstract  android.graphics.drawable.Drawable getDrawable(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo);
public abstract  android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityIcon(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityBanner(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityBanner(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getDefaultActivityIcon();
public abstract  android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo info);
public abstract  android.graphics.drawable.Drawable getApplicationIcon(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getApplicationBanner(android.content.pm.ApplicationInfo info);
public abstract  android.graphics.drawable.Drawable getApplicationBanner(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityLogo(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityLogo(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getApplicationLogo(android.content.pm.ApplicationInfo info);
public abstract  android.graphics.drawable.Drawable getApplicationLogo(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getUserBadgedIcon(android.graphics.drawable.Drawable icon, android.os.UserHandle user);
public abstract  android.graphics.drawable.Drawable getUserBadgedDrawableForDensity(android.graphics.drawable.Drawable drawable, android.os.UserHandle user, android.graphics.Rect badgeLocation, int badgeDensity);
public abstract  java.lang.CharSequence getUserBadgedLabel(java.lang.CharSequence label, android.os.UserHandle user);
public abstract  java.lang.CharSequence getText(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo);
public abstract  android.content.res.XmlResourceParser getXml(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo);
public abstract  java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo info);
public abstract  android.content.res.Resources getResourcesForActivity(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo app) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.res.Resources getResourcesForApplication(java.lang.String appPackageName) throws android.content.pm.PackageManager.NameNotFoundException;
public  android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); }
public abstract  int installExistingPackage(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  int installExistingPackage(java.lang.String packageName, int installReason) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  void verifyPendingInstall(int id, int verificationCode);
public abstract  void extendVerificationTimeout(int id, int verificationCodeAtTimeout, long millisecondsToDelay);
public abstract  void verifyIntentFilter(int verificationId, int verificationCode, java.util.List<java.lang.String> failedDomains);
public abstract  int getIntentVerificationStatusAsUser(java.lang.String packageName, int userId);
public abstract  boolean updateIntentVerificationStatusAsUser(java.lang.String packageName, int status, int userId);
public abstract  java.util.List<android.content.pm.IntentFilterVerificationInfo> getIntentFilterVerifications(java.lang.String packageName);
public abstract  java.util.List<android.content.IntentFilter> getAllIntentFilters(java.lang.String packageName);
public abstract  java.lang.String getDefaultBrowserPackageNameAsUser(int userId);
public abstract  boolean setDefaultBrowserPackageNameAsUser(java.lang.String packageName, int userId);
public abstract  void setInstallerPackageName(java.lang.String targetPackage, java.lang.String installerPackageName);
public abstract  void setUpdateAvailable(java.lang.String packageName, boolean updateAvaialble);
public abstract  java.lang.String getInstallerPackageName(java.lang.String packageName);
@java.lang.Deprecated()
public abstract  void addPackageToPreferred(java.lang.String packageName);
@java.lang.Deprecated()
public abstract  void removePackageFromPreferred(java.lang.String packageName);
public abstract  java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int flags);
@java.lang.Deprecated()
public abstract  void addPreferredActivity(android.content.IntentFilter filter, int match, android.content.ComponentName[] set, android.content.ComponentName activity);
public abstract  void clearPackagePreferredActivities(java.lang.String packageName);
public abstract  int getPreferredActivities(java.util.List<android.content.IntentFilter> outFilters, java.util.List<android.content.ComponentName> outActivities, java.lang.String packageName);
public abstract  void setComponentEnabledSetting(android.content.ComponentName componentName, int newState, int flags);
public abstract  int getComponentEnabledSetting(android.content.ComponentName componentName);
public abstract  void setApplicationEnabledSetting(java.lang.String packageName, int newState, int flags);
public abstract  int getApplicationEnabledSetting(java.lang.String packageName);
public abstract  boolean isSafeMode();
public abstract  void addOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener listener);
public abstract  void removeOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener listener);
public  java.lang.String[] setPackagesSuspended(java.lang.String[] packageNames, boolean suspended, android.os.PersistableBundle appExtras, android.os.PersistableBundle launcherExtras, java.lang.String dialogMessage) { throw new RuntimeException("Stub!"); }
public  boolean isPackageSuspended(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  boolean isPackageSuspended() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getSuspendedPackageAppExtras() { throw new RuntimeException("Stub!"); }
public abstract  void setApplicationCategoryHint(java.lang.String packageName, int categoryHint);
public abstract  android.content.pm.PackageInstaller getPackageInstaller();
public abstract  boolean canRequestPackageInstalls();
public abstract  android.content.ComponentName getInstantAppResolverSettingsComponent();
public abstract  android.content.ComponentName getInstantAppInstallerComponent();
public abstract  void registerDexModule(java.lang.String dexModulePath, android.content.pm.PackageManager.DexModuleRegisterCallback callback);
public  android.content.pm.dex.ArtManager getArtManager() { throw new RuntimeException("Stub!"); }
public  void setHarmfulAppWarning(java.lang.String packageName, java.lang.CharSequence warning) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getHarmfulAppWarning(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean hasSigningCertificate(java.lang.String packageName, byte[] certificate, int type) { throw new RuntimeException("Stub!"); }
public  boolean hasSigningCertificate(int uid, byte[] certificate, int type) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "android.content.pm.action.REQUEST_PERMISSIONS";
public static final int CERT_INPUT_RAW_X509 = 0;
public static final int CERT_INPUT_SHA256 = 1;
public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;
public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;
public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
public static final int DONT_KILL_APP = 1;
public static final java.lang.String EXTRA_REQUEST_PERMISSIONS_NAMES = "android.content.pm.extra.REQUEST_PERMISSIONS_NAMES";
public static final java.lang.String EXTRA_REQUEST_PERMISSIONS_RESULTS = "android.content.pm.extra.REQUEST_PERMISSIONS_RESULTS";
public static final java.lang.String EXTRA_VERIFICATION_ID = "android.content.pm.extra.VERIFICATION_ID";
public static final java.lang.String EXTRA_VERIFICATION_RESULT = "android.content.pm.extra.VERIFICATION_RESULT";
public static final java.lang.String FEATURE_ACTIVITIES_ON_SECONDARY_DISPLAYS = "android.software.activities_on_secondary_displays";
public static final java.lang.String FEATURE_APP_WIDGETS = "android.software.app_widgets";
public static final java.lang.String FEATURE_AUDIO_LOW_LATENCY = "android.hardware.audio.low_latency";
public static final java.lang.String FEATURE_AUDIO_OUTPUT = "android.hardware.audio.output";
public static final java.lang.String FEATURE_AUDIO_PRO = "android.hardware.audio.pro";
public static final java.lang.String FEATURE_AUTOFILL = "android.software.autofill";
public static final java.lang.String FEATURE_AUTOMOTIVE = "android.hardware.type.automotive";
public static final java.lang.String FEATURE_BACKUP = "android.software.backup";
public static final java.lang.String FEATURE_BLUETOOTH = "android.hardware.bluetooth";
public static final java.lang.String FEATURE_BLUETOOTH_LE = "android.hardware.bluetooth_le";
public static final java.lang.String FEATURE_BROADCAST_RADIO = "android.hardware.broadcastradio";
public static final java.lang.String FEATURE_CAMERA = "android.hardware.camera";
public static final java.lang.String FEATURE_CAMERA_ANY = "android.hardware.camera.any";
public static final java.lang.String FEATURE_CAMERA_AR = "android.hardware.camera.ar";
public static final java.lang.String FEATURE_CAMERA_AUTOFOCUS = "android.hardware.camera.autofocus";
public static final java.lang.String FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING = "android.hardware.camera.capability.manual_post_processing";
public static final java.lang.String FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR = "android.hardware.camera.capability.manual_sensor";
public static final java.lang.String FEATURE_CAMERA_CAPABILITY_RAW = "android.hardware.camera.capability.raw";
public static final java.lang.String FEATURE_CAMERA_EXTERNAL = "android.hardware.camera.external";
public static final java.lang.String FEATURE_CAMERA_FLASH = "android.hardware.camera.flash";
public static final java.lang.String FEATURE_CAMERA_FRONT = "android.hardware.camera.front";
public static final java.lang.String FEATURE_CAMERA_LEVEL_FULL = "android.hardware.camera.level.full";
public static final java.lang.String FEATURE_CANT_SAVE_STATE = "android.software.cant_save_state";
public static final java.lang.String FEATURE_COMPANION_DEVICE_SETUP = "android.software.companion_device_setup";
public static final java.lang.String FEATURE_CONNECTION_SERVICE = "android.software.connectionservice";
public static final java.lang.String FEATURE_CONSUMER_IR = "android.hardware.consumerir";
public static final java.lang.String FEATURE_DEVICE_ADMIN = "android.software.device_admin";
public static final java.lang.String FEATURE_EMBEDDED = "android.hardware.type.embedded";
public static final java.lang.String FEATURE_ETHERNET = "android.hardware.ethernet";
public static final java.lang.String FEATURE_FAKETOUCH = "android.hardware.faketouch";
public static final java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = "android.hardware.faketouch.multitouch.distinct";
public static final java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = "android.hardware.faketouch.multitouch.jazzhand";
public static final java.lang.String FEATURE_FINGERPRINT = "android.hardware.fingerprint";
public static final java.lang.String FEATURE_FREEFORM_WINDOW_MANAGEMENT = "android.software.freeform_window_management";
public static final java.lang.String FEATURE_GAMEPAD = "android.hardware.gamepad";
public static final java.lang.String FEATURE_HIFI_SENSORS = "android.hardware.sensor.hifi_sensors";
public static final java.lang.String FEATURE_HOME_SCREEN = "android.software.home_screen";
public static final java.lang.String FEATURE_INPUT_METHODS = "android.software.input_methods";
public static final java.lang.String FEATURE_LEANBACK = "android.software.leanback";
public static final java.lang.String FEATURE_LEANBACK_ONLY = "android.software.leanback_only";
public static final java.lang.String FEATURE_LIVE_TV = "android.software.live_tv";
public static final java.lang.String FEATURE_LIVE_WALLPAPER = "android.software.live_wallpaper";
public static final java.lang.String FEATURE_LOCATION = "android.hardware.location";
public static final java.lang.String FEATURE_LOCATION_GPS = "android.hardware.location.gps";
public static final java.lang.String FEATURE_LOCATION_NETWORK = "android.hardware.location.network";
public static final java.lang.String FEATURE_MANAGED_USERS = "android.software.managed_users";
public static final java.lang.String FEATURE_MICROPHONE = "android.hardware.microphone";
public static final java.lang.String FEATURE_MIDI = "android.software.midi";
public static final java.lang.String FEATURE_NFC = "android.hardware.nfc";
public static final java.lang.String FEATURE_NFC_HOST_CARD_EMULATION = "android.hardware.nfc.hce";
public static final java.lang.String FEATURE_NFC_HOST_CARD_EMULATION_NFCF = "android.hardware.nfc.hcef";
public static final java.lang.String FEATURE_OPENGLES_EXTENSION_PACK = "android.hardware.opengles.aep";
public static final java.lang.String FEATURE_PC = "android.hardware.type.pc";
public static final java.lang.String FEATURE_PICTURE_IN_PICTURE = "android.software.picture_in_picture";
public static final java.lang.String FEATURE_PRINTING = "android.software.print";
public static final java.lang.String FEATURE_RAM_LOW = "android.hardware.ram.low";
public static final java.lang.String FEATURE_RAM_NORMAL = "android.hardware.ram.normal";
public static final java.lang.String FEATURE_SCREEN_LANDSCAPE = "android.hardware.screen.landscape";
public static final java.lang.String FEATURE_SCREEN_PORTRAIT = "android.hardware.screen.portrait";
public static final java.lang.String FEATURE_SECURELY_REMOVES_USERS = "android.software.securely_removes_users";
public static final java.lang.String FEATURE_SENSOR_ACCELEROMETER = "android.hardware.sensor.accelerometer";
public static final java.lang.String FEATURE_SENSOR_AMBIENT_TEMPERATURE = "android.hardware.sensor.ambient_temperature";
public static final java.lang.String FEATURE_SENSOR_BAROMETER = "android.hardware.sensor.barometer";
public static final java.lang.String FEATURE_SENSOR_COMPASS = "android.hardware.sensor.compass";
public static final java.lang.String FEATURE_SENSOR_GYROSCOPE = "android.hardware.sensor.gyroscope";
public static final java.lang.String FEATURE_SENSOR_HEART_RATE = "android.hardware.sensor.heartrate";
public static final java.lang.String FEATURE_SENSOR_HEART_RATE_ECG = "android.hardware.sensor.heartrate.ecg";
public static final java.lang.String FEATURE_SENSOR_LIGHT = "android.hardware.sensor.light";
public static final java.lang.String FEATURE_SENSOR_PROXIMITY = "android.hardware.sensor.proximity";
public static final java.lang.String FEATURE_SENSOR_RELATIVE_HUMIDITY = "android.hardware.sensor.relative_humidity";
public static final java.lang.String FEATURE_SENSOR_STEP_COUNTER = "android.hardware.sensor.stepcounter";
public static final java.lang.String FEATURE_SENSOR_STEP_DETECTOR = "android.hardware.sensor.stepdetector";
public static final java.lang.String FEATURE_SIP = "android.software.sip";
public static final java.lang.String FEATURE_SIP_VOIP = "android.software.sip.voip";
public static final java.lang.String FEATURE_STRONGBOX_KEYSTORE = "android.hardware.strongbox_keystore";
public static final java.lang.String FEATURE_TELEPHONY = "android.hardware.telephony";
public static final java.lang.String FEATURE_TELEPHONY_CARRIERLOCK = "android.hardware.telephony.carrierlock";
public static final java.lang.String FEATURE_TELEPHONY_CDMA = "android.hardware.telephony.cdma";
public static final java.lang.String FEATURE_TELEPHONY_EUICC = "android.hardware.telephony.euicc";
public static final java.lang.String FEATURE_TELEPHONY_GSM = "android.hardware.telephony.gsm";
public static final java.lang.String FEATURE_TELEPHONY_MBMS = "android.hardware.telephony.mbms";
@java.lang.Deprecated()
public static final java.lang.String FEATURE_TELEVISION = "android.hardware.type.television";
public static final java.lang.String FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";
public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH = "android.hardware.touchscreen.multitouch";
public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = "android.hardware.touchscreen.multitouch.distinct";
public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = "android.hardware.touchscreen.multitouch.jazzhand";
public static final java.lang.String FEATURE_USB_ACCESSORY = "android.hardware.usb.accessory";
public static final java.lang.String FEATURE_USB_HOST = "android.hardware.usb.host";
public static final java.lang.String FEATURE_VERIFIED_BOOT = "android.software.verified_boot";
public static final java.lang.String FEATURE_VR_HEADTRACKING = "android.hardware.vr.headtracking";
@java.lang.Deprecated()
public static final java.lang.String FEATURE_VR_MODE = "android.software.vr.mode";
public static final java.lang.String FEATURE_VR_MODE_HIGH_PERFORMANCE = "android.hardware.vr.high_performance";
public static final java.lang.String FEATURE_VULKAN_HARDWARE_COMPUTE = "android.hardware.vulkan.compute";
public static final java.lang.String FEATURE_VULKAN_HARDWARE_LEVEL = "android.hardware.vulkan.level";
public static final java.lang.String FEATURE_VULKAN_HARDWARE_VERSION = "android.hardware.vulkan.version";
public static final java.lang.String FEATURE_WATCH = "android.hardware.type.watch";
public static final java.lang.String FEATURE_WEBVIEW = "android.software.webview";
public static final java.lang.String FEATURE_WIFI = "android.hardware.wifi";
public static final java.lang.String FEATURE_WIFI_AWARE = "android.hardware.wifi.aware";
public static final java.lang.String FEATURE_WIFI_DIRECT = "android.hardware.wifi.direct";
public static final java.lang.String FEATURE_WIFI_PASSPOINT = "android.hardware.wifi.passpoint";
public static final java.lang.String FEATURE_WIFI_RTT = "android.hardware.wifi.rtt";
public static final int FLAG_PERMISSION_GRANTED_BY_DEFAULT = 32;
public static final int FLAG_PERMISSION_POLICY_FIXED = 4;
public static final int FLAG_PERMISSION_REVIEW_REQUIRED = 64;
public static final int FLAG_PERMISSION_REVOKE_ON_UPGRADE = 8;
public static final int FLAG_PERMISSION_SYSTEM_FIXED = 16;
public static final int FLAG_PERMISSION_USER_FIXED = 2;
public static final int FLAG_PERMISSION_USER_SET = 1;
public static final int GET_ACTIVITIES = 1;
public static final int GET_CONFIGURATIONS = 16384;
@java.lang.Deprecated()
public static final int GET_DISABLED_COMPONENTS = 512;
@java.lang.Deprecated()
public static final int GET_DISABLED_UNTIL_USED_COMPONENTS = 32768;
public static final int GET_GIDS = 256;
public static final int GET_INSTRUMENTATION = 16;
public static final int GET_INTENT_FILTERS = 32;
public static final int GET_META_DATA = 128;
public static final int GET_PERMISSIONS = 4096;
public static final int GET_PROVIDERS = 8;
public static final int GET_RECEIVERS = 2;
public static final int GET_RESOLVED_FILTER = 64;
public static final int GET_SERVICES = 4;
public static final int GET_SHARED_LIBRARY_FILES = 1024;
@java.lang.Deprecated()
public static final int GET_SIGNATURES = 64;
public static final int GET_SIGNING_CERTIFICATES = 134217728;
@java.lang.Deprecated()
public static final int GET_UNINSTALLED_PACKAGES = 8192;
public static final int GET_URI_PERMISSION_PATTERNS = 2048;
public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;
public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;
public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;
public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;
public static final int INSTALL_FAILED_DEXOPT = -11;
public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;
public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;
public static final int INSTALL_FAILED_INVALID_APK = -2;
public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;
public static final int INSTALL_FAILED_INVALID_URI = -3;
public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;
public static final int INSTALL_FAILED_MISSING_FEATURE = -17;
public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;
public static final int INSTALL_FAILED_NEWER_SDK = -14;
public static final int INSTALL_FAILED_NO_SHARED_USER = -6;
public static final int INSTALL_FAILED_OLDER_SDK = -12;
public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;
public static final int INSTALL_FAILED_PERMISSION_MODEL_DOWNGRADE = -26;
public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;
public static final int INSTALL_FAILED_SANDBOX_VERSION_DOWNGRADE = -27;
public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;
public static final int INSTALL_FAILED_TEST_ONLY = -15;
public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;
public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;
public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;
public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;
public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;
public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;
public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;
public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;
public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;
public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;
public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;
public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;
public static final int INSTALL_REASON_DEVICE_RESTORE = 2;
public static final int INSTALL_REASON_DEVICE_SETUP = 3;
public static final int INSTALL_REASON_POLICY = 1;
public static final int INSTALL_REASON_UNKNOWN = 0;
public static final int INSTALL_REASON_USER = 4;
public static final int INSTALL_SUCCEEDED = 1;
public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS = 2;
public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS_ASK = 4;
public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ASK = 1;
public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_NEVER = 3;
public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_UNDEFINED = 0;
public static final int INTENT_FILTER_VERIFICATION_FAILURE = -1;
public static final int INTENT_FILTER_VERIFICATION_SUCCESS = 1;
public static final int MASK_PERMISSION_FLAGS = 255;
public static final int MATCH_ALL = 131072;
public static final int MATCH_ANY_USER = 4194304;
public static final int MATCH_DEFAULT_ONLY = 65536;
public static final int MATCH_DIRECT_BOOT_AWARE = 524288;
public static final int MATCH_DIRECT_BOOT_UNAWARE = 262144;
public static final int MATCH_DISABLED_COMPONENTS = 512;
public static final int MATCH_DISABLED_UNTIL_USED_COMPONENTS = 32768;
public static final int MATCH_FACTORY_ONLY = 2097152;
public static final int MATCH_INSTANT = 8388608;
public static final int MATCH_SYSTEM_ONLY = 1048576;
public static final int MATCH_UNINSTALLED_PACKAGES = 8192;
public static final long MAXIMUM_VERIFICATION_TIMEOUT = 3600000L;
public static final int PERMISSION_DENIED = -1;
public static final int PERMISSION_GRANTED = 0;
public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
public static final int SIGNATURE_MATCH = 0;
public static final int SIGNATURE_NEITHER_SIGNED = 1;
public static final int SIGNATURE_NO_MATCH = -3;
public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
public static final int VERIFICATION_ALLOW = 1;
public static final int VERIFICATION_REJECT = -1;
public static final int VERSION_CODE_HIGHEST = -1;
}
