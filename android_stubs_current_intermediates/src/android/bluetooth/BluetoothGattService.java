/*
* Copyright (C) 2013 The Android Open Source Project
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
package android.bluetooth;
public class BluetoothGattService
  implements android.os.Parcelable
{
public  BluetoothGattService(java.util.UUID uuid, int serviceType) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  boolean addService(android.bluetooth.BluetoothGattService service) { throw new RuntimeException("Stub!"); }
public  boolean addCharacteristic(android.bluetooth.BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
public  java.util.UUID getUuid() { throw new RuntimeException("Stub!"); }
public  int getInstanceId() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothGattService> getIncludedServices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothGattCharacteristic> getCharacteristics() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID uuid) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattService> CREATOR;
public static final int SERVICE_TYPE_PRIMARY = 0;
public static final int SERVICE_TYPE_SECONDARY = 1;
protected java.util.List<android.bluetooth.BluetoothGattCharacteristic> mCharacteristics;
protected java.util.List<android.bluetooth.BluetoothGattService> mIncludedServices;
static { CREATOR = null; }
}
