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

package android.bluetooth.le;
public final class ScanResult
  implements android.os.Parcelable
{
@java.lang.Deprecated()
public  ScanResult(android.bluetooth.BluetoothDevice device, android.bluetooth.le.ScanRecord scanRecord, int rssi, long timestampNanos) { throw new RuntimeException("Stub!"); }
public  ScanResult(android.bluetooth.BluetoothDevice device, int eventType, int primaryPhy, int secondaryPhy, int advertisingSid, int txPower, int rssi, int periodicAdvertisingInterval, android.bluetooth.le.ScanRecord scanRecord, long timestampNanos) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothDevice getDevice() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanRecord getScanRecord() { throw new RuntimeException("Stub!"); }
public  int getRssi() { throw new RuntimeException("Stub!"); }
public  long getTimestampNanos() { throw new RuntimeException("Stub!"); }
public  boolean isLegacy() { throw new RuntimeException("Stub!"); }
public  boolean isConnectable() { throw new RuntimeException("Stub!"); }
public  int getDataStatus() { throw new RuntimeException("Stub!"); }
public  int getPrimaryPhy() { throw new RuntimeException("Stub!"); }
public  int getSecondaryPhy() { throw new RuntimeException("Stub!"); }
public  int getAdvertisingSid() { throw new RuntimeException("Stub!"); }
public  int getTxPower() { throw new RuntimeException("Stub!"); }
public  int getPeriodicAdvertisingInterval() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.bluetooth.le.ScanResult> CREATOR;
public static final int DATA_COMPLETE = 0;
public static final int DATA_TRUNCATED = 2;
public static final int PERIODIC_INTERVAL_NOT_PRESENT = 0;
public static final int PHY_UNUSED = 0;
public static final int SID_NOT_PRESENT = 255;
public static final int TX_POWER_NOT_PRESENT = 127;
static { CREATOR = null; }
}
