/*
* Copyright (C) 2013 The Android Open Source Project
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
public final class UriPermission
  implements android.os.Parcelable
{
UriPermission() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  boolean isReadPermission() { throw new RuntimeException("Stub!"); }
public  boolean isWritePermission() { throw new RuntimeException("Stub!"); }
public  long getPersistedTime() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.UriPermission> CREATOR;
public static final long INVALID_TIME = -9223372036854775808L;
static { CREATOR = null; }
}
