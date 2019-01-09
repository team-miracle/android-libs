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
package android.service.quicksettings;
public class TileService
  extends android.app.Service
{
public  TileService() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onTileAdded() { throw new RuntimeException("Stub!"); }
public  void onTileRemoved() { throw new RuntimeException("Stub!"); }
public  void onStartListening() { throw new RuntimeException("Stub!"); }
public  void onStopListening() { throw new RuntimeException("Stub!"); }
public  void onClick() { throw new RuntimeException("Stub!"); }
public final  void showDialog(android.app.Dialog dialog) { throw new RuntimeException("Stub!"); }
public final  void unlockAndRun(java.lang.Runnable runnable) { throw new RuntimeException("Stub!"); }
public final  boolean isSecure() { throw new RuntimeException("Stub!"); }
public final  boolean isLocked() { throw new RuntimeException("Stub!"); }
public final  void startActivityAndCollapse(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  android.service.quicksettings.Tile getQsTile() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final  void requestListeningState(android.content.Context context, android.content.ComponentName component) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
public static final java.lang.String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
public static final java.lang.String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
}
