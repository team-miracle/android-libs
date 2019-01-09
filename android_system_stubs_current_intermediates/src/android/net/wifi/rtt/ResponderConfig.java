/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.net.wifi.rtt;
public final class ResponderConfig
  implements android.os.Parcelable
{
public  ResponderConfig(android.net.MacAddress macAddress, int responderType, boolean supports80211mc, int channelWidth, int frequency, int centerFreq0, int centerFreq1, int preamble) { throw new RuntimeException("Stub!"); }
public  ResponderConfig(android.net.wifi.aware.PeerHandle peerHandle, int responderType, boolean supports80211mc, int channelWidth, int frequency, int centerFreq0, int centerFreq1, int preamble) { throw new RuntimeException("Stub!"); }
public static  android.net.wifi.rtt.ResponderConfig fromScanResult(android.net.wifi.ScanResult scanResult) { throw new RuntimeException("Stub!"); }
public static  android.net.wifi.rtt.ResponderConfig fromWifiAwarePeerMacAddressWithDefaults(android.net.MacAddress macAddress) { throw new RuntimeException("Stub!"); }
public static  android.net.wifi.rtt.ResponderConfig fromWifiAwarePeerHandleWithDefaults(android.net.wifi.aware.PeerHandle peerHandle) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final int CHANNEL_WIDTH_160MHZ = 3;
public static final int CHANNEL_WIDTH_20MHZ = 0;
public static final int CHANNEL_WIDTH_40MHZ = 1;
public static final int CHANNEL_WIDTH_80MHZ = 2;
public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
public static final android.os.Parcelable.Creator<android.net.wifi.rtt.ResponderConfig> CREATOR;
public static final int PREAMBLE_HT = 1;
public static final int PREAMBLE_LEGACY = 0;
public static final int PREAMBLE_VHT = 2;
public static final int RESPONDER_AP = 0;
public static final int RESPONDER_AWARE = 4;
public static final int RESPONDER_P2P_CLIENT = 3;
public static final int RESPONDER_P2P_GO = 2;
public static final int RESPONDER_STA = 1;
public final int centerFreq0;
public final int centerFreq1;
public final int channelWidth;
public final int frequency;
public final android.net.MacAddress macAddress;
public final android.net.wifi.aware.PeerHandle peerHandle;
public final int preamble;
public final int responderType;
public final boolean supports80211mc;
static { CREATOR = null; }
}
