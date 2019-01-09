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
public final class GnssMeasurementsEvent
  implements android.os.Parcelable
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent eventArgs) { throw new RuntimeException("Stub!"); }
public  void onStatusChanged(int status) { throw new RuntimeException("Stub!"); }
public static final int STATUS_LOCATION_DISABLED = 2;
public static final int STATUS_NOT_ALLOWED = 3;
public static final int STATUS_NOT_SUPPORTED = 0;
public static final int STATUS_READY = 1;
}
public  GnssMeasurementsEvent(android.location.GnssClock clock, android.location.GnssMeasurement[] measurements) { throw new RuntimeException("Stub!"); }
public  android.location.GnssClock getClock() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<android.location.GnssMeasurement> getMeasurements() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.GnssMeasurementsEvent> CREATOR;
static { CREATOR = null; }
}
