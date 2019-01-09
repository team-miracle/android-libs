/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.app.admin;
public final class DeviceAdminInfo
  implements android.os.Parcelable
{
public  DeviceAdminInfo(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getReceiverName() { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo getActivityInfo() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getComponent() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadDescription(android.content.pm.PackageManager pm) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  boolean isVisible() { throw new RuntimeException("Stub!"); }
public  boolean usesPolicy(int policyIdent) { throw new RuntimeException("Stub!"); }
public  java.lang.String getTagForPolicy(int policyIdent) { throw new RuntimeException("Stub!"); }
public  boolean supportsTransferOwnership() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.admin.DeviceAdminInfo> CREATOR;
public static final int USES_ENCRYPTED_STORAGE = 7;
public static final int USES_POLICY_DISABLE_CAMERA = 8;
public static final int USES_POLICY_DISABLE_KEYGUARD_FEATURES = 9;
public static final int USES_POLICY_EXPIRE_PASSWORD = 6;
public static final int USES_POLICY_FORCE_LOCK = 3;
public static final int USES_POLICY_LIMIT_PASSWORD = 0;
public static final int USES_POLICY_RESET_PASSWORD = 2;
public static final int USES_POLICY_WATCH_LOGIN = 1;
public static final int USES_POLICY_WIPE_DATA = 4;
static { CREATOR = null; }
}
