/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class InstantAppResolveInfo
  implements android.os.Parcelable
{
public static final class InstantAppDigest
  implements android.os.Parcelable
{
public  InstantAppDigest(java.lang.String hostName) { throw new RuntimeException("Stub!"); }
public  byte[][] getDigestBytes() { throw new RuntimeException("Stub!"); }
public  int[] getDigestPrefix() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"hiding"})
public static final android.os.Parcelable.Creator<android.content.pm.InstantAppResolveInfo.InstantAppDigest> CREATOR;
public static final android.content.pm.InstantAppResolveInfo.InstantAppDigest UNDEFINED;
static { CREATOR = null; UNDEFINED = null; }
}
public  InstantAppResolveInfo(android.content.pm.InstantAppResolveInfo.InstantAppDigest digest, java.lang.String packageName, java.util.List<android.content.pm.InstantAppIntentFilter> filters, int versionCode) { throw new RuntimeException("Stub!"); }
public  InstantAppResolveInfo(android.content.pm.InstantAppResolveInfo.InstantAppDigest digest, java.lang.String packageName, java.util.List<android.content.pm.InstantAppIntentFilter> filters, long versionCode, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  InstantAppResolveInfo(java.lang.String hostName, java.lang.String packageName, java.util.List<android.content.pm.InstantAppIntentFilter> filters) { throw new RuntimeException("Stub!"); }
public  InstantAppResolveInfo(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  boolean shouldLetInstallerDecide() { throw new RuntimeException("Stub!"); }
public  byte[] getDigestBytes() { throw new RuntimeException("Stub!"); }
public  int getDigestPrefix() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.InstantAppIntentFilter> getIntentFilters() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getVersionCode() { throw new RuntimeException("Stub!"); }
public  long getLongVersionCode() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.InstantAppResolveInfo> CREATOR;
static { CREATOR = null; }
}
