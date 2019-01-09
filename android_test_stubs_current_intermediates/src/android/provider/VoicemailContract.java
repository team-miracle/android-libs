/*
* Copyright (C) 2011 The Android Open Source Project
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
* limitations under the License
*/

package android.provider;
public class VoicemailContract
{
public static final class Voicemails
  implements android.provider.BaseColumns, android.provider.OpenableColumns
{
Voicemails() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildSourceUri(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ARCHIVED = "archived";
public static final java.lang.String BACKED_UP = "backed_up";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DATE = "date";
public static final java.lang.String DELETED = "deleted";
public static final java.lang.String DIRTY = "dirty";
public static final int DIRTY_RETAIN = -1;
public static final java.lang.String DIR_TYPE = "vnd.android.cursor.dir/voicemails";
public static final java.lang.String DURATION = "duration";
public static final java.lang.String HAS_CONTENT = "has_content";
public static final java.lang.String IS_OMTP_VOICEMAIL = "is_omtp_voicemail";
public static final java.lang.String IS_READ = "is_read";
public static final java.lang.String ITEM_TYPE = "vnd.android.cursor.item/voicemail";
public static final java.lang.String LAST_MODIFIED = "last_modified";
public static final java.lang.String MIME_TYPE = "mime_type";
public static final java.lang.String NEW = "new";
public static final java.lang.String NUMBER = "number";
public static final java.lang.String PHONE_ACCOUNT_COMPONENT_NAME = "subscription_component_name";
public static final java.lang.String PHONE_ACCOUNT_ID = "subscription_id";
public static final java.lang.String RESTORED = "restored";
public static final java.lang.String SOURCE_DATA = "source_data";
public static final java.lang.String SOURCE_PACKAGE = "source_package";
public static final java.lang.String TRANSCRIPTION = "transcription";
static { CONTENT_URI = null; }
}
public static final class Status
  implements android.provider.BaseColumns
{
Status() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildSourceUri(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONFIGURATION_STATE = "configuration_state";
public static final int CONFIGURATION_STATE_CAN_BE_CONFIGURED = 2;
public static final int CONFIGURATION_STATE_CONFIGURING = 3;
public static final int CONFIGURATION_STATE_DISABLED = 5;
public static final int CONFIGURATION_STATE_FAILED = 4;
public static final int CONFIGURATION_STATE_NOT_CONFIGURED = 1;
public static final int CONFIGURATION_STATE_OK = 0;
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DATA_CHANNEL_STATE = "data_channel_state";
public static final int DATA_CHANNEL_STATE_BAD_CONFIGURATION = 3;
public static final int DATA_CHANNEL_STATE_COMMUNICATION_ERROR = 4;
public static final int DATA_CHANNEL_STATE_NO_CONNECTION = 1;
public static final int DATA_CHANNEL_STATE_NO_CONNECTION_CELLULAR_REQUIRED = 2;
public static final int DATA_CHANNEL_STATE_OK = 0;
public static final int DATA_CHANNEL_STATE_SERVER_CONNECTION_ERROR = 6;
public static final int DATA_CHANNEL_STATE_SERVER_ERROR = 5;
public static final java.lang.String DIR_TYPE = "vnd.android.cursor.dir/voicemail.source.status";
public static final java.lang.String ITEM_TYPE = "vnd.android.cursor.item/voicemail.source.status";
public static final java.lang.String NOTIFICATION_CHANNEL_STATE = "notification_channel_state";
public static final int NOTIFICATION_CHANNEL_STATE_MESSAGE_WAITING = 2;
public static final int NOTIFICATION_CHANNEL_STATE_NO_CONNECTION = 1;
public static final int NOTIFICATION_CHANNEL_STATE_OK = 0;
public static final java.lang.String PHONE_ACCOUNT_COMPONENT_NAME = "phone_account_component_name";
public static final java.lang.String PHONE_ACCOUNT_ID = "phone_account_id";
public static final java.lang.String QUOTA_OCCUPIED = "quota_occupied";
public static final java.lang.String QUOTA_TOTAL = "quota_total";
public static final int QUOTA_UNAVAILABLE = -1;
public static final java.lang.String SETTINGS_URI = "settings_uri";
public static final java.lang.String SOURCE_PACKAGE = "source_package";
public static final java.lang.String SOURCE_TYPE = "source_type";
public static final java.lang.String VOICEMAIL_ACCESS_URI = "voicemail_access_uri";
static { CONTENT_URI = null; }
}
VoicemailContract() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_FETCH_VOICEMAIL = "android.intent.action.FETCH_VOICEMAIL";
public static final java.lang.String ACTION_NEW_VOICEMAIL = "android.intent.action.NEW_VOICEMAIL";
public static final java.lang.String ACTION_SYNC_VOICEMAIL = "android.provider.action.SYNC_VOICEMAIL";
public static final java.lang.String AUTHORITY = "com.android.voicemail";
public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = "android.provider.extra.PHONE_ACCOUNT_HANDLE";
public static final java.lang.String EXTRA_SELF_CHANGE = "com.android.voicemail.extra.SELF_CHANGE";
public static final java.lang.String PARAM_KEY_SOURCE_PACKAGE = "source_package";
}
