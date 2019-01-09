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

package android.telephony;
public abstract class CellInfo
  implements android.os.Parcelable
{
CellInfo() { throw new RuntimeException("Stub!"); }
public  boolean isRegistered() { throw new RuntimeException("Stub!"); }
public  long getTimeStamp() { throw new RuntimeException("Stub!"); }
public  int getCellConnectionStatus() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public abstract  void writeToParcel(android.os.Parcel dest, int flags);
public static final int CONNECTION_NONE = 0;
public static final int CONNECTION_PRIMARY_SERVING = 1;
public static final int CONNECTION_SECONDARY_SERVING = 2;
public static final int CONNECTION_UNKNOWN = 2147483647;
public static final android.os.Parcelable.Creator<android.telephony.CellInfo> CREATOR;
static { CREATOR = null; }
}
