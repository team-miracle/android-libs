/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.media;
public final class AudioAttributes
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  Builder(android.media.AudioAttributes aa) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  android.media.AudioAttributes build() { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder setUsage(int usage) { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder setContentType(int contentType) { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder addBundle(android.os.Bundle bundle) { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder setLegacyStreamType(int streamType) { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder setCapturePreset(int preset) { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes.Builder setInternalCapturePreset(int preset) { throw new RuntimeException("Stub!"); }
}
AudioAttributes() { throw new RuntimeException("Stub!"); }
public  int getContentType() { throw new RuntimeException("Stub!"); }
public  int getUsage() { throw new RuntimeException("Stub!"); }
public  int getCapturePreset() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  int getAllFlags() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBundle() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getVolumeControlStream() { throw new RuntimeException("Stub!"); }
public static final int CONTENT_TYPE_MOVIE = 3;
public static final int CONTENT_TYPE_MUSIC = 2;
public static final int CONTENT_TYPE_SONIFICATION = 4;
public static final int CONTENT_TYPE_SPEECH = 1;
public static final int CONTENT_TYPE_UNKNOWN = 0;
public static final android.os.Parcelable.Creator<android.media.AudioAttributes> CREATOR;
public static final int FLAG_AUDIBILITY_ENFORCED = 1;
public static final int FLAG_BEACON = 8;
public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
public static final int FLAG_BYPASS_MUTE = 128;
public static final int FLAG_HW_AV_SYNC = 16;
public static final int FLAG_HW_HOTWORD = 32;
@Deprecated
public static final int FLAG_LOW_LATENCY = 256;
public static final int USAGE_ALARM = 4;
public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
public static final int USAGE_ASSISTANT = 16;
public static final int USAGE_GAME = 14;
public static final int USAGE_MEDIA = 1;
public static final int USAGE_NOTIFICATION = 5;
public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
public static final int USAGE_NOTIFICATION_EVENT = 10;
public static final int USAGE_NOTIFICATION_RINGTONE = 6;
public static final int USAGE_UNKNOWN = 0;
public static final int USAGE_VOICE_COMMUNICATION = 2;
public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
static { CREATOR = null; }
}
