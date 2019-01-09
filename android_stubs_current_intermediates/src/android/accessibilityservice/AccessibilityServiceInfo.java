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

package android.accessibilityservice;
public class AccessibilityServiceInfo
  implements android.os.Parcelable
{
public  AccessibilityServiceInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  android.content.pm.ResolveInfo getResolveInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSettingsActivityName() { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean getCanRetrieveWindowContent() { throw new RuntimeException("Stub!"); }
public  int getCapabilities() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadSummary(android.content.pm.PackageManager packageManager) { throw new RuntimeException("Stub!"); }
@Deprecated
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  java.lang.String loadDescription(android.content.pm.PackageManager packageManager) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flagz) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.lang.String feedbackTypeToString(int feedbackType) { throw new RuntimeException("Stub!"); }
public static  java.lang.String flagToString(int flag) { throw new RuntimeException("Stub!"); }
public static  java.lang.String capabilityToString(int capability) { throw new RuntimeException("Stub!"); }
public static final int CAPABILITY_CAN_CONTROL_MAGNIFICATION = 16;
public static final int CAPABILITY_CAN_PERFORM_GESTURES = 32;
@Deprecated
public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = 8;
public static final int CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES = 64;
public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityServiceInfo> CREATOR;
public static final int DEFAULT = 1;
public static final int FEEDBACK_ALL_MASK = -1;
public static final int FEEDBACK_AUDIBLE = 4;
public static final int FEEDBACK_BRAILLE = 32;
public static final int FEEDBACK_GENERIC = 16;
public static final int FEEDBACK_HAPTIC = 2;
public static final int FEEDBACK_SPOKEN = 1;
public static final int FEEDBACK_VISUAL = 8;
public static final int FLAG_ENABLE_ACCESSIBILITY_VOLUME = 128;
public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
public static final int FLAG_REPORT_VIEW_IDS = 16;
public static final int FLAG_REQUEST_ACCESSIBILITY_BUTTON = 256;
@Deprecated
public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
public static final int FLAG_REQUEST_FINGERPRINT_GESTURES = 512;
public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
public static final int FLAG_RETRIEVE_INTERACTIVE_WINDOWS = 64;
public int eventTypes;
public int feedbackType;
public int flags;
public long notificationTimeout;
public java.lang.String[] packageNames = null;
static { CREATOR = null; }
}
