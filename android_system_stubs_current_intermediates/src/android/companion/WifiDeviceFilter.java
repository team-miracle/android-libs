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

package android.companion;
public final class WifiDeviceFilter
  implements android.companion.DeviceFilter<android.net.wifi.ScanResult>
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.companion.WifiDeviceFilter.Builder setNamePattern(java.util.regex.Pattern regex) { throw new RuntimeException("Stub!"); }
public  android.companion.WifiDeviceFilter build() { throw new RuntimeException("Stub!"); }
}
WifiDeviceFilter() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.companion.WifiDeviceFilter> CREATOR;
static { CREATOR = null; }
}
