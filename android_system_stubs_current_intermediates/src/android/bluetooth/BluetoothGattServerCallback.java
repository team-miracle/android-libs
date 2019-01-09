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
public abstract class BluetoothGattServerCallback
{
public  BluetoothGattServerCallback() { throw new RuntimeException("Stub!"); }
public  void onConnectionStateChange(android.bluetooth.BluetoothDevice device, int status, int newState) { throw new RuntimeException("Stub!"); }
public  void onServiceAdded(int status, android.bluetooth.BluetoothGattService service) { throw new RuntimeException("Stub!"); }
public  void onCharacteristicReadRequest(android.bluetooth.BluetoothDevice device, int requestId, int offset, android.bluetooth.BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
public  void onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice device, int requestId, android.bluetooth.BluetoothGattCharacteristic characteristic, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) { throw new RuntimeException("Stub!"); }
public  void onDescriptorReadRequest(android.bluetooth.BluetoothDevice device, int requestId, int offset, android.bluetooth.BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  void onDescriptorWriteRequest(android.bluetooth.BluetoothDevice device, int requestId, android.bluetooth.BluetoothGattDescriptor descriptor, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) { throw new RuntimeException("Stub!"); }
public  void onExecuteWrite(android.bluetooth.BluetoothDevice device, int requestId, boolean execute) { throw new RuntimeException("Stub!"); }
public  void onNotificationSent(android.bluetooth.BluetoothDevice device, int status) { throw new RuntimeException("Stub!"); }
public  void onMtuChanged(android.bluetooth.BluetoothDevice device, int mtu) { throw new RuntimeException("Stub!"); }
public  void onPhyUpdate(android.bluetooth.BluetoothDevice device, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
public  void onPhyRead(android.bluetooth.BluetoothDevice device, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
}
