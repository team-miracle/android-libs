/**
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy
* of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/

package android.app.usage;
public final class UsageStats
  implements android.os.Parcelable
{
public  UsageStats(android.app.usage.UsageStats stats) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  long getFirstTimeStamp() { throw new RuntimeException("Stub!"); }
public  long getLastTimeStamp() { throw new RuntimeException("Stub!"); }
public  long getLastTimeUsed() { throw new RuntimeException("Stub!"); }
public  long getTotalTimeInForeground() { throw new RuntimeException("Stub!"); }
public  void add(android.app.usage.UsageStats right) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.usage.UsageStats> CREATOR;
static { CREATOR = null; }
}
