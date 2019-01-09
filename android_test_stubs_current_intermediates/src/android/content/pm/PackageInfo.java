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
public class PackageInfo
  implements android.os.Parcelable
{
public  PackageInfo() { throw new RuntimeException("Stub!"); }
public  long getLongVersionCode() { throw new RuntimeException("Stub!"); }
public  void setLongVersionCode(long longVersionCode) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.PackageInfo> CREATOR;
public static final int INSTALL_LOCATION_AUTO = 0;
public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
public static final int REQUESTED_PERMISSION_GRANTED = 2;
public android.content.pm.ActivityInfo[] activities = null;
public android.content.pm.ApplicationInfo applicationInfo;
public int baseRevisionCode;
public android.content.pm.ConfigurationInfo[] configPreferences = null;
public android.content.pm.FeatureGroupInfo[] featureGroups = null;
public long firstInstallTime;
public int[] gids = null;
public int installLocation;
public android.content.pm.InstrumentationInfo[] instrumentation = null;
public long lastUpdateTime;
public java.lang.String packageName;
public android.content.pm.PermissionInfo[] permissions = null;
public android.content.pm.ProviderInfo[] providers = null;
public android.content.pm.ActivityInfo[] receivers = null;
public android.content.pm.FeatureInfo[] reqFeatures = null;
public java.lang.String[] requestedPermissions = null;
public int[] requestedPermissionsFlags = null;
public android.content.pm.ServiceInfo[] services = null;
public java.lang.String sharedUserId;
public int sharedUserLabel;
@java.lang.Deprecated()
public android.content.pm.Signature[] signatures = null;
public android.content.pm.SigningInfo signingInfo;
public java.lang.String[] splitNames = null;
public int[] splitRevisionCodes = null;
@java.lang.Deprecated()
public int versionCode;
public java.lang.String versionName;
static { CREATOR = null; }
}
