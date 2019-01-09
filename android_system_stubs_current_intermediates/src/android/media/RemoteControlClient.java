/*
* Copyright (C) 2011 The Android Open Source Project
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
@java.lang.Deprecated()
public class RemoteControlClient
{
@java.lang.Deprecated()
public class MetadataEditor
  extends android.media.MediaMetadataEditor
{
MetadataEditor() { throw new RuntimeException("Stub!"); }
public synchronized  android.media.RemoteControlClient.MetadataEditor putString(int key, java.lang.String value) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.media.RemoteControlClient.MetadataEditor putLong(int key, long value) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.media.RemoteControlClient.MetadataEditor putBitmap(int key, android.graphics.Bitmap bitmap) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.media.RemoteControlClient.MetadataEditor putObject(int key, java.lang.Object object) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  void clear() { throw new RuntimeException("Stub!"); }
public synchronized  void apply() { throw new RuntimeException("Stub!"); }
public static final int BITMAP_KEY_ARTWORK = 100;
}
public static interface OnMetadataUpdateListener
{
public abstract  void onMetadataUpdate(int key, java.lang.Object newValue);
}
public static interface OnPlaybackPositionUpdateListener
{
public abstract  void onPlaybackPositionUpdate(long newPositionMs);
}
public static interface OnGetPlaybackPositionListener
{
public abstract  long onGetPlaybackPosition();
}
public  RemoteControlClient(android.app.PendingIntent mediaButtonIntent) { throw new RuntimeException("Stub!"); }
public  RemoteControlClient(android.app.PendingIntent mediaButtonIntent, android.os.Looper looper) { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaSession getMediaSession() { throw new RuntimeException("Stub!"); }
public  android.media.RemoteControlClient.MetadataEditor editMetadata(boolean startEmpty) { throw new RuntimeException("Stub!"); }
public  void setPlaybackState(int state) { throw new RuntimeException("Stub!"); }
public  void setPlaybackState(int state, long timeInMs, float playbackSpeed) { throw new RuntimeException("Stub!"); }
public  void setTransportControlFlags(int transportControlFlags) { throw new RuntimeException("Stub!"); }
public  void setMetadataUpdateListener(android.media.RemoteControlClient.OnMetadataUpdateListener l) { throw new RuntimeException("Stub!"); }
public  void setPlaybackPositionUpdateListener(android.media.RemoteControlClient.OnPlaybackPositionUpdateListener l) { throw new RuntimeException("Stub!"); }
public  void setOnGetPlaybackPositionListener(android.media.RemoteControlClient.OnGetPlaybackPositionListener l) { throw new RuntimeException("Stub!"); }
public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
public static final int FLAG_KEY_MEDIA_NEXT = 128;
public static final int FLAG_KEY_MEDIA_PAUSE = 16;
public static final int FLAG_KEY_MEDIA_PLAY = 4;
public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
public static final int FLAG_KEY_MEDIA_POSITION_UPDATE = 256;
public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
public static final int FLAG_KEY_MEDIA_RATING = 512;
public static final int FLAG_KEY_MEDIA_REWIND = 2;
public static final int FLAG_KEY_MEDIA_STOP = 32;
public static final int PLAYSTATE_BUFFERING = 8;
public static final int PLAYSTATE_ERROR = 9;
public static final int PLAYSTATE_FAST_FORWARDING = 4;
public static final int PLAYSTATE_PAUSED = 2;
public static final int PLAYSTATE_PLAYING = 3;
public static final int PLAYSTATE_REWINDING = 5;
public static final int PLAYSTATE_SKIPPING_BACKWARDS = 7;
public static final int PLAYSTATE_SKIPPING_FORWARDS = 6;
public static final int PLAYSTATE_STOPPED = 1;
}
