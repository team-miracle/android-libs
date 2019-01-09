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

package android.service.media;
public abstract class MediaBrowserService
  extends android.app.Service
{
public class Result<T>
{
Result() { throw new RuntimeException("Stub!"); }
public  void sendResult(T result) { throw new RuntimeException("Stub!"); }
public  void detach() { throw new RuntimeException("Stub!"); }
}
public static final class BrowserRoot
{
public  BrowserRoot(java.lang.String rootId, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  java.lang.String getRootId() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
}
public  MediaBrowserService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void dump(java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public abstract  android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String clientPackageName, int clientUid, android.os.Bundle rootHints);
public abstract  void onLoadChildren(java.lang.String parentId, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result);
public  void onLoadChildren(java.lang.String parentId, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void onLoadItem(java.lang.String itemId, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> result) { throw new RuntimeException("Stub!"); }
public  void setSessionToken(android.media.session.MediaSession.Token token) { throw new RuntimeException("Stub!"); }
public  android.media.session.MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
public final  android.os.Bundle getBrowserRootHints() { throw new RuntimeException("Stub!"); }
public final  android.media.session.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() { throw new RuntimeException("Stub!"); }
public  void notifyChildrenChanged(java.lang.String parentId) { throw new RuntimeException("Stub!"); }
public  void notifyChildrenChanged(java.lang.String parentId, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
}
