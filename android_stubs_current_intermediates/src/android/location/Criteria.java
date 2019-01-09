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
public class Criteria
  implements android.os.Parcelable
{
public  Criteria() { throw new RuntimeException("Stub!"); }
public  Criteria(android.location.Criteria criteria) { throw new RuntimeException("Stub!"); }
public  void setHorizontalAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
public  int getHorizontalAccuracy() { throw new RuntimeException("Stub!"); }
public  void setVerticalAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
public  int getVerticalAccuracy() { throw new RuntimeException("Stub!"); }
public  void setSpeedAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
public  int getSpeedAccuracy() { throw new RuntimeException("Stub!"); }
public  void setBearingAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
public  int getBearingAccuracy() { throw new RuntimeException("Stub!"); }
public  void setAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
public  int getAccuracy() { throw new RuntimeException("Stub!"); }
public  void setPowerRequirement(int level) { throw new RuntimeException("Stub!"); }
public  int getPowerRequirement() { throw new RuntimeException("Stub!"); }
public  void setCostAllowed(boolean costAllowed) { throw new RuntimeException("Stub!"); }
public  boolean isCostAllowed() { throw new RuntimeException("Stub!"); }
public  void setAltitudeRequired(boolean altitudeRequired) { throw new RuntimeException("Stub!"); }
public  boolean isAltitudeRequired() { throw new RuntimeException("Stub!"); }
public  void setSpeedRequired(boolean speedRequired) { throw new RuntimeException("Stub!"); }
public  boolean isSpeedRequired() { throw new RuntimeException("Stub!"); }
public  void setBearingRequired(boolean bearingRequired) { throw new RuntimeException("Stub!"); }
public  boolean isBearingRequired() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ACCURACY_COARSE = 2;
public static final int ACCURACY_FINE = 1;
public static final int ACCURACY_HIGH = 3;
public static final int ACCURACY_LOW = 1;
public static final int ACCURACY_MEDIUM = 2;
public static final android.os.Parcelable.Creator<android.location.Criteria> CREATOR;
public static final int NO_REQUIREMENT = 0;
public static final int POWER_HIGH = 3;
public static final int POWER_LOW = 1;
public static final int POWER_MEDIUM = 2;
static { CREATOR = null; }
}
