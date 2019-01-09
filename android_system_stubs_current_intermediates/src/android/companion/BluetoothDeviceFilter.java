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
public final class BluetoothDeviceFilter
  implements android.companion.DeviceFilter<android.bluetooth.BluetoothDevice>
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothDeviceFilter.Builder setNamePattern(java.util.regex.Pattern regex) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothDeviceFilter.Builder setAddress(java.lang.String address) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothDeviceFilter.Builder addServiceUuid(android.os.ParcelUuid serviceUuid, android.os.ParcelUuid serviceUuidMask) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothDeviceFilter build() { throw new RuntimeException("Stub!"); }
}
BluetoothDeviceFilter() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.companion.BluetoothDeviceFilter> CREATOR;
static { CREATOR = null; }
}
