/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.test.mock;
@java.lang.Deprecated()
public class MockPackageManager
  extends android.content.pm.PackageManager
{
public  MockPackageManager() { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInfo getPackageInfo(android.content.pm.VersionedPackage versionedPackage, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] names) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] names) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getLaunchIntentForPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getLeanbackLaunchIntentForPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int[] getPackageGids(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  int[] getPackageGids(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  int getPackageUid(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInfo> getPackagesHoldingPermissions(java.lang.String[] permissions, int flags) { throw new RuntimeException("Stub!"); }
public  int checkPermission(java.lang.String permName, java.lang.String pkgName) { throw new RuntimeException("Stub!"); }
public  boolean canRequestPackageInstalls() { throw new RuntimeException("Stub!"); }
public  boolean isPermissionRevokedByPolicy(java.lang.String permName, java.lang.String pkgName) { throw new RuntimeException("Stub!"); }
public  boolean addPermission(android.content.pm.PermissionInfo info) { throw new RuntimeException("Stub!"); }
public  boolean addPermissionAsync(android.content.pm.PermissionInfo info) { throw new RuntimeException("Stub!"); }
public  void removePermission(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) { throw new RuntimeException("Stub!"); }
public  int checkSignatures(int uid1, int uid2) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getPackagesForUid(int uid) { throw new RuntimeException("Stub!"); }
public  java.lang.String getNameForUid(int uid) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName caller, android.content.Intent[] specifics, android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ResolveInfo resolveService(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ResolveInfo resolveServiceAsUser(android.content.Intent intent, int flags, int userId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String processName, int uid, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String targetPackage, int flags) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityIcon(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDefaultActivityIcon() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityBanner(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityBanner(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationBanner(android.content.pm.ApplicationInfo info) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationBanner(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo info) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationIcon(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityLogo(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getActivityLogo(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationLogo(android.content.pm.ApplicationInfo info) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getApplicationLogo(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getUserBadgedIcon(android.graphics.drawable.Drawable icon, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getUserBadgedDrawableForDensity(android.graphics.drawable.Drawable drawable, android.os.UserHandle user, android.graphics.Rect badgeLocation, int badgeDensity) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getUserBadgedLabel(java.lang.CharSequence label, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser getXml(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo info) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResourcesForActivity(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo app) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResourcesForApplication(java.lang.String appPackageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); }
public  void setInstallerPackageName(java.lang.String targetPackage, java.lang.String installerPackageName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getInstallerPackageName(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void addPackageToPreferred(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void removePackageFromPreferred(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int flags) { throw new RuntimeException("Stub!"); }
public  void setComponentEnabledSetting(android.content.ComponentName componentName, int newState, int flags) { throw new RuntimeException("Stub!"); }
public  int getComponentEnabledSetting(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public  void setApplicationEnabledSetting(java.lang.String packageName, int newState, int flags) { throw new RuntimeException("Stub!"); }
public  int getApplicationEnabledSetting(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void addPreferredActivity(android.content.IntentFilter filter, int match, android.content.ComponentName[] set, android.content.ComponentName activity) { throw new RuntimeException("Stub!"); }
public  void clearPackagePreferredActivities(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int getPreferredActivities(java.util.List<android.content.IntentFilter> outFilters, java.util.List<android.content.ComponentName> outActivities, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSystemSharedLibraryNames() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibraries(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.pm.FeatureInfo[] getSystemAvailableFeatures() { throw new RuntimeException("Stub!"); }
public  boolean hasSystemFeature(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean hasSystemFeature(java.lang.String name, int version) { throw new RuntimeException("Stub!"); }
public  boolean isSafeMode() { throw new RuntimeException("Stub!"); }
public  void verifyPendingInstall(int id, int verificationCode) { throw new RuntimeException("Stub!"); }
public  void extendVerificationTimeout(int id, int verificationCodeAtTimeout, long millisecondsToDelay) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.IntentFilter> getAllIntentFilters(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean hasSigningCertificate(java.lang.String packageName, byte[] certificate, int type) { throw new RuntimeException("Stub!"); }
public  boolean hasSigningCertificate(int uid, byte[] certificate, int type) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.PackageInfo> getInstalledPackagesAsUser(int flags, int userId) { throw new RuntimeException("Stub!"); }
public  void grantRuntimePermission(java.lang.String packageName, java.lang.String permissionName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void revokeRuntimePermission(java.lang.String packageName, java.lang.String permissionName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  int getPermissionFlags(java.lang.String permissionName, java.lang.String packageName, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void updatePermissionFlags(java.lang.String permissionName, java.lang.String packageName, int flagMask, int flagValues, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void addOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener listener) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.InstantAppInfo> getInstantApps() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getInstantAppIcon(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  byte[] getInstantAppCookie() { throw new RuntimeException("Stub!"); }
public  boolean isInstantApp() { throw new RuntimeException("Stub!"); }
public  boolean isInstantApp(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int getInstantAppCookieMaxBytes() { throw new RuntimeException("Stub!"); }
public  void clearInstantAppCookie() { throw new RuntimeException("Stub!"); }
public  void updateInstantAppCookie(byte[] cookie) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ChangedPackages getChangedPackages(int sequenceNumber) { throw new RuntimeException("Stub!"); }
public  void setUpdateAvailable(java.lang.String packageName, boolean updateAvailable) { throw new RuntimeException("Stub!"); }
public  void setApplicationCategoryHint(java.lang.String packageName, int categoryHint) { throw new RuntimeException("Stub!"); }
public  int installExistingPackage(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  int installExistingPackage(java.lang.String packageName, int installReason) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  void verifyIntentFilter(int id, int verificationCode, java.util.List<java.lang.String> outFailedDomains) { throw new RuntimeException("Stub!"); }
public  int getIntentVerificationStatusAsUser(java.lang.String packageName, int userId) { throw new RuntimeException("Stub!"); }
public  boolean updateIntentVerificationStatusAsUser(java.lang.String packageName, int status, int userId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.IntentFilterVerificationInfo> getIntentFilterVerifications(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultBrowserPackageNameAsUser(int userId) { throw new RuntimeException("Stub!"); }
public  boolean setDefaultBrowserPackageNameAsUser(java.lang.String packageName, int userId) { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageInstaller getPackageInstaller() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getInstantAppResolverSettingsComponent() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getInstantAppInstallerComponent() { throw new RuntimeException("Stub!"); }
public  void registerDexModule(java.lang.String dexModulePath, android.content.pm.PackageManager.DexModuleRegisterCallback callback) { throw new RuntimeException("Stub!"); }
}
