/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.net;
public class VpnService
  extends android.app.Service
{
public class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder setSession(java.lang.String session) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder setConfigureIntent(android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder setMtu(int mtu) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addAddress(java.net.InetAddress address, int prefixLength) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addAddress(java.lang.String address, int prefixLength) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addRoute(java.net.InetAddress address, int prefixLength) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addRoute(java.lang.String address, int prefixLength) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addDnsServer(java.net.InetAddress address) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addDnsServer(java.lang.String address) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addSearchDomain(java.lang.String domain) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder allowFamily(int family) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addAllowedApplication(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder addDisallowedApplication(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder allowBypass() { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder setBlocking(boolean blocking) { throw new RuntimeException("Stub!"); }
public  android.net.VpnService.Builder setUnderlyingNetworks(android.net.Network[] networks) { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor establish() { throw new RuntimeException("Stub!"); }
}
public  VpnService() { throw new RuntimeException("Stub!"); }
public static  android.content.Intent prepare(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  void prepareAndAuthorize(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  boolean protect(int socket) { throw new RuntimeException("Stub!"); }
public  boolean protect(java.net.Socket socket) { throw new RuntimeException("Stub!"); }
public  boolean protect(java.net.DatagramSocket socket) { throw new RuntimeException("Stub!"); }
public  boolean setUnderlyingNetworks(android.net.Network[] networks) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onRevoke() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.net.VpnService";
public static final java.lang.String SERVICE_META_DATA_SUPPORTS_ALWAYS_ON = "android.net.VpnService.SUPPORTS_ALWAYS_ON";
}
