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

package android.provider;
public final class Settings
{
public static class SettingNotFoundException
  extends android.util.AndroidException
{
public  SettingNotFoundException(java.lang.String msg) { throw new RuntimeException("Stub!"); }
}
public static class NameValueTable
  implements android.provider.BaseColumns
{
public  NameValueTable() { throw new RuntimeException("Stub!"); }
protected static  boolean putString(android.content.ContentResolver resolver, android.net.Uri uri, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(android.net.Uri uri, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static final java.lang.String NAME = "name";
public static final java.lang.String VALUE = "value";
}
public static final class System
  extends android.provider.Settings.NameValueTable
{
public  System() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getString(android.content.ContentResolver resolver, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  boolean putString(android.content.ContentResolver resolver, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name, int def) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putInt(android.content.ContentResolver cr, java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name, long def) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putLong(android.content.ContentResolver cr, java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name, float def) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putFloat(android.content.ContentResolver cr, java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
public static  void getConfiguration(android.content.ContentResolver cr, android.content.res.Configuration outConfig) { throw new RuntimeException("Stub!"); }
public static  boolean putConfiguration(android.content.ContentResolver cr, android.content.res.Configuration config) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean getShowGTalkServiceStatus(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void setShowGTalkServiceStatus(android.content.ContentResolver cr, boolean flag) { throw new RuntimeException("Stub!"); }
public static  boolean canWrite(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACCELEROMETER_ROTATION = "accelerometer_rotation";
@java.lang.Deprecated()
public static final java.lang.String ADB_ENABLED = "adb_enabled";
@java.lang.Deprecated()
public static final java.lang.String AIRPLANE_MODE_ON = "airplane_mode_on";
@java.lang.Deprecated()
public static final java.lang.String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
public static final java.lang.String ALARM_ALERT = "alarm_alert";
@java.lang.Deprecated()
public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
@java.lang.Deprecated()
public static final java.lang.String ANDROID_ID = "android_id";
@java.lang.Deprecated()
public static final java.lang.String ANIMATOR_DURATION_SCALE = "animator_duration_scale";
@java.lang.Deprecated()
public static final java.lang.String AUTO_TIME = "auto_time";
@java.lang.Deprecated()
public static final java.lang.String AUTO_TIME_ZONE = "auto_time_zone";
public static final java.lang.String BLUETOOTH_DISCOVERABILITY = "bluetooth_discoverability";
public static final java.lang.String BLUETOOTH_DISCOVERABILITY_TIMEOUT = "bluetooth_discoverability_timeout";
@java.lang.Deprecated()
public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
public static final android.net.Uri CONTENT_URI;
@java.lang.Deprecated()
public static final java.lang.String DATA_ROAMING = "data_roaming";
public static final java.lang.String DATE_FORMAT = "date_format";
@java.lang.Deprecated()
public static final java.lang.String DEBUG_APP = "debug_app";
public static final android.net.Uri DEFAULT_ALARM_ALERT_URI;
public static final android.net.Uri DEFAULT_NOTIFICATION_URI;
public static final android.net.Uri DEFAULT_RINGTONE_URI;
@java.lang.Deprecated()
public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
@java.lang.Deprecated()
public static final java.lang.String DIM_SCREEN = "dim_screen";
public static final java.lang.String DTMF_TONE_TYPE_WHEN_DIALING = "dtmf_tone_type";
public static final java.lang.String DTMF_TONE_WHEN_DIALING = "dtmf_tone";
public static final java.lang.String END_BUTTON_BEHAVIOR = "end_button_behavior";
public static final java.lang.String FONT_SCALE = "font_scale";
public static final java.lang.String HAPTIC_FEEDBACK_ENABLED = "haptic_feedback_enabled";
@java.lang.Deprecated()
public static final java.lang.String HTTP_PROXY = "http_proxy";
@java.lang.Deprecated()
public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
@java.lang.Deprecated()
public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
@java.lang.Deprecated()
public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
@java.lang.Deprecated()
public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
@java.lang.Deprecated()
public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
@java.lang.Deprecated()
public static final java.lang.String LOGGING_ID = "logging_id";
@java.lang.Deprecated()
public static final java.lang.String MODE_RINGER = "mode_ringer";
public static final java.lang.String MODE_RINGER_STREAMS_AFFECTED = "mode_ringer_streams_affected";
public static final java.lang.String MUTE_STREAMS_AFFECTED = "mute_streams_affected";
@java.lang.Deprecated()
public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
@java.lang.Deprecated()
public static final java.lang.String NEXT_ALARM_FORMATTED = "next_alarm_formatted";
public static final java.lang.String NOTIFICATION_SOUND = "notification_sound";
@java.lang.Deprecated()
public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
@java.lang.Deprecated()
public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
@java.lang.Deprecated()
public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
@java.lang.Deprecated()
public static final java.lang.String RADIO_BLUETOOTH = "bluetooth";
@java.lang.Deprecated()
public static final java.lang.String RADIO_CELL = "cell";
@java.lang.Deprecated()
public static final java.lang.String RADIO_NFC = "nfc";
@java.lang.Deprecated()
public static final java.lang.String RADIO_WIFI = "wifi";
public static final java.lang.String RINGTONE = "ringtone";
public static final java.lang.String SCREEN_BRIGHTNESS = "screen_brightness";
public static final java.lang.String SCREEN_BRIGHTNESS_MODE = "screen_brightness_mode";
public static final int SCREEN_BRIGHTNESS_MODE_AUTOMATIC = 1;
public static final int SCREEN_BRIGHTNESS_MODE_MANUAL = 0;
public static final java.lang.String SCREEN_OFF_TIMEOUT = "screen_off_timeout";
@java.lang.Deprecated()
public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";
public static final java.lang.String SETUP_WIZARD_HAS_RUN = "setup_wizard_has_run";
public static final java.lang.String SHOW_GTALK_SERVICE_STATUS = "SHOW_GTALK_SERVICE_STATUS";
@java.lang.Deprecated()
public static final java.lang.String SHOW_PROCESSES = "show_processes";
@java.lang.Deprecated()
public static final java.lang.String SHOW_WEB_SUGGESTIONS = "show_web_suggestions";
public static final java.lang.String SOUND_EFFECTS_ENABLED = "sound_effects_enabled";
@java.lang.Deprecated()
public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
public static final java.lang.String TEXT_AUTO_CAPS = "auto_caps";
public static final java.lang.String TEXT_AUTO_PUNCTUATE = "auto_punctuate";
public static final java.lang.String TEXT_AUTO_REPLACE = "auto_replace";
public static final java.lang.String TEXT_SHOW_PASSWORD = "show_password";
public static final java.lang.String TIME_12_24 = "time_12_24";
@java.lang.Deprecated()
public static final java.lang.String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
@java.lang.Deprecated()
public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
public static final java.lang.String USER_ROTATION = "user_rotation";
@java.lang.Deprecated()
public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
public static final java.lang.String VIBRATE_ON = "vibrate_on";
public static final java.lang.String VIBRATE_WHEN_RINGING = "vibrate_when_ringing";
@java.lang.Deprecated()
public static final java.lang.String WAIT_FOR_DEBUGGER = "wait_for_debugger";
@java.lang.Deprecated()
public static final java.lang.String WALLPAPER_ACTIVITY = "wallpaper_activity";
@java.lang.Deprecated()
public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
@java.lang.Deprecated()
public static final java.lang.String WIFI_ON = "wifi_on";
@java.lang.Deprecated()
public static final java.lang.String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
@java.lang.Deprecated()
public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
@java.lang.Deprecated()
public static final int WIFI_SLEEP_POLICY_NEVER = 2;
@java.lang.Deprecated()
public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
@java.lang.Deprecated()
public static final java.lang.String WIFI_STATIC_DNS1 = "wifi_static_dns1";
@java.lang.Deprecated()
public static final java.lang.String WIFI_STATIC_DNS2 = "wifi_static_dns2";
@java.lang.Deprecated()
public static final java.lang.String WIFI_STATIC_GATEWAY = "wifi_static_gateway";
@java.lang.Deprecated()
public static final java.lang.String WIFI_STATIC_IP = "wifi_static_ip";
@java.lang.Deprecated()
public static final java.lang.String WIFI_STATIC_NETMASK = "wifi_static_netmask";
@java.lang.Deprecated()
public static final java.lang.String WIFI_USE_STATIC_IP = "wifi_use_static_ip";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WINDOW_ANIMATION_SCALE = "window_animation_scale";
static { CONTENT_URI = null; DEFAULT_ALARM_ALERT_URI = null; DEFAULT_NOTIFICATION_URI = null; DEFAULT_RINGTONE_URI = null; }
}
public static final class Secure
  extends android.provider.Settings.NameValueTable
{
public  Secure() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getString(android.content.ContentResolver resolver, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  boolean putString(android.content.ContentResolver resolver, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name, int def) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putInt(android.content.ContentResolver cr, java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name, long def) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putLong(android.content.ContentResolver cr, java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name, float def) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putFloat(android.content.ContentResolver cr, java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isLocationProviderEnabled(android.content.ContentResolver cr, java.lang.String provider) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void setLocationProviderEnabled(android.content.ContentResolver cr, java.lang.String provider, boolean enabled) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = "accessibility_display_inversion_enabled";
public static final java.lang.String ACCESSIBILITY_DISPLAY_MAGNIFICATION_ENABLED = "accessibility_display_magnification_enabled";
public static final java.lang.String ACCESSIBILITY_ENABLED = "accessibility_enabled";
@java.lang.Deprecated()
public static final java.lang.String ACCESSIBILITY_SPEAK_PASSWORD = "speak_password";
@java.lang.Deprecated()
public static final java.lang.String ADB_ENABLED = "adb_enabled";
public static final java.lang.String ALLOWED_GEOLOCATION_ORIGINS = "allowed_geolocation_origins";
@java.lang.Deprecated()
public static final java.lang.String ALLOW_MOCK_LOCATION = "mock_location";
public static final java.lang.String ANDROID_ID = "android_id";
public static final java.lang.String AUTOFILL_FEATURE_FIELD_CLASSIFICATION = "autofill_field_classification";
public static final java.lang.String AUTOFILL_SERVICE = "autofill_service";
public static final java.lang.String AUTOFILL_USER_DATA_MAX_CATEGORY_COUNT = "autofill_user_data_max_category_count";
public static final java.lang.String AUTOFILL_USER_DATA_MAX_FIELD_CLASSIFICATION_IDS_SIZE = "autofill_user_data_max_field_classification_size";
public static final java.lang.String AUTOFILL_USER_DATA_MAX_USER_DATA_SIZE = "autofill_user_data_max_user_data_size";
public static final java.lang.String AUTOFILL_USER_DATA_MAX_VALUE_LENGTH = "autofill_user_data_max_value_length";
public static final java.lang.String AUTOFILL_USER_DATA_MIN_VALUE_LENGTH = "autofill_user_data_min_value_length";
@java.lang.Deprecated()
public static final java.lang.String BACKGROUND_DATA = "background_data";
@java.lang.Deprecated()
public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
public static final android.net.Uri CONTENT_URI;
@java.lang.Deprecated()
public static final java.lang.String DATA_ROAMING = "data_roaming";
public static final java.lang.String DEFAULT_INPUT_METHOD = "default_input_method";
@java.lang.Deprecated()
public static final java.lang.String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";
@java.lang.Deprecated()
public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
public static final java.lang.String DISABLED_PRINT_SERVICES = "disabled_print_services";
public static final java.lang.String ENABLED_ACCESSIBILITY_SERVICES = "enabled_accessibility_services";
public static final java.lang.String ENABLED_INPUT_METHODS = "enabled_input_methods";
@java.lang.Deprecated()
public static final java.lang.String ENABLED_NOTIFICATION_POLICY_ACCESS_PACKAGES = "enabled_notification_policy_access_packages";
@java.lang.Deprecated()
public static final java.lang.String HTTP_PROXY = "http_proxy";
public static final java.lang.String INPUT_METHOD_SELECTOR_VISIBILITY = "input_method_selector_visibility";
@Deprecated
public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
@java.lang.Deprecated()
public static final java.lang.String LOCATION_MODE = "location_mode";
@java.lang.Deprecated()
public static final int LOCATION_MODE_BATTERY_SAVING = 2;
@java.lang.Deprecated()
public static final int LOCATION_MODE_HIGH_ACCURACY = 3;
@java.lang.Deprecated()
public static final int LOCATION_MODE_OFF = 0;
@java.lang.Deprecated()
public static final int LOCATION_MODE_SENSORS_ONLY = 1;
@java.lang.Deprecated()
public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
@java.lang.Deprecated()
public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
@java.lang.Deprecated()
public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
@java.lang.Deprecated()
public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
@java.lang.Deprecated()
public static final java.lang.String LOGGING_ID = "logging_id";
@java.lang.Deprecated()
public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
public static final java.lang.String RTT_CALLING_MODE = "rtt_calling_mode";
public static final java.lang.String SELECTED_INPUT_METHOD_SUBTYPE = "selected_input_method_subtype";
public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";
public static final java.lang.String SKIP_FIRST_USE_HINTS = "skip_first_use_hints";
public static final java.lang.String SYNC_PARENT_SOUNDS = "sync_parent_sounds";
public static final java.lang.String TOUCH_EXPLORATION_ENABLED = "touch_exploration_enabled";
@java.lang.Deprecated()
public static final java.lang.String TTS_DEFAULT_COUNTRY = "tts_default_country";
@java.lang.Deprecated()
public static final java.lang.String TTS_DEFAULT_LANG = "tts_default_lang";
public static final java.lang.String TTS_DEFAULT_PITCH = "tts_default_pitch";
public static final java.lang.String TTS_DEFAULT_RATE = "tts_default_rate";
public static final java.lang.String TTS_DEFAULT_SYNTH = "tts_default_synth";
@java.lang.Deprecated()
public static final java.lang.String TTS_DEFAULT_VARIANT = "tts_default_variant";
public static final java.lang.String TTS_ENABLED_PLUGINS = "tts_enabled_plugins";
@java.lang.Deprecated()
public static final java.lang.String TTS_USE_DEFAULTS = "tts_use_defaults";
@java.lang.Deprecated()
public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
public static final java.lang.String USER_SETUP_COMPLETE = "user_setup_complete";
@java.lang.Deprecated()
public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
public static final java.lang.String VOICE_INTERACTION_SERVICE = "voice_interaction_service";
@java.lang.Deprecated()
public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
@java.lang.Deprecated()
public static final java.lang.String WIFI_ON = "wifi_on";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_WATCHDOG_WATCH_LIST = "wifi_watchdog_watch_list";
static { CONTENT_URI = null; }
}
public static final class Global
  extends android.provider.Settings.NameValueTable
{
public  Global() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getString(android.content.ContentResolver resolver, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  boolean putString(android.content.ContentResolver resolver, java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriFor(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name, int def) { throw new RuntimeException("Stub!"); }
public static  int getInt(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putInt(android.content.ContentResolver cr, java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name, long def) { throw new RuntimeException("Stub!"); }
public static  long getLong(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putLong(android.content.ContentResolver cr, java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name, float def) { throw new RuntimeException("Stub!"); }
public static  float getFloat(android.content.ContentResolver cr, java.lang.String name) throws android.provider.Settings.SettingNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean putFloat(android.content.ContentResolver cr, java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ADB_ENABLED = "adb_enabled";
public static final java.lang.String AIRPLANE_MODE_ON = "airplane_mode_on";
public static final java.lang.String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
public static final java.lang.String ANIMATOR_DURATION_SCALE = "animator_duration_scale";
public static final java.lang.String AUTOFILL_COMPAT_MODE_ALLOWED_PACKAGES = "autofill_compat_mode_allowed_packages";
public static final java.lang.String AUTO_TIME = "auto_time";
public static final java.lang.String AUTO_TIME_ZONE = "auto_time_zone";
public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";
public static final java.lang.String BOOT_COUNT = "boot_count";
public static final java.lang.String CONTACT_METADATA_SYNC_ENABLED = "contact_metadata_sync_enabled";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DATA_ROAMING = "data_roaming";
public static final java.lang.String DEBUG_APP = "debug_app";
public static final java.lang.String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";
public static final java.lang.String DEVICE_NAME = "device_name";
public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";
public static final java.lang.String HIDDEN_API_BLACKLIST_EXEMPTIONS = "hidden_api_blacklist_exemptions";
public static final java.lang.String HTTP_PROXY = "http_proxy";
@java.lang.Deprecated()
public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
public static final java.lang.String LOCATION_GLOBAL_KILL_SWITCH = "location_global_kill_switch";
public static final java.lang.String LOW_POWER_MODE = "low_power";
public static final java.lang.String LOW_POWER_MODE_STICKY = "low_power_sticky";
public static final java.lang.String MODE_RINGER = "mode_ringer";
public static final java.lang.String NETWORK_PREFERENCE = "network_preference";
public static final java.lang.String RADIO_BLUETOOTH = "bluetooth";
public static final java.lang.String RADIO_CELL = "cell";
public static final java.lang.String RADIO_NFC = "nfc";
public static final java.lang.String RADIO_WIFI = "wifi";
@java.lang.Deprecated()
public static final java.lang.String SHOW_PROCESSES = "show_processes";
public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
public static final java.lang.String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";
public static final java.lang.String USE_OPEN_WIFI_PACKAGE = "use_open_wifi_package";
public static final java.lang.String WAIT_FOR_DEBUGGER = "wait_for_debugger";
public static final java.lang.String WIFI_DEVICE_OWNER_CONFIGS_LOCKDOWN = "wifi_device_owner_configs_lockdown";
public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
@java.lang.Deprecated()
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
public static final java.lang.String WIFI_ON = "wifi_on";
public static final java.lang.String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
public static final int WIFI_SLEEP_POLICY_NEVER = 2;
public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
public static final java.lang.String WINDOW_ANIMATION_SCALE = "window_animation_scale";
static { CONTENT_URI = null; }
}
public  Settings() { throw new RuntimeException("Stub!"); }
public static  boolean canDrawOverlays(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_ACCESSIBILITY_SETTINGS = "android.settings.ACCESSIBILITY_SETTINGS";
public static final java.lang.String ACTION_ADD_ACCOUNT = "android.settings.ADD_ACCOUNT_SETTINGS";
public static final java.lang.String ACTION_AIRPLANE_MODE_SETTINGS = "android.settings.AIRPLANE_MODE_SETTINGS";
public static final java.lang.String ACTION_APN_SETTINGS = "android.settings.APN_SETTINGS";
public static final java.lang.String ACTION_APPLICATION_DETAILS_SETTINGS = "android.settings.APPLICATION_DETAILS_SETTINGS";
public static final java.lang.String ACTION_APPLICATION_DEVELOPMENT_SETTINGS = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
public static final java.lang.String ACTION_APPLICATION_SETTINGS = "android.settings.APPLICATION_SETTINGS";
public static final java.lang.String ACTION_APP_NOTIFICATION_SETTINGS = "android.settings.APP_NOTIFICATION_SETTINGS";
public static final java.lang.String ACTION_BATTERY_SAVER_SETTINGS = "android.settings.BATTERY_SAVER_SETTINGS";
public static final java.lang.String ACTION_BLUETOOTH_SETTINGS = "android.settings.BLUETOOTH_SETTINGS";
public static final java.lang.String ACTION_CAPTIONING_SETTINGS = "android.settings.CAPTIONING_SETTINGS";
public static final java.lang.String ACTION_CAST_SETTINGS = "android.settings.CAST_SETTINGS";
public static final java.lang.String ACTION_CHANNEL_NOTIFICATION_SETTINGS = "android.settings.CHANNEL_NOTIFICATION_SETTINGS";
public static final java.lang.String ACTION_DATA_ROAMING_SETTINGS = "android.settings.DATA_ROAMING_SETTINGS";
public static final java.lang.String ACTION_DATA_USAGE_SETTINGS = "android.settings.DATA_USAGE_SETTINGS";
public static final java.lang.String ACTION_DATE_SETTINGS = "android.settings.DATE_SETTINGS";
public static final java.lang.String ACTION_DEVICE_INFO_SETTINGS = "android.settings.DEVICE_INFO_SETTINGS";
public static final java.lang.String ACTION_DISPLAY_SETTINGS = "android.settings.DISPLAY_SETTINGS";
public static final java.lang.String ACTION_DREAM_SETTINGS = "android.settings.DREAM_SETTINGS";
public static final java.lang.String ACTION_ENTERPRISE_PRIVACY_SETTINGS = "android.settings.ENTERPRISE_PRIVACY_SETTINGS";
public static final java.lang.String ACTION_FINGERPRINT_ENROLL = "android.settings.FINGERPRINT_ENROLL";
public static final java.lang.String ACTION_HARD_KEYBOARD_SETTINGS = "android.settings.HARD_KEYBOARD_SETTINGS";
public static final java.lang.String ACTION_HOME_SETTINGS = "android.settings.HOME_SETTINGS";
public static final java.lang.String ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS = "android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS";
public static final java.lang.String ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS";
public static final java.lang.String ACTION_INPUT_METHOD_SETTINGS = "android.settings.INPUT_METHOD_SETTINGS";
public static final java.lang.String ACTION_INPUT_METHOD_SUBTYPE_SETTINGS = "android.settings.INPUT_METHOD_SUBTYPE_SETTINGS";
public static final java.lang.String ACTION_INTERNAL_STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";
public static final java.lang.String ACTION_LOCALE_SETTINGS = "android.settings.LOCALE_SETTINGS";
public static final java.lang.String ACTION_LOCATION_SOURCE_SETTINGS = "android.settings.LOCATION_SOURCE_SETTINGS";
public static final java.lang.String ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS = "android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS";
public static final java.lang.String ACTION_MANAGE_APPLICATIONS_SETTINGS = "android.settings.MANAGE_APPLICATIONS_SETTINGS";
public static final java.lang.String ACTION_MANAGE_DEFAULT_APPS_SETTINGS = "android.settings.MANAGE_DEFAULT_APPS_SETTINGS";
public static final java.lang.String ACTION_MANAGE_OVERLAY_PERMISSION = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
public static final java.lang.String ACTION_MANAGE_UNKNOWN_APP_SOURCES = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
public static final java.lang.String ACTION_MANAGE_WRITE_SETTINGS = "android.settings.action.MANAGE_WRITE_SETTINGS";
public static final java.lang.String ACTION_MEMORY_CARD_SETTINGS = "android.settings.MEMORY_CARD_SETTINGS";
public static final java.lang.String ACTION_NETWORK_OPERATOR_SETTINGS = "android.settings.NETWORK_OPERATOR_SETTINGS";
public static final java.lang.String ACTION_NFCSHARING_SETTINGS = "android.settings.NFCSHARING_SETTINGS";
public static final java.lang.String ACTION_NFC_PAYMENT_SETTINGS = "android.settings.NFC_PAYMENT_SETTINGS";
public static final java.lang.String ACTION_NFC_SETTINGS = "android.settings.NFC_SETTINGS";
public static final java.lang.String ACTION_NIGHT_DISPLAY_SETTINGS = "android.settings.NIGHT_DISPLAY_SETTINGS";
public static final java.lang.String ACTION_NOTIFICATION_LISTENER_SETTINGS = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
public static final java.lang.String ACTION_PRINT_SETTINGS = "android.settings.ACTION_PRINT_SETTINGS";
public static final java.lang.String ACTION_PRIVACY_SETTINGS = "android.settings.PRIVACY_SETTINGS";
public static final java.lang.String ACTION_QUICK_LAUNCH_SETTINGS = "android.settings.QUICK_LAUNCH_SETTINGS";
public static final java.lang.String ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
public static final java.lang.String ACTION_REQUEST_SET_AUTOFILL_SERVICE = "android.settings.REQUEST_SET_AUTOFILL_SERVICE";
public static final java.lang.String ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";
public static final java.lang.String ACTION_SECURITY_SETTINGS = "android.settings.SECURITY_SETTINGS";
public static final java.lang.String ACTION_SETTINGS = "android.settings.SETTINGS";
public static final java.lang.String ACTION_SHOW_REGULATORY_INFO = "android.settings.SHOW_REGULATORY_INFO";
public static final java.lang.String ACTION_SOUND_SETTINGS = "android.settings.SOUND_SETTINGS";
public static final java.lang.String ACTION_STORAGE_VOLUME_ACCESS_SETTINGS = "android.settings.STORAGE_VOLUME_ACCESS_SETTINGS";
public static final java.lang.String ACTION_SYNC_SETTINGS = "android.settings.SYNC_SETTINGS";
public static final java.lang.String ACTION_USAGE_ACCESS_SETTINGS = "android.settings.USAGE_ACCESS_SETTINGS";
public static final java.lang.String ACTION_USER_DICTIONARY_SETTINGS = "android.settings.USER_DICTIONARY_SETTINGS";
public static final java.lang.String ACTION_VOICE_CONTROL_AIRPLANE_MODE = "android.settings.VOICE_CONTROL_AIRPLANE_MODE";
public static final java.lang.String ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE = "android.settings.VOICE_CONTROL_BATTERY_SAVER_MODE";
public static final java.lang.String ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE = "android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE";
public static final java.lang.String ACTION_VOICE_INPUT_SETTINGS = "android.settings.VOICE_INPUT_SETTINGS";
public static final java.lang.String ACTION_VPN_SETTINGS = "android.settings.VPN_SETTINGS";
public static final java.lang.String ACTION_VR_LISTENER_SETTINGS = "android.settings.VR_LISTENER_SETTINGS";
public static final java.lang.String ACTION_WEBVIEW_SETTINGS = "android.settings.WEBVIEW_SETTINGS";
public static final java.lang.String ACTION_WIFI_IP_SETTINGS = "android.settings.WIFI_IP_SETTINGS";
public static final java.lang.String ACTION_WIFI_SETTINGS = "android.settings.WIFI_SETTINGS";
public static final java.lang.String ACTION_WIRELESS_SETTINGS = "android.settings.WIRELESS_SETTINGS";
public static final java.lang.String ACTION_ZEN_MODE_PRIORITY_SETTINGS = "android.settings.ZEN_MODE_PRIORITY_SETTINGS";
public static final java.lang.String AUTHORITY = "settings";
public static final java.lang.String EXTRA_ACCOUNT_TYPES = "account_types";
public static final java.lang.String EXTRA_AIRPLANE_MODE_ENABLED = "airplane_mode_enabled";
public static final java.lang.String EXTRA_APP_PACKAGE = "android.provider.extra.APP_PACKAGE";
public static final java.lang.String EXTRA_AUTHORITIES = "authorities";
public static final java.lang.String EXTRA_BATTERY_SAVER_MODE_ENABLED = "android.settings.extra.battery_saver_mode_enabled";
public static final java.lang.String EXTRA_CHANNEL_ID = "android.provider.extra.CHANNEL_ID";
public static final java.lang.String EXTRA_DO_NOT_DISTURB_MODE_ENABLED = "android.settings.extra.do_not_disturb_mode_enabled";
public static final java.lang.String EXTRA_DO_NOT_DISTURB_MODE_MINUTES = "android.settings.extra.do_not_disturb_mode_minutes";
public static final java.lang.String EXTRA_INPUT_METHOD_ID = "input_method_id";
public static final java.lang.String EXTRA_SUB_ID = "android.provider.extra.SUB_ID";
public static final java.lang.String INTENT_CATEGORY_USAGE_ACCESS_CONFIG = "android.intent.category.USAGE_ACCESS_CONFIG";
public static final java.lang.String METADATA_USAGE_ACCESS_REASON = "android.settings.metadata.USAGE_ACCESS_REASON";
}
