/*
* Copyright (C) 2008 The Android Open Source Project
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
public class ConnectivityManager
{
public static interface OnNetworkActiveListener
{
public abstract  void onNetworkActive();
}
public abstract static class OnStartTetheringCallback
{
public  OnStartTetheringCallback() { throw new RuntimeException("Stub!"); }
public  void onTetheringStarted() { throw new RuntimeException("Stub!"); }
public  void onTetheringFailed() { throw new RuntimeException("Stub!"); }
}
public static class NetworkCallback
{
public  NetworkCallback() { throw new RuntimeException("Stub!"); }
public  void onAvailable(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  void onLosing(android.net.Network network, int maxMsToLive) { throw new RuntimeException("Stub!"); }
public  void onLost(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  void onUnavailable() { throw new RuntimeException("Stub!"); }
public  void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) { throw new RuntimeException("Stub!"); }
public  void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) { throw new RuntimeException("Stub!"); }
}
ConnectivityManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isNetworkTypeValid(int networkType) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setNetworkPreference(int preference) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getNetworkPreference() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkInfo getActiveNetworkInfo() { throw new RuntimeException("Stub!"); }
public  android.net.Network getActiveNetwork() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.net.NetworkInfo getNetworkInfo(int networkType) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkInfo getNetworkInfo(android.net.Network network) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.net.NetworkInfo[] getAllNetworkInfo() { throw new RuntimeException("Stub!"); }
public  android.net.Network[] getAllNetworks() { throw new RuntimeException("Stub!"); }
public  android.net.LinkProperties getLinkProperties(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCaptivePortalServerUrl() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean getBackgroundDataSetting() { throw new RuntimeException("Stub!"); }
public  void addDefaultNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener l) { throw new RuntimeException("Stub!"); }
public  void removeDefaultNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener l) { throw new RuntimeException("Stub!"); }
public  boolean isDefaultNetworkActive() { throw new RuntimeException("Stub!"); }
public  boolean isTetheringSupported() { throw new RuntimeException("Stub!"); }
public  void startTethering(int type, boolean showProvisioningUi, android.net.ConnectivityManager.OnStartTetheringCallback callback) { throw new RuntimeException("Stub!"); }
public  void startTethering(int type, boolean showProvisioningUi, android.net.ConnectivityManager.OnStartTetheringCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void stopTethering(int type) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void reportBadNetwork(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  void reportNetworkConnectivity(android.net.Network network, boolean hasConnectivity) { throw new RuntimeException("Stub!"); }
public  android.net.ProxyInfo getDefaultProxy() { throw new RuntimeException("Stub!"); }
public  boolean isActiveNetworkMetered() { throw new RuntimeException("Stub!"); }
public  void requestNetwork(android.net.NetworkRequest request, android.net.ConnectivityManager.NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
public  void requestNetwork(android.net.NetworkRequest request, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void requestNetwork(android.net.NetworkRequest request, android.net.ConnectivityManager.NetworkCallback networkCallback, int timeoutMs) { throw new RuntimeException("Stub!"); }
public  void requestNetwork(android.net.NetworkRequest request, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler, int timeoutMs) { throw new RuntimeException("Stub!"); }
public  void requestNetwork(android.net.NetworkRequest request, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void releaseNetworkRequest(android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void registerNetworkCallback(android.net.NetworkRequest request, android.net.ConnectivityManager.NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
public  void registerNetworkCallback(android.net.NetworkRequest request, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void registerNetworkCallback(android.net.NetworkRequest request, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
public  void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean requestBandwidthUpdate(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  void unregisterNetworkCallback(android.net.ConnectivityManager.NetworkCallback networkCallback) { throw new RuntimeException("Stub!"); }
public  void unregisterNetworkCallback(android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  int getMultipathPreference(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  boolean bindProcessToNetwork(android.net.Network network) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean setProcessDefaultNetwork(android.net.Network network) { throw new RuntimeException("Stub!"); }
public  android.net.Network getBoundNetworkForProcess() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.net.Network getProcessDefaultNetwork() { throw new RuntimeException("Stub!"); }
public  int getRestrictBackgroundStatus() { throw new RuntimeException("Stub!"); }
public  byte[] getNetworkWatchlistConfigHash() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final java.lang.String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
public static final java.lang.String ACTION_CAPTIVE_PORTAL_SIGN_IN = "android.net.conn.CAPTIVE_PORTAL";
public static final java.lang.String ACTION_RESTRICT_BACKGROUND_CHANGED = "android.net.conn.RESTRICT_BACKGROUND_CHANGED";
@java.lang.Deprecated()
public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
@java.lang.Deprecated()
public static final int DEFAULT_NETWORK_PREFERENCE = 1;
public static final java.lang.String EXTRA_CAPTIVE_PORTAL = "android.net.extra.CAPTIVE_PORTAL";
public static final java.lang.String EXTRA_CAPTIVE_PORTAL_URL = "android.net.extra.CAPTIVE_PORTAL_URL";
public static final java.lang.String EXTRA_EXTRA_INFO = "extraInfo";
public static final java.lang.String EXTRA_IS_FAILOVER = "isFailover";
public static final java.lang.String EXTRA_NETWORK = "android.net.extra.NETWORK";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
public static final java.lang.String EXTRA_NETWORK_REQUEST = "android.net.extra.NETWORK_REQUEST";
public static final java.lang.String EXTRA_NETWORK_TYPE = "networkType";
public static final java.lang.String EXTRA_NO_CONNECTIVITY = "noConnectivity";
public static final java.lang.String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
public static final java.lang.String EXTRA_REASON = "reason";
public static final int MULTIPATH_PREFERENCE_HANDOVER = 1;
public static final int MULTIPATH_PREFERENCE_PERFORMANCE = 4;
public static final int MULTIPATH_PREFERENCE_RELIABILITY = 2;
public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
public static final int TETHERING_BLUETOOTH = 2;
public static final int TETHERING_USB = 1;
public static final int TETHERING_WIFI = 0;
@java.lang.Deprecated()
public static final int TYPE_BLUETOOTH = 7;
@java.lang.Deprecated()
public static final int TYPE_DUMMY = 8;
@java.lang.Deprecated()
public static final int TYPE_ETHERNET = 9;
@java.lang.Deprecated()
public static final int TYPE_MOBILE = 0;
@java.lang.Deprecated()
public static final int TYPE_MOBILE_DUN = 4;
@java.lang.Deprecated()
public static final int TYPE_MOBILE_HIPRI = 5;
@java.lang.Deprecated()
public static final int TYPE_MOBILE_MMS = 2;
@java.lang.Deprecated()
public static final int TYPE_MOBILE_SUPL = 3;
@java.lang.Deprecated()
public static final int TYPE_VPN = 17;
@java.lang.Deprecated()
public static final int TYPE_WIFI = 1;
@java.lang.Deprecated()
public static final int TYPE_WIMAX = 6;
}
