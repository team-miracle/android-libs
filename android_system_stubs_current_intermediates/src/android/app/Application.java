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
public class Application
  extends android.content.ContextWrapper
  implements android.content.ComponentCallbacks2
{
public static interface ActivityLifecycleCallbacks
{
public abstract  void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState);
public abstract  void onActivityStarted(android.app.Activity activity);
public abstract  void onActivityResumed(android.app.Activity activity);
public abstract  void onActivityPaused(android.app.Activity activity);
public abstract  void onActivityStopped(android.app.Activity activity);
public abstract  void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState);
public abstract  void onActivityDestroyed(android.app.Activity activity);
}
public static interface OnProvideAssistDataListener
{
public abstract  void onProvideAssistData(android.app.Activity activity, android.os.Bundle data);
}
public  Application() { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onTerminate() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void onLowMemory() { throw new RuntimeException("Stub!"); }
public  void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
public  void registerComponentCallbacks(android.content.ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
public  void unregisterComponentCallbacks(android.content.ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
public  void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks callback) { throw new RuntimeException("Stub!"); }
public  void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks callback) { throw new RuntimeException("Stub!"); }
public  void registerOnProvideAssistDataListener(android.app.Application.OnProvideAssistDataListener callback) { throw new RuntimeException("Stub!"); }
public  void unregisterOnProvideAssistDataListener(android.app.Application.OnProvideAssistDataListener callback) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getProcessName() { throw new RuntimeException("Stub!"); }
}
