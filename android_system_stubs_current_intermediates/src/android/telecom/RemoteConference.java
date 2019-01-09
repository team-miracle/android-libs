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
public final class RemoteConference
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onStateChanged(android.telecom.RemoteConference conference, int oldState, int newState) { throw new RuntimeException("Stub!"); }
public  void onDisconnected(android.telecom.RemoteConference conference, android.telecom.DisconnectCause disconnectCause) { throw new RuntimeException("Stub!"); }
public  void onConnectionAdded(android.telecom.RemoteConference conference, android.telecom.RemoteConnection connection) { throw new RuntimeException("Stub!"); }
public  void onConnectionRemoved(android.telecom.RemoteConference conference, android.telecom.RemoteConnection connection) { throw new RuntimeException("Stub!"); }
public  void onConnectionCapabilitiesChanged(android.telecom.RemoteConference conference, int connectionCapabilities) { throw new RuntimeException("Stub!"); }
public  void onConnectionPropertiesChanged(android.telecom.RemoteConference conference, int connectionProperties) { throw new RuntimeException("Stub!"); }
public  void onConferenceableConnectionsChanged(android.telecom.RemoteConference conference, java.util.List<android.telecom.RemoteConnection> conferenceableConnections) { throw new RuntimeException("Stub!"); }
public  void onDestroyed(android.telecom.RemoteConference conference) { throw new RuntimeException("Stub!"); }
public  void onExtrasChanged(android.telecom.RemoteConference conference, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
}
RemoteConference() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.RemoteConnection> getConnections() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  int getConnectionCapabilities() { throw new RuntimeException("Stub!"); }
public  int getConnectionProperties() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public  void separate(android.telecom.RemoteConnection connection) { throw new RuntimeException("Stub!"); }
public  void merge() { throw new RuntimeException("Stub!"); }
public  void swap() { throw new RuntimeException("Stub!"); }
public  void hold() { throw new RuntimeException("Stub!"); }
public  void unhold() { throw new RuntimeException("Stub!"); }
public  android.telecom.DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
public  void playDtmfTone(char digit) { throw new RuntimeException("Stub!"); }
public  void stopDtmfTone() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setAudioState(android.telecom.AudioState state) { throw new RuntimeException("Stub!"); }
public  void setCallAudioState(android.telecom.CallAudioState state) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.RemoteConnection> getConferenceableConnections() { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.telecom.RemoteConference.Callback callback) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.telecom.RemoteConference.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.telecom.RemoteConference.Callback callback) { throw new RuntimeException("Stub!"); }
}
