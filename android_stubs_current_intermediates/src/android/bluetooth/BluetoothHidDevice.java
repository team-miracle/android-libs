/*
* Copyright (C) 2016 The Android Open Source Project
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
public final class BluetoothHidDevice
  implements android.bluetooth.BluetoothProfile
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onAppStatusChanged(android.bluetooth.BluetoothDevice pluggedDevice, boolean registered) { throw new RuntimeException("Stub!"); }
public  void onConnectionStateChanged(android.bluetooth.BluetoothDevice device, int state) { throw new RuntimeException("Stub!"); }
public  void onGetReport(android.bluetooth.BluetoothDevice device, byte type, byte id, int bufferSize) { throw new RuntimeException("Stub!"); }
public  void onSetReport(android.bluetooth.BluetoothDevice device, byte type, byte id, byte[] data) { throw new RuntimeException("Stub!"); }
public  void onSetProtocol(android.bluetooth.BluetoothDevice device, byte protocol) { throw new RuntimeException("Stub!"); }
public  void onInterruptData(android.bluetooth.BluetoothDevice device, byte reportId, byte[] data) { throw new RuntimeException("Stub!"); }
public  void onVirtualCableUnplug(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
}
BluetoothHidDevice() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
public  int getConnectionState(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  boolean registerApp(android.bluetooth.BluetoothHidDeviceAppSdpSettings sdp, android.bluetooth.BluetoothHidDeviceAppQosSettings inQos, android.bluetooth.BluetoothHidDeviceAppQosSettings outQos, java.util.concurrent.Executor executor, android.bluetooth.BluetoothHidDevice.Callback callback) { throw new RuntimeException("Stub!"); }
public  boolean unregisterApp() { throw new RuntimeException("Stub!"); }
public  boolean sendReport(android.bluetooth.BluetoothDevice device, int id, byte[] data) { throw new RuntimeException("Stub!"); }
public  boolean replyReport(android.bluetooth.BluetoothDevice device, byte type, byte id, byte[] data) { throw new RuntimeException("Stub!"); }
public  boolean reportError(android.bluetooth.BluetoothDevice device, byte error) { throw new RuntimeException("Stub!"); }
public  boolean connect(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public  boolean disconnect(android.bluetooth.BluetoothDevice device) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hiddevice.profile.action.CONNECTION_STATE_CHANGED";
public static final byte ERROR_RSP_INVALID_PARAM = 4;
public static final byte ERROR_RSP_INVALID_RPT_ID = 2;
public static final byte ERROR_RSP_NOT_READY = 1;
public static final byte ERROR_RSP_SUCCESS = 0;
public static final byte ERROR_RSP_UNKNOWN = 14;
public static final byte ERROR_RSP_UNSUPPORTED_REQ = 3;
public static final byte PROTOCOL_BOOT_MODE = 0;
public static final byte PROTOCOL_REPORT_MODE = 1;
public static final byte REPORT_TYPE_FEATURE = 3;
public static final byte REPORT_TYPE_INPUT = 1;
public static final byte REPORT_TYPE_OUTPUT = 2;
public static final byte SUBCLASS1_COMBO = -64;
public static final byte SUBCLASS1_KEYBOARD = 64;
public static final byte SUBCLASS1_MOUSE = -128;
public static final byte SUBCLASS1_NONE = 0;
public static final byte SUBCLASS2_CARD_READER = 6;
public static final byte SUBCLASS2_DIGITIZER_TABLET = 5;
public static final byte SUBCLASS2_GAMEPAD = 2;
public static final byte SUBCLASS2_JOYSTICK = 1;
public static final byte SUBCLASS2_REMOTE_CONTROL = 3;
public static final byte SUBCLASS2_SENSING_DEVICE = 4;
public static final byte SUBCLASS2_UNCATEGORIZED = 0;
}
