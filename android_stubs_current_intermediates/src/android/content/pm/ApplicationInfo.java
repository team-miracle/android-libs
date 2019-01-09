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
public class ApplicationInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public static class DisplayNameComparator
  implements java.util.Comparator<android.content.pm.ApplicationInfo>
{
public  DisplayNameComparator(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int compare(android.content.pm.ApplicationInfo aa, android.content.pm.ApplicationInfo ab) { throw new RuntimeException("Stub!"); }
}
public  ApplicationInfo() { throw new RuntimeException("Stub!"); }
public  ApplicationInfo(android.content.pm.ApplicationInfo orig) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence getCategoryTitle(android.content.Context context, int category) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadDescription(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  boolean isVirtualPreload() { throw new RuntimeException("Stub!"); }
public static final int CATEGORY_AUDIO = 1;
public static final int CATEGORY_GAME = 0;
public static final int CATEGORY_IMAGE = 3;
public static final int CATEGORY_MAPS = 6;
public static final int CATEGORY_NEWS = 5;
public static final int CATEGORY_PRODUCTIVITY = 7;
public static final int CATEGORY_SOCIAL = 4;
public static final int CATEGORY_UNDEFINED = -1;
public static final int CATEGORY_VIDEO = 2;
public static final android.os.Parcelable.Creator<android.content.pm.ApplicationInfo> CREATOR;
public static final int FLAG_ALLOW_BACKUP = 32768;
public static final int FLAG_ALLOW_CLEAR_USER_DATA = 64;
public static final int FLAG_ALLOW_TASK_REPARENTING = 32;
public static final int FLAG_DEBUGGABLE = 2;
public static final int FLAG_EXTERNAL_STORAGE = 262144;
public static final int FLAG_EXTRACT_NATIVE_LIBS = 268435456;
public static final int FLAG_FACTORY_TEST = 16;
public static final int FLAG_FULL_BACKUP_ONLY = 67108864;
public static final int FLAG_HARDWARE_ACCELERATED = 536870912;
public static final int FLAG_HAS_CODE = 4;
public static final int FLAG_INSTALLED = 8388608;
public static final int FLAG_IS_DATA_ONLY = 16777216;
@java.lang.Deprecated()
public static final int FLAG_IS_GAME = 33554432;
public static final int FLAG_KILL_AFTER_RESTORE = 65536;
public static final int FLAG_LARGE_HEAP = 1048576;
public static final int FLAG_MULTIARCH = -2147483648;
public static final int FLAG_PERSISTENT = 8;
public static final int FLAG_RESIZEABLE_FOR_SCREENS = 4096;
public static final int FLAG_RESTORE_ANY_VERSION = 131072;
public static final int FLAG_STOPPED = 2097152;
public static final int FLAG_SUPPORTS_LARGE_SCREENS = 2048;
public static final int FLAG_SUPPORTS_NORMAL_SCREENS = 1024;
public static final int FLAG_SUPPORTS_RTL = 4194304;
public static final int FLAG_SUPPORTS_SCREEN_DENSITIES = 8192;
public static final int FLAG_SUPPORTS_SMALL_SCREENS = 512;
public static final int FLAG_SUPPORTS_XLARGE_SCREENS = 524288;
public static final int FLAG_SUSPENDED = 1073741824;
public static final int FLAG_SYSTEM = 1;
public static final int FLAG_TEST_ONLY = 256;
public static final int FLAG_UPDATED_SYSTEM_APP = 128;
public static final int FLAG_USES_CLEARTEXT_TRAFFIC = 134217728;
public static final int FLAG_VM_SAFE_MODE = 16384;
public java.lang.String appComponentFactory;
public java.lang.String backupAgentName;
public int category;
public java.lang.String className;
public int compatibleWidthLimitDp;
public java.lang.String dataDir;
public int descriptionRes;
public java.lang.String deviceProtectedDataDir;
public boolean enabled;
public int flags;
public int largestWidthLimitDp;
public java.lang.String manageSpaceActivityName;
public int minSdkVersion;
public java.lang.String nativeLibraryDir;
public java.lang.String permission;
public java.lang.String processName;
public java.lang.String publicSourceDir;
public int requiresSmallestWidthDp;
public java.lang.String[] sharedLibraryFiles = null;
public java.lang.String sourceDir;
public java.lang.String[] splitNames = null;
public java.lang.String[] splitPublicSourceDirs = null;
public java.lang.String[] splitSourceDirs = null;
public java.util.UUID storageUuid;
public int targetSdkVersion;
public java.lang.String taskAffinity;
public int theme;
public int uiOptions;
public int uid;
static { CREATOR = null; }
}
