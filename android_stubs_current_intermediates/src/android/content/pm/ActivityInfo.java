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
public class ActivityInfo
  extends android.content.pm.ComponentInfo
  implements android.os.Parcelable
{
public static final class WindowLayout
{
public  WindowLayout(int width, float widthFraction, int height, float heightFraction, int gravity, int minWidth, int minHeight) { throw new RuntimeException("Stub!"); }
public final int gravity;
public final int height;
public final float heightFraction;
public final int minHeight;
public final int minWidth;
public final int width;
public final float widthFraction;
}
public  ActivityInfo() { throw new RuntimeException("Stub!"); }
public  ActivityInfo(android.content.pm.ActivityInfo orig) { throw new RuntimeException("Stub!"); }
public final  int getThemeResource() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final int COLOR_MODE_DEFAULT = 0;
public static final int COLOR_MODE_HDR = 2;
public static final int COLOR_MODE_WIDE_COLOR_GAMUT = 1;
public static final int CONFIG_COLOR_MODE = 16384;
public static final int CONFIG_DENSITY = 4096;
public static final int CONFIG_FONT_SCALE = 1073741824;
public static final int CONFIG_KEYBOARD = 16;
public static final int CONFIG_KEYBOARD_HIDDEN = 32;
public static final int CONFIG_LAYOUT_DIRECTION = 8192;
public static final int CONFIG_LOCALE = 4;
public static final int CONFIG_MCC = 1;
public static final int CONFIG_MNC = 2;
public static final int CONFIG_NAVIGATION = 64;
public static final int CONFIG_ORIENTATION = 128;
public static final int CONFIG_SCREEN_LAYOUT = 256;
public static final int CONFIG_SCREEN_SIZE = 1024;
public static final int CONFIG_SMALLEST_SCREEN_SIZE = 2048;
public static final int CONFIG_TOUCHSCREEN = 8;
public static final int CONFIG_UI_MODE = 512;
public static final android.os.Parcelable.Creator<android.content.pm.ActivityInfo> CREATOR;
public static final int DOCUMENT_LAUNCH_ALWAYS = 2;
public static final int DOCUMENT_LAUNCH_INTO_EXISTING = 1;
public static final int DOCUMENT_LAUNCH_NEVER = 3;
public static final int DOCUMENT_LAUNCH_NONE = 0;
public static final int FLAG_ALLOW_TASK_REPARENTING = 64;
public static final int FLAG_ALWAYS_RETAIN_TASK_STATE = 8;
public static final int FLAG_AUTO_REMOVE_FROM_RECENTS = 8192;
public static final int FLAG_CLEAR_TASK_ON_LAUNCH = 4;
public static final int FLAG_ENABLE_VR_MODE = 32768;
public static final int FLAG_EXCLUDE_FROM_RECENTS = 32;
public static final int FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS = 256;
public static final int FLAG_FINISH_ON_TASK_LAUNCH = 2;
public static final int FLAG_HARDWARE_ACCELERATED = 512;
public static final int FLAG_IMMERSIVE = 2048;
public static final int FLAG_MULTIPROCESS = 1;
public static final int FLAG_NO_HISTORY = 128;
public static final int FLAG_RELINQUISH_TASK_IDENTITY = 4096;
public static final int FLAG_RESUME_WHILE_PAUSING = 16384;
public static final int FLAG_SINGLE_USER = 1073741824;
public static final int FLAG_STATE_NOT_NEEDED = 16;
public static final int LAUNCH_MULTIPLE = 0;
public static final int LAUNCH_SINGLE_INSTANCE = 3;
public static final int LAUNCH_SINGLE_TASK = 2;
public static final int LAUNCH_SINGLE_TOP = 1;
public static final int PERSIST_ACROSS_REBOOTS = 2;
public static final int PERSIST_NEVER = 1;
public static final int PERSIST_ROOT_ONLY = 0;
public static final int SCREEN_ORIENTATION_BEHIND = 3;
public static final int SCREEN_ORIENTATION_FULL_SENSOR = 10;
public static final int SCREEN_ORIENTATION_FULL_USER = 13;
public static final int SCREEN_ORIENTATION_LANDSCAPE = 0;
public static final int SCREEN_ORIENTATION_LOCKED = 14;
public static final int SCREEN_ORIENTATION_NOSENSOR = 5;
public static final int SCREEN_ORIENTATION_PORTRAIT = 1;
public static final int SCREEN_ORIENTATION_REVERSE_LANDSCAPE = 8;
public static final int SCREEN_ORIENTATION_REVERSE_PORTRAIT = 9;
public static final int SCREEN_ORIENTATION_SENSOR = 4;
public static final int SCREEN_ORIENTATION_SENSOR_LANDSCAPE = 6;
public static final int SCREEN_ORIENTATION_SENSOR_PORTRAIT = 7;
public static final int SCREEN_ORIENTATION_UNSPECIFIED = -1;
public static final int SCREEN_ORIENTATION_USER = 2;
public static final int SCREEN_ORIENTATION_USER_LANDSCAPE = 11;
public static final int SCREEN_ORIENTATION_USER_PORTRAIT = 12;
public static final int UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW = 1;
public int colorMode;
public int configChanges;
public int documentLaunchMode;
public int flags;
public int launchMode;
public int maxRecents;
public java.lang.String parentActivityName;
public java.lang.String permission;
public int persistableMode;
public int screenOrientation;
public int softInputMode;
public java.lang.String targetActivity;
public java.lang.String taskAffinity;
public int theme;
public int uiOptions;
public android.content.pm.ActivityInfo.WindowLayout windowLayout;
static { CREATOR = null; }
}
