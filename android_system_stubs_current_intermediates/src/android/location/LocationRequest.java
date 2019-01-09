/*
* Copyright (C) 2012 The Android Open Source Project
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

package android.location;
public final class LocationRequest
  implements android.os.Parcelable
{
LocationRequest() { throw new RuntimeException("Stub!"); }
public static  android.location.LocationRequest create() { throw new RuntimeException("Stub!"); }
public static  android.location.LocationRequest createFromDeprecatedProvider(java.lang.String provider, long minTime, float minDistance, boolean singleShot) { throw new RuntimeException("Stub!"); }
public static  android.location.LocationRequest createFromDeprecatedCriteria(android.location.Criteria criteria, long minTime, float minDistance, boolean singleShot) { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setQuality(int quality) { throw new RuntimeException("Stub!"); }
public  int getQuality() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setInterval(long millis) { throw new RuntimeException("Stub!"); }
public  long getInterval() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setLowPowerMode(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isLowPowerMode() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setFastestInterval(long millis) { throw new RuntimeException("Stub!"); }
public  long getFastestInterval() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setExpireIn(long millis) { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setExpireAt(long millis) { throw new RuntimeException("Stub!"); }
public  long getExpireAt() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setNumUpdates(int numUpdates) { throw new RuntimeException("Stub!"); }
public  int getNumUpdates() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setProvider(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  java.lang.String getProvider() { throw new RuntimeException("Stub!"); }
public  android.location.LocationRequest setSmallestDisplacement(float meters) { throw new RuntimeException("Stub!"); }
public  float getSmallestDisplacement() { throw new RuntimeException("Stub!"); }
public  void setWorkSource(android.os.WorkSource workSource) { throw new RuntimeException("Stub!"); }
public  android.os.WorkSource getWorkSource() { throw new RuntimeException("Stub!"); }
public  void setHideFromAppOps(boolean hideFromAppOps) { throw new RuntimeException("Stub!"); }
public  boolean getHideFromAppOps() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ACCURACY_BLOCK = 102;
public static final int ACCURACY_CITY = 104;
public static final int ACCURACY_FINE = 100;
public static final android.os.Parcelable.Creator<android.location.LocationRequest> CREATOR;
public static final int POWER_HIGH = 203;
public static final int POWER_LOW = 201;
public static final int POWER_NONE = 200;
static { CREATOR = null; }
}
