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
public final class BluetoothHidDeviceAppQosSettings
  implements android.os.Parcelable
{
public  BluetoothHidDeviceAppQosSettings(int serviceType, int tokenRate, int tokenBucketSize, int peakBandwidth, int latency, int delayVariation) { throw new RuntimeException("Stub!"); }
public  int getServiceType() { throw new RuntimeException("Stub!"); }
public  int getTokenRate() { throw new RuntimeException("Stub!"); }
public  int getTokenBucketSize() { throw new RuntimeException("Stub!"); }
public  int getPeakBandwidth() { throw new RuntimeException("Stub!"); }
public  int getLatency() { throw new RuntimeException("Stub!"); }
public  int getDelayVariation() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothHidDeviceAppQosSettings> CREATOR;
public static final int MAX = -1;
public static final int SERVICE_BEST_EFFORT = 1;
public static final int SERVICE_GUARANTEED = 2;
public static final int SERVICE_NO_TRAFFIC = 0;
static { CREATOR = null; }
}
