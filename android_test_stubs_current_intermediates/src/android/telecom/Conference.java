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
public abstract class Conference
  extends android.telecom.Conferenceable
{
public  Conference(android.telecom.PhoneAccountHandle phoneAccount) { throw new RuntimeException("Stub!"); }
public final  android.telecom.PhoneAccountHandle getPhoneAccountHandle() { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.telecom.Connection> getConnections() { throw new RuntimeException("Stub!"); }
public final  int getState() { throw new RuntimeException("Stub!"); }
public final  int getConnectionCapabilities() { throw new RuntimeException("Stub!"); }
public final  int getConnectionProperties() { throw new RuntimeException("Stub!"); }
public final  android.telecom.CallAudioState getCallAudioState() { throw new RuntimeException("Stub!"); }
public  android.telecom.Connection.VideoProvider getVideoProvider() { throw new RuntimeException("Stub!"); }
public  int getVideoState() { throw new RuntimeException("Stub!"); }
public  void onDisconnect() { throw new RuntimeException("Stub!"); }
public  void onSeparate(android.telecom.Connection connection) { throw new RuntimeException("Stub!"); }
public  void onMerge(android.telecom.Connection connection) { throw new RuntimeException("Stub!"); }
public  void onHold() { throw new RuntimeException("Stub!"); }
public  void onUnhold() { throw new RuntimeException("Stub!"); }
public  void onMerge() { throw new RuntimeException("Stub!"); }
public  void onSwap() { throw new RuntimeException("Stub!"); }
public  void onPlayDtmfTone(char c) { throw new RuntimeException("Stub!"); }
public  void onStopDtmfTone() { throw new RuntimeException("Stub!"); }
public  void onCallAudioStateChanged(android.telecom.CallAudioState state) { throw new RuntimeException("Stub!"); }
public  void onConnectionAdded(android.telecom.Connection connection) { throw new RuntimeException("Stub!"); }
public final  void setOnHold() { throw new RuntimeException("Stub!"); }
public final  void setDialing() { throw new RuntimeException("Stub!"); }
public final  void setActive() { throw new RuntimeException("Stub!"); }
public final  void setDisconnected(android.telecom.DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
public final  android.telecom.DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
public final  void setConnectionCapabilities(int connectionCapabilities) { throw new RuntimeException("Stub!"); }
public final  void setConnectionProperties(int connectionProperties) { throw new RuntimeException("Stub!"); }
public final  boolean addConnection(android.telecom.Connection connection) { throw new RuntimeException("Stub!"); }
public final  void removeConnection(android.telecom.Connection connection) { throw new RuntimeException("Stub!"); }
public final  void setConferenceableConnections(java.util.List<android.telecom.Connection> conferenceableConnections) { throw new RuntimeException("Stub!"); }
public final  void setVideoState(android.telecom.Connection c, int videoState) { throw new RuntimeException("Stub!"); }
public final  void setVideoProvider(android.telecom.Connection c, android.telecom.Connection.VideoProvider videoProvider) { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.telecom.Connection> getConferenceableConnections() { throw new RuntimeException("Stub!"); }
public final  void destroy() { throw new RuntimeException("Stub!"); }
public final  void setConnectionTime(long connectionTimeMillis) { throw new RuntimeException("Stub!"); }
public final  void setConnectionStartElapsedRealTime(long connectionStartElapsedRealTime) { throw new RuntimeException("Stub!"); }
public final  long getConnectionTime() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  void setStatusHints(android.telecom.StatusHints statusHints) { throw new RuntimeException("Stub!"); }
public final  android.telecom.StatusHints getStatusHints() { throw new RuntimeException("Stub!"); }
public final  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public final  void putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public final  void removeExtras(java.util.List<java.lang.String> keys) { throw new RuntimeException("Stub!"); }
public final  void removeExtras(java.lang.String... keys) { throw new RuntimeException("Stub!"); }
public final  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  void onExtrasChanged(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static final long CONNECT_TIME_NOT_SPECIFIED = 0L;
}
