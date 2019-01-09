/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.content;
public class SyncAdapterType
  implements android.os.Parcelable
{
public  SyncAdapterType(java.lang.String authority, java.lang.String accountType, boolean userVisible, boolean supportsUploading) { throw new RuntimeException("Stub!"); }
public  SyncAdapterType(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  boolean supportsUploading() { throw new RuntimeException("Stub!"); }
public  boolean isUserVisible() { throw new RuntimeException("Stub!"); }
public  boolean allowParallelSyncs() { throw new RuntimeException("Stub!"); }
public  boolean isAlwaysSyncable() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSettingsActivity() { throw new RuntimeException("Stub!"); }
public static  android.content.SyncAdapterType newKey(java.lang.String authority, java.lang.String accountType) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.SyncAdapterType> CREATOR;
public final java.lang.String accountType;
public final java.lang.String authority;
public final boolean isKey;
static { CREATOR = null; }
}
