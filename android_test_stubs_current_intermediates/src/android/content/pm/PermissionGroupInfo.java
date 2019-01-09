/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.content.pm;
public class PermissionGroupInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public  PermissionGroupInfo() { throw new RuntimeException("Stub!"); }
public  PermissionGroupInfo(android.content.pm.PermissionGroupInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadDescription(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.PermissionGroupInfo> CREATOR;
public static final int FLAG_PERSONAL_INFO = 1;
public int descriptionRes;
public int flags;
public java.lang.CharSequence nonLocalizedDescription;
public int priority;
static { CREATOR = null; }
}
