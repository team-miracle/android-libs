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
* limitations under the License
*/

package android.location;
public final class GnssClock
  implements android.os.Parcelable
{
GnssClock() { throw new RuntimeException("Stub!"); }
public  boolean hasLeapSecond() { throw new RuntimeException("Stub!"); }
public  int getLeapSecond() { throw new RuntimeException("Stub!"); }
public  long getTimeNanos() { throw new RuntimeException("Stub!"); }
public  boolean hasTimeUncertaintyNanos() { throw new RuntimeException("Stub!"); }
public  double getTimeUncertaintyNanos() { throw new RuntimeException("Stub!"); }
public  boolean hasFullBiasNanos() { throw new RuntimeException("Stub!"); }
public  long getFullBiasNanos() { throw new RuntimeException("Stub!"); }
public  boolean hasBiasNanos() { throw new RuntimeException("Stub!"); }
public  double getBiasNanos() { throw new RuntimeException("Stub!"); }
public  boolean hasBiasUncertaintyNanos() { throw new RuntimeException("Stub!"); }
public  double getBiasUncertaintyNanos() { throw new RuntimeException("Stub!"); }
public  boolean hasDriftNanosPerSecond() { throw new RuntimeException("Stub!"); }
public  double getDriftNanosPerSecond() { throw new RuntimeException("Stub!"); }
public  boolean hasDriftUncertaintyNanosPerSecond() { throw new RuntimeException("Stub!"); }
public  double getDriftUncertaintyNanosPerSecond() { throw new RuntimeException("Stub!"); }
public  int getHardwareClockDiscontinuityCount() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.GnssClock> CREATOR;
static { CREATOR = null; }
}
