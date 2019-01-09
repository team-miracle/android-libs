/*
* Copyright (C) 2012 The Android Open Source Project
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

package android.os;
public class UserManager
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface UserRestrictionSource
{
}
public static class UserOperationException
  extends java.lang.RuntimeException
{
UserOperationException() { throw new RuntimeException("Stub!"); }
public  int getUserOperationResult() { throw new RuntimeException("Stub!"); }
}
public static final class EnforcingUser
  implements android.os.Parcelable
{
EnforcingUser() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  android.os.UserHandle getUserHandle() { throw new RuntimeException("Stub!"); }
@android.os.UserManager.UserRestrictionSource()
public  int getUserRestrictionSource() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.UserManager.EnforcingUser> CREATOR;
static { CREATOR = null; }
}
UserManager() { throw new RuntimeException("Stub!"); }
public static  boolean supportsMultipleUsers() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserName() { throw new RuntimeException("Stub!"); }
public  boolean isUserAGoat() { throw new RuntimeException("Stub!"); }
public  boolean isSystemUser() { throw new RuntimeException("Stub!"); }
public  boolean isRestrictedProfile() { throw new RuntimeException("Stub!"); }
public  boolean hasRestrictedProfiles() { throw new RuntimeException("Stub!"); }
public  boolean isDemoUser() { throw new RuntimeException("Stub!"); }
public  boolean isManagedProfile() { throw new RuntimeException("Stub!"); }
public  boolean isManagedProfile(int userId) { throw new RuntimeException("Stub!"); }
public  boolean isUserRunning(android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  boolean isUserRunningOrStopping(android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  boolean isUserUnlocked() { throw new RuntimeException("Stub!"); }
public  boolean isUserUnlocked(android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.os.UserManager.UserRestrictionSource()
public  int getUserRestrictionSource(java.lang.String restrictionKey, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String restrictionKey, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getUserRestrictions() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getUserRestrictions(android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setUserRestrictions(android.os.Bundle restrictions) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setUserRestrictions(android.os.Bundle restrictions, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setUserRestriction(java.lang.String key, boolean value) { throw new RuntimeException("Stub!"); }
public  boolean hasUserRestriction(java.lang.String restrictionKey) { throw new RuntimeException("Stub!"); }
public  long getSerialNumberForUser(android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.os.UserHandle getUserForSerialNumber(long serialNumber) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent createUserCreationIntent(java.lang.String userName, java.lang.String accountName, java.lang.String accountType, android.os.PersistableBundle accountOptions) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSeedAccountName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSeedAccountType() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getSeedAccountOptions() { throw new RuntimeException("Stub!"); }
public  void clearSeedAccountData() { throw new RuntimeException("Stub!"); }
public  int getUserCount() { throw new RuntimeException("Stub!"); }
public  long[] getSerialNumbersOfUsers(boolean excludeDying) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.UserHandle> getUserProfiles() { throw new RuntimeException("Stub!"); }
public  boolean requestQuietModeEnabled(boolean enableQuietMode, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  boolean isQuietModeEnabled(android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getApplicationRestrictions(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean setRestrictionsChallenge(java.lang.String newPin) { throw new RuntimeException("Stub!"); }
public  long getUserCreationTime(android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_USER_RESTRICTIONS_CHANGED = "android.os.action.USER_RESTRICTIONS_CHANGED";
public static final java.lang.String ALLOW_PARENT_PROFILE_APP_LINKING = "allow_parent_profile_app_linking";
public static final java.lang.String DISALLOW_ADD_MANAGED_PROFILE = "no_add_managed_profile";
public static final java.lang.String DISALLOW_ADD_USER = "no_add_user";
public static final java.lang.String DISALLOW_ADJUST_VOLUME = "no_adjust_volume";
public static final java.lang.String DISALLOW_AIRPLANE_MODE = "no_airplane_mode";
public static final java.lang.String DISALLOW_AMBIENT_DISPLAY = "no_ambient_display";
public static final java.lang.String DISALLOW_APPS_CONTROL = "no_control_apps";
public static final java.lang.String DISALLOW_AUTOFILL = "no_autofill";
public static final java.lang.String DISALLOW_BLUETOOTH = "no_bluetooth";
public static final java.lang.String DISALLOW_BLUETOOTH_SHARING = "no_bluetooth_sharing";
public static final java.lang.String DISALLOW_CONFIG_BLUETOOTH = "no_config_bluetooth";
public static final java.lang.String DISALLOW_CONFIG_BRIGHTNESS = "no_config_brightness";
public static final java.lang.String DISALLOW_CONFIG_CELL_BROADCASTS = "no_config_cell_broadcasts";
public static final java.lang.String DISALLOW_CONFIG_CREDENTIALS = "no_config_credentials";
public static final java.lang.String DISALLOW_CONFIG_DATE_TIME = "no_config_date_time";
public static final java.lang.String DISALLOW_CONFIG_LOCALE = "no_config_locale";
public static final java.lang.String DISALLOW_CONFIG_LOCATION = "no_config_location";
public static final java.lang.String DISALLOW_CONFIG_MOBILE_NETWORKS = "no_config_mobile_networks";
public static final java.lang.String DISALLOW_CONFIG_SCREEN_TIMEOUT = "no_config_screen_timeout";
public static final java.lang.String DISALLOW_CONFIG_TETHERING = "no_config_tethering";
public static final java.lang.String DISALLOW_CONFIG_VPN = "no_config_vpn";
public static final java.lang.String DISALLOW_CONFIG_WIFI = "no_config_wifi";
public static final java.lang.String DISALLOW_CREATE_WINDOWS = "no_create_windows";
public static final java.lang.String DISALLOW_CROSS_PROFILE_COPY_PASTE = "no_cross_profile_copy_paste";
public static final java.lang.String DISALLOW_DATA_ROAMING = "no_data_roaming";
public static final java.lang.String DISALLOW_DEBUGGING_FEATURES = "no_debugging_features";
public static final java.lang.String DISALLOW_FACTORY_RESET = "no_factory_reset";
public static final java.lang.String DISALLOW_FUN = "no_fun";
public static final java.lang.String DISALLOW_INSTALL_APPS = "no_install_apps";
public static final java.lang.String DISALLOW_INSTALL_UNKNOWN_SOURCES = "no_install_unknown_sources";
public static final java.lang.String DISALLOW_MODIFY_ACCOUNTS = "no_modify_accounts";
public static final java.lang.String DISALLOW_MOUNT_PHYSICAL_MEDIA = "no_physical_media";
public static final java.lang.String DISALLOW_NETWORK_RESET = "no_network_reset";
@java.lang.Deprecated()
public static final java.lang.String DISALLOW_OEM_UNLOCK = "no_oem_unlock";
public static final java.lang.String DISALLOW_OUTGOING_BEAM = "no_outgoing_beam";
public static final java.lang.String DISALLOW_OUTGOING_CALLS = "no_outgoing_calls";
public static final java.lang.String DISALLOW_PRINTING = "no_printing";
public static final java.lang.String DISALLOW_REMOVE_MANAGED_PROFILE = "no_remove_managed_profile";
public static final java.lang.String DISALLOW_REMOVE_USER = "no_remove_user";
public static final java.lang.String DISALLOW_RUN_IN_BACKGROUND = "no_run_in_background";
public static final java.lang.String DISALLOW_SAFE_BOOT = "no_safe_boot";
public static final java.lang.String DISALLOW_SET_USER_ICON = "no_set_user_icon";
public static final java.lang.String DISALLOW_SET_WALLPAPER = "no_set_wallpaper";
public static final java.lang.String DISALLOW_SHARE_INTO_MANAGED_PROFILE = "no_sharing_into_profile";
public static final java.lang.String DISALLOW_SHARE_LOCATION = "no_share_location";
public static final java.lang.String DISALLOW_SMS = "no_sms";
public static final java.lang.String DISALLOW_SYSTEM_ERROR_DIALOGS = "no_system_error_dialogs";
public static final java.lang.String DISALLOW_UNIFIED_PASSWORD = "no_unified_password";
public static final java.lang.String DISALLOW_UNINSTALL_APPS = "no_uninstall_apps";
public static final java.lang.String DISALLOW_UNMUTE_MICROPHONE = "no_unmute_microphone";
public static final java.lang.String DISALLOW_USB_FILE_TRANSFER = "no_usb_file_transfer";
public static final java.lang.String DISALLOW_USER_SWITCH = "no_user_switch";
public static final java.lang.String ENSURE_VERIFY_APPS = "ensure_verify_apps";
public static final java.lang.String KEY_RESTRICTIONS_PENDING = "restrictions_pending";
public static final int RESTRICTION_NOT_SET = 0;
public static final int RESTRICTION_SOURCE_DEVICE_OWNER = 2;
public static final int RESTRICTION_SOURCE_PROFILE_OWNER = 4;
public static final int RESTRICTION_SOURCE_SYSTEM = 1;
public static final int USER_CREATION_FAILED_NOT_PERMITTED = 1;
public static final int USER_CREATION_FAILED_NO_MORE_USERS = 2;
public static final int USER_OPERATION_ERROR_CURRENT_USER = 4;
public static final int USER_OPERATION_ERROR_LOW_STORAGE = 5;
public static final int USER_OPERATION_ERROR_MANAGED_PROFILE = 2;
public static final int USER_OPERATION_ERROR_MAX_RUNNING_USERS = 3;
public static final int USER_OPERATION_ERROR_MAX_USERS = 6;
public static final int USER_OPERATION_ERROR_UNKNOWN = 1;
public static final int USER_OPERATION_SUCCESS = 0;
}
