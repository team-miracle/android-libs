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
public abstract class Connection
  extends android.telecom.Conferenceable
{
public static final class RttTextStream
{
RttTextStream() { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String input) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readImmediately() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public static final class RttModifyStatus
{
RttModifyStatus() { throw new RuntimeException("Stub!"); }
public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
}
public abstract static class VideoProvider
{
public  VideoProvider() { throw new RuntimeException("Stub!"); }
public abstract  void onSetCamera(java.lang.String cameraId);
public abstract  void onSetPreviewSurface(android.view.Surface surface);
public abstract  void onSetDisplaySurface(android.view.Surface surface);
public abstract  void onSetDeviceOrientation(int rotation);
public abstract  void onSetZoom(float value);
public abstract  void onSendSessionModifyRequest(android.telecom.VideoProfile fromProfile, android.telecom.VideoProfile toProfile);
public abstract  void onSendSessionModifyResponse(android.telecom.VideoProfile responseProfile);
public abstract  void onRequestCameraCapabilities();
public abstract  void onRequestConnectionDataUsage();
public abstract  void onSetPauseImage(android.net.Uri uri);
public  void receiveSessionModifyRequest(android.telecom.VideoProfile videoProfile) { throw new RuntimeException("Stub!"); }
public  void receiveSessionModifyResponse(int status, android.telecom.VideoProfile requestedProfile, android.telecom.VideoProfile responseProfile) { throw new RuntimeException("Stub!"); }
public  void handleCallSessionEvent(int event) { throw new RuntimeException("Stub!"); }
public  void changePeerDimensions(int width, int height) { throw new RuntimeException("Stub!"); }
public  void setCallDataUsage(long dataUsage) { throw new RuntimeException("Stub!"); }
public  void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities) { throw new RuntimeException("Stub!"); }
public  void changeVideoQuality(int videoQuality) { throw new RuntimeException("Stub!"); }
public static final int SESSION_EVENT_CAMERA_FAILURE = 5;
public static final int SESSION_EVENT_CAMERA_PERMISSION_ERROR = 7;
public static final int SESSION_EVENT_CAMERA_READY = 6;
public static final int SESSION_EVENT_RX_PAUSE = 1;
public static final int SESSION_EVENT_RX_RESUME = 2;
public static final int SESSION_EVENT_TX_START = 3;
public static final int SESSION_EVENT_TX_STOP = 4;
public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
}
public  Connection() { throw new RuntimeException("Stub!"); }
public static  java.lang.String capabilitiesToString(int capabilities) { throw new RuntimeException("Stub!"); }
public static  java.lang.String propertiesToString(int properties) { throw new RuntimeException("Stub!"); }
public final  android.net.Uri getAddress() { throw new RuntimeException("Stub!"); }
public final  int getAddressPresentation() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getCallerDisplayName() { throw new RuntimeException("Stub!"); }
public final  int getCallerDisplayNamePresentation() { throw new RuntimeException("Stub!"); }
public final  int getState() { throw new RuntimeException("Stub!"); }
public final  android.telecom.CallAudioState getCallAudioState() { throw new RuntimeException("Stub!"); }
public final  android.telecom.Conference getConference() { throw new RuntimeException("Stub!"); }
public final  boolean isRingbackRequested() { throw new RuntimeException("Stub!"); }
public final  boolean getAudioModeIsVoip() { throw new RuntimeException("Stub!"); }
public final  android.telecom.StatusHints getStatusHints() { throw new RuntimeException("Stub!"); }
public final  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public final  android.telecom.DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
public static  java.lang.String stateToString(int state) { throw new RuntimeException("Stub!"); }
public final  int getConnectionCapabilities() { throw new RuntimeException("Stub!"); }
public final  int getConnectionProperties() { throw new RuntimeException("Stub!"); }
public final  void setAddress(android.net.Uri address, int presentation) { throw new RuntimeException("Stub!"); }
public final  void setCallerDisplayName(java.lang.String callerDisplayName, int presentation) { throw new RuntimeException("Stub!"); }
public final  void setVideoState(int videoState) { throw new RuntimeException("Stub!"); }
public final  void setActive() { throw new RuntimeException("Stub!"); }
public final  void setRinging() { throw new RuntimeException("Stub!"); }
public final  void setInitializing() { throw new RuntimeException("Stub!"); }
public final  void setInitialized() { throw new RuntimeException("Stub!"); }
public final  void setDialing() { throw new RuntimeException("Stub!"); }
public final  void setPulling() { throw new RuntimeException("Stub!"); }
public final  void setOnHold() { throw new RuntimeException("Stub!"); }
public final  void setVideoProvider(android.telecom.Connection.VideoProvider videoProvider) { throw new RuntimeException("Stub!"); }
public final  android.telecom.Connection.VideoProvider getVideoProvider() { throw new RuntimeException("Stub!"); }
public final  void setDisconnected(android.telecom.DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
public final  void setPostDialWait(java.lang.String remaining) { throw new RuntimeException("Stub!"); }
public final  void setNextPostDialChar(char nextChar) { throw new RuntimeException("Stub!"); }
public final  void setRingbackRequested(boolean ringback) { throw new RuntimeException("Stub!"); }
public final  void setConnectionCapabilities(int connectionCapabilities) { throw new RuntimeException("Stub!"); }
public final  void setConnectionProperties(int connectionProperties) { throw new RuntimeException("Stub!"); }
public final  void destroy() { throw new RuntimeException("Stub!"); }
public final  void setAudioModeIsVoip(boolean isVoip) { throw new RuntimeException("Stub!"); }
public final  void setStatusHints(android.telecom.StatusHints statusHints) { throw new RuntimeException("Stub!"); }
public final  void setConferenceableConnections(java.util.List<android.telecom.Connection> conferenceableConnections) { throw new RuntimeException("Stub!"); }
public final  void setConferenceables(java.util.List<android.telecom.Conferenceable> conferenceables) { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.telecom.Conferenceable> getConferenceables() { throw new RuntimeException("Stub!"); }
public final  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public final  void putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public final  void removeExtras(java.util.List<java.lang.String> keys) { throw new RuntimeException("Stub!"); }
public final  void removeExtras(java.lang.String... keys) { throw new RuntimeException("Stub!"); }
public final  void setAudioRoute(int route) { throw new RuntimeException("Stub!"); }
public  void requestBluetoothAudio(android.bluetooth.BluetoothDevice bluetoothDevice) { throw new RuntimeException("Stub!"); }
public final  void sendRttInitiationSuccess() { throw new RuntimeException("Stub!"); }
public final  void sendRttInitiationFailure(int reason) { throw new RuntimeException("Stub!"); }
public final  void sendRttSessionRemotelyTerminated() { throw new RuntimeException("Stub!"); }
public final  void sendRemoteRttRequest() { throw new RuntimeException("Stub!"); }
public  void onCallAudioStateChanged(android.telecom.CallAudioState state) { throw new RuntimeException("Stub!"); }
public  void onStateChanged(int state) { throw new RuntimeException("Stub!"); }
public  void onPlayDtmfTone(char c) { throw new RuntimeException("Stub!"); }
public  void onStopDtmfTone() { throw new RuntimeException("Stub!"); }
public  void onDisconnect() { throw new RuntimeException("Stub!"); }
public  void onSeparate() { throw new RuntimeException("Stub!"); }
public  void onAbort() { throw new RuntimeException("Stub!"); }
public  void onHold() { throw new RuntimeException("Stub!"); }
public  void onUnhold() { throw new RuntimeException("Stub!"); }
public  void onAnswer(int videoState) { throw new RuntimeException("Stub!"); }
public  void onAnswer() { throw new RuntimeException("Stub!"); }
public  void onDeflect(android.net.Uri address) { throw new RuntimeException("Stub!"); }
public  void onReject() { throw new RuntimeException("Stub!"); }
public  void onReject(java.lang.String replyMessage) { throw new RuntimeException("Stub!"); }
public  void onPostDialContinue(boolean proceed) { throw new RuntimeException("Stub!"); }
public  void onPullExternalCall() { throw new RuntimeException("Stub!"); }
public  void onCallEvent(java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onHandoverComplete() { throw new RuntimeException("Stub!"); }
public  void onExtrasChanged(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onShowIncomingCallUi() { throw new RuntimeException("Stub!"); }
public  void onStartRtt(android.telecom.Connection.RttTextStream rttTextStream) { throw new RuntimeException("Stub!"); }
public  void onStopRtt() { throw new RuntimeException("Stub!"); }
public  void handleRttUpgradeResponse(android.telecom.Connection.RttTextStream rttTextStream) { throw new RuntimeException("Stub!"); }
public static  android.telecom.Connection createFailedConnection(android.telecom.DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
public static  android.telecom.Connection createCanceledConnection() { throw new RuntimeException("Stub!"); }
public  void sendConnectionEvent(java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 8388608;
public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
public static final int CAPABILITY_CAN_PULL_CALL = 16777216;
public static final int CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION = 4194304;
public static final int CAPABILITY_CAN_UPGRADE_TO_VIDEO = 524288;
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
public static final int CAPABILITY_SUPPORT_DEFLECT = 33554432;
public static final int CAPABILITY_SUPPORT_HOLD = 2;
public static final int CAPABILITY_SWAP_CONFERENCE = 8;
public static final java.lang.String EVENT_CALL_MERGE_FAILED = "android.telecom.event.CALL_MERGE_FAILED";
public static final java.lang.String EVENT_CALL_PULL_FAILED = "android.telecom.event.CALL_PULL_FAILED";
public static final java.lang.String EXTRA_ANSWERING_DROPS_FG_CALL = "android.telecom.extra.ANSWERING_DROPS_FG_CALL";
public static final java.lang.String EXTRA_ANSWERING_DROPS_FG_CALL_APP_NAME = "android.telecom.extra.ANSWERING_DROPS_FG_CALL_APP_NAME";
public static final java.lang.String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
public static final java.lang.String EXTRA_CHILD_ADDRESS = "android.telecom.extra.CHILD_ADDRESS";
public static final java.lang.String EXTRA_LAST_FORWARDED_NUMBER = "android.telecom.extra.LAST_FORWARDED_NUMBER";
public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 32;
public static final int PROPERTY_IS_EXTERNAL_CALL = 16;
public static final int PROPERTY_IS_RTT = 256;
public static final int PROPERTY_SELF_MANAGED = 128;
public static final int STATE_ACTIVE = 4;
public static final int STATE_DIALING = 3;
public static final int STATE_DISCONNECTED = 6;
public static final int STATE_HOLDING = 5;
public static final int STATE_INITIALIZING = 0;
public static final int STATE_NEW = 1;
public static final int STATE_PULLING_CALL = 7;
public static final int STATE_RINGING = 2;
}
