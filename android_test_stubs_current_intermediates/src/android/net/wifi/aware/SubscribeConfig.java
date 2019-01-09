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
public final class SubscribeConfig
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setServiceName(java.lang.String serviceName) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setServiceSpecificInfo(byte[] serviceSpecificInfo) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setMatchFilter(java.util.List<byte[]> matchFilter) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setSubscribeType(int subscribeType) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setTtlSec(int ttlSec) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setTerminateNotificationEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setMinDistanceMm(int minDistanceMm) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig.Builder setMaxDistanceMm(int maxDistanceMm) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.SubscribeConfig build() { throw new RuntimeException("Stub!"); }
}
SubscribeConfig() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.aware.SubscribeConfig> CREATOR;
public static final int SUBSCRIBE_TYPE_ACTIVE = 1;
public static final int SUBSCRIBE_TYPE_PASSIVE = 0;
static { CREATOR = null; }
}
