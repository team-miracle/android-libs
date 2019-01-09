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
public final class MediaSessionManager
{
public static interface OnActiveSessionsChangedListener
{
public abstract  void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> controllers);
}
public static interface OnVolumeKeyLongPressListener
{
public abstract  void onVolumeKeyLongPress(android.view.KeyEvent event);
}
public static interface OnMediaKeyListener
{
public abstract  boolean onMediaKey(android.view.KeyEvent event);
}
public static final class RemoteUserInfo
{
public  RemoteUserInfo(java.lang.String packageName, int pid, int uid) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  int getPid() { throw new RuntimeException("Stub!"); }
public  int getUid() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
MediaSessionManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.session.MediaController> getActiveSessions(android.content.ComponentName notificationListener) { throw new RuntimeException("Stub!"); }
public  void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener sessionListener, android.content.ComponentName notificationListener) { throw new RuntimeException("Stub!"); }
public  void addOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener sessionListener, android.content.ComponentName notificationListener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removeOnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener listener) { throw new RuntimeException("Stub!"); }
public  boolean isTrustedForMediaControl(android.media.session.MediaSessionManager.RemoteUserInfo userInfo) { throw new RuntimeException("Stub!"); }
public  void setOnVolumeKeyLongPressListener(android.media.session.MediaSessionManager.OnVolumeKeyLongPressListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnMediaKeyListener(android.media.session.MediaSessionManager.OnMediaKeyListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
}
