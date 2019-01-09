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
public final class NotificationChannelGroup
  implements android.os.Parcelable
{
public  NotificationChannelGroup(java.lang.String id, java.lang.CharSequence name) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.NotificationChannel> getChannels() { throw new RuntimeException("Stub!"); }
public  boolean isBlocked() { throw new RuntimeException("Stub!"); }
public  void setDescription(java.lang.String description) { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject toJson() throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  android.app.NotificationChannelGroup clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.NotificationChannelGroup> CREATOR;
static { CREATOR = null; }
}
