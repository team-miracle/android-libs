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
package android.telephony;
public final class TelephonyHistogram
  implements android.os.Parcelable
{
public  TelephonyHistogram(int category, int id, int bucketCount) { throw new RuntimeException("Stub!"); }
public  TelephonyHistogram(android.telephony.TelephonyHistogram th) { throw new RuntimeException("Stub!"); }
public  TelephonyHistogram(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  int getCategory() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getMinTime() { throw new RuntimeException("Stub!"); }
public  int getMaxTime() { throw new RuntimeException("Stub!"); }
public  int getAverageTime() { throw new RuntimeException("Stub!"); }
public  int getSampleCount() { throw new RuntimeException("Stub!"); }
public  int getBucketCount() { throw new RuntimeException("Stub!"); }
public  int[] getBucketEndPoints() { throw new RuntimeException("Stub!"); }
public  int[] getBucketCounters() { throw new RuntimeException("Stub!"); }
public  void addTimeTaken(int time) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.TelephonyHistogram> CREATOR;
public static final int TELEPHONY_CATEGORY_RIL = 1;
static { CREATOR = null; }
}
