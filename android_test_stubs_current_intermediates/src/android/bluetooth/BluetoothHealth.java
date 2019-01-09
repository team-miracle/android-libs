/*
* Copyright (C) 2011 The Android Open Source Project
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
public final class BluetoothHealth
  implements android.bluetooth.BluetoothProfile
{
BluetoothHealth() { throw new RuntimeException("Stub!"); }
public  boolean registerSinkAppConfiguration(java.lang.String name, int dataType, android.bluetooth.BluetoothHealthCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean unregisterAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); }
public  boolean connectChannelToSource(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); }
public  boolean disconnectChannel(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config, int channelId) { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor getMainChannelFd(android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); }
public  int getConnectionState(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
public static final int APP_CONFIG_REGISTRATION_FAILURE = 1;
public static final int APP_CONFIG_REGISTRATION_SUCCESS = 0;
public static final int APP_CONFIG_UNREGISTRATION_FAILURE = 3;
public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = 2;
public static final int CHANNEL_TYPE_RELIABLE = 10;
public static final int CHANNEL_TYPE_STREAMING = 11;
public static final int SINK_ROLE = 2;
public static final int SOURCE_ROLE = 1;
public static final int STATE_CHANNEL_CONNECTED = 2;
public static final int STATE_CHANNEL_CONNECTING = 1;
public static final int STATE_CHANNEL_DISCONNECTED = 0;
public static final int STATE_CHANNEL_DISCONNECTING = 3;
}
