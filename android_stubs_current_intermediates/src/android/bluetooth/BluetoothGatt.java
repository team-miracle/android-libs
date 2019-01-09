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
public final class BluetoothGatt
  implements android.bluetooth.BluetoothProfile
{
BluetoothGatt() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public  boolean connect() { throw new RuntimeException("Stub!"); }
public  void setPreferredPhy(int txPhy, int rxPhy, int phyOptions) { throw new RuntimeException("Stub!"); }
public  void readPhy() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothDevice getDevice() { throw new RuntimeException("Stub!"); }
public  boolean discoverServices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothGattService> getServices() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGattService getService(java.util.UUID uuid) { throw new RuntimeException("Stub!"); }
public  boolean readCharacteristic(android.bluetooth.BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
public  boolean writeCharacteristic(android.bluetooth.BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
public  boolean readDescriptor(android.bluetooth.BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  boolean writeDescriptor(android.bluetooth.BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  boolean beginReliableWrite() { throw new RuntimeException("Stub!"); }
public  boolean executeReliableWrite() { throw new RuntimeException("Stub!"); }
public  void abortReliableWrite() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void abortReliableWrite(android.bluetooth.BluetoothDevice mDevice) { throw new RuntimeException("Stub!"); }
public  boolean setCharacteristicNotification(android.bluetooth.BluetoothGattCharacteristic characteristic, boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean readRemoteRssi() { throw new RuntimeException("Stub!"); }
public  boolean requestMtu(int mtu) { throw new RuntimeException("Stub!"); }
public  boolean requestConnectionPriority(int connectionPriority) { throw new RuntimeException("Stub!"); }
public  int getConnectionState(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
public static final int CONNECTION_PRIORITY_BALANCED = 0;
public static final int CONNECTION_PRIORITY_HIGH = 1;
public static final int CONNECTION_PRIORITY_LOW_POWER = 2;
public static final int GATT_CONNECTION_CONGESTED = 143;
public static final int GATT_FAILURE = 257;
public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 13;
public static final int GATT_INVALID_OFFSET = 7;
public static final int GATT_READ_NOT_PERMITTED = 2;
public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
public static final int GATT_SUCCESS = 0;
public static final int GATT_WRITE_NOT_PERMITTED = 3;
}
