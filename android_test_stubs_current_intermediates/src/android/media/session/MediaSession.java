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
public final class MediaSession
{
public static final class Token
  implements android.os.Parcelable
{
Token() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.session.MediaSession.Token> CREATOR;
static { CREATOR = null; }
}
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onCommand(java.lang.String command, android.os.Bundle args, android.os.ResultReceiver cb) { throw new RuntimeException("Stub!"); }
public  boolean onMediaButtonEvent(android.content.Intent mediaButtonIntent) { throw new RuntimeException("Stub!"); }
public  void onPrepare() { throw new RuntimeException("Stub!"); }
public  void onPrepareFromMediaId(java.lang.String mediaId, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPrepareFromSearch(java.lang.String query, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPrepareFromUri(android.net.Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPlay() { throw new RuntimeException("Stub!"); }
public  void onPlayFromSearch(java.lang.String query, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPlayFromMediaId(java.lang.String mediaId, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPlayFromUri(android.net.Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onSkipToQueueItem(long id) { throw new RuntimeException("Stub!"); }
public  void onPause() { throw new RuntimeException("Stub!"); }
public  void onSkipToNext() { throw new RuntimeException("Stub!"); }
public  void onSkipToPrevious() { throw new RuntimeException("Stub!"); }
public  void onFastForward() { throw new RuntimeException("Stub!"); }
public  void onRewind() { throw new RuntimeException("Stub!"); }
public  void onStop() { throw new RuntimeException("Stub!"); }
public  void onSeekTo(long pos) { throw new RuntimeException("Stub!"); }
public  void onSetRating(android.media.Rating rating) { throw new RuntimeException("Stub!"); }
public  void onCustomAction(java.lang.String action, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
}
public static final class QueueItem
  implements android.os.Parcelable
{
public  QueueItem(android.media.MediaDescription description, long id) { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription getDescription() { throw new RuntimeException("Stub!"); }
public  long getQueueId() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.session.MediaSession.QueueItem> CREATOR;
public static final int UNKNOWN_ID = -1;
static { CREATOR = null; }
}
public  MediaSession(android.content.Context context, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  void setCallback(android.media.session.MediaSession.Callback callback) { throw new RuntimeException("Stub!"); }
public  void setCallback(android.media.session.MediaSession.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setSessionActivity(android.app.PendingIntent pi) { throw new RuntimeException("Stub!"); }
public  void setMediaButtonReceiver(android.app.PendingIntent mbr) { throw new RuntimeException("Stub!"); }
public  void setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  void setPlaybackToLocal(android.media.AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
public  void setPlaybackToRemote(android.media.VolumeProvider volumeProvider) { throw new RuntimeException("Stub!"); }
public  void setActive(boolean active) { throw new RuntimeException("Stub!"); }
public  boolean isActive() { throw new RuntimeException("Stub!"); }
public  void sendSessionEvent(java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaController getController() { throw new RuntimeException("Stub!"); }
public  void setPlaybackState(android.media.session.PlaybackState state) { throw new RuntimeException("Stub!"); }
public  void setMetadata(android.media.MediaMetadata metadata) { throw new RuntimeException("Stub!"); }
public  void setQueue(java.util.List<android.media.session.MediaSession.QueueItem> queue) { throw new RuntimeException("Stub!"); }
public  void setQueueTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  void setRatingType(int type) { throw new RuntimeException("Stub!"); }
public  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
@java.lang.Deprecated()
public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
}
