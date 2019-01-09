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

package android.bluetooth;
public abstract class BluetoothGattCallback
{
public  BluetoothGattCallback() { throw new RuntimeException("Stub!"); }
public  void onPhyUpdate(android.bluetooth.BluetoothGatt gatt, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
public  void onPhyRead(android.bluetooth.BluetoothGatt gatt, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
public  void onConnectionStateChange(android.bluetooth.BluetoothGatt gatt, int status, int newState) { throw new RuntimeException("Stub!"); }
public  void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) { throw new RuntimeException("Stub!"); }
public  void onCharacteristicRead(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) { throw new RuntimeException("Stub!"); }
public  void onCharacteristicWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) { throw new RuntimeException("Stub!"); }
public  void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
public  void onDescriptorRead(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattDescriptor descriptor, int status) { throw new RuntimeException("Stub!"); }
public  void onDescriptorWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattDescriptor descriptor, int status) { throw new RuntimeException("Stub!"); }
public  void onReliableWriteCompleted(android.bluetooth.BluetoothGatt gatt, int status) { throw new RuntimeException("Stub!"); }
public  void onReadRemoteRssi(android.bluetooth.BluetoothGatt gatt, int rssi, int status) { throw new RuntimeException("Stub!"); }
public  void onMtuChanged(android.bluetooth.BluetoothGatt gatt, int mtu, int status) { throw new RuntimeException("Stub!"); }
}
