/*
* Copyright (C) 2010-2016 The Android Open Source Project
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
public interface BluetoothProfile
{
public static interface ServiceListener
{
public abstract  void onServiceConnected(int profile, android.bluetooth.BluetoothProfile proxy);
public abstract  void onServiceDisconnected(int profile);
}
public abstract  java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices();
public abstract  java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states);
public abstract  int getConnectionState(android.bluetooth.BluetoothDevice device);
public static final int A2DP = 2;
public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.profile.extra.PREVIOUS_STATE";
public static final java.lang.String EXTRA_STATE = "android.bluetooth.profile.extra.STATE";
public static final int GATT = 7;
public static final int GATT_SERVER = 8;
public static final int HEADSET = 1;
public static final int HEALTH = 3;
public static final int HID_DEVICE = 19;
public static final int PRIORITY_OFF = 0;
public static final int PRIORITY_ON = 100;
public static final int SAP = 10;
public static final int STATE_CONNECTED = 2;
public static final int STATE_CONNECTING = 1;
public static final int STATE_DISCONNECTED = 0;
public static final int STATE_DISCONNECTING = 3;
}
