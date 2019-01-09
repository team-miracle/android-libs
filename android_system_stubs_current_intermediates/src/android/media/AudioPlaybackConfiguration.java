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
public final class AudioPlaybackConfiguration
  implements android.os.Parcelable
{
AudioPlaybackConfiguration() { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
public  int getClientUid() { throw new RuntimeException("Stub!"); }
public  int getClientPid() { throw new RuntimeException("Stub!"); }
public  int getPlayerType() { throw new RuntimeException("Stub!"); }
public  int getPlayerState() { throw new RuntimeException("Stub!"); }
public  int getPlayerInterfaceId() { throw new RuntimeException("Stub!"); }
public  android.media.PlayerProxy getPlayerProxy() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.AudioPlaybackConfiguration> CREATOR;
public static final int PLAYER_STATE_IDLE = 1;
public static final int PLAYER_STATE_PAUSED = 3;
public static final int PLAYER_STATE_RELEASED = 0;
public static final int PLAYER_STATE_STARTED = 2;
public static final int PLAYER_STATE_STOPPED = 4;
public static final int PLAYER_STATE_UNKNOWN = -1;
public static final int PLAYER_TYPE_JAM_AUDIOTRACK = 1;
public static final int PLAYER_TYPE_JAM_MEDIAPLAYER = 2;
public static final int PLAYER_TYPE_JAM_SOUNDPOOL = 3;
public static final int PLAYER_TYPE_SLES_AUDIOPLAYER_BUFFERQUEUE = 11;
public static final int PLAYER_TYPE_SLES_AUDIOPLAYER_URI_FD = 12;
public static final int PLAYER_TYPE_UNKNOWN = -1;
static { CREATOR = null; }
}
