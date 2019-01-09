/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.app.admin;
public class DevicePolicyManager
{
public static interface OnClearApplicationUserDataListener
{
public abstract  void onApplicationUserDataCleared(java.lang.String packageName, boolean succeeded);
}
DevicePolicyManager() { throw new RuntimeException("Stub!"); }
public  boolean isAdminActive(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.ComponentName> getActiveAdmins() { throw new RuntimeException("Stub!"); }
public  void removeActiveAdmin(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean hasGrantedPolicy(android.content.ComponentName admin, int usesPolicy) { throw new RuntimeException("Stub!"); }
public  void setPasswordQuality(android.content.ComponentName admin, int quality) { throw new RuntimeException("Stub!"); }
public  int getPasswordQuality(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumLength(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumLength(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumUpperCase(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumUpperCase(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumLowerCase(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumLowerCase(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumLetters(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumLetters(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumNumeric(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumNumeric(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumSymbols(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumSymbols(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordMinimumNonLetter(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  int getPasswordMinimumNonLetter(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPasswordHistoryLength(android.content.ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
public  void setPasswordExpirationTimeout(android.content.ComponentName admin, long timeout) { throw new RuntimeException("Stub!"); }
public  long getPasswordExpirationTimeout(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  long getPasswordExpiration(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  int getPasswordHistoryLength(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  int getPasswordMaximumLength(int quality) { throw new RuntimeException("Stub!"); }
public  boolean isActivePasswordSufficient() { throw new RuntimeException("Stub!"); }
public  boolean isUsingUnifiedPassword(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  int getCurrentFailedPasswordAttempts() { throw new RuntimeException("Stub!"); }
public  void setMaximumFailedPasswordsForWipe(android.content.ComponentName admin, int num) { throw new RuntimeException("Stub!"); }
public  int getMaximumFailedPasswordsForWipe(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean resetPassword(java.lang.String password, int flags) { throw new RuntimeException("Stub!"); }
public  boolean setResetPasswordToken(android.content.ComponentName admin, byte[] token) { throw new RuntimeException("Stub!"); }
public  boolean clearResetPasswordToken(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean isResetPasswordTokenActive(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean resetPasswordWithToken(android.content.ComponentName admin, java.lang.String password, byte[] token, int flags) { throw new RuntimeException("Stub!"); }
public  void setMaximumTimeToLock(android.content.ComponentName admin, long timeMs) { throw new RuntimeException("Stub!"); }
public  long getMaximumTimeToLock(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setRequiredStrongAuthTimeout(android.content.ComponentName admin, long timeoutMs) { throw new RuntimeException("Stub!"); }
public  long getRequiredStrongAuthTimeout(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void lockNow() { throw new RuntimeException("Stub!"); }
public  void lockNow(int flags) { throw new RuntimeException("Stub!"); }
public  void wipeData(int flags) { throw new RuntimeException("Stub!"); }
public  void wipeData(int flags, java.lang.CharSequence reason) { throw new RuntimeException("Stub!"); }
public  void setRecommendedGlobalProxy(android.content.ComponentName admin, android.net.ProxyInfo proxyInfo) { throw new RuntimeException("Stub!"); }
public  int setStorageEncryption(android.content.ComponentName admin, boolean encrypt) { throw new RuntimeException("Stub!"); }
public  boolean getStorageEncryption(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  int getStorageEncryptionStatus() { throw new RuntimeException("Stub!"); }
public  boolean installCaCert(android.content.ComponentName admin, byte[] certBuffer) { throw new RuntimeException("Stub!"); }
public  void uninstallCaCert(android.content.ComponentName admin, byte[] certBuffer) { throw new RuntimeException("Stub!"); }
public  java.util.List<byte[]> getInstalledCaCerts(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void uninstallAllUserCaCerts(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean hasCaCertInstalled(android.content.ComponentName admin, byte[] certBuffer) { throw new RuntimeException("Stub!"); }
public  boolean installKeyPair(android.content.ComponentName admin, java.security.PrivateKey privKey, java.security.cert.Certificate cert, java.lang.String alias) { throw new RuntimeException("Stub!"); }
public  boolean installKeyPair(android.content.ComponentName admin, java.security.PrivateKey privKey, java.security.cert.Certificate[] certs, java.lang.String alias, boolean requestAccess) { throw new RuntimeException("Stub!"); }
public  boolean installKeyPair(android.content.ComponentName admin, java.security.PrivateKey privKey, java.security.cert.Certificate[] certs, java.lang.String alias, int flags) { throw new RuntimeException("Stub!"); }
public  boolean removeKeyPair(android.content.ComponentName admin, java.lang.String alias) { throw new RuntimeException("Stub!"); }
public  android.security.AttestedKeyPair generateKeyPair(android.content.ComponentName admin, java.lang.String algorithm, android.security.keystore.KeyGenParameterSpec keySpec, int idAttestationFlags) { throw new RuntimeException("Stub!"); }
public  boolean isDeviceIdAttestationSupported() { throw new RuntimeException("Stub!"); }
public  boolean setKeyPairCertificate(android.content.ComponentName admin, java.lang.String alias, java.util.List<java.security.cert.Certificate> certs, boolean isUserSelectable) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setCertInstallerPackage(android.content.ComponentName admin, java.lang.String installerPackage) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getCertInstallerPackage(android.content.ComponentName admin) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void setDelegatedScopes(android.content.ComponentName admin, java.lang.String delegatePackage, java.util.List<java.lang.String> scopes) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName admin, java.lang.String delegatedPackage) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName admin, java.lang.String delegationScope) { throw new RuntimeException("Stub!"); }
public  void setAlwaysOnVpnPackage(android.content.ComponentName admin, java.lang.String vpnPackage, boolean lockdownEnabled) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setCameraDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  boolean getCameraDisabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean requestBugreport(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setScreenCaptureDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  boolean getScreenCaptureDisabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setAutoTimeRequired(android.content.ComponentName admin, boolean required) { throw new RuntimeException("Stub!"); }
public  boolean getAutoTimeRequired() { throw new RuntimeException("Stub!"); }
public  void setKeyguardDisabledFeatures(android.content.ComponentName admin, int which) { throw new RuntimeException("Stub!"); }
public  int getKeyguardDisabledFeatures(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean isDeviceOwnerApp(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void clearDeviceOwnerApp(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  boolean isDeviceManaged() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void clearProfileOwner(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setDeviceOwnerLockScreenInfo(android.content.ComponentName admin, java.lang.CharSequence info) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDeviceOwnerLockScreenInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] setPackagesSuspended(android.content.ComponentName admin, java.lang.String[] packageNames, boolean suspended) { throw new RuntimeException("Stub!"); }
public  boolean isPackageSuspended(android.content.ComponentName admin, java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  void setProfileEnabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setProfileName(android.content.ComponentName admin, java.lang.String profileName) { throw new RuntimeException("Stub!"); }
public  boolean isProfileOwnerApp(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void addPersistentPreferredActivity(android.content.ComponentName admin, android.content.IntentFilter filter, android.content.ComponentName activity) { throw new RuntimeException("Stub!"); }
public  void clearPackagePersistentPreferredActivities(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setApplicationRestrictionsManagingPackage(android.content.ComponentName admin, java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isCallerApplicationRestrictionsManagingPackage() { throw new RuntimeException("Stub!"); }
public  void setApplicationRestrictions(android.content.ComponentName admin, java.lang.String packageName, android.os.Bundle settings) { throw new RuntimeException("Stub!"); }
public  void setTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName target, android.os.PersistableBundle configuration) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName admin, android.content.ComponentName agent) { throw new RuntimeException("Stub!"); }
public  void setCrossProfileCallerIdDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  boolean getCrossProfileCallerIdDisabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setCrossProfileContactsSearchDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setBluetoothContactSharingDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  boolean getBluetoothContactSharingDisabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void addCrossProfileIntentFilter(android.content.ComponentName admin, android.content.IntentFilter filter, int flags) { throw new RuntimeException("Stub!"); }
public  void clearCrossProfileIntentFilters(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean setPermittedAccessibilityServices(android.content.ComponentName admin, java.util.List<java.lang.String> packageNames) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean setPermittedInputMethods(android.content.ComponentName admin, java.util.List<java.lang.String> packageNames) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName admin, java.util.List<java.lang.String> packageList) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setKeepUninstalledPackages(android.content.ComponentName admin, java.util.List<java.lang.String> packageNames) { throw new RuntimeException("Stub!"); }
public  android.os.UserHandle createAndManageUser(android.content.ComponentName admin, java.lang.String name, android.content.ComponentName profileOwner, android.os.PersistableBundle adminExtras, int flags) { throw new RuntimeException("Stub!"); }
public  boolean removeUser(android.content.ComponentName admin, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  boolean switchUser(android.content.ComponentName admin, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  int startUserInBackground(android.content.ComponentName admin, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  int stopUser(android.content.ComponentName admin, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  int logoutUser(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean isEphemeralUser(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getApplicationRestrictions(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void addUserRestriction(android.content.ComponentName admin, java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void clearUserRestriction(android.content.ComponentName admin, java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getUserRestrictions(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  android.content.Intent createAdminSupportIntent(java.lang.String restriction) { throw new RuntimeException("Stub!"); }
public  boolean setApplicationHidden(android.content.ComponentName admin, java.lang.String packageName, boolean hidden) { throw new RuntimeException("Stub!"); }
public  boolean isApplicationHidden(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void enableSystemApp(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int enableSystemApp(android.content.ComponentName admin, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  boolean installExistingPackage(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void setAccountManagementDisabled(android.content.ComponentName admin, java.lang.String accountType, boolean disabled) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getAccountTypesWithManagementDisabled() { throw new RuntimeException("Stub!"); }
public  void setLockTaskPackages(android.content.ComponentName admin, java.lang.String[] packages) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getLockTaskPackages(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean isLockTaskPermitted(java.lang.String pkg) { throw new RuntimeException("Stub!"); }
public  void setLockTaskFeatures(android.content.ComponentName admin, int flags) { throw new RuntimeException("Stub!"); }
public  int getLockTaskFeatures(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setGlobalSetting(android.content.ComponentName admin, java.lang.String setting, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setSystemSetting(android.content.ComponentName admin, java.lang.String setting, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  boolean setTime(android.content.ComponentName admin, long millis) { throw new RuntimeException("Stub!"); }
public  boolean setTimeZone(android.content.ComponentName admin, java.lang.String timeZone) { throw new RuntimeException("Stub!"); }
public  void setSecureSetting(android.content.ComponentName admin, java.lang.String setting, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setRestrictionsProvider(android.content.ComponentName admin, android.content.ComponentName provider) { throw new RuntimeException("Stub!"); }
public  void setMasterVolumeMuted(android.content.ComponentName admin, boolean on) { throw new RuntimeException("Stub!"); }
public  boolean isMasterVolumeMuted(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName, boolean uninstallBlocked) { throw new RuntimeException("Stub!"); }
public  boolean isUninstallBlocked(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean addCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean removeCrossProfileWidgetProvider(android.content.ComponentName admin, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setUserIcon(android.content.ComponentName admin, android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
public  void setSystemUpdatePolicy(android.content.ComponentName admin, android.app.admin.SystemUpdatePolicy policy) { throw new RuntimeException("Stub!"); }
public  android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() { throw new RuntimeException("Stub!"); }
public  boolean setKeyguardDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  boolean setStatusBarDisabled(android.content.ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
public  android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setPermissionPolicy(android.content.ComponentName admin, int policy) { throw new RuntimeException("Stub!"); }
public  int getPermissionPolicy(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean setPermissionGrantState(android.content.ComponentName admin, java.lang.String packageName, java.lang.String permission, int grantState) { throw new RuntimeException("Stub!"); }
public  int getPermissionGrantState(android.content.ComponentName admin, java.lang.String packageName, java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  boolean isProvisioningAllowed(java.lang.String action) { throw new RuntimeException("Stub!"); }
public  boolean isManagedProfile(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.lang.String getWifiMacAddress(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void reboot(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setShortSupportMessage(android.content.ComponentName admin, java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getShortSupportMessage(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setLongSupportMessage(android.content.ComponentName admin, java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLongSupportMessage(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  android.app.admin.DevicePolicyManager getParentProfileInstance(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setSecurityLoggingEnabled(android.content.ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isSecurityLoggingEnabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.admin.SecurityLog.SecurityEvent> retrieveSecurityLogs(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName admin, java.util.List<java.lang.String> packageNames) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.admin.SecurityLog.SecurityEvent> retrievePreRebootSecurityLogs(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setOrganizationColor(android.content.ComponentName admin, int color) { throw new RuntimeException("Stub!"); }
public  int getOrganizationColor(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setOrganizationName(android.content.ComponentName admin, java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getOrganizationName(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  java.lang.CharSequence getDeviceOwnerOrganizationName() { throw new RuntimeException("Stub!"); }
public  void setAffiliationIds(android.content.ComponentName admin, java.util.Set<java.lang.String> ids) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getAffiliationIds(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  boolean isAffiliatedUser() { throw new RuntimeException("Stub!"); }
public  void setBackupServiceEnabled(android.content.ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isBackupServiceEnabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setNetworkLoggingEnabled(android.content.ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isNetworkLoggingEnabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName admin, long batchToken) { throw new RuntimeException("Stub!"); }
public  boolean bindDeviceAdminServiceAsUser(android.content.ComponentName admin, android.content.Intent serviceIntent, android.content.ServiceConnection conn, int flags, android.os.UserHandle targetUser) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  long getLastSecurityLogRetrievalTime() { throw new RuntimeException("Stub!"); }
public  long getLastBugReportRequestTime() { throw new RuntimeException("Stub!"); }
public  long getLastNetworkLogRetrievalTime() { throw new RuntimeException("Stub!"); }
public  boolean isCurrentInputMethodSetByOwner() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getOwnerInstalledCaCerts(android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void clearApplicationUserData(android.content.ComponentName admin, java.lang.String packageName, java.util.concurrent.Executor executor, android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener listener) { throw new RuntimeException("Stub!"); }
public  void setLogoutEnabled(android.content.ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isLogoutEnabled() { throw new RuntimeException("Stub!"); }
public  void transferOwnership(android.content.ComponentName admin, android.content.ComponentName target, android.os.PersistableBundle bundle) { throw new RuntimeException("Stub!"); }
public  void setStartUserSessionMessage(android.content.ComponentName admin, java.lang.CharSequence startUserSessionMessage) { throw new RuntimeException("Stub!"); }
public  void setEndUserSessionMessage(android.content.ComponentName admin, java.lang.CharSequence endUserSessionMessage) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  int addOverrideApn(android.content.ComponentName admin, android.telephony.data.ApnSetting apnSetting) { throw new RuntimeException("Stub!"); }
public  boolean updateOverrideApn(android.content.ComponentName admin, int apnId, android.telephony.data.ApnSetting apnSetting) { throw new RuntimeException("Stub!"); }
public  boolean removeOverrideApn(android.content.ComponentName admin, int apnId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  void setOverrideApnsEnabled(android.content.ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isOverrideApnEnabled(android.content.ComponentName admin) { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getTransferOwnershipBundle() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACCOUNT_FEATURE_DEVICE_OR_PROFILE_OWNER_ALLOWED = "android.account.DEVICE_OR_PROFILE_OWNER_ALLOWED";
public static final java.lang.String ACCOUNT_FEATURE_DEVICE_OR_PROFILE_OWNER_DISALLOWED = "android.account.DEVICE_OR_PROFILE_OWNER_DISALLOWED";
public static final java.lang.String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";
public static final java.lang.String ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED = "android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED";
public static final java.lang.String ACTION_DATA_SHARING_RESTRICTION_APPLIED = "android.app.action.DATA_SHARING_RESTRICTION_APPLIED";
public static final java.lang.String ACTION_DEVICE_ADMIN_SERVICE = "android.app.action.DEVICE_ADMIN_SERVICE";
public static final java.lang.String ACTION_DEVICE_OWNER_CHANGED = "android.app.action.DEVICE_OWNER_CHANGED";
public static final java.lang.String ACTION_MANAGED_PROFILE_PROVISIONED = "android.app.action.MANAGED_PROFILE_PROVISIONED";
public static final java.lang.String ACTION_PROFILE_OWNER_CHANGED = "android.app.action.PROFILE_OWNER_CHANGED";
public static final java.lang.String ACTION_PROVISIONING_SUCCESSFUL = "android.app.action.PROVISIONING_SUCCESSFUL";
public static final java.lang.String ACTION_PROVISION_MANAGED_DEVICE = "android.app.action.PROVISION_MANAGED_DEVICE";
public static final java.lang.String ACTION_PROVISION_MANAGED_PROFILE = "android.app.action.PROVISION_MANAGED_PROFILE";
public static final java.lang.String ACTION_SET_NEW_PARENT_PROFILE_PASSWORD = "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD";
public static final java.lang.String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";
public static final java.lang.String ACTION_START_ENCRYPTION = "android.app.action.START_ENCRYPTION";
public static final java.lang.String ACTION_SYSTEM_UPDATE_POLICY_CHANGED = "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED";
public static final java.lang.String DELEGATION_APP_RESTRICTIONS = "delegation-app-restrictions";
public static final java.lang.String DELEGATION_BLOCK_UNINSTALL = "delegation-block-uninstall";
public static final java.lang.String DELEGATION_CERT_INSTALL = "delegation-cert-install";
public static final java.lang.String DELEGATION_ENABLE_SYSTEM_APP = "delegation-enable-system-app";
public static final java.lang.String DELEGATION_INSTALL_EXISTING_PACKAGE = "delegation-install-existing-package";
public static final java.lang.String DELEGATION_KEEP_UNINSTALLED_PACKAGES = "delegation-keep-uninstalled-packages";
public static final java.lang.String DELEGATION_PACKAGE_ACCESS = "delegation-package-access";
public static final java.lang.String DELEGATION_PERMISSION_GRANT = "delegation-permission-grant";
public static final int ENCRYPTION_STATUS_ACTIVATING = 2;
public static final int ENCRYPTION_STATUS_ACTIVE = 3;
public static final int ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY = 4;
public static final int ENCRYPTION_STATUS_ACTIVE_PER_USER = 5;
public static final int ENCRYPTION_STATUS_INACTIVE = 1;
public static final int ENCRYPTION_STATUS_UNSUPPORTED = 0;
public static final java.lang.String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";
public static final java.lang.String EXTRA_DELEGATION_SCOPES = "android.app.extra.DELEGATION_SCOPES";
public static final java.lang.String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";
public static final java.lang.String EXTRA_PROVISIONING_ACCOUNT_TO_MIGRATE = "android.app.extra.PROVISIONING_ACCOUNT_TO_MIGRATE";
public static final java.lang.String EXTRA_PROVISIONING_ADMIN_EXTRAS_BUNDLE = "android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE";
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME";
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE = "android.app.extra.PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE";
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM";
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER";
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME";
public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM";
public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMERS = "android.app.extra.PROVISIONING_DISCLAIMERS";
public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_CONTENT = "android.app.extra.PROVISIONING_DISCLAIMER_CONTENT";
public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_HEADER = "android.app.extra.PROVISIONING_DISCLAIMER_HEADER";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_PROVISIONING_EMAIL_ADDRESS = "android.app.extra.PROVISIONING_EMAIL_ADDRESS";
public static final java.lang.String EXTRA_PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION = "android.app.extra.PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION";
public static final java.lang.String EXTRA_PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED = "android.app.extra.PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED";
public static final java.lang.String EXTRA_PROVISIONING_LOCALE = "android.app.extra.PROVISIONING_LOCALE";
public static final java.lang.String EXTRA_PROVISIONING_LOCAL_TIME = "android.app.extra.PROVISIONING_LOCAL_TIME";
public static final java.lang.String EXTRA_PROVISIONING_LOGO_URI = "android.app.extra.PROVISIONING_LOGO_URI";
public static final java.lang.String EXTRA_PROVISIONING_MAIN_COLOR = "android.app.extra.PROVISIONING_MAIN_COLOR";
public static final java.lang.String EXTRA_PROVISIONING_SKIP_ENCRYPTION = "android.app.extra.PROVISIONING_SKIP_ENCRYPTION";
public static final java.lang.String EXTRA_PROVISIONING_SKIP_USER_CONSENT = "android.app.extra.PROVISIONING_SKIP_USER_CONSENT";
public static final java.lang.String EXTRA_PROVISIONING_TIME_ZONE = "android.app.extra.PROVISIONING_TIME_ZONE";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_HIDDEN = "android.app.extra.PROVISIONING_WIFI_HIDDEN";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_PAC_URL = "android.app.extra.PROVISIONING_WIFI_PAC_URL";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_PASSWORD = "android.app.extra.PROVISIONING_WIFI_PASSWORD";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_BYPASS = "android.app.extra.PROVISIONING_WIFI_PROXY_BYPASS";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_HOST = "android.app.extra.PROVISIONING_WIFI_PROXY_HOST";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_PORT = "android.app.extra.PROVISIONING_WIFI_PROXY_PORT";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_SECURITY_TYPE = "android.app.extra.PROVISIONING_WIFI_SECURITY_TYPE";
public static final java.lang.String EXTRA_PROVISIONING_WIFI_SSID = "android.app.extra.PROVISIONING_WIFI_SSID";
public static final java.lang.String EXTRA_RESTRICTION = "android.app.extra.RESTRICTION";
public static final int FLAG_EVICT_CREDENTIAL_ENCRYPTION_KEY = 1;
public static final int FLAG_MANAGED_CAN_ACCESS_PARENT = 2;
public static final int FLAG_PARENT_CAN_ACCESS_MANAGED = 1;
public static final int ID_TYPE_BASE_INFO = 1;
public static final int ID_TYPE_IMEI = 4;
public static final int ID_TYPE_MEID = 8;
public static final int ID_TYPE_SERIAL = 2;
public static final int INSTALLKEY_REQUEST_CREDENTIALS_ACCESS = 1;
public static final int INSTALLKEY_SET_USER_SELECTABLE = 2;
public static final int KEYGUARD_DISABLE_BIOMETRICS = 416;
public static final int KEYGUARD_DISABLE_FACE = 128;
public static final int KEYGUARD_DISABLE_FEATURES_ALL = 2147483647;
public static final int KEYGUARD_DISABLE_FEATURES_NONE = 0;
public static final int KEYGUARD_DISABLE_FINGERPRINT = 32;
public static final int KEYGUARD_DISABLE_IRIS = 256;
public static final int KEYGUARD_DISABLE_REMOTE_INPUT = 64;
public static final int KEYGUARD_DISABLE_SECURE_CAMERA = 2;
public static final int KEYGUARD_DISABLE_SECURE_NOTIFICATIONS = 4;
public static final int KEYGUARD_DISABLE_TRUST_AGENTS = 16;
public static final int KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS = 8;
public static final int KEYGUARD_DISABLE_WIDGETS_ALL = 1;
public static final int LEAVE_ALL_SYSTEM_APPS_ENABLED = 16;
public static final int LOCK_TASK_FEATURE_GLOBAL_ACTIONS = 16;
public static final int LOCK_TASK_FEATURE_HOME = 4;
public static final int LOCK_TASK_FEATURE_KEYGUARD = 32;
public static final int LOCK_TASK_FEATURE_NONE = 0;
public static final int LOCK_TASK_FEATURE_NOTIFICATIONS = 2;
public static final int LOCK_TASK_FEATURE_OVERVIEW = 8;
public static final int LOCK_TASK_FEATURE_SYSTEM_INFO = 1;
public static final int MAKE_USER_EPHEMERAL = 2;
public static final java.lang.String MIME_TYPE_PROVISIONING_NFC = "application/com.android.managedprovisioning";
public static final int PASSWORD_QUALITY_ALPHABETIC = 262144;
public static final int PASSWORD_QUALITY_ALPHANUMERIC = 327680;
public static final int PASSWORD_QUALITY_BIOMETRIC_WEAK = 32768;
public static final int PASSWORD_QUALITY_COMPLEX = 393216;
public static final int PASSWORD_QUALITY_NUMERIC = 131072;
public static final int PASSWORD_QUALITY_NUMERIC_COMPLEX = 196608;
public static final int PASSWORD_QUALITY_SOMETHING = 65536;
public static final int PASSWORD_QUALITY_UNSPECIFIED = 0;
public static final int PERMISSION_GRANT_STATE_DEFAULT = 0;
public static final int PERMISSION_GRANT_STATE_DENIED = 2;
public static final int PERMISSION_GRANT_STATE_GRANTED = 1;
public static final int PERMISSION_POLICY_AUTO_DENY = 2;
public static final int PERMISSION_POLICY_AUTO_GRANT = 1;
public static final int PERMISSION_POLICY_PROMPT = 0;
public static final java.lang.String POLICY_DISABLE_CAMERA = "policy_disable_camera";
public static final java.lang.String POLICY_DISABLE_SCREEN_CAPTURE = "policy_disable_screen_capture";
public static final int RESET_PASSWORD_DO_NOT_ASK_CREDENTIALS_ON_BOOT = 2;
public static final int RESET_PASSWORD_REQUIRE_ENTRY = 1;
public static final int SKIP_SETUP_WIZARD = 1;
public static final int WIPE_EUICC = 4;
public static final int WIPE_EXTERNAL_STORAGE = 1;
public static final int WIPE_RESET_PROTECTION_DATA = 2;
}
