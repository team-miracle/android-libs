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
package android.media.session;
public final class PlaybackState
  implements android.os.Parcelable
{
public static final class CustomAction
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(java.lang.String action, java.lang.CharSequence name, int icon) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.CustomAction.Builder setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.CustomAction build() { throw new RuntimeException("Stub!"); }
}
CustomAction() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAction() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getName() { throw new RuntimeException("Stub!"); }
public  int getIcon() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.session.PlaybackState.CustomAction> CREATOR;
static { CREATOR = null; }
}
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.media.session.PlaybackState from) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setState(int state, long position, float playbackSpeed, long updateTime) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setState(int state, long position, float playbackSpeed) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setActions(long actions) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder addCustomAction(java.lang.String action, java.lang.String name, int icon) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder addCustomAction(android.media.session.PlaybackState.CustomAction customAction) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setBufferedPosition(long bufferedPosition) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setActiveQueueItemId(long id) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setErrorMessage(java.lang.CharSequence error) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState.Builder setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState build() { throw new RuntimeException("Stub!"); }
}
PlaybackState() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  long getPosition() { throw new RuntimeException("Stub!"); }
public  long getBufferedPosition() { throw new RuntimeException("Stub!"); }
public  float getPlaybackSpeed() { throw new RuntimeException("Stub!"); }
public  long getActions() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.session.PlaybackState.CustomAction> getCustomActions() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getErrorMessage() { throw new RuntimeException("Stub!"); }
public  long getLastPositionUpdateTime() { throw new RuntimeException("Stub!"); }
public  long getActiveQueueItemId() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public static final long ACTION_FAST_FORWARD = 64L;
public static final long ACTION_PAUSE = 2L;
public static final long ACTION_PLAY = 4L;
public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
public static final long ACTION_PLAY_FROM_URI = 8192L;
public static final long ACTION_PLAY_PAUSE = 512L;
public static final long ACTION_PREPARE = 16384L;
public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
public static final long ACTION_PREPARE_FROM_SEARCH = 65536L;
public static final long ACTION_PREPARE_FROM_URI = 131072L;
public static final long ACTION_REWIND = 8L;
public static final long ACTION_SEEK_TO = 256L;
public static final long ACTION_SET_RATING = 128L;
public static final long ACTION_SKIP_TO_NEXT = 32L;
public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
public static final long ACTION_STOP = 1L;
public static final android.os.Parcelable.Creator<android.media.session.PlaybackState> CREATOR;
public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
public static final int STATE_BUFFERING = 6;
public static final int STATE_CONNECTING = 8;
public static final int STATE_ERROR = 7;
public static final int STATE_FAST_FORWARDING = 4;
public static final int STATE_NONE = 0;
public static final int STATE_PAUSED = 2;
public static final int STATE_PLAYING = 3;
public static final int STATE_REWINDING = 5;
public static final int STATE_SKIPPING_TO_NEXT = 10;
public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
public static final int STATE_STOPPED = 1;
static { CREATOR = null; }
}
