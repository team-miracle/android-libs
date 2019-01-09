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

package android.net;
public final class NetworkCapabilities
  implements android.os.Parcelable
{
public  NetworkCapabilities(android.net.NetworkCapabilities nc) { throw new RuntimeException("Stub!"); }
public  boolean hasCapability(int capability) { throw new RuntimeException("Stub!"); }
public  boolean hasTransport(int transportType) { throw new RuntimeException("Stub!"); }
public  int getLinkUpstreamBandwidthKbps() { throw new RuntimeException("Stub!"); }
public  int getLinkDownstreamBandwidthKbps() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.NetworkCapabilities> CREATOR;
public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
public static final int NET_CAPABILITY_CBS = 5;
public static final int NET_CAPABILITY_DUN = 2;
public static final int NET_CAPABILITY_EIMS = 10;
public static final int NET_CAPABILITY_FOREGROUND = 19;
public static final int NET_CAPABILITY_FOTA = 3;
public static final int NET_CAPABILITY_IA = 7;
public static final int NET_CAPABILITY_IMS = 4;
public static final int NET_CAPABILITY_INTERNET = 12;
public static final int NET_CAPABILITY_MMS = 0;
public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
public static final int NET_CAPABILITY_NOT_METERED = 11;
public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
public static final int NET_CAPABILITY_NOT_ROAMING = 18;
public static final int NET_CAPABILITY_NOT_SUSPENDED = 21;
public static final int NET_CAPABILITY_NOT_VPN = 15;
public static final int NET_CAPABILITY_RCS = 8;
public static final int NET_CAPABILITY_SUPL = 1;
public static final int NET_CAPABILITY_TRUSTED = 14;
public static final int NET_CAPABILITY_VALIDATED = 16;
public static final int NET_CAPABILITY_WIFI_P2P = 6;
public static final int NET_CAPABILITY_XCAP = 9;
public static final int TRANSPORT_BLUETOOTH = 2;
public static final int TRANSPORT_CELLULAR = 0;
public static final int TRANSPORT_ETHERNET = 3;
public static final int TRANSPORT_LOWPAN = 6;
public static final int TRANSPORT_VPN = 4;
public static final int TRANSPORT_WIFI = 1;
public static final int TRANSPORT_WIFI_AWARE = 5;
static { CREATOR = null; }
}
