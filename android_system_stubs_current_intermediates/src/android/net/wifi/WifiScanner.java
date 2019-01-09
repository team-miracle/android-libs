/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.net.wifi;
public class WifiScanner
{
public static interface ActionListener
{
public abstract  void onSuccess();
public abstract  void onFailure(int reason, java.lang.String description);
}
public static class ChannelSpec
{
public  ChannelSpec(int frequency) { throw new RuntimeException("Stub!"); }
public int frequency;
}
public static class ScanSettings
  implements android.os.Parcelable
{
public  ScanSettings() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public int band;
public android.net.wifi.WifiScanner.ChannelSpec[] channels = null;
public int maxPeriodInMs;
public int maxScansToCache;
public int numBssidsPerScan;
public int periodInMs;
public int reportEvents;
public int stepCount;
}
public static class ScanData
  implements android.os.Parcelable
{
public  ScanData(int id, int flags, android.net.wifi.ScanResult[] results) { throw new RuntimeException("Stub!"); }
public  ScanData(android.net.wifi.WifiScanner.ScanData s) { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.ScanResult[] getResults() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
}
public static class ParcelableScanData
  implements android.os.Parcelable
{
public  ParcelableScanData(android.net.wifi.WifiScanner.ScanData[] results) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.WifiScanner.ScanData[] getResults() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public android.net.wifi.WifiScanner.ScanData[] mResults = null;
}
public static class ParcelableScanResults
  implements android.os.Parcelable
{
public  ParcelableScanResults(android.net.wifi.ScanResult[] results) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.ScanResult[] getResults() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public android.net.wifi.ScanResult[] mResults = null;
}
public static interface ScanListener
  extends android.net.wifi.WifiScanner.ActionListener
{
public abstract  void onPeriodChanged(int periodInMs);
public abstract  void onResults(android.net.wifi.WifiScanner.ScanData[] results);
public abstract  void onFullResult(android.net.wifi.ScanResult fullScanResult);
}
@java.lang.Deprecated()
public static class BssidInfo
{
public  BssidInfo() { throw new RuntimeException("Stub!"); }
public java.lang.String bssid;
public int frequencyHint;
public int high;
public int low;
}
@java.lang.Deprecated()
public static class WifiChangeSettings
  implements android.os.Parcelable
{
public  WifiChangeSettings() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public android.net.wifi.WifiScanner.BssidInfo[] bssidInfos = null;
public int lostApSampleSize;
public int minApsBreachingThreshold;
public int periodInMs;
public int rssiSampleSize;
public int unchangedSampleSize;
}
@java.lang.Deprecated()
public static interface WifiChangeListener
  extends android.net.wifi.WifiScanner.ActionListener
{
public abstract  void onChanging(android.net.wifi.ScanResult[] results);
public abstract  void onQuiescence(android.net.wifi.ScanResult[] results);
}
@java.lang.Deprecated()
public static interface BssidListener
  extends android.net.wifi.WifiScanner.ActionListener
{
public abstract  void onFound(android.net.wifi.ScanResult[] results);
public abstract  void onLost(android.net.wifi.ScanResult[] results);
}
@java.lang.Deprecated()
public static class HotlistSettings
  implements android.os.Parcelable
{
public  HotlistSettings() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public int apLostThreshold;
public android.net.wifi.WifiScanner.BssidInfo[] bssidInfos = null;
}
WifiScanner() { throw new RuntimeException("Stub!"); }
public  void startBackgroundScan(android.net.wifi.WifiScanner.ScanSettings settings, android.net.wifi.WifiScanner.ScanListener listener) { throw new RuntimeException("Stub!"); }
public  void startBackgroundScan(android.net.wifi.WifiScanner.ScanSettings settings, android.net.wifi.WifiScanner.ScanListener listener, android.os.WorkSource workSource) { throw new RuntimeException("Stub!"); }
public  void stopBackgroundScan(android.net.wifi.WifiScanner.ScanListener listener) { throw new RuntimeException("Stub!"); }
public  boolean getScanResults() { throw new RuntimeException("Stub!"); }
public  void startScan(android.net.wifi.WifiScanner.ScanSettings settings, android.net.wifi.WifiScanner.ScanListener listener) { throw new RuntimeException("Stub!"); }
public  void startScan(android.net.wifi.WifiScanner.ScanSettings settings, android.net.wifi.WifiScanner.ScanListener listener, android.os.WorkSource workSource) { throw new RuntimeException("Stub!"); }
public  void stopScan(android.net.wifi.WifiScanner.ScanListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  void configureWifiChange(int rssiSampleSize, int lostApSampleSize, int unchangedSampleSize, int minApsBreachingThreshold, int periodInMs, android.net.wifi.WifiScanner.BssidInfo[] bssidInfos) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  void startTrackingWifiChange(android.net.wifi.WifiScanner.WifiChangeListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  void stopTrackingWifiChange(android.net.wifi.WifiScanner.WifiChangeListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  void configureWifiChange(android.net.wifi.WifiScanner.WifiChangeSettings settings) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  void startTrackingBssids(android.net.wifi.WifiScanner.BssidInfo[] bssidInfos, int apLostThreshold, android.net.wifi.WifiScanner.BssidListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  void stopTrackingBssids(android.net.wifi.WifiScanner.BssidListener listener) { throw new RuntimeException("Stub!"); }
public static final int MAX_SCAN_PERIOD_MS = 1024000;
public static final int MIN_SCAN_PERIOD_MS = 1000;
public static final int REASON_DUPLICATE_REQEUST = -5;
public static final int REASON_INVALID_LISTENER = -2;
public static final int REASON_INVALID_REQUEST = -3;
public static final int REASON_NOT_AUTHORIZED = -4;
public static final int REASON_SUCCEEDED = 0;
public static final int REASON_UNSPECIFIED = -1;
@java.lang.Deprecated()
public static final int REPORT_EVENT_AFTER_BUFFER_FULL = 0;
public static final int REPORT_EVENT_AFTER_EACH_SCAN = 1;
public static final int REPORT_EVENT_FULL_SCAN_RESULT = 2;
public static final int REPORT_EVENT_NO_BATCH = 4;
public static final int WIFI_BAND_24_GHZ = 1;
public static final int WIFI_BAND_5_GHZ = 2;
public static final int WIFI_BAND_5_GHZ_DFS_ONLY = 4;
public static final int WIFI_BAND_5_GHZ_WITH_DFS = 6;
public static final int WIFI_BAND_BOTH = 3;
public static final int WIFI_BAND_BOTH_WITH_DFS = 7;
public static final int WIFI_BAND_UNSPECIFIED = 0;
}
