/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.view.accessibility;
public final class AccessibilityEvent
  extends android.view.accessibility.AccessibilityRecord
  implements android.os.Parcelable
{
AccessibilityEvent() { throw new RuntimeException("Stub!"); }
public  int getRecordCount() { throw new RuntimeException("Stub!"); }
public  void appendRecord(android.view.accessibility.AccessibilityRecord record) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityRecord getRecord(int index) { throw new RuntimeException("Stub!"); }
public  int getEventType() { throw new RuntimeException("Stub!"); }
public  int getContentChangeTypes() { throw new RuntimeException("Stub!"); }
public  void setContentChangeTypes(int changeTypes) { throw new RuntimeException("Stub!"); }
public  int getWindowChanges() { throw new RuntimeException("Stub!"); }
public  void setEventType(int eventType) { throw new RuntimeException("Stub!"); }
public  long getEventTime() { throw new RuntimeException("Stub!"); }
public  void setEventTime(long eventTime) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPackageName() { throw new RuntimeException("Stub!"); }
public  void setPackageName(java.lang.CharSequence packageName) { throw new RuntimeException("Stub!"); }
public  void setMovementGranularity(int granularity) { throw new RuntimeException("Stub!"); }
public  int getMovementGranularity() { throw new RuntimeException("Stub!"); }
public  void setAction(int action) { throw new RuntimeException("Stub!"); }
public  int getAction() { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityEvent obtain(int eventType) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityEvent obtain(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityEvent obtain() { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public  void initFromParcel(android.os.Parcel parcel) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.lang.String eventTypeToString(int eventType) { throw new RuntimeException("Stub!"); }
public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityEvent> CREATOR;
public static final int INVALID_POSITION = -1;
@java.lang.Deprecated()
public static final int MAX_TEXT_LENGTH = 500;
public static final int TYPES_ALL_MASK = -1;
public static final int TYPE_ANNOUNCEMENT = 16384;
public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
public static final int TYPE_GESTURE_DETECTION_END = 524288;
public static final int TYPE_GESTURE_DETECTION_START = 262144;
public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;
public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
public static final int TYPE_VIEW_CLICKED = 1;
public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
public static final int TYPE_VIEW_FOCUSED = 8;
public static final int TYPE_VIEW_HOVER_ENTER = 128;
public static final int TYPE_VIEW_HOVER_EXIT = 256;
public static final int TYPE_VIEW_LONG_CLICKED = 2;
public static final int TYPE_VIEW_SCROLLED = 4096;
public static final int TYPE_VIEW_SELECTED = 4;
public static final int TYPE_VIEW_TEXT_CHANGED = 16;
public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
public static final int TYPE_WINDOWS_CHANGED = 4194304;
public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
public static final int TYPE_WINDOW_STATE_CHANGED = 32;
public static final int WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED = 128;
public static final int WINDOWS_CHANGE_ACTIVE = 32;
public static final int WINDOWS_CHANGE_ADDED = 1;
public static final int WINDOWS_CHANGE_BOUNDS = 8;
public static final int WINDOWS_CHANGE_CHILDREN = 512;
public static final int WINDOWS_CHANGE_FOCUSED = 64;
public static final int WINDOWS_CHANGE_LAYER = 16;
public static final int WINDOWS_CHANGE_PARENT = 256;
public static final int WINDOWS_CHANGE_PIP = 1024;
public static final int WINDOWS_CHANGE_REMOVED = 2;
public static final int WINDOWS_CHANGE_TITLE = 4;
static { CREATOR = null; }
}
