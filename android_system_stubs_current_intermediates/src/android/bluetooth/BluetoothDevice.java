/*
* Copyright (C) 2009 The Android Open Source Project
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
public final class BluetoothDevice
  implements android.os.Parcelable
{
BluetoothDevice() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  boolean createBond() { throw new RuntimeException("Stub!"); }
public  boolean cancelBondProcess() { throw new RuntimeException("Stub!"); }
public  boolean removeBond() { throw new RuntimeException("Stub!"); }
public  int getBondState() { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  boolean isEncrypted() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothClass getBluetoothClass() { throw new RuntimeException("Stub!"); }
public  android.os.ParcelUuid[] getUuids() { throw new RuntimeException("Stub!"); }
public  boolean fetchUuidsWithSdp() { throw new RuntimeException("Stub!"); }
public  boolean setPin(byte[] pin) { throw new RuntimeException("Stub!"); }
public  boolean setPairingConfirmation(boolean confirm) { throw new RuntimeException("Stub!"); }
public  boolean setPhonebookAccessPermission(int value) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothSocket createRfcommSocketToServiceRecord(java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothSocket createInsecureRfcommSocketToServiceRecord(java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGatt connectGatt(android.content.Context context, boolean autoConnect, android.bluetooth.BluetoothGattCallback callback) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGatt connectGatt(android.content.Context context, boolean autoConnect, android.bluetooth.BluetoothGattCallback callback, int transport) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGatt connectGatt(android.content.Context context, boolean autoConnect, android.bluetooth.BluetoothGattCallback callback, int transport, int phy) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGatt connectGatt(android.content.Context context, boolean autoConnect, android.bluetooth.BluetoothGattCallback callback, int transport, int phy, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public static final int ACCESS_ALLOWED = 1;
public static final int ACCESS_REJECTED = 2;
public static final int ACCESS_UNKNOWN = 0;
public static final java.lang.String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";
public static final java.lang.String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";
public static final java.lang.String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";
public static final java.lang.String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";
public static final java.lang.String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";
public static final java.lang.String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
public static final java.lang.String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";
public static final java.lang.String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";
public static final java.lang.String ACTION_UUID = "android.bluetooth.device.action.UUID";
public static final int BOND_BONDED = 12;
public static final int BOND_BONDING = 11;
public static final int BOND_NONE = 10;
public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothDevice> CREATOR;
public static final int DEVICE_TYPE_CLASSIC = 1;
public static final int DEVICE_TYPE_DUAL = 3;
public static final int DEVICE_TYPE_LE = 2;
public static final int DEVICE_TYPE_UNKNOWN = 0;
public static final int ERROR = -2147483648;
public static final java.lang.String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";
public static final java.lang.String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";
public static final java.lang.String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
public static final java.lang.String EXTRA_NAME = "android.bluetooth.device.extra.NAME";
public static final java.lang.String EXTRA_PAIRING_KEY = "android.bluetooth.device.extra.PAIRING_KEY";
public static final java.lang.String EXTRA_PAIRING_VARIANT = "android.bluetooth.device.extra.PAIRING_VARIANT";
public static final java.lang.String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";
public static final java.lang.String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";
public static final java.lang.String EXTRA_UUID = "android.bluetooth.device.extra.UUID";
public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;
public static final int PAIRING_VARIANT_PIN = 0;
public static final int PHY_LE_1M = 1;
public static final int PHY_LE_1M_MASK = 1;
public static final int PHY_LE_2M = 2;
public static final int PHY_LE_2M_MASK = 2;
public static final int PHY_LE_CODED = 3;
public static final int PHY_LE_CODED_MASK = 4;
public static final int PHY_OPTION_NO_PREFERRED = 0;
public static final int PHY_OPTION_S2 = 1;
public static final int PHY_OPTION_S8 = 2;
public static final int TRANSPORT_AUTO = 0;
public static final int TRANSPORT_BREDR = 1;
public static final int TRANSPORT_LE = 2;
static { CREATOR = null; }
}
