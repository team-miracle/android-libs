/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.bluetooth.le;
public final class BluetoothLeScanner
{
BluetoothLeScanner() { throw new RuntimeException("Stub!"); }
public  void startScan(android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public  void startScan(java.util.List<android.bluetooth.le.ScanFilter> filters, android.bluetooth.le.ScanSettings settings, android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public  int startScan(java.util.List<android.bluetooth.le.ScanFilter> filters, android.bluetooth.le.ScanSettings settings, android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void startScanFromSource(android.os.WorkSource workSource, android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public  void startScanFromSource(java.util.List<android.bluetooth.le.ScanFilter> filters, android.bluetooth.le.ScanSettings settings, android.os.WorkSource workSource, android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public  void stopScan(android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public  void stopScan(android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void flushPendingScanResults(android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public  void startTruncatedScan(java.util.List<android.bluetooth.le.TruncatedFilter> truncatedFilters, android.bluetooth.le.ScanSettings settings, android.bluetooth.le.ScanCallback callback) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_CALLBACK_TYPE = "android.bluetooth.le.extra.CALLBACK_TYPE";
public static final java.lang.String EXTRA_ERROR_CODE = "android.bluetooth.le.extra.ERROR_CODE";
public static final java.lang.String EXTRA_LIST_SCAN_RESULT = "android.bluetooth.le.extra.LIST_SCAN_RESULT";
}
