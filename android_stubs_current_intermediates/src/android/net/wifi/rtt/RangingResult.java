/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.net.wifi.rtt;
public final class RangingResult
  implements android.os.Parcelable
{
RangingResult() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  android.net.MacAddress getMacAddress() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.PeerHandle getPeerHandle() { throw new RuntimeException("Stub!"); }
public  int getDistanceMm() { throw new RuntimeException("Stub!"); }
public  int getDistanceStdDevMm() { throw new RuntimeException("Stub!"); }
public  int getRssi() { throw new RuntimeException("Stub!"); }
public  int getNumAttemptedMeasurements() { throw new RuntimeException("Stub!"); }
public  int getNumSuccessfulMeasurements() { throw new RuntimeException("Stub!"); }
public  long getRangingTimestampMillis() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingResult> CREATOR;
public static final int STATUS_FAIL = 1;
public static final int STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC = 2;
public static final int STATUS_SUCCESS = 0;
static { CREATOR = null; }
}
