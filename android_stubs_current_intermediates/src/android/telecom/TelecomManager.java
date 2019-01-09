/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
* in compliance with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software distributed under the License
* is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
* or implied. See the License for the specific language governing permissions and limitations under
* the License.
*/

package android.telecom;
public class TelecomManager
{
TelecomManager() { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String uriScheme) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccountHandle getSimCallManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts() { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle account) { throw new RuntimeException("Stub!"); }
public  void registerPhoneAccount(android.telecom.PhoneAccount account) { throw new RuntimeException("Stub!"); }
public  void unregisterPhoneAccount(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultDialerPackage() { throw new RuntimeException("Stub!"); }
public  boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle accountHandle, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  java.lang.String getLine1Number(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  boolean isInCall() { throw new RuntimeException("Stub!"); }
public  boolean isInManagedCall() { throw new RuntimeException("Stub!"); }
public  boolean endCall() { throw new RuntimeException("Stub!"); }
public  void acceptRingingCall() { throw new RuntimeException("Stub!"); }
public  void acceptRingingCall(int videoState) { throw new RuntimeException("Stub!"); }
public  void silenceRinger() { throw new RuntimeException("Stub!"); }
public  boolean isTtySupported() { throw new RuntimeException("Stub!"); }
public  void addNewIncomingCall(android.telecom.PhoneAccountHandle phoneAccount, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  boolean handleMmi(java.lang.String dialString) { throw new RuntimeException("Stub!"); }
public  boolean handleMmi(java.lang.String dialString, android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
public  void cancelMissedCallsNotification() { throw new RuntimeException("Stub!"); }
public  void showInCallScreen(boolean showDialpad) { throw new RuntimeException("Stub!"); }
public  void placeCall(android.net.Uri address, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.content.Intent createManageBlockedNumbersIntent() { throw new RuntimeException("Stub!"); }
public  boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
public  boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
public  void acceptHandover(android.net.Uri srcAddr, int videoState, android.telecom.PhoneAccountHandle destAcct) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHANGE_DEFAULT_DIALER = "android.telecom.action.CHANGE_DEFAULT_DIALER";
public static final java.lang.String ACTION_CHANGE_PHONE_ACCOUNTS = "android.telecom.action.CHANGE_PHONE_ACCOUNTS";
public static final java.lang.String ACTION_CONFIGURE_PHONE_ACCOUNT = "android.telecom.action.CONFIGURE_PHONE_ACCOUNT";
public static final java.lang.String ACTION_DEFAULT_DIALER_CHANGED = "android.telecom.action.DEFAULT_DIALER_CHANGED";
@Deprecated
public static final java.lang.String ACTION_INCOMING_CALL = "android.telecom.action.INCOMING_CALL";
public static final java.lang.String ACTION_PHONE_ACCOUNT_REGISTERED = "android.telecom.action.PHONE_ACCOUNT_REGISTERED";
public static final java.lang.String ACTION_PHONE_ACCOUNT_UNREGISTERED = "android.telecom.action.PHONE_ACCOUNT_UNREGISTERED";
public static final java.lang.String ACTION_SHOW_CALL_ACCESSIBILITY_SETTINGS = "android.telecom.action.SHOW_CALL_ACCESSIBILITY_SETTINGS";
public static final java.lang.String ACTION_SHOW_CALL_SETTINGS = "android.telecom.action.SHOW_CALL_SETTINGS";
public static final java.lang.String ACTION_SHOW_MISSED_CALLS_NOTIFICATION = "android.telecom.action.SHOW_MISSED_CALLS_NOTIFICATION";
public static final java.lang.String ACTION_SHOW_RESPOND_VIA_SMS_SETTINGS = "android.telecom.action.SHOW_RESPOND_VIA_SMS_SETTINGS";
public static final char DTMF_CHARACTER_PAUSE = 44;
public static final char DTMF_CHARACTER_WAIT = 59;
public static final java.lang.String EXTRA_CALL_BACK_NUMBER = "android.telecom.extra.CALL_BACK_NUMBER";
public static final java.lang.String EXTRA_CALL_DISCONNECT_CAUSE = "android.telecom.extra.CALL_DISCONNECT_CAUSE";
public static final java.lang.String EXTRA_CALL_DISCONNECT_MESSAGE = "android.telecom.extra.CALL_DISCONNECT_MESSAGE";
public static final java.lang.String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
public static final java.lang.String EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME = "android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME";
public static final java.lang.String EXTRA_INCOMING_CALL_ADDRESS = "android.telecom.extra.INCOMING_CALL_ADDRESS";
public static final java.lang.String EXTRA_INCOMING_CALL_EXTRAS = "android.telecom.extra.INCOMING_CALL_EXTRAS";
public static final java.lang.String EXTRA_INCOMING_VIDEO_STATE = "android.telecom.extra.INCOMING_VIDEO_STATE";
public static final java.lang.String EXTRA_NOTIFICATION_COUNT = "android.telecom.extra.NOTIFICATION_COUNT";
public static final java.lang.String EXTRA_NOTIFICATION_PHONE_NUMBER = "android.telecom.extra.NOTIFICATION_PHONE_NUMBER";
public static final java.lang.String EXTRA_OUTGOING_CALL_EXTRAS = "android.telecom.extra.OUTGOING_CALL_EXTRAS";
public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telecom.extra.PHONE_ACCOUNT_HANDLE";
public static final java.lang.String EXTRA_START_CALL_WITH_RTT = "android.telecom.extra.START_CALL_WITH_RTT";
public static final java.lang.String EXTRA_START_CALL_WITH_SPEAKERPHONE = "android.telecom.extra.START_CALL_WITH_SPEAKERPHONE";
public static final java.lang.String EXTRA_START_CALL_WITH_VIDEO_STATE = "android.telecom.extra.START_CALL_WITH_VIDEO_STATE";
public static final java.lang.String GATEWAY_ORIGINAL_ADDRESS = "android.telecom.extra.GATEWAY_ORIGINAL_ADDRESS";
public static final java.lang.String GATEWAY_PROVIDER_PACKAGE = "android.telecom.extra.GATEWAY_PROVIDER_PACKAGE";
public static final java.lang.String METADATA_INCLUDE_EXTERNAL_CALLS = "android.telecom.INCLUDE_EXTERNAL_CALLS";
public static final java.lang.String METADATA_INCLUDE_SELF_MANAGED_CALLS = "android.telecom.INCLUDE_SELF_MANAGED_CALLS";
public static final java.lang.String METADATA_IN_CALL_SERVICE_RINGING = "android.telecom.IN_CALL_SERVICE_RINGING";
public static final java.lang.String METADATA_IN_CALL_SERVICE_UI = "android.telecom.IN_CALL_SERVICE_UI";
public static final int PRESENTATION_ALLOWED = 1;
public static final int PRESENTATION_PAYPHONE = 4;
public static final int PRESENTATION_RESTRICTED = 2;
public static final int PRESENTATION_UNKNOWN = 3;
}
