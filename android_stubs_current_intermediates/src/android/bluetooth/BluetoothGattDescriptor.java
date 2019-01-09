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
public class BluetoothGattDescriptor
  implements android.os.Parcelable
{
public  BluetoothGattDescriptor(java.util.UUID uuid, int permissions) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGattCharacteristic getCharacteristic() { throw new RuntimeException("Stub!"); }
public  java.util.UUID getUuid() { throw new RuntimeException("Stub!"); }
public  int getPermissions() { throw new RuntimeException("Stub!"); }
public  byte[] getValue() { throw new RuntimeException("Stub!"); }
public  boolean setValue(byte[] value) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattDescriptor> CREATOR;
public static final byte[] DISABLE_NOTIFICATION_VALUE = null;
public static final byte[] ENABLE_INDICATION_VALUE = null;
public static final byte[] ENABLE_NOTIFICATION_VALUE = null;
public static final int PERMISSION_READ = 1;
public static final int PERMISSION_READ_ENCRYPTED = 2;
public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
public static final int PERMISSION_WRITE = 16;
public static final int PERMISSION_WRITE_ENCRYPTED = 32;
public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
public static final int PERMISSION_WRITE_SIGNED = 128;
public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
static { CREATOR = null; }
}
