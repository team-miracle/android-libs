/*
* Copyright (C) 2015 The Android Open Source Project
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


package android.service.chooser;
public abstract class ChooserTargetService
  extends android.app.Service
{
public  ChooserTargetService() { throw new RuntimeException("Stub!"); }
public abstract  java.util.List<android.service.chooser.ChooserTarget> onGetChooserTargets(android.content.ComponentName targetActivityName, android.content.IntentFilter matchedFilter);
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
public static final java.lang.String META_DATA_NAME = "android.service.chooser.chooser_target_service";
public static final java.lang.String SERVICE_INTERFACE = "android.service.chooser.ChooserTargetService";
}
