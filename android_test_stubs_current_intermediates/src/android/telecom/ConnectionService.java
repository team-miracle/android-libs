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
public abstract class ConnectionService
  extends android.app.Service
{
public  ConnectionService() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  boolean onUnbind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  android.telecom.RemoteConnection createRemoteIncomingConnection(android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public final  android.telecom.RemoteConnection createRemoteOutgoingConnection(android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public final  void conferenceRemoteConnections(android.telecom.RemoteConnection remoteConnection1, android.telecom.RemoteConnection remoteConnection2) { throw new RuntimeException("Stub!"); }
public final  void addConference(android.telecom.Conference conference) { throw new RuntimeException("Stub!"); }
public final  void addExistingConnection(android.telecom.PhoneAccountHandle phoneAccountHandle, android.telecom.Connection connection) { throw new RuntimeException("Stub!"); }
public final  void connectionServiceFocusReleased() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<android.telecom.Connection> getAllConnections() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<android.telecom.Conference> getAllConferences() { throw new RuntimeException("Stub!"); }
public  android.telecom.Connection onCreateIncomingConnection(android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public  void onCreateIncomingConnectionFailed(android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public  void onCreateOutgoingConnectionFailed(android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public  android.telecom.Connection onCreateOutgoingConnection(android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public  android.telecom.Connection onCreateOutgoingHandoverConnection(android.telecom.PhoneAccountHandle fromPhoneAccountHandle, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public  android.telecom.Connection onCreateIncomingHandoverConnection(android.telecom.PhoneAccountHandle fromPhoneAccountHandle, android.telecom.ConnectionRequest request) { throw new RuntimeException("Stub!"); }
public  void onHandoverFailed(android.telecom.ConnectionRequest request, int error) { throw new RuntimeException("Stub!"); }
public  void onConference(android.telecom.Connection connection1, android.telecom.Connection connection2) { throw new RuntimeException("Stub!"); }
public  void onRemoteConferenceAdded(android.telecom.RemoteConference conference) { throw new RuntimeException("Stub!"); }
public  void onRemoteExistingConnectionAdded(android.telecom.RemoteConnection connection) { throw new RuntimeException("Stub!"); }
public  void onConnectionServiceFocusLost() { throw new RuntimeException("Stub!"); }
public  void onConnectionServiceFocusGained() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.telecom.ConnectionService";
}
