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

package android.app;
public class AppOpsManager
{
public static interface OnOpChangedListener
{
public abstract  void onOpChanged(java.lang.String op, java.lang.String packageName);
}
public static interface OnOpActiveChangedListener
{
public abstract  void onOpActiveChanged(int code, int uid, java.lang.String packageName, boolean active);
}
AppOpsManager() { throw new RuntimeException("Stub!"); }
public  void setMode(int code, int uid, java.lang.String packageName, int mode) { throw new RuntimeException("Stub!"); }
public static  java.lang.String permissionToOp(java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  void startWatchingMode(java.lang.String op, java.lang.String packageName, android.app.AppOpsManager.OnOpChangedListener callback) { throw new RuntimeException("Stub!"); }
public  void stopWatchingMode(android.app.AppOpsManager.OnOpChangedListener callback) { throw new RuntimeException("Stub!"); }
public  void startWatchingActive(int[] ops, android.app.AppOpsManager.OnOpActiveChangedListener callback) { throw new RuntimeException("Stub!"); }
public  void stopWatchingActive(android.app.AppOpsManager.OnOpActiveChangedListener callback) { throw new RuntimeException("Stub!"); }
public  int checkOp(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int checkOpNoThrow(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int noteOp(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int noteOpNoThrow(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int noteProxyOp(java.lang.String op, java.lang.String proxiedPackageName) { throw new RuntimeException("Stub!"); }
public  int noteProxyOpNoThrow(java.lang.String op, java.lang.String proxiedPackageName) { throw new RuntimeException("Stub!"); }
public  int startOp(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int startOpNoThrow(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void finishOp(java.lang.String op, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void checkPackage(int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean isOperationActive(int code, int uid, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getOpStrs() { throw new RuntimeException("Stub!"); }
public static final int MODE_ALLOWED = 0;
public static final int MODE_DEFAULT = 3;
public static final int MODE_ERRORED = 2;
public static final int MODE_IGNORED = 1;
public static final java.lang.String OPSTR_ACCEPT_HANDOVER = "android:accept_handover";
public static final java.lang.String OPSTR_ACCESS_NOTIFICATIONS = "android:access_notifications";
public static final java.lang.String OPSTR_ACTIVATE_VPN = "android:activate_vpn";
public static final java.lang.String OPSTR_ADD_VOICEMAIL = "android:add_voicemail";
public static final java.lang.String OPSTR_ANSWER_PHONE_CALLS = "android:answer_phone_calls";
public static final java.lang.String OPSTR_ASSIST_SCREENSHOT = "android:assist_screenshot";
public static final java.lang.String OPSTR_ASSIST_STRUCTURE = "android:assist_structure";
public static final java.lang.String OPSTR_AUDIO_ACCESSIBILITY_VOLUME = "android:audio_accessibility_volume";
public static final java.lang.String OPSTR_AUDIO_ALARM_VOLUME = "android:audio_alarm_volume";
public static final java.lang.String OPSTR_AUDIO_BLUETOOTH_VOLUME = "android:audio_bluetooth_volume";
public static final java.lang.String OPSTR_AUDIO_MASTER_VOLUME = "android:audio_master_volume";
public static final java.lang.String OPSTR_AUDIO_MEDIA_VOLUME = "android:audio_media_volume";
public static final java.lang.String OPSTR_AUDIO_NOTIFICATION_VOLUME = "android:audio_notification_volume";
public static final java.lang.String OPSTR_AUDIO_RING_VOLUME = "android:audio_ring_volume";
public static final java.lang.String OPSTR_AUDIO_VOICE_VOLUME = "android:audio_voice_volume";
public static final java.lang.String OPSTR_BIND_ACCESSIBILITY_SERVICE = "android:bind_accessibility_service";
public static final java.lang.String OPSTR_BODY_SENSORS = "android:body_sensors";
public static final java.lang.String OPSTR_CALL_PHONE = "android:call_phone";
public static final java.lang.String OPSTR_CAMERA = "android:camera";
public static final java.lang.String OPSTR_CHANGE_WIFI_STATE = "android:change_wifi_state";
public static final java.lang.String OPSTR_COARSE_LOCATION = "android:coarse_location";
public static final java.lang.String OPSTR_FINE_LOCATION = "android:fine_location";
public static final java.lang.String OPSTR_GET_ACCOUNTS = "android:get_accounts";
public static final java.lang.String OPSTR_GET_USAGE_STATS = "android:get_usage_stats";
public static final java.lang.String OPSTR_GPS = "android:gps";
public static final java.lang.String OPSTR_INSTANT_APP_START_FOREGROUND = "android:instant_app_start_foreground";
public static final java.lang.String OPSTR_MANAGE_IPSEC_TUNNELS = "android:manage_ipsec_tunnels";
public static final java.lang.String OPSTR_MOCK_LOCATION = "android:mock_location";
public static final java.lang.String OPSTR_MONITOR_HIGH_POWER_LOCATION = "android:monitor_location_high_power";
public static final java.lang.String OPSTR_MONITOR_LOCATION = "android:monitor_location";
public static final java.lang.String OPSTR_MUTE_MICROPHONE = "android:mute_microphone";
public static final java.lang.String OPSTR_NEIGHBORING_CELLS = "android:neighboring_cells";
public static final java.lang.String OPSTR_PICTURE_IN_PICTURE = "android:picture_in_picture";
public static final java.lang.String OPSTR_PLAY_AUDIO = "android:play_audio";
public static final java.lang.String OPSTR_POST_NOTIFICATION = "android:post_notification";
public static final java.lang.String OPSTR_PROCESS_OUTGOING_CALLS = "android:process_outgoing_calls";
public static final java.lang.String OPSTR_PROJECT_MEDIA = "android:project_media";
public static final java.lang.String OPSTR_READ_CALENDAR = "android:read_calendar";
public static final java.lang.String OPSTR_READ_CALL_LOG = "android:read_call_log";
public static final java.lang.String OPSTR_READ_CELL_BROADCASTS = "android:read_cell_broadcasts";
public static final java.lang.String OPSTR_READ_CLIPBOARD = "android:read_clipboard";
public static final java.lang.String OPSTR_READ_CONTACTS = "android:read_contacts";
public static final java.lang.String OPSTR_READ_EXTERNAL_STORAGE = "android:read_external_storage";
public static final java.lang.String OPSTR_READ_ICC_SMS = "android:read_icc_sms";
public static final java.lang.String OPSTR_READ_PHONE_NUMBERS = "android:read_phone_numbers";
public static final java.lang.String OPSTR_READ_PHONE_STATE = "android:read_phone_state";
public static final java.lang.String OPSTR_READ_SMS = "android:read_sms";
public static final java.lang.String OPSTR_RECEIVE_EMERGENCY_BROADCAST = "android:receive_emergency_broadcast";
public static final java.lang.String OPSTR_RECEIVE_MMS = "android:receive_mms";
public static final java.lang.String OPSTR_RECEIVE_SMS = "android:receive_sms";
public static final java.lang.String OPSTR_RECEIVE_WAP_PUSH = "android:receive_wap_push";
public static final java.lang.String OPSTR_RECORD_AUDIO = "android:record_audio";
public static final java.lang.String OPSTR_REQUEST_DELETE_PACKAGES = "android:request_delete_packages";
public static final java.lang.String OPSTR_REQUEST_INSTALL_PACKAGES = "android:request_install_packages";
public static final java.lang.String OPSTR_RUN_ANY_IN_BACKGROUND = "android:run_any_in_background";
public static final java.lang.String OPSTR_RUN_IN_BACKGROUND = "android:run_in_background";
public static final java.lang.String OPSTR_SEND_SMS = "android:send_sms";
public static final java.lang.String OPSTR_START_FOREGROUND = "android:start_foreground";
public static final java.lang.String OPSTR_SYSTEM_ALERT_WINDOW = "android:system_alert_window";
public static final java.lang.String OPSTR_TAKE_AUDIO_FOCUS = "android:take_audio_focus";
public static final java.lang.String OPSTR_TAKE_MEDIA_BUTTONS = "android:take_media_buttons";
public static final java.lang.String OPSTR_TOAST_WINDOW = "android:toast_window";
public static final java.lang.String OPSTR_TURN_SCREEN_ON = "android:turn_screen_on";
public static final java.lang.String OPSTR_USE_FINGERPRINT = "android:use_fingerprint";
public static final java.lang.String OPSTR_USE_SIP = "android:use_sip";
public static final java.lang.String OPSTR_VIBRATE = "android:vibrate";
public static final java.lang.String OPSTR_WAKE_LOCK = "android:wake_lock";
public static final java.lang.String OPSTR_WIFI_SCAN = "android:wifi_scan";
public static final java.lang.String OPSTR_WRITE_CALENDAR = "android:write_calendar";
public static final java.lang.String OPSTR_WRITE_CALL_LOG = "android:write_call_log";
public static final java.lang.String OPSTR_WRITE_CLIPBOARD = "android:write_clipboard";
public static final java.lang.String OPSTR_WRITE_CONTACTS = "android:write_contacts";
public static final java.lang.String OPSTR_WRITE_EXTERNAL_STORAGE = "android:write_external_storage";
public static final java.lang.String OPSTR_WRITE_ICC_SMS = "android:write_icc_sms";
public static final java.lang.String OPSTR_WRITE_SETTINGS = "android:write_settings";
public static final java.lang.String OPSTR_WRITE_SMS = "android:write_sms";
public static final java.lang.String OPSTR_WRITE_WALLPAPER = "android:write_wallpaper";
public static final int OP_RECORD_AUDIO = 27;
public static final int OP_SYSTEM_ALERT_WINDOW = 24;
}
