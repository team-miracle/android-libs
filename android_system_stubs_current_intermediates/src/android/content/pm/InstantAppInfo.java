/*
* Copyright (C) 2015 The Android Open Source Project
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
public final class InstantAppInfo
  implements android.os.Parcelable
{
public  InstantAppInfo(android.content.pm.ApplicationInfo appInfo, java.lang.String[] requestedPermissions, java.lang.String[] grantedPermissions) { throw new RuntimeException("Stub!"); }
public  InstantAppInfo(java.lang.String packageName, java.lang.CharSequence label, java.lang.String[] requestedPermissions, java.lang.String[] grantedPermissions) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ApplicationInfo getApplicationInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager packageManager) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager packageManager) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getRequestedPermissions() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getGrantedPermissions() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.InstantAppInfo> CREATOR;
static { CREATOR = null; }
}
