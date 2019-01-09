/*
* Copyright (C) 2016 The Android Open Source Project
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
public final class NotificationChannel
  implements android.os.Parcelable
{
public  NotificationChannel(java.lang.String id, java.lang.CharSequence name, int importance) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void setName(java.lang.CharSequence name) { throw new RuntimeException("Stub!"); }
public  void setDescription(java.lang.String description) { throw new RuntimeException("Stub!"); }
public  void setGroup(java.lang.String groupId) { throw new RuntimeException("Stub!"); }
public  void setShowBadge(boolean showBadge) { throw new RuntimeException("Stub!"); }
public  void setSound(android.net.Uri sound, android.media.AudioAttributes audioAttributes) { throw new RuntimeException("Stub!"); }
public  void enableLights(boolean lights) { throw new RuntimeException("Stub!"); }
public  void setLightColor(int argb) { throw new RuntimeException("Stub!"); }
public  void enableVibration(boolean vibration) { throw new RuntimeException("Stub!"); }
public  void setVibrationPattern(long[] vibrationPattern) { throw new RuntimeException("Stub!"); }
public  void setImportance(int importance) { throw new RuntimeException("Stub!"); }
public  void setBypassDnd(boolean bypassDnd) { throw new RuntimeException("Stub!"); }
public  void setLockscreenVisibility(int lockscreenVisibility) { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  int getImportance() { throw new RuntimeException("Stub!"); }
public  boolean canBypassDnd() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getSound() { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
public  boolean shouldShowLights() { throw new RuntimeException("Stub!"); }
public  int getLightColor() { throw new RuntimeException("Stub!"); }
public  boolean shouldVibrate() { throw new RuntimeException("Stub!"); }
public  long[] getVibrationPattern() { throw new RuntimeException("Stub!"); }
public  int getLockscreenVisibility() { throw new RuntimeException("Stub!"); }
public  boolean canShowBadge() { throw new RuntimeException("Stub!"); }
public  java.lang.String getGroup() { throw new RuntimeException("Stub!"); }
public  boolean isDeleted() { throw new RuntimeException("Stub!"); }
public  int getUserLockedFields() { throw new RuntimeException("Stub!"); }
public  void populateFromXml(org.xmlpull.v1.XmlPullParser parser) { throw new RuntimeException("Stub!"); }
public  void writeXml(org.xmlpull.v1.XmlSerializer out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject toJson() throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.NotificationChannel> CREATOR;
public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
static { CREATOR = null; }
}
