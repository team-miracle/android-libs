/*
* Copyright (C) 2012 The Android Open Source Project
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

package android.net.nsd;
public final class NsdManager
{
public static interface DiscoveryListener
{
public abstract  void onStartDiscoveryFailed(java.lang.String serviceType, int errorCode);
public abstract  void onStopDiscoveryFailed(java.lang.String serviceType, int errorCode);
public abstract  void onDiscoveryStarted(java.lang.String serviceType);
public abstract  void onDiscoveryStopped(java.lang.String serviceType);
public abstract  void onServiceFound(android.net.nsd.NsdServiceInfo serviceInfo);
public abstract  void onServiceLost(android.net.nsd.NsdServiceInfo serviceInfo);
}
public static interface RegistrationListener
{
public abstract  void onRegistrationFailed(android.net.nsd.NsdServiceInfo serviceInfo, int errorCode);
public abstract  void onUnregistrationFailed(android.net.nsd.NsdServiceInfo serviceInfo, int errorCode);
public abstract  void onServiceRegistered(android.net.nsd.NsdServiceInfo serviceInfo);
public abstract  void onServiceUnregistered(android.net.nsd.NsdServiceInfo serviceInfo);
}
public static interface ResolveListener
{
public abstract  void onResolveFailed(android.net.nsd.NsdServiceInfo serviceInfo, int errorCode);
public abstract  void onServiceResolved(android.net.nsd.NsdServiceInfo serviceInfo);
}
NsdManager() { throw new RuntimeException("Stub!"); }
public  void registerService(android.net.nsd.NsdServiceInfo serviceInfo, int protocolType, android.net.nsd.NsdManager.RegistrationListener listener) { throw new RuntimeException("Stub!"); }
public  void unregisterService(android.net.nsd.NsdManager.RegistrationListener listener) { throw new RuntimeException("Stub!"); }
public  void discoverServices(java.lang.String serviceType, int protocolType, android.net.nsd.NsdManager.DiscoveryListener listener) { throw new RuntimeException("Stub!"); }
public  void stopServiceDiscovery(android.net.nsd.NsdManager.DiscoveryListener listener) { throw new RuntimeException("Stub!"); }
public  void resolveService(android.net.nsd.NsdServiceInfo serviceInfo, android.net.nsd.NsdManager.ResolveListener listener) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_NSD_STATE_CHANGED = "android.net.nsd.STATE_CHANGED";
public static final java.lang.String EXTRA_NSD_STATE = "nsd_state";
public static final int FAILURE_ALREADY_ACTIVE = 3;
public static final int FAILURE_INTERNAL_ERROR = 0;
public static final int FAILURE_MAX_LIMIT = 4;
public static final int NSD_STATE_DISABLED = 1;
public static final int NSD_STATE_ENABLED = 2;
public static final int PROTOCOL_DNS_SD = 1;
}
