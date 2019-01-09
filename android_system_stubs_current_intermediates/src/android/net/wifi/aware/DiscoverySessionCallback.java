/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.net.wifi.aware;
public class DiscoverySessionCallback
{
public  DiscoverySessionCallback() { throw new RuntimeException("Stub!"); }
public  void onPublishStarted(android.net.wifi.aware.PublishDiscoverySession session) { throw new RuntimeException("Stub!"); }
public  void onSubscribeStarted(android.net.wifi.aware.SubscribeDiscoverySession session) { throw new RuntimeException("Stub!"); }
public  void onSessionConfigUpdated() { throw new RuntimeException("Stub!"); }
public  void onSessionConfigFailed() { throw new RuntimeException("Stub!"); }
public  void onSessionTerminated() { throw new RuntimeException("Stub!"); }
public  void onServiceDiscovered(android.net.wifi.aware.PeerHandle peerHandle, byte[] serviceSpecificInfo, java.util.List<byte[]> matchFilter) { throw new RuntimeException("Stub!"); }
public  void onServiceDiscoveredWithinRange(android.net.wifi.aware.PeerHandle peerHandle, byte[] serviceSpecificInfo, java.util.List<byte[]> matchFilter, int distanceMm) { throw new RuntimeException("Stub!"); }
public  void onMessageSendSucceeded(@java.lang.SuppressWarnings(value={"unused"})
int messageId) { throw new RuntimeException("Stub!"); }
public  void onMessageSendFailed(@java.lang.SuppressWarnings(value={"unused"})
int messageId) { throw new RuntimeException("Stub!"); }
public  void onMessageReceived(android.net.wifi.aware.PeerHandle peerHandle, byte[] message) { throw new RuntimeException("Stub!"); }
}
