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

package android.net.wifi;
public class WifiConfiguration
  implements android.os.Parcelable
{
public static class KeyMgmt
{
KeyMgmt() { throw new RuntimeException("Stub!"); }
public static final int IEEE8021X = 3;
public static final int NONE = 0;
public static final int WPA2_PSK = 4;
public static final int WPA_EAP = 2;
public static final int WPA_PSK = 1;
public static final java.lang.String[] strings = null;
public static final java.lang.String varName = "key_mgmt";
}
public static class Protocol
{
Protocol() { throw new RuntimeException("Stub!"); }
public static final int RSN = 1;
@java.lang.Deprecated()
public static final int WPA = 0;
public static final java.lang.String[] strings = null;
public static final java.lang.String varName = "proto";
}
public static class AuthAlgorithm
{
AuthAlgorithm() { throw new RuntimeException("Stub!"); }
public static final int LEAP = 2;
public static final int OPEN = 0;
@java.lang.Deprecated()
public static final int SHARED = 1;
public static final java.lang.String[] strings = null;
public static final java.lang.String varName = "auth_alg";
}
public static class PairwiseCipher
{
PairwiseCipher() { throw new RuntimeException("Stub!"); }
public static final int CCMP = 2;
public static final int NONE = 0;
@java.lang.Deprecated()
public static final int TKIP = 1;
public static final java.lang.String[] strings = null;
public static final java.lang.String varName = "pairwise";
}
public static class GroupCipher
{
GroupCipher() { throw new RuntimeException("Stub!"); }
public static final int CCMP = 3;
public static final int TKIP = 2;
@java.lang.Deprecated()
public static final int WEP104 = 1;
@java.lang.Deprecated()
public static final int WEP40 = 0;
public static final java.lang.String[] strings = null;
public static final java.lang.String varName = "group";
}
public static class Status
{
Status() { throw new RuntimeException("Stub!"); }
public static final int CURRENT = 0;
public static final int DISABLED = 1;
public static final int ENABLED = 2;
public static final java.lang.String[] strings = null;
}
public  WifiConfiguration() { throw new RuntimeException("Stub!"); }
public  boolean hasNoInternetAccess() { throw new RuntimeException("Stub!"); }
public  boolean isNoInternetAccessExpected() { throw new RuntimeException("Stub!"); }
public  boolean isEphemeral() { throw new RuntimeException("Stub!"); }
public  boolean isPasspoint() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  android.net.ProxyInfo getHttpProxy() { throw new RuntimeException("Stub!"); }
public  void setHttpProxy(android.net.ProxyInfo httpProxy) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public java.lang.String BSSID;
public java.lang.String FQDN;
public java.lang.String SSID;
public java.util.BitSet allowedAuthAlgorithms;
public java.util.BitSet allowedGroupCiphers;
public java.util.BitSet allowedKeyManagement;
public java.util.BitSet allowedPairwiseCiphers;
public java.util.BitSet allowedProtocols;
public java.lang.String creatorName;
public int creatorUid;
public android.net.wifi.WifiEnterpriseConfig enterpriseConfig;
public boolean hiddenSSID;
public boolean isHomeProviderNetwork;
public java.lang.String lastUpdateName;
public int lastUpdateUid;
public boolean meteredHint;
public int networkId;
public int numAssociation;
public int numScorerOverride;
public int numScorerOverrideAndSwitchedNetwork;
public java.lang.String preSharedKey;
@java.lang.Deprecated()
public int priority;
public java.lang.String providerFriendlyName;
public long[] roamingConsortiumIds = null;
public int status;
public boolean useExternalScores;
@java.lang.Deprecated()
public java.lang.String[] wepKeys = null;
@java.lang.Deprecated()
public int wepTxKeyIndex;
}
