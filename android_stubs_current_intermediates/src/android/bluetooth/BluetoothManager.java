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
public final class BluetoothManager
{
BluetoothManager() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public  int getConnectionState(android.bluetooth.BluetoothDevice device, int profile) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(int profile) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int profile, int[] states) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothGattServer openGattServer(android.content.Context context, android.bluetooth.BluetoothGattServerCallback callback) { throw new RuntimeException("Stub!"); }
}
