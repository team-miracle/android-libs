/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.telecom;
public final class Call
{
public static class Details
{
Details() { throw new RuntimeException("Stub!"); }
public static  boolean can(int capabilities, int capability) { throw new RuntimeException("Stub!"); }
public  boolean can(int capability) { throw new RuntimeException("Stub!"); }
public static  java.lang.String capabilitiesToString(int capabilities) { throw new RuntimeException("Stub!"); }
public static  boolean hasProperty(int properties, int property) { throw new RuntimeException("Stub!"); }
public  boolean hasProperty(int property) { throw new RuntimeException("Stub!"); }
public static  java.lang.String propertiesToString(int properties) { throw new RuntimeException("Stub!"); }
public  android.net.Uri getHandle() { throw new RuntimeException("Stub!"); }
public  int getHandlePresentation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCallerDisplayName() { throw new RuntimeException("Stub!"); }
public  int getCallerDisplayNamePresentation() { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccountHandle getAccountHandle() { throw new RuntimeException("Stub!"); }
public  int getCallCapabilities() { throw new RuntimeException("Stub!"); }
public  int getCallProperties() { throw new RuntimeException("Stub!"); }
public  android.telecom.DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
public final  long getConnectTimeMillis() { throw new RuntimeException("Stub!"); }
public  android.telecom.GatewayInfo getGatewayInfo() { throw new RuntimeException("Stub!"); }
public  int getVideoState() { throw new RuntimeException("Stub!"); }
public  android.telecom.StatusHints getStatusHints() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getIntentExtras() { throw new RuntimeException("Stub!"); }
public  long getCreationTimeMillis() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 4194304;
public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
public static final int CAPABILITY_CAN_PULL_CALL = 8388608;
public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = 8192;
public static final int CAPABILITY_HOLD = 1;
public static final int CAPABILITY_MANAGE_CONFERENCE = 128;
public static final int CAPABILITY_MERGE_CONFERENCE = 4;
public static final int CAPABILITY_MUTE = 64;
public static final int CAPABILITY_RESPOND_VIA_TEXT = 32;
public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = 4096;
public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 768;
public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = 256;
public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = 512;
public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 3072;
public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = 1024;
public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = 2048;
public static final int CAPABILITY_SUPPORT_DEFLECT = 16777216;
public static final int CAPABILITY_SUPPORT_HOLD = 2;
public static final int CAPABILITY_SWAP_CONFERENCE = 8;
public static final int PROPERTY_CONFERENCE = 1;
public static final int PROPERTY_EMERGENCY_CALLBACK_MODE = 4;
public static final int PROPERTY_ENTERPRISE_CALL = 32;
public static final int PROPERTY_GENERIC_CONFERENCE = 2;
public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 128;
public static final int PROPERTY_HIGH_DEF_AUDIO = 16;
public static final int PROPERTY_IS_EXTERNAL_CALL = 64;
public static final int PROPERTY_RTT = 1024;
public static final int PROPERTY_SELF_MANAGED = 256;
public static final int PROPERTY_WIFI = 8;
}
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onStateChanged(android.telecom.Call call, int state) { throw new RuntimeException("Stub!"); }
public  void onParentChanged(android.telecom.Call call, android.telecom.Call parent) { throw new RuntimeException("Stub!"); }
public  void onChildrenChanged(android.telecom.Call call, java.util.List<android.telecom.Call> children) { throw new RuntimeException("Stub!"); }
public  void onDetailsChanged(android.telecom.Call call, android.telecom.Call.Details details) { throw new RuntimeException("Stub!"); }
public  void onCannedTextResponsesLoaded(android.telecom.Call call, java.util.List<java.lang.String> cannedTextResponses) { throw new RuntimeException("Stub!"); }
public  void onPostDialWait(android.telecom.Call call, java.lang.String remainingPostDialSequence) { throw new RuntimeException("Stub!"); }
public  void onVideoCallChanged(android.telecom.Call call, android.telecom.InCallService.VideoCall videoCall) { throw new RuntimeException("Stub!"); }
public  void onCallDestroyed(android.telecom.Call call) { throw new RuntimeException("Stub!"); }
public  void onConferenceableCallsChanged(android.telecom.Call call, java.util.List<android.telecom.Call> conferenceableCalls) { throw new RuntimeException("Stub!"); }
public  void onConnectionEvent(android.telecom.Call call, java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onRttModeChanged(android.telecom.Call call, int mode) { throw new RuntimeException("Stub!"); }
public  void onRttStatusChanged(android.telecom.Call call, boolean enabled, android.telecom.Call.RttCall rttCall) { throw new RuntimeException("Stub!"); }
public  void onRttRequest(android.telecom.Call call, int id) { throw new RuntimeException("Stub!"); }
public  void onRttInitiationFailure(android.telecom.Call call, int reason) { throw new RuntimeException("Stub!"); }
public  void onHandoverComplete(android.telecom.Call call) { throw new RuntimeException("Stub!"); }
public  void onHandoverFailed(android.telecom.Call call, int failureReason) { throw new RuntimeException("Stub!"); }
public static final int HANDOVER_FAILURE_DEST_APP_REJECTED = 1;
public static final int HANDOVER_FAILURE_NOT_SUPPORTED = 2;
public static final int HANDOVER_FAILURE_ONGOING_EMERGENCY_CALL = 4;
public static final int HANDOVER_FAILURE_UNKNOWN = 5;
public static final int HANDOVER_FAILURE_USER_REJECTED = 3;
}
public static final class RttCall
{
RttCall() { throw new RuntimeException("Stub!"); }
public  int getRttAudioMode() { throw new RuntimeException("Stub!"); }
public  void setRttMode(int mode) { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String input) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String read() { throw new RuntimeException("Stub!"); }
public  java.lang.String readImmediately() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int RTT_MODE_FULL = 1;
public static final int RTT_MODE_HCO = 2;
public static final int RTT_MODE_VCO = 3;
}
Call() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRemainingPostDialSequence() { throw new RuntimeException("Stub!"); }
public  void answer(int videoState) { throw new RuntimeException("Stub!"); }
public  void deflect(android.net.Uri address) { throw new RuntimeException("Stub!"); }
public  void reject(boolean rejectWithMessage, java.lang.String textMessage) { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public  void hold() { throw new RuntimeException("Stub!"); }
public  void unhold() { throw new RuntimeException("Stub!"); }
public  void playDtmfTone(char digit) { throw new RuntimeException("Stub!"); }
public  void stopDtmfTone() { throw new RuntimeException("Stub!"); }
public  void postDialContinue(boolean proceed) { throw new RuntimeException("Stub!"); }
public  void phoneAccountSelected(android.telecom.PhoneAccountHandle accountHandle, boolean setDefault) { throw new RuntimeException("Stub!"); }
public  void conference(android.telecom.Call callToConferenceWith) { throw new RuntimeException("Stub!"); }
public  void splitFromConference() { throw new RuntimeException("Stub!"); }
public  void mergeConference() { throw new RuntimeException("Stub!"); }
public  void swapConference() { throw new RuntimeException("Stub!"); }
public  void pullExternalCall() { throw new RuntimeException("Stub!"); }
public  void sendCallEvent(java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void sendRttRequest() { throw new RuntimeException("Stub!"); }
public  void respondToRttRequest(int id, boolean accept) { throw new RuntimeException("Stub!"); }
public  void handoverTo(android.telecom.PhoneAccountHandle toHandle, int videoState, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void stopRtt() { throw new RuntimeException("Stub!"); }
public  void putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void removeExtras(java.util.List<java.lang.String> keys) { throw new RuntimeException("Stub!"); }
public  void removeExtras(java.lang.String... keys) { throw new RuntimeException("Stub!"); }
public  android.telecom.Call getParent() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.Call> getChildren() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.Call> getConferenceableCalls() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getCannedTextResponses() { throw new RuntimeException("Stub!"); }
public  android.telecom.InCallService.VideoCall getVideoCall() { throw new RuntimeException("Stub!"); }
public  android.telecom.Call.Details getDetails() { throw new RuntimeException("Stub!"); }
public  android.telecom.Call.RttCall getRttCall() { throw new RuntimeException("Stub!"); }
public  boolean isRttActive() { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.telecom.Call.Callback callback) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.telecom.Call.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.telecom.Call.Callback callback) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AVAILABLE_PHONE_ACCOUNTS = "selectPhoneAccountAccounts";
public static final java.lang.String EXTRA_LAST_EMERGENCY_CALLBACK_TIME_MILLIS = "android.telecom.extra.LAST_EMERGENCY_CALLBACK_TIME_MILLIS";
public static final int STATE_ACTIVE = 4;
public static final int STATE_CONNECTING = 9;
public static final int STATE_DIALING = 1;
public static final int STATE_DISCONNECTED = 7;
public static final int STATE_DISCONNECTING = 10;
public static final int STATE_HOLDING = 3;
public static final int STATE_NEW = 0;
public static final int STATE_PULLING_CALL = 11;
public static final int STATE_RINGING = 2;
public static final int STATE_SELECT_PHONE_ACCOUNT = 8;
}
