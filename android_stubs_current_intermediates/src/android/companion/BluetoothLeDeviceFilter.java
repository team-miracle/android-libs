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
public final class BluetoothLeDeviceFilter
  implements android.companion.DeviceFilter<android.bluetooth.le.ScanResult>
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothLeDeviceFilter.Builder setNamePattern(java.util.regex.Pattern regex) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothLeDeviceFilter.Builder setScanFilter(android.bluetooth.le.ScanFilter scanFilter) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothLeDeviceFilter.Builder setRawDataFilter(byte[] rawDataFilter, byte[] rawDataFilterMask) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothLeDeviceFilter.Builder setRenameFromBytes(java.lang.String prefix, java.lang.String suffix, int bytesFrom, int bytesLength, java.nio.ByteOrder byteOrder) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothLeDeviceFilter.Builder setRenameFromName(java.lang.String prefix, java.lang.String suffix, int nameFrom, int nameLength) { throw new RuntimeException("Stub!"); }
public  android.companion.BluetoothLeDeviceFilter build() { throw new RuntimeException("Stub!"); }
}
BluetoothLeDeviceFilter() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  int getRenamePrefixLengthLimit() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.companion.BluetoothLeDeviceFilter> CREATOR;
static { CREATOR = null; }
}
