/*
* Copyright (C) 2006 The Android Open Source Project
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
public final class ProviderInfo
  extends android.content.pm.ComponentInfo
  implements android.os.Parcelable
{
public  ProviderInfo() { throw new RuntimeException("Stub!"); }
public  ProviderInfo(android.content.pm.ProviderInfo orig) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.ProviderInfo> CREATOR;
public static final int FLAG_SINGLE_USER = 1073741824;
public java.lang.String authority;
public int flags;
public boolean grantUriPermissions;
public int initOrder;
@java.lang.Deprecated()
public boolean isSyncable;
public boolean multiprocess;
public android.content.pm.PathPermission[] pathPermissions = null;
public java.lang.String readPermission;
public android.os.PatternMatcher[] uriPermissionPatterns = null;
public java.lang.String writePermission;
static { CREATOR = null; }
}
