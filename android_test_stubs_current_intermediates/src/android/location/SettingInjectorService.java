/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.location;
public abstract class SettingInjectorService
  extends android.app.Service
{
public  SettingInjectorService(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  void onStart(android.content.Intent intent, int startId) { throw new RuntimeException("Stub!"); }
public final  int onStartCommand(android.content.Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected abstract  java.lang.String onGetSummary();
protected abstract  boolean onGetEnabled();
public static final java.lang.String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
public static final java.lang.String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
public static final java.lang.String ATTRIBUTES_NAME = "injected-location-setting";
public static final java.lang.String META_DATA_NAME = "android.location.SettingInjectorService";
}
