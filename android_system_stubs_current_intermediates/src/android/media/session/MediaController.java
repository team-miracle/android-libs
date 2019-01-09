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
public final class MediaController
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onSessionDestroyed() { throw new RuntimeException("Stub!"); }
public  void onSessionEvent(java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPlaybackStateChanged(android.media.session.PlaybackState state) { throw new RuntimeException("Stub!"); }
public  void onMetadataChanged(android.media.MediaMetadata metadata) { throw new RuntimeException("Stub!"); }
public  void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> queue) { throw new RuntimeException("Stub!"); }
public  void onQueueTitleChanged(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  void onExtrasChanged(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo info) { throw new RuntimeException("Stub!"); }
}
public final class TransportControls
{
TransportControls() { throw new RuntimeException("Stub!"); }
public  void prepare() { throw new RuntimeException("Stub!"); }
public  void prepareFromMediaId(java.lang.String mediaId, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void prepareFromSearch(java.lang.String query, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void prepareFromUri(android.net.Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void play() { throw new RuntimeException("Stub!"); }
public  void playFromMediaId(java.lang.String mediaId, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void playFromSearch(java.lang.String query, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void playFromUri(android.net.Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void skipToQueueItem(long id) { throw new RuntimeException("Stub!"); }
public  void pause() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
public  void seekTo(long pos) { throw new RuntimeException("Stub!"); }
public  void fastForward() { throw new RuntimeException("Stub!"); }
public  void skipToNext() { throw new RuntimeException("Stub!"); }
public  void rewind() { throw new RuntimeException("Stub!"); }
public  void skipToPrevious() { throw new RuntimeException("Stub!"); }
public  void setRating(android.media.Rating rating) { throw new RuntimeException("Stub!"); }
public  void sendCustomAction(android.media.session.PlaybackState.CustomAction customAction, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public  void sendCustomAction(java.lang.String action, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
}
public static final class PlaybackInfo
{
PlaybackInfo() { throw new RuntimeException("Stub!"); }
public  int getPlaybackType() { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
public  int getVolumeControl() { throw new RuntimeException("Stub!"); }
public  int getMaxVolume() { throw new RuntimeException("Stub!"); }
public  int getCurrentVolume() { throw new RuntimeException("Stub!"); }
public static final int PLAYBACK_TYPE_LOCAL = 1;
public static final int PLAYBACK_TYPE_REMOTE = 2;
}
public  MediaController(android.content.Context context, android.media.session.MediaSession.Token token) { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaController.TransportControls getTransportControls() { throw new RuntimeException("Stub!"); }
public  boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) { throw new RuntimeException("Stub!"); }
public  android.media.session.PlaybackState getPlaybackState() { throw new RuntimeException("Stub!"); }
public  android.media.MediaMetadata getMetadata() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.session.MediaSession.QueueItem> getQueue() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getQueueTitle() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int getRatingType() { throw new RuntimeException("Stub!"); }
public  long getFlags() { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaController.PlaybackInfo getPlaybackInfo() { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getSessionActivity() { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
public  void setVolumeTo(int value, int flags) { throw new RuntimeException("Stub!"); }
public  void adjustVolume(int direction, int flags) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.media.session.MediaController.Callback callback) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.media.session.MediaController.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.media.session.MediaController.Callback callback) { throw new RuntimeException("Stub!"); }
public  void sendCommand(java.lang.String command, android.os.Bundle args, android.os.ResultReceiver cb) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
}
