/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.os.storage;
public final class StorageVolume
  implements android.os.Parcelable
{
StorageVolume() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  boolean isPrimary() { throw new RuntimeException("Stub!"); }
public  boolean isRemovable() { throw new RuntimeException("Stub!"); }
public  boolean isEmulated() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUuid() { throw new RuntimeException("Stub!"); }
public  java.lang.String getState() { throw new RuntimeException("Stub!"); }
public  android.content.Intent createAccessIntent(java.lang.String directoryName) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.storage.StorageVolume> CREATOR;
public static final java.lang.String EXTRA_STORAGE_VOLUME = "android.os.storage.extra.STORAGE_VOLUME";
static { CREATOR = null; }
}
