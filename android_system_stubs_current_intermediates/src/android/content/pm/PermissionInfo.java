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
public class PermissionInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public  PermissionInfo() { throw new RuntimeException("Stub!"); }
public  PermissionInfo(android.content.pm.PermissionInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadDescription(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  int getProtection() { throw new RuntimeException("Stub!"); }
public  int getProtectionFlags() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.PermissionInfo> CREATOR;
public static final int FLAG_COSTS_MONEY = 1;
public static final int FLAG_INSTALLED = 1073741824;
public static final int FLAG_REMOVED = 2;
public static final int PROTECTION_DANGEROUS = 1;
public static final int PROTECTION_FLAG_APPOP = 64;
public static final int PROTECTION_FLAG_DEVELOPMENT = 32;
public static final int PROTECTION_FLAG_INSTALLER = 256;
public static final int PROTECTION_FLAG_INSTANT = 4096;
public static final int PROTECTION_FLAG_OEM = 16384;
public static final int PROTECTION_FLAG_PRE23 = 128;
public static final int PROTECTION_FLAG_PREINSTALLED = 1024;
public static final int PROTECTION_FLAG_PRIVILEGED = 16;
public static final int PROTECTION_FLAG_RUNTIME_ONLY = 8192;
public static final int PROTECTION_FLAG_SETUP = 2048;
@java.lang.Deprecated()
public static final int PROTECTION_FLAG_SYSTEM = 16;
public static final int PROTECTION_FLAG_SYSTEM_TEXT_CLASSIFIER = 65536;
public static final int PROTECTION_FLAG_VERIFIER = 512;
@java.lang.Deprecated()
public static final int PROTECTION_MASK_BASE = 15;
@java.lang.Deprecated()
public static final int PROTECTION_MASK_FLAGS = 65520;
public static final int PROTECTION_NORMAL = 0;
public static final int PROTECTION_SIGNATURE = 2;
@java.lang.Deprecated()
public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
public int descriptionRes;
public int flags;
public java.lang.String group;
public java.lang.CharSequence nonLocalizedDescription;
@java.lang.Deprecated()
public int protectionLevel;
public int requestRes;
static { CREATOR = null; }
}
