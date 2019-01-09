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

package android.service.notification;
public class StatusBarNotification
  implements android.os.Parcelable
{
@java.lang.Deprecated()
public  StatusBarNotification(java.lang.String pkg, java.lang.String opPkg, int id, java.lang.String tag, int uid, int initialPid, int score, android.app.Notification notification, android.os.UserHandle user, long postTime) { throw new RuntimeException("Stub!"); }
public  StatusBarNotification(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  boolean isGroup() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  android.service.notification.StatusBarNotification clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean isOngoing() { throw new RuntimeException("Stub!"); }
public  boolean isClearable() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getUserId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTag() { throw new RuntimeException("Stub!"); }
public  android.app.Notification getNotification() { throw new RuntimeException("Stub!"); }
public  android.os.UserHandle getUser() { throw new RuntimeException("Stub!"); }
public  long getPostTime() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  java.lang.String getGroupKey() { throw new RuntimeException("Stub!"); }
public  void setOverrideGroupKey(java.lang.String overrideGroupKey) { throw new RuntimeException("Stub!"); }
public  java.lang.String getOverrideGroupKey() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.notification.StatusBarNotification> CREATOR;
static { CREATOR = null; }
}
