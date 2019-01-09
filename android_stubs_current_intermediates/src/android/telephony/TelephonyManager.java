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
public class TelephonyManager
{
public abstract static class UssdResponseCallback
{
public  UssdResponseCallback() { throw new RuntimeException("Stub!"); }
public  void onReceiveUssdResponse(android.telephony.TelephonyManager telephonyManager, java.lang.String request, java.lang.CharSequence response) { throw new RuntimeException("Stub!"); }
public  void onReceiveUssdResponseFailed(android.telephony.TelephonyManager telephonyManager, java.lang.String request, int failureCode) { throw new RuntimeException("Stub!"); }
}
TelephonyManager() { throw new RuntimeException("Stub!"); }
public  int getPhoneCount() { throw new RuntimeException("Stub!"); }
public  android.telephony.TelephonyManager createForSubscriptionId(int subId) { throw new RuntimeException("Stub!"); }
public  android.telephony.TelephonyManager createForPhoneAccountHandle(android.telecom.PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceSoftwareVersion() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getDeviceId() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getDeviceId(int slotIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getImei() { throw new RuntimeException("Stub!"); }
public  java.lang.String getImei(int slotIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMeid() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMeid(int slotIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getNai() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.telephony.CellLocation getCellLocation() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo() { throw new RuntimeException("Stub!"); }
public  int getPhoneType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkOperatorName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkOperator() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkSpecifier() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getCarrierConfig() { throw new RuntimeException("Stub!"); }
public  boolean isNetworkRoaming() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNetworkCountryIso() { throw new RuntimeException("Stub!"); }
public  int getNetworkType() { throw new RuntimeException("Stub!"); }
public  int getDataNetworkType() { throw new RuntimeException("Stub!"); }
public  int getVoiceNetworkType() { throw new RuntimeException("Stub!"); }
public  boolean hasIccCard() { throw new RuntimeException("Stub!"); }
public  int getSimState() { throw new RuntimeException("Stub!"); }
public  int getSimState(int slotIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimOperator() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimOperatorName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimCountryIso() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSimSerialNumber() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubscriberId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getGroupIdLevel1() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLine1Number() { throw new RuntimeException("Stub!"); }
public  boolean setLine1NumberForDisplay(java.lang.String alphaTag, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailNumber() { throw new RuntimeException("Stub!"); }
public  boolean setVoiceMailNumber(java.lang.String alphaTag, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVisualVoicemailPackageName() { throw new RuntimeException("Stub!"); }
public  void setVisualVoicemailSmsFilterSettings(android.telephony.VisualVoicemailSmsFilterSettings settings) { throw new RuntimeException("Stub!"); }
public  void sendVisualVoicemailSms(java.lang.String number, int port, java.lang.String text, android.app.PendingIntent sentIntent) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailAlphaTag() { throw new RuntimeException("Stub!"); }
public  void sendDialerSpecialCode(java.lang.String inputCode) { throw new RuntimeException("Stub!"); }
public  int getCallState() { throw new RuntimeException("Stub!"); }
public  int getDataActivity() { throw new RuntimeException("Stub!"); }
public  int getDataState() { throw new RuntimeException("Stub!"); }
public  void listen(android.telephony.PhoneStateListener listener, int events) { throw new RuntimeException("Stub!"); }
public  boolean isVoiceCapable() { throw new RuntimeException("Stub!"); }
public  boolean isSmsCapable() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.CellInfo> getAllCellInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMmsUserAgent() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMmsUAProfUrl() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String AID) { throw new RuntimeException("Stub!"); }
public  android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String AID, int p2) { throw new RuntimeException("Stub!"); }
public  boolean iccCloseLogicalChannel(int channel) { throw new RuntimeException("Stub!"); }
public  java.lang.String iccTransmitApduLogicalChannel(int channel, int cla, int instruction, int p1, int p2, int p3, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  java.lang.String iccTransmitApduBasicChannel(int cla, int instruction, int p1, int p2, int p3, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3, java.lang.String filePath) { throw new RuntimeException("Stub!"); }
public  java.lang.String sendEnvelopeWithStatus(java.lang.String content) { throw new RuntimeException("Stub!"); }
public  java.lang.String getIccAuthentication(int appType, int authType, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getForbiddenPlmns() { throw new RuntimeException("Stub!"); }
public  void setNetworkSelectionModeAutomatic() { throw new RuntimeException("Stub!"); }
public  android.telephony.NetworkScan requestNetworkScan(android.telephony.NetworkScanRequest request, java.util.concurrent.Executor executor, android.telephony.TelephonyScanManager.NetworkScanCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean setNetworkSelectionModeManual(java.lang.String operatorNumeric, boolean persistSelection) { throw new RuntimeException("Stub!"); }
public  boolean setPreferredNetworkTypeToGlobal() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierPrivileges() { throw new RuntimeException("Stub!"); }
public  boolean setOperatorBrandOverride(java.lang.String brand) { throw new RuntimeException("Stub!"); }
public  void sendUssdRequest(java.lang.String ussdRequest, android.telephony.TelephonyManager.UssdResponseCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean isConcurrentVoiceAndDataSupported() { throw new RuntimeException("Stub!"); }
public  void setDataEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean isDataEnabled() { throw new RuntimeException("Stub!"); }
public  boolean canChangeDtmfToneLength() { throw new RuntimeException("Stub!"); }
public  boolean isWorldPhone() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isTtyModeSupported() { throw new RuntimeException("Stub!"); }
public  boolean isHearingAidCompatibilitySupported() { throw new RuntimeException("Stub!"); }
public  android.telephony.ServiceState getServiceState() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setVoicemailRingtoneUri(android.telecom.PhoneAccountHandle phoneAccountHandle, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean enabled) { throw new RuntimeException("Stub!"); }
public  int getSimCarrierId() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSimCarrierIdName() { throw new RuntimeException("Stub!"); }
public  android.telephony.SignalStrength getSignalStrength() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CONFIGURE_VOICEMAIL = "android.telephony.action.CONFIGURE_VOICEMAIL";
public static final java.lang.String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
public static final java.lang.String ACTION_RESPOND_VIA_MESSAGE = "android.intent.action.RESPOND_VIA_MESSAGE";
public static final java.lang.String ACTION_SHOW_VOICEMAIL_NOTIFICATION = "android.telephony.action.SHOW_VOICEMAIL_NOTIFICATION";
public static final java.lang.String ACTION_SUBSCRIPTION_CARRIER_IDENTITY_CHANGED = "android.telephony.action.SUBSCRIPTION_CARRIER_IDENTITY_CHANGED";
public static final int APPTYPE_CSIM = 4;
public static final int APPTYPE_ISIM = 5;
public static final int APPTYPE_RUIM = 3;
public static final int APPTYPE_SIM = 1;
public static final int APPTYPE_USIM = 2;
public static final int AUTHTYPE_EAP_AKA = 129;
public static final int AUTHTYPE_EAP_SIM = 128;
public static final int CALL_STATE_IDLE = 0;
public static final int CALL_STATE_OFFHOOK = 2;
public static final int CALL_STATE_RINGING = 1;
public static final int CDMA_ROAMING_MODE_AFFILIATED = 1;
public static final int CDMA_ROAMING_MODE_ANY = 2;
public static final int CDMA_ROAMING_MODE_HOME = 0;
public static final int CDMA_ROAMING_MODE_RADIO_DEFAULT = -1;
public static final int DATA_ACTIVITY_DORMANT = 4;
public static final int DATA_ACTIVITY_IN = 1;
public static final int DATA_ACTIVITY_INOUT = 3;
public static final int DATA_ACTIVITY_NONE = 0;
public static final int DATA_ACTIVITY_OUT = 2;
public static final int DATA_CONNECTED = 2;
public static final int DATA_CONNECTING = 1;
public static final int DATA_DISCONNECTED = 0;
public static final int DATA_SUSPENDED = 3;
public static final java.lang.String EXTRA_CALL_VOICEMAIL_INTENT = "android.telephony.extra.CALL_VOICEMAIL_INTENT";
public static final java.lang.String EXTRA_CARRIER_ID = "android.telephony.extra.CARRIER_ID";
public static final java.lang.String EXTRA_CARRIER_NAME = "android.telephony.extra.CARRIER_NAME";
public static final java.lang.String EXTRA_HIDE_PUBLIC_SETTINGS = "android.telephony.extra.HIDE_PUBLIC_SETTINGS";
public static final java.lang.String EXTRA_INCOMING_NUMBER = "incoming_number";
public static final java.lang.String EXTRA_IS_REFRESH = "android.telephony.extra.IS_REFRESH";
public static final java.lang.String EXTRA_LAUNCH_VOICEMAIL_SETTINGS_INTENT = "android.telephony.extra.LAUNCH_VOICEMAIL_SETTINGS_INTENT";
public static final java.lang.String EXTRA_NOTIFICATION_COUNT = "android.telephony.extra.NOTIFICATION_COUNT";
public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telephony.extra.PHONE_ACCOUNT_HANDLE";
public static final java.lang.String EXTRA_STATE = "state";
public static final java.lang.String EXTRA_STATE_IDLE;
public static final java.lang.String EXTRA_STATE_OFFHOOK;
public static final java.lang.String EXTRA_STATE_RINGING;
public static final java.lang.String EXTRA_SUBSCRIPTION_ID = "android.telephony.extra.SUBSCRIPTION_ID";
public static final java.lang.String EXTRA_VOICEMAIL_NUMBER = "android.telephony.extra.VOICEMAIL_NUMBER";
public static final java.lang.String METADATA_HIDE_VOICEMAIL_SETTINGS_MENU = "android.telephony.HIDE_VOICEMAIL_SETTINGS_MENU";
public static final int NETWORK_TYPE_1xRTT = 7;
public static final int NETWORK_TYPE_CDMA = 4;
public static final int NETWORK_TYPE_EDGE = 2;
public static final int NETWORK_TYPE_EHRPD = 14;
public static final int NETWORK_TYPE_EVDO_0 = 5;
public static final int NETWORK_TYPE_EVDO_A = 6;
public static final int NETWORK_TYPE_EVDO_B = 12;
public static final int NETWORK_TYPE_GPRS = 1;
public static final int NETWORK_TYPE_GSM = 16;
public static final int NETWORK_TYPE_HSDPA = 8;
public static final int NETWORK_TYPE_HSPA = 10;
public static final int NETWORK_TYPE_HSPAP = 15;
public static final int NETWORK_TYPE_HSUPA = 9;
public static final int NETWORK_TYPE_IDEN = 11;
public static final int NETWORK_TYPE_IWLAN = 18;
public static final int NETWORK_TYPE_LTE = 13;
public static final int NETWORK_TYPE_TD_SCDMA = 17;
public static final int NETWORK_TYPE_UMTS = 3;
public static final int NETWORK_TYPE_UNKNOWN = 0;
public static final int PHONE_TYPE_CDMA = 2;
public static final int PHONE_TYPE_GSM = 1;
public static final int PHONE_TYPE_NONE = 0;
public static final int PHONE_TYPE_SIP = 3;
public static final int SIM_STATE_ABSENT = 1;
public static final int SIM_STATE_CARD_IO_ERROR = 8;
public static final int SIM_STATE_CARD_RESTRICTED = 9;
public static final int SIM_STATE_NETWORK_LOCKED = 4;
public static final int SIM_STATE_NOT_READY = 6;
public static final int SIM_STATE_PERM_DISABLED = 7;
public static final int SIM_STATE_PIN_REQUIRED = 2;
public static final int SIM_STATE_PUK_REQUIRED = 3;
public static final int SIM_STATE_READY = 5;
public static final int SIM_STATE_UNKNOWN = 0;
public static final int UNKNOWN_CARRIER_ID = -1;
public static final int USSD_ERROR_SERVICE_UNAVAIL = -2;
public static final int USSD_RETURN_FAILURE = -1;
public static final java.lang.String VVM_TYPE_CVVM = "vvm_type_cvvm";
public static final java.lang.String VVM_TYPE_OMTP = "vvm_type_omtp";
static { EXTRA_STATE_IDLE = null; EXTRA_STATE_OFFHOOK = null; EXTRA_STATE_RINGING = null; }
}
