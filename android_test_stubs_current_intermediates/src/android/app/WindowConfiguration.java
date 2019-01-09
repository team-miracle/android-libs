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

package android.app;
public class WindowConfiguration
  implements android.os.Parcelable, java.lang.Comparable<android.app.WindowConfiguration>
{
public  WindowConfiguration() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void setBounds(android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public  void setAppBounds(android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getAppBounds() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getBounds() { throw new RuntimeException("Stub!"); }
public  void setWindowingMode(int windowingMode) { throw new RuntimeException("Stub!"); }
public  int getWindowingMode() { throw new RuntimeException("Stub!"); }
public  void setActivityType(int activityType) { throw new RuntimeException("Stub!"); }
public  int getActivityType() { throw new RuntimeException("Stub!"); }
public  void setTo(android.app.WindowConfiguration other) { throw new RuntimeException("Stub!"); }
public  int compareTo(android.app.WindowConfiguration that) { throw new RuntimeException("Stub!"); }
public static final int ACTIVITY_TYPE_ASSISTANT = 4;
public static final int ACTIVITY_TYPE_HOME = 2;
public static final int ACTIVITY_TYPE_RECENTS = 3;
public static final int ACTIVITY_TYPE_STANDARD = 1;
public static final int ACTIVITY_TYPE_UNDEFINED = 0;
public static final int WINDOWING_MODE_FREEFORM = 5;
public static final int WINDOWING_MODE_FULLSCREEN = 1;
public static final int WINDOWING_MODE_FULLSCREEN_OR_SPLIT_SCREEN_SECONDARY = 4;
public static final int WINDOWING_MODE_PINNED = 2;
public static final int WINDOWING_MODE_SPLIT_SCREEN_PRIMARY = 3;
public static final int WINDOWING_MODE_SPLIT_SCREEN_SECONDARY = 4;
public static final int WINDOWING_MODE_UNDEFINED = 0;
}
