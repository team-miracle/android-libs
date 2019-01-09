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
public final class Telephony
{
public static interface TextBasedSmsColumns
{
public static final java.lang.String ADDRESS = "address";
public static final java.lang.String BODY = "body";
public static final java.lang.String CREATOR = "creator";
public static final java.lang.String DATE = "date";
public static final java.lang.String DATE_SENT = "date_sent";
public static final java.lang.String ERROR_CODE = "error_code";
public static final java.lang.String LOCKED = "locked";
public static final int MESSAGE_TYPE_ALL = 0;
public static final int MESSAGE_TYPE_DRAFT = 3;
public static final int MESSAGE_TYPE_FAILED = 5;
public static final int MESSAGE_TYPE_INBOX = 1;
public static final int MESSAGE_TYPE_OUTBOX = 4;
public static final int MESSAGE_TYPE_QUEUED = 6;
public static final int MESSAGE_TYPE_SENT = 2;
public static final java.lang.String PERSON = "person";
public static final java.lang.String PROTOCOL = "protocol";
public static final java.lang.String READ = "read";
public static final java.lang.String REPLY_PATH_PRESENT = "reply_path_present";
public static final java.lang.String SEEN = "seen";
public static final java.lang.String SERVICE_CENTER = "service_center";
public static final java.lang.String STATUS = "status";
public static final int STATUS_COMPLETE = 0;
public static final int STATUS_FAILED = 64;
public static final int STATUS_NONE = -1;
public static final int STATUS_PENDING = 32;
public static final java.lang.String SUBJECT = "subject";
public static final java.lang.String SUBSCRIPTION_ID = "sub_id";
public static final java.lang.String THREAD_ID = "thread_id";
public static final java.lang.String TYPE = "type";
}
public static final class Sms
  implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns
{
public static final class Inbox
  implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns
{
Inbox() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Sent
  implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns
{
Sent() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Draft
  implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns
{
Draft() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Outbox
  implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns
{
Outbox() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Conversations
  implements android.provider.BaseColumns, android.provider.Telephony.TextBasedSmsColumns
{
Conversations() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
public static final java.lang.String MESSAGE_COUNT = "msg_count";
public static final java.lang.String SNIPPET = "snippet";
static { CONTENT_URI = null; }
}
public static final class Intents
{
Intents() { throw new RuntimeException("Stub!"); }
public static  android.telephony.SmsMessage[] getMessagesFromIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHANGE_DEFAULT = "android.provider.Telephony.ACTION_CHANGE_DEFAULT";
public static final java.lang.String ACTION_DEFAULT_SMS_PACKAGE_CHANGED = "android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED";
public static final java.lang.String ACTION_EXTERNAL_PROVIDER_CHANGE = "android.provider.action.EXTERNAL_PROVIDER_CHANGE";
public static final java.lang.String DATA_SMS_RECEIVED_ACTION = "android.intent.action.DATA_SMS_RECEIVED";
public static final java.lang.String EXTRA_IS_DEFAULT_SMS_APP = "android.provider.extra.IS_DEFAULT_SMS_APP";
public static final java.lang.String EXTRA_PACKAGE_NAME = "package";
public static final int RESULT_SMS_DUPLICATED = 5;
public static final int RESULT_SMS_GENERIC_ERROR = 2;
public static final int RESULT_SMS_HANDLED = 1;
public static final int RESULT_SMS_OUT_OF_MEMORY = 3;
public static final int RESULT_SMS_UNSUPPORTED = 4;
public static final java.lang.String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";
public static final java.lang.String SIM_FULL_ACTION = "android.provider.Telephony.SIM_FULL";
public static final java.lang.String SMS_CARRIER_PROVISION_ACTION = "android.provider.Telephony.SMS_CARRIER_PROVISION";
public static final java.lang.String SMS_CB_RECEIVED_ACTION = "android.provider.Telephony.SMS_CB_RECEIVED";
public static final java.lang.String SMS_DELIVER_ACTION = "android.provider.Telephony.SMS_DELIVER";
public static final java.lang.String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";
public static final java.lang.String SMS_REJECTED_ACTION = "android.provider.Telephony.SMS_REJECTED";
public static final java.lang.String SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED_ACTION = "android.provider.Telephony.SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED";
public static final java.lang.String WAP_PUSH_DELIVER_ACTION = "android.provider.Telephony.WAP_PUSH_DELIVER";
public static final java.lang.String WAP_PUSH_RECEIVED_ACTION = "android.provider.Telephony.WAP_PUSH_RECEIVED";
}
Sms() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDefaultSmsPackage(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static interface BaseMmsColumns
  extends android.provider.BaseColumns
{
public static final java.lang.String CONTENT_CLASS = "ct_cls";
public static final java.lang.String CONTENT_LOCATION = "ct_l";
public static final java.lang.String CONTENT_TYPE = "ct_t";
public static final java.lang.String CREATOR = "creator";
public static final java.lang.String DATE = "date";
public static final java.lang.String DATE_SENT = "date_sent";
public static final java.lang.String DELIVERY_REPORT = "d_rpt";
public static final java.lang.String DELIVERY_TIME = "d_tm";
public static final java.lang.String EXPIRY = "exp";
public static final java.lang.String LOCKED = "locked";
public static final java.lang.String MESSAGE_BOX = "msg_box";
public static final int MESSAGE_BOX_ALL = 0;
public static final int MESSAGE_BOX_DRAFTS = 3;
public static final int MESSAGE_BOX_FAILED = 5;
public static final int MESSAGE_BOX_INBOX = 1;
public static final int MESSAGE_BOX_OUTBOX = 4;
public static final int MESSAGE_BOX_SENT = 2;
public static final java.lang.String MESSAGE_CLASS = "m_cls";
public static final java.lang.String MESSAGE_ID = "m_id";
public static final java.lang.String MESSAGE_SIZE = "m_size";
public static final java.lang.String MESSAGE_TYPE = "m_type";
public static final java.lang.String MMS_VERSION = "v";
public static final java.lang.String PRIORITY = "pri";
public static final java.lang.String READ = "read";
public static final java.lang.String READ_REPORT = "rr";
public static final java.lang.String READ_STATUS = "read_status";
public static final java.lang.String REPORT_ALLOWED = "rpt_a";
public static final java.lang.String RESPONSE_STATUS = "resp_st";
public static final java.lang.String RESPONSE_TEXT = "resp_txt";
public static final java.lang.String RETRIEVE_STATUS = "retr_st";
public static final java.lang.String RETRIEVE_TEXT = "retr_txt";
public static final java.lang.String RETRIEVE_TEXT_CHARSET = "retr_txt_cs";
public static final java.lang.String SEEN = "seen";
public static final java.lang.String STATUS = "st";
public static final java.lang.String SUBJECT = "sub";
public static final java.lang.String SUBJECT_CHARSET = "sub_cs";
public static final java.lang.String SUBSCRIPTION_ID = "sub_id";
public static final java.lang.String TEXT_ONLY = "text_only";
public static final java.lang.String THREAD_ID = "thread_id";
public static final java.lang.String TRANSACTION_ID = "tr_id";
}
public static interface CanonicalAddressesColumns
  extends android.provider.BaseColumns
{
public static final java.lang.String ADDRESS = "address";
}
public static interface ThreadsColumns
  extends android.provider.BaseColumns
{
public static final java.lang.String ARCHIVED = "archived";
public static final java.lang.String DATE = "date";
public static final java.lang.String ERROR = "error";
public static final java.lang.String HAS_ATTACHMENT = "has_attachment";
public static final java.lang.String MESSAGE_COUNT = "message_count";
public static final java.lang.String READ = "read";
public static final java.lang.String RECIPIENT_IDS = "recipient_ids";
public static final java.lang.String SNIPPET = "snippet";
public static final java.lang.String SNIPPET_CHARSET = "snippet_cs";
public static final java.lang.String TYPE = "type";
}
public static final class Threads
  implements android.provider.Telephony.ThreadsColumns
{
Threads() { throw new RuntimeException("Stub!"); }
public static  long getOrCreateThreadId(android.content.Context context, java.lang.String recipient) { throw new RuntimeException("Stub!"); }
public static  long getOrCreateThreadId(android.content.Context context, java.util.Set<java.lang.String> recipients) { throw new RuntimeException("Stub!"); }
public static final int BROADCAST_THREAD = 1;
public static final int COMMON_THREAD = 0;
public static final android.net.Uri CONTENT_URI;
public static final android.net.Uri OBSOLETE_THREADS_URI;
static { CONTENT_URI = null; OBSOLETE_THREADS_URI = null; }
}
public static final class Mms
  implements android.provider.Telephony.BaseMmsColumns
{
public static final class Inbox
  implements android.provider.Telephony.BaseMmsColumns
{
Inbox() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Sent
  implements android.provider.Telephony.BaseMmsColumns
{
Sent() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Draft
  implements android.provider.Telephony.BaseMmsColumns
{
Draft() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Outbox
  implements android.provider.Telephony.BaseMmsColumns
{
Outbox() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
static { CONTENT_URI = null; }
}
public static final class Addr
  implements android.provider.BaseColumns
{
Addr() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ADDRESS = "address";
public static final java.lang.String CHARSET = "charset";
public static final java.lang.String CONTACT_ID = "contact_id";
public static final java.lang.String MSG_ID = "msg_id";
public static final java.lang.String TYPE = "type";
}
public static final class Part
  implements android.provider.BaseColumns
{
Part() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CHARSET = "chset";
public static final java.lang.String CONTENT_DISPOSITION = "cd";
public static final java.lang.String CONTENT_ID = "cid";
public static final java.lang.String CONTENT_LOCATION = "cl";
public static final java.lang.String CONTENT_TYPE = "ct";
public static final java.lang.String CT_START = "ctt_s";
public static final java.lang.String CT_TYPE = "ctt_t";
public static final java.lang.String FILENAME = "fn";
public static final java.lang.String MSG_ID = "mid";
public static final java.lang.String NAME = "name";
public static final java.lang.String SEQ = "seq";
public static final java.lang.String TEXT = "text";
public static final java.lang.String _DATA = "_data";
}
public static final class Rate
{
Rate() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String SENT_TIME = "sent_time";
static { CONTENT_URI = null; }
}
public static final class Intents
{
Intents() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_CHANGED_ACTION = "android.intent.action.CONTENT_CHANGED";
public static final java.lang.String DELETED_CONTENTS = "deleted_contents";
}
Mms() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
public static final android.net.Uri REPORT_REQUEST_URI;
public static final android.net.Uri REPORT_STATUS_URI;
static { CONTENT_URI = null; REPORT_REQUEST_URI = null; REPORT_STATUS_URI = null; }
}
public static final class MmsSms
  implements android.provider.BaseColumns
{
public static final class PendingMessages
  implements android.provider.BaseColumns
{
PendingMessages() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DUE_TIME = "due_time";
public static final java.lang.String ERROR_CODE = "err_code";
public static final java.lang.String ERROR_TYPE = "err_type";
public static final java.lang.String LAST_TRY = "last_try";
public static final java.lang.String MSG_ID = "msg_id";
public static final java.lang.String MSG_TYPE = "msg_type";
public static final java.lang.String PROTO_TYPE = "proto_type";
public static final java.lang.String RETRY_INDEX = "retry_index";
public static final java.lang.String SUBSCRIPTION_ID = "pending_sub_id";
static { CONTENT_URI = null; }
}
MmsSms() { throw new RuntimeException("Stub!"); }
public static final android.net.Uri CONTENT_CONVERSATIONS_URI;
public static final android.net.Uri CONTENT_DRAFT_URI;
public static final android.net.Uri CONTENT_FILTER_BYPHONE_URI;
public static final android.net.Uri CONTENT_LOCKED_URI;
public static final android.net.Uri CONTENT_UNDELIVERED_URI;
public static final android.net.Uri CONTENT_URI;
public static final int ERR_TYPE_GENERIC = 1;
public static final int ERR_TYPE_GENERIC_PERMANENT = 10;
public static final int ERR_TYPE_MMS_PROTO_PERMANENT = 12;
public static final int ERR_TYPE_MMS_PROTO_TRANSIENT = 3;
public static final int ERR_TYPE_SMS_PROTO_PERMANENT = 11;
public static final int ERR_TYPE_SMS_PROTO_TRANSIENT = 2;
public static final int ERR_TYPE_TRANSPORT_FAILURE = 4;
public static final int MMS_PROTO = 1;
public static final int NO_ERROR = 0;
public static final android.net.Uri SEARCH_URI;
public static final int SMS_PROTO = 0;
public static final java.lang.String TYPE_DISCRIMINATOR_COLUMN = "transport_type";
static { CONTENT_CONVERSATIONS_URI = null; CONTENT_DRAFT_URI = null; CONTENT_FILTER_BYPHONE_URI = null; CONTENT_LOCKED_URI = null; CONTENT_UNDELIVERED_URI = null; CONTENT_URI = null; SEARCH_URI = null; }
}
public static final class Carriers
  implements android.provider.BaseColumns
{
Carriers() { throw new RuntimeException("Stub!"); }
public static final java.lang.String APN = "apn";
public static final java.lang.String AUTH_TYPE = "authtype";
@java.lang.Deprecated()
public static final java.lang.String BEARER = "bearer";
public static final java.lang.String CARRIER_ENABLED = "carrier_enabled";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String CURRENT = "current";
public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
public static final java.lang.String MCC = "mcc";
public static final java.lang.String MMSC = "mmsc";
public static final java.lang.String MMSPORT = "mmsport";
public static final java.lang.String MMSPROXY = "mmsproxy";
public static final java.lang.String MNC = "mnc";
public static final java.lang.String MVNO_MATCH_DATA = "mvno_match_data";
public static final java.lang.String MVNO_TYPE = "mvno_type";
public static final java.lang.String NAME = "name";
public static final java.lang.String NETWORK_TYPE_BITMASK = "network_type_bitmask";
public static final java.lang.String NUMERIC = "numeric";
public static final java.lang.String PASSWORD = "password";
public static final java.lang.String PORT = "port";
public static final java.lang.String PROTOCOL = "protocol";
public static final java.lang.String PROXY = "proxy";
public static final java.lang.String ROAMING_PROTOCOL = "roaming_protocol";
public static final java.lang.String SERVER = "server";
public static final java.lang.String SUBSCRIPTION_ID = "sub_id";
public static final java.lang.String TYPE = "type";
public static final java.lang.String USER = "user";
static { CONTENT_URI = null; }
}
public static final class ServiceStateTable
{
ServiceStateTable() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriForSubscriptionIdAndField(int subscriptionId, java.lang.String field) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriForSubscriptionId(int subscriptionId) { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "service-state";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String IS_MANUAL_NETWORK_SELECTION = "is_manual_network_selection";
public static final java.lang.String VOICE_OPERATOR_NUMERIC = "voice_operator_numeric";
public static final java.lang.String VOICE_REG_STATE = "voice_reg_state";
static { CONTENT_URI = null; }
}
public static final class CarrierId
  implements android.provider.BaseColumns
{
CarrierId() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getUriForSubscriptionId(int subscriptionId) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CARRIER_ID = "carrier_id";
public static final java.lang.String CARRIER_NAME = "carrier_name";
public static final android.net.Uri CONTENT_URI;
static { CONTENT_URI = null; }
}
Telephony() { throw new RuntimeException("Stub!"); }
}
