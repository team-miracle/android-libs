/*
* Copyright 2009-2016 The Android Open Source Project
* Copyright 2015 Samsung LSI
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
public final class BluetoothAdapter
{
public static interface LeScanCallback
{
public abstract  void onLeScan(android.bluetooth.BluetoothDevice device, int rssi, byte[] scanRecord);
}
BluetoothAdapter() { throw new RuntimeException("Stub!"); }
public static synchronized  android.bluetooth.BluetoothAdapter getDefaultAdapter() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String address) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothDevice getRemoteDevice(byte[] address) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isLeEnabled() { throw new RuntimeException("Stub!"); }
public  boolean disableBLE() { throw new RuntimeException("Stub!"); }
public  boolean enableBLE() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  boolean enable() { throw new RuntimeException("Stub!"); }
public  boolean disable() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  boolean setName(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int getScanMode() { throw new RuntimeException("Stub!"); }
public  boolean startDiscovery() { throw new RuntimeException("Stub!"); }
public  boolean cancelDiscovery() { throw new RuntimeException("Stub!"); }
public  boolean isDiscovering() { throw new RuntimeException("Stub!"); }
public  boolean isMultipleAdvertisementSupported() { throw new RuntimeException("Stub!"); }
public  boolean isBleScanAlwaysAvailable() { throw new RuntimeException("Stub!"); }
public  boolean isOffloadedFilteringSupported() { throw new RuntimeException("Stub!"); }
public  boolean isOffloadedScanBatchingSupported() { throw new RuntimeException("Stub!"); }
public  boolean isLe2MPhySupported() { throw new RuntimeException("Stub!"); }
public  boolean isLeCodedPhySupported() { throw new RuntimeException("Stub!"); }
public  boolean isLeExtendedAdvertisingSupported() { throw new RuntimeException("Stub!"); }
public  boolean isLePeriodicAdvertisingSupported() { throw new RuntimeException("Stub!"); }
public  int getLeMaximumAdvertisingDataLength() { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.bluetooth.BluetoothDevice> getBondedDevices() { throw new RuntimeException("Stub!"); }
public  int getProfileConnectionState(int profile) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String name, java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String name, java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean getProfileProxy(android.content.Context context, android.bluetooth.BluetoothProfile.ServiceListener listener, int profile) { throw new RuntimeException("Stub!"); }
public  void closeProfileProxy(int profile, android.bluetooth.BluetoothProfile proxy) { throw new RuntimeException("Stub!"); }
public  boolean enableNoAutoConnect() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static  boolean checkBluetoothAddress(java.lang.String address) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean startLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean startLeScan(java.util.UUID[] serviceUuids, android.bluetooth.BluetoothAdapter.LeScanCallback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void stopLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback callback) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_BLE_STATE_CHANGED = "android.bluetooth.adapter.action.BLE_STATE_CHANGED";
public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
public static final java.lang.String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
public static final java.lang.String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
public static final java.lang.String ACTION_REQUEST_BLE_SCAN_ALWAYS_AVAILABLE = "android.bluetooth.adapter.action.REQUEST_BLE_SCAN_ALWAYS_AVAILABLE";
public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
public static final java.lang.String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
public static final java.lang.String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
public static final java.lang.String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
public static final int ERROR = -2147483648;
public static final java.lang.String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
public static final java.lang.String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
public static final java.lang.String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
public static final java.lang.String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
public static final java.lang.String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
public static final java.lang.String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
public static final int SCAN_MODE_CONNECTABLE = 21;
public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
public static final int SCAN_MODE_NONE = 20;
public static final int STATE_CONNECTED = 2;
public static final int STATE_CONNECTING = 1;
public static final int STATE_DISCONNECTED = 0;
public static final int STATE_DISCONNECTING = 3;
public static final int STATE_OFF = 10;
public static final int STATE_ON = 12;
public static final int STATE_TURNING_OFF = 13;
public static final int STATE_TURNING_ON = 11;
}
