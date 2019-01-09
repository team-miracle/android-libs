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

package android.content.pm;
public class ServiceInfo
  extends android.content.pm.ComponentInfo
  implements android.os.Parcelable
{
public  ServiceInfo() { throw new RuntimeException("Stub!"); }
public  ServiceInfo(android.content.pm.ServiceInfo orig) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.ServiceInfo> CREATOR;
public static final int FLAG_EXTERNAL_SERVICE = 4;
public static final int FLAG_ISOLATED_PROCESS = 2;
public static final int FLAG_SINGLE_USER = 1073741824;
public static final int FLAG_STOP_WITH_TASK = 1;
public int flags;
public java.lang.String permission;
static { CREATOR = null; }
}
