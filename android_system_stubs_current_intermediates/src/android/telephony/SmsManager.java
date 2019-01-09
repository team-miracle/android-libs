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

package android.telephony;
public final class SmsManager
{
SmsManager() { throw new RuntimeException("Stub!"); }
public  void sendTextMessage(java.lang.String destinationAddress, java.lang.String scAddress, java.lang.String text, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
public  void sendTextMessageWithoutPersisting(java.lang.String destinationAddress, java.lang.String scAddress, java.lang.String text, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
public  void injectSmsPdu(byte[] pdu, java.lang.String format, android.app.PendingIntent receivedIntent) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> divideMessage(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  void sendMultipartTextMessage(java.lang.String destinationAddress, java.lang.String scAddress, java.util.ArrayList<java.lang.String> parts, java.util.ArrayList<android.app.PendingIntent> sentIntents, java.util.ArrayList<android.app.PendingIntent> deliveryIntents) { throw new RuntimeException("Stub!"); }
public  void sendMultipartTextMessageWithoutPersisting(java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) { throw new RuntimeException("Stub!"); }
public  void sendDataMessage(java.lang.String destinationAddress, java.lang.String scAddress, short destinationPort, byte[] data, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
public static  android.telephony.SmsManager getDefault() { throw new RuntimeException("Stub!"); }
public static  android.telephony.SmsManager getSmsManagerForSubscriptionId(int subId) { throw new RuntimeException("Stub!"); }
public  int getSubscriptionId() { throw new RuntimeException("Stub!"); }
public static  int getDefaultSmsSubscriptionId() { throw new RuntimeException("Stub!"); }
public  void sendMultimediaMessage(android.content.Context context, android.net.Uri contentUri, java.lang.String locationUrl, android.os.Bundle configOverrides, android.app.PendingIntent sentIntent) { throw new RuntimeException("Stub!"); }
public  void downloadMultimediaMessage(android.content.Context context, java.lang.String locationUrl, android.net.Uri contentUri, android.os.Bundle configOverrides, android.app.PendingIntent downloadedIntent) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getCarrierConfigValues() { throw new RuntimeException("Stub!"); }
public  java.lang.String createAppSpecificSmsToken(android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_MMS_DATA = "android.telephony.extra.MMS_DATA";
public static final java.lang.String EXTRA_MMS_HTTP_STATUS = "android.telephony.extra.MMS_HTTP_STATUS";
public static final java.lang.String MMS_CONFIG_ALIAS_ENABLED = "aliasEnabled";
public static final java.lang.String MMS_CONFIG_ALIAS_MAX_CHARS = "aliasMaxChars";
public static final java.lang.String MMS_CONFIG_ALIAS_MIN_CHARS = "aliasMinChars";
public static final java.lang.String MMS_CONFIG_ALLOW_ATTACH_AUDIO = "allowAttachAudio";
public static final java.lang.String MMS_CONFIG_APPEND_TRANSACTION_ID = "enabledTransID";
public static final java.lang.String MMS_CONFIG_EMAIL_GATEWAY_NUMBER = "emailGatewayNumber";
public static final java.lang.String MMS_CONFIG_GROUP_MMS_ENABLED = "enableGroupMms";
public static final java.lang.String MMS_CONFIG_HTTP_PARAMS = "httpParams";
public static final java.lang.String MMS_CONFIG_HTTP_SOCKET_TIMEOUT = "httpSocketTimeout";
public static final java.lang.String MMS_CONFIG_MAX_IMAGE_HEIGHT = "maxImageHeight";
public static final java.lang.String MMS_CONFIG_MAX_IMAGE_WIDTH = "maxImageWidth";
public static final java.lang.String MMS_CONFIG_MAX_MESSAGE_SIZE = "maxMessageSize";
public static final java.lang.String MMS_CONFIG_MESSAGE_TEXT_MAX_SIZE = "maxMessageTextSize";
public static final java.lang.String MMS_CONFIG_MMS_DELIVERY_REPORT_ENABLED = "enableMMSDeliveryReports";
public static final java.lang.String MMS_CONFIG_MMS_ENABLED = "enabledMMS";
public static final java.lang.String MMS_CONFIG_MMS_READ_REPORT_ENABLED = "enableMMSReadReports";
public static final java.lang.String MMS_CONFIG_MULTIPART_SMS_ENABLED = "enableMultipartSMS";
public static final java.lang.String MMS_CONFIG_NAI_SUFFIX = "naiSuffix";
public static final java.lang.String MMS_CONFIG_NOTIFY_WAP_MMSC_ENABLED = "enabledNotifyWapMMSC";
public static final java.lang.String MMS_CONFIG_RECIPIENT_LIMIT = "recipientLimit";
public static final java.lang.String MMS_CONFIG_SEND_MULTIPART_SMS_AS_SEPARATE_MESSAGES = "sendMultipartSmsAsSeparateMessages";
public static final java.lang.String MMS_CONFIG_SHOW_CELL_BROADCAST_APP_LINKS = "config_cellBroadcastAppLinks";
public static final java.lang.String MMS_CONFIG_SMS_DELIVERY_REPORT_ENABLED = "enableSMSDeliveryReports";
public static final java.lang.String MMS_CONFIG_SMS_TO_MMS_TEXT_LENGTH_THRESHOLD = "smsToMmsTextLengthThreshold";
public static final java.lang.String MMS_CONFIG_SMS_TO_MMS_TEXT_THRESHOLD = "smsToMmsTextThreshold";
public static final java.lang.String MMS_CONFIG_SUBJECT_MAX_LENGTH = "maxSubjectLength";
public static final java.lang.String MMS_CONFIG_SUPPORT_HTTP_CHARSET_HEADER = "supportHttpCharsetHeader";
public static final java.lang.String MMS_CONFIG_SUPPORT_MMS_CONTENT_DISPOSITION = "supportMmsContentDisposition";
public static final java.lang.String MMS_CONFIG_UA_PROF_TAG_NAME = "uaProfTagName";
public static final java.lang.String MMS_CONFIG_UA_PROF_URL = "uaProfUrl";
public static final java.lang.String MMS_CONFIG_USER_AGENT = "userAgent";
public static final int MMS_ERROR_CONFIGURATION_ERROR = 7;
public static final int MMS_ERROR_HTTP_FAILURE = 4;
public static final int MMS_ERROR_INVALID_APN = 2;
public static final int MMS_ERROR_IO_ERROR = 5;
public static final int MMS_ERROR_NO_DATA_NETWORK = 8;
public static final int MMS_ERROR_RETRY = 6;
public static final int MMS_ERROR_UNABLE_CONNECT_MMS = 3;
public static final int MMS_ERROR_UNSPECIFIED = 1;
public static final int RESULT_CANCELLED = 23;
public static final int RESULT_ENCODING_ERROR = 18;
public static final int RESULT_ERROR_FDN_CHECK_FAILURE = 6;
public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
public static final int RESULT_ERROR_LIMIT_EXCEEDED = 5;
public static final int RESULT_ERROR_NONE = 0;
public static final int RESULT_ERROR_NO_SERVICE = 4;
public static final int RESULT_ERROR_NULL_PDU = 3;
public static final int RESULT_ERROR_RADIO_OFF = 2;
public static final int RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED = 8;
public static final int RESULT_ERROR_SHORT_CODE_NOT_ALLOWED = 7;
public static final int RESULT_INTERNAL_ERROR = 21;
public static final int RESULT_INVALID_ARGUMENTS = 11;
public static final int RESULT_INVALID_SMSC_ADDRESS = 19;
public static final int RESULT_INVALID_SMS_FORMAT = 14;
public static final int RESULT_INVALID_STATE = 12;
public static final int RESULT_MODEM_ERROR = 16;
public static final int RESULT_NETWORK_ERROR = 17;
public static final int RESULT_NETWORK_REJECT = 10;
public static final int RESULT_NO_MEMORY = 13;
public static final int RESULT_NO_RESOURCES = 22;
public static final int RESULT_OPERATION_NOT_ALLOWED = 20;
public static final int RESULT_RADIO_NOT_AVAILABLE = 9;
public static final int RESULT_REQUEST_NOT_SUPPORTED = 24;
public static final int RESULT_SYSTEM_ERROR = 15;
public static final int STATUS_ON_ICC_FREE = 0;
public static final int STATUS_ON_ICC_READ = 1;
public static final int STATUS_ON_ICC_SENT = 5;
public static final int STATUS_ON_ICC_UNREAD = 3;
public static final int STATUS_ON_ICC_UNSENT = 7;
}
