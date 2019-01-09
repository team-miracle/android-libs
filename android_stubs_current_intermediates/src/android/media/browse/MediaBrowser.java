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

package android.media.browse;
public final class MediaBrowser
{
public static class MediaItem
  implements android.os.Parcelable
{
public  MediaItem(android.media.MediaDescription description, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  boolean isBrowsable() { throw new RuntimeException("Stub!"); }
public  boolean isPlayable() { throw new RuntimeException("Stub!"); }
public  android.media.MediaDescription getDescription() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMediaId() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.browse.MediaBrowser.MediaItem> CREATOR;
public static final int FLAG_BROWSABLE = 1;
public static final int FLAG_PLAYABLE = 2;
static { CREATOR = null; }
}
public static class ConnectionCallback
{
public  ConnectionCallback() { throw new RuntimeException("Stub!"); }
public  void onConnected() { throw new RuntimeException("Stub!"); }
public  void onConnectionSuspended() { throw new RuntimeException("Stub!"); }
public  void onConnectionFailed() { throw new RuntimeException("Stub!"); }
}
public abstract static class SubscriptionCallback
{
public  SubscriptionCallback() { throw new RuntimeException("Stub!"); }
public  void onChildrenLoaded(java.lang.String parentId, java.util.List<android.media.browse.MediaBrowser.MediaItem> children) { throw new RuntimeException("Stub!"); }
public  void onChildrenLoaded(java.lang.String parentId, java.util.List<android.media.browse.MediaBrowser.MediaItem> children, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void onError(java.lang.String parentId) { throw new RuntimeException("Stub!"); }
public  void onError(java.lang.String parentId, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
}
public abstract static class ItemCallback
{
public  ItemCallback() { throw new RuntimeException("Stub!"); }
public  void onItemLoaded(android.media.browse.MediaBrowser.MediaItem item) { throw new RuntimeException("Stub!"); }
public  void onError(java.lang.String mediaId) { throw new RuntimeException("Stub!"); }
}
public  MediaBrowser(android.content.Context context, android.content.ComponentName serviceComponent, android.media.browse.MediaBrowser.ConnectionCallback callback, android.os.Bundle rootHints) { throw new RuntimeException("Stub!"); }
public  void connect() { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getServiceComponent() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRoot() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
public  void subscribe(java.lang.String parentId, android.media.browse.MediaBrowser.SubscriptionCallback callback) { throw new RuntimeException("Stub!"); }
public  void subscribe(java.lang.String parentId, android.os.Bundle options, android.media.browse.MediaBrowser.SubscriptionCallback callback) { throw new RuntimeException("Stub!"); }
public  void unsubscribe(java.lang.String parentId) { throw new RuntimeException("Stub!"); }
public  void unsubscribe(java.lang.String parentId, android.media.browse.MediaBrowser.SubscriptionCallback callback) { throw new RuntimeException("Stub!"); }
public  void getItem(java.lang.String mediaId, android.media.browse.MediaBrowser.ItemCallback cb) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_PAGE = "android.media.browse.extra.PAGE";
public static final java.lang.String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
}
