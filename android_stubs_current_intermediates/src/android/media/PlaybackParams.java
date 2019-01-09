/*
* Copyright 2015 The Android Open Source Project
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
public final class PlaybackParams
  implements android.os.Parcelable
{
public  PlaybackParams() { throw new RuntimeException("Stub!"); }
public  android.media.PlaybackParams allowDefaults() { throw new RuntimeException("Stub!"); }
public  android.media.PlaybackParams setAudioFallbackMode(int audioFallbackMode) { throw new RuntimeException("Stub!"); }
public  int getAudioFallbackMode() { throw new RuntimeException("Stub!"); }
public  android.media.PlaybackParams setPitch(float pitch) { throw new RuntimeException("Stub!"); }
public  float getPitch() { throw new RuntimeException("Stub!"); }
public  android.media.PlaybackParams setSpeed(float speed) { throw new RuntimeException("Stub!"); }
public  float getSpeed() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int AUDIO_FALLBACK_MODE_DEFAULT = 0;
public static final int AUDIO_FALLBACK_MODE_FAIL = 2;
public static final int AUDIO_FALLBACK_MODE_MUTE = 1;
public static final android.os.Parcelable.Creator<android.media.PlaybackParams> CREATOR;
static { CREATOR = null; }
}
