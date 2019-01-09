/**
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
package android.service.notification;
public final class NotificationStats
  implements android.os.Parcelable
{
public  NotificationStats() { throw new RuntimeException("Stub!"); }
protected  NotificationStats(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean hasSeen() { throw new RuntimeException("Stub!"); }
public  void setSeen() { throw new RuntimeException("Stub!"); }
public  boolean hasExpanded() { throw new RuntimeException("Stub!"); }
public  void setExpanded() { throw new RuntimeException("Stub!"); }
public  boolean hasDirectReplied() { throw new RuntimeException("Stub!"); }
public  void setDirectReplied() { throw new RuntimeException("Stub!"); }
public  boolean hasSnoozed() { throw new RuntimeException("Stub!"); }
public  void setSnoozed() { throw new RuntimeException("Stub!"); }
public  boolean hasViewedSettings() { throw new RuntimeException("Stub!"); }
public  void setViewedSettings() { throw new RuntimeException("Stub!"); }
public  boolean hasInteracted() { throw new RuntimeException("Stub!"); }
public  int getDismissalSurface() { throw new RuntimeException("Stub!"); }
public  void setDismissalSurface(int dismissalSurface) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.notification.NotificationStats> CREATOR;
public static final int DISMISSAL_AOD = 2;
public static final int DISMISSAL_NOT_DISMISSED = -1;
public static final int DISMISSAL_OTHER = 0;
public static final int DISMISSAL_PEEK = 1;
public static final int DISMISSAL_SHADE = 3;
static { CREATOR = null; }
}
