/*
* Copyright (C) 2008 The Android Open Source Project
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
public abstract class IntentService
  extends android.app.Service
{
public  IntentService(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setIntentRedelivery(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onStart(android.content.Intent intent, int startId) { throw new RuntimeException("Stub!"); }
public  int onStartCommand(android.content.Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
protected abstract  void onHandleIntent(android.content.Intent intent);
}
