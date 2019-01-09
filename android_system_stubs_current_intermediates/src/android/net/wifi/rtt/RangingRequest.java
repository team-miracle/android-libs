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
public final class RangingRequest
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.rtt.RangingRequest.Builder addAccessPoint(android.net.wifi.ScanResult apInfo) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.rtt.RangingRequest.Builder addAccessPoints(java.util.List<android.net.wifi.ScanResult> apInfos) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.MacAddress peerMacAddress) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.wifi.aware.PeerHandle peerHandle) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.rtt.RangingRequest.Builder addResponder(android.net.wifi.rtt.ResponderConfig responder) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.rtt.RangingRequest build() { throw new RuntimeException("Stub!"); }
}
RangingRequest() { throw new RuntimeException("Stub!"); }
public static  int getMaxPeers() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingRequest> CREATOR;
static { CREATOR = null; }
}
