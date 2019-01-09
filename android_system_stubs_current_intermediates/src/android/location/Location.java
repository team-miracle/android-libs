/*
* Copyright (C) 2007 The Android Open Source Project
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
public class Location
  implements android.os.Parcelable
{
public  Location(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  Location(android.location.Location l) { throw new RuntimeException("Stub!"); }
public  void set(android.location.Location l) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public static  java.lang.String convert(double coordinate, int outputType) { throw new RuntimeException("Stub!"); }
public static  double convert(java.lang.String coordinate) { throw new RuntimeException("Stub!"); }
public static  void distanceBetween(double startLatitude, double startLongitude, double endLatitude, double endLongitude, float[] results) { throw new RuntimeException("Stub!"); }
public  float distanceTo(android.location.Location dest) { throw new RuntimeException("Stub!"); }
public  float bearingTo(android.location.Location dest) { throw new RuntimeException("Stub!"); }
public  java.lang.String getProvider() { throw new RuntimeException("Stub!"); }
public  void setProvider(java.lang.String provider) { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public  void setTime(long time) { throw new RuntimeException("Stub!"); }
public  long getElapsedRealtimeNanos() { throw new RuntimeException("Stub!"); }
public  void setElapsedRealtimeNanos(long time) { throw new RuntimeException("Stub!"); }
public  double getLatitude() { throw new RuntimeException("Stub!"); }
public  void setLatitude(double latitude) { throw new RuntimeException("Stub!"); }
public  double getLongitude() { throw new RuntimeException("Stub!"); }
public  void setLongitude(double longitude) { throw new RuntimeException("Stub!"); }
public  boolean hasAltitude() { throw new RuntimeException("Stub!"); }
public  double getAltitude() { throw new RuntimeException("Stub!"); }
public  void setAltitude(double altitude) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeAltitude() { throw new RuntimeException("Stub!"); }
public  boolean hasSpeed() { throw new RuntimeException("Stub!"); }
public  float getSpeed() { throw new RuntimeException("Stub!"); }
public  void setSpeed(float speed) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeSpeed() { throw new RuntimeException("Stub!"); }
public  boolean hasBearing() { throw new RuntimeException("Stub!"); }
public  float getBearing() { throw new RuntimeException("Stub!"); }
public  void setBearing(float bearing) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeBearing() { throw new RuntimeException("Stub!"); }
public  boolean hasAccuracy() { throw new RuntimeException("Stub!"); }
public  float getAccuracy() { throw new RuntimeException("Stub!"); }
public  void setAccuracy(float horizontalAccuracy) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeAccuracy() { throw new RuntimeException("Stub!"); }
public  boolean hasVerticalAccuracy() { throw new RuntimeException("Stub!"); }
public  float getVerticalAccuracyMeters() { throw new RuntimeException("Stub!"); }
public  void setVerticalAccuracyMeters(float verticalAccuracyMeters) { throw new RuntimeException("Stub!"); }
public  boolean hasSpeedAccuracy() { throw new RuntimeException("Stub!"); }
public  float getSpeedAccuracyMetersPerSecond() { throw new RuntimeException("Stub!"); }
public  void setSpeedAccuracyMetersPerSecond(float speedAccuracyMeterPerSecond) { throw new RuntimeException("Stub!"); }
public  boolean hasBearingAccuracy() { throw new RuntimeException("Stub!"); }
public  float getBearingAccuracyDegrees() { throw new RuntimeException("Stub!"); }
public  void setBearingAccuracyDegrees(float bearingAccuracyDegrees) { throw new RuntimeException("Stub!"); }
public  boolean isComplete() { throw new RuntimeException("Stub!"); }
public  void makeComplete() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  boolean isFromMockProvider() { throw new RuntimeException("Stub!"); }
public  void setIsFromMockProvider(boolean isFromMockProvider) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.Location> CREATOR;
public static final int FORMAT_DEGREES = 0;
public static final int FORMAT_MINUTES = 1;
public static final int FORMAT_SECONDS = 2;
static { CREATOR = null; }
}
