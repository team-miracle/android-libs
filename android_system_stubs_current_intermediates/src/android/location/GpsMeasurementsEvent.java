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
public class GpsMeasurementsEvent
  implements android.os.Parcelable
{
public static interface Listener
{
public abstract  void onGpsMeasurementsReceived(android.location.GpsMeasurementsEvent eventArgs);
public abstract  void onStatusChanged(int status);
}
public  GpsMeasurementsEvent(android.location.GpsClock clock, android.location.GpsMeasurement[] measurements) { throw new RuntimeException("Stub!"); }
public  android.location.GpsClock getClock() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<android.location.GpsMeasurement> getMeasurements() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.GpsMeasurementsEvent> CREATOR;
public static final int STATUS_GPS_LOCATION_DISABLED = 2;
public static final int STATUS_NOT_SUPPORTED = 0;
public static final int STATUS_READY = 1;
static { CREATOR = null; }
}
