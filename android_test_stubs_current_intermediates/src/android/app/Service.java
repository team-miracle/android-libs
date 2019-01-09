/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.app;
public abstract class Service
  extends android.content.ContextWrapper
  implements android.content.ComponentCallbacks2
{
public  Service() { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public final  android.app.Application getApplication() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onStart(android.content.Intent intent, int startId) { throw new RuntimeException("Stub!"); }
public  int onStartCommand(android.content.Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void onLowMemory() { throw new RuntimeException("Stub!"); }
public  void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
public abstract  android.os.IBinder onBind(android.content.Intent intent);
public  boolean onUnbind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onRebind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onTaskRemoved(android.content.Intent rootIntent) { throw new RuntimeException("Stub!"); }
public final  void stopSelf() { throw new RuntimeException("Stub!"); }
public final  void stopSelf(int startId) { throw new RuntimeException("Stub!"); }
public final  boolean stopSelfResult(int startId) { throw new RuntimeException("Stub!"); }
public final  void startForeground(int id, android.app.Notification notification) { throw new RuntimeException("Stub!"); }
public final  void stopForeground(boolean removeNotification) { throw new RuntimeException("Stub!"); }
public final  void stopForeground(int flags) { throw new RuntimeException("Stub!"); }
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public static final int START_CONTINUATION_MASK = 15;
public static final int START_FLAG_REDELIVERY = 1;
public static final int START_FLAG_RETRY = 2;
public static final int START_NOT_STICKY = 2;
public static final int START_REDELIVER_INTENT = 3;
public static final int START_STICKY = 1;
public static final int START_STICKY_COMPATIBILITY = 0;
public static final int STOP_FOREGROUND_DETACH = 2;
public static final int STOP_FOREGROUND_REMOVE = 1;
}
