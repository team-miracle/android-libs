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
public class WifiAwareSession
  implements java.lang.AutoCloseable
{
WifiAwareSession() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void publish(android.net.wifi.aware.PublishConfig publishConfig, android.net.wifi.aware.DiscoverySessionCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void subscribe(android.net.wifi.aware.SubscribeConfig subscribeConfig, android.net.wifi.aware.DiscoverySessionCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkSpecifier createNetworkSpecifierOpen(int role, byte[] peer) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkSpecifier createNetworkSpecifierPassphrase(int role, byte[] peer, java.lang.String passphrase) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkSpecifier createNetworkSpecifierPmk(int role, byte[] peer, byte[] pmk) { throw new RuntimeException("Stub!"); }
}
