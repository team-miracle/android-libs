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

package android.bluetooth.le;
public final class ScanSettings
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setScanMode(int scanMode) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setCallbackType(int callbackType) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setReportDelay(long reportDelayMillis) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setNumOfMatches(int numOfMatches) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setMatchMode(int matchMode) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setLegacy(boolean legacy) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings.Builder setPhy(int phy) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.ScanSettings build() { throw new RuntimeException("Stub!"); }
}
ScanSettings() { throw new RuntimeException("Stub!"); }
public  int getScanMode() { throw new RuntimeException("Stub!"); }
public  int getCallbackType() { throw new RuntimeException("Stub!"); }
public  int getScanResultType() { throw new RuntimeException("Stub!"); }
public  boolean getLegacy() { throw new RuntimeException("Stub!"); }
public  int getPhy() { throw new RuntimeException("Stub!"); }
public  long getReportDelayMillis() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final int CALLBACK_TYPE_ALL_MATCHES = 1;
public static final int CALLBACK_TYPE_FIRST_MATCH = 2;
public static final int CALLBACK_TYPE_MATCH_LOST = 4;
public static final android.os.Parcelable.Creator<android.bluetooth.le.ScanSettings> CREATOR;
public static final int MATCH_MODE_AGGRESSIVE = 1;
public static final int MATCH_MODE_STICKY = 2;
public static final int MATCH_NUM_FEW_ADVERTISEMENT = 2;
public static final int MATCH_NUM_MAX_ADVERTISEMENT = 3;
public static final int MATCH_NUM_ONE_ADVERTISEMENT = 1;
public static final int PHY_LE_ALL_SUPPORTED = 255;
public static final int SCAN_MODE_BALANCED = 1;
public static final int SCAN_MODE_LOW_LATENCY = 2;
public static final int SCAN_MODE_LOW_POWER = 0;
public static final int SCAN_MODE_OPPORTUNISTIC = -1;
static { CREATOR = null; }
}
