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

package android.hardware.location;
@java.lang.Deprecated()
public class NanoAppFilter
  implements android.os.Parcelable
{
public  NanoAppFilter(long appId, int appVersion, int versionMask, long vendorMask) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  boolean testMatch(android.hardware.location.NanoAppInstanceInfo info) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int APP_ANY = -1;
public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppFilter> CREATOR;
public static final int FLAGS_VERSION_ANY = -1;
public static final int FLAGS_VERSION_GREAT_THAN = 2;
public static final int FLAGS_VERSION_LESS_THAN = 4;
public static final int FLAGS_VERSION_STRICTLY_EQUAL = 8;
public static final int HUB_ANY = -1;
public static final int VENDOR_ANY = -1;
static { CREATOR = null; }
}
