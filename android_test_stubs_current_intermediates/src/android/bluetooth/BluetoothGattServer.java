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
public final class BluetoothGattServer
  implements android.bluetooth.BluetoothProfile
{
BluetoothGattServer() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean connect(android.bluetooth.BluetoothDevice device, boolean autoConnect) { throw new RuntimeException("Stub!"); }
public  void cancelConnection(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  void setPreferredPhy(android.bluetooth.BluetoothDevice device, int txPhy, int rxPhy, int phyOptions) { throw new RuntimeException("Stub!"); }
public  void readPhy(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  boolean sendResponse(android.bluetooth.BluetoothDevice device, int requestId, int status, int offset, byte[] value) { throw new RuntimeException("Stub!"); }
public  boolean notifyCharacteristicChanged(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothGattCharacteristic characteristic, boolean confirm) { throw new RuntimeException("Stub!"); }
public  boolean addService(android.bluetooth.BluetoothGattService service) { throw new RuntimeException("Stub!"); }
public  boolean removeService(android.bluetooth.BluetoothGattService service) { throw new RuntimeException("Stub!"); }
public  void clearServices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothGattService> getServices() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGattService getService(java.util.UUID uuid) { throw new RuntimeException("Stub!"); }
public  int getConnectionState(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
}
