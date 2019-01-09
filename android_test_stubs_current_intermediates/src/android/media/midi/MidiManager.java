/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.media.midi;
public final class MidiManager
{
public static class DeviceCallback
{
public  DeviceCallback() { throw new RuntimeException("Stub!"); }
public  void onDeviceAdded(android.media.midi.MidiDeviceInfo device) { throw new RuntimeException("Stub!"); }
public  void onDeviceRemoved(android.media.midi.MidiDeviceInfo device) { throw new RuntimeException("Stub!"); }
public  void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus status) { throw new RuntimeException("Stub!"); }
}
public static interface OnDeviceOpenedListener
{
public abstract  void onDeviceOpened(android.media.midi.MidiDevice device);
}
MidiManager() { throw new RuntimeException("Stub!"); }
public  void registerDeviceCallback(android.media.midi.MidiManager.DeviceCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterDeviceCallback(android.media.midi.MidiManager.DeviceCallback callback) { throw new RuntimeException("Stub!"); }
public  android.media.midi.MidiDeviceInfo[] getDevices() { throw new RuntimeException("Stub!"); }
public  void openDevice(android.media.midi.MidiDeviceInfo deviceInfo, android.media.midi.MidiManager.OnDeviceOpenedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void openBluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice, android.media.midi.MidiManager.OnDeviceOpenedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
}
