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

package android.media;
public final class AudioRecordingConfiguration
  implements android.os.Parcelable
{
AudioRecordingConfiguration() { throw new RuntimeException("Stub!"); }
public  int getClientAudioSource() { throw new RuntimeException("Stub!"); }
public  int getClientAudioSessionId() { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat getFormat() { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat getClientFormat() { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getAudioDevice() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.AudioRecordingConfiguration> CREATOR;
static { CREATOR = null; }
}
