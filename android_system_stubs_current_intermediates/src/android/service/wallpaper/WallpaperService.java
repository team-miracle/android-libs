/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.service.wallpaper;
public abstract class WallpaperService
  extends android.app.Service
{
public class Engine
{
public  Engine() { throw new RuntimeException("Stub!"); }
public  android.view.SurfaceHolder getSurfaceHolder() { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
public  boolean isVisible() { throw new RuntimeException("Stub!"); }
public  boolean isPreview() { throw new RuntimeException("Stub!"); }
public  void setTouchEventsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setOffsetNotificationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void onCreate(android.view.SurfaceHolder surfaceHolder) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onVisibilityChanged(boolean visible) { throw new RuntimeException("Stub!"); }
public  void onApplyWindowInsets(android.view.WindowInsets insets) { throw new RuntimeException("Stub!"); }
public  void onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle onCommand(java.lang.String action, int x, int y, int z, android.os.Bundle extras, boolean resultRequested) { throw new RuntimeException("Stub!"); }
public  void onDesiredSizeChanged(int desiredWidth, int desiredHeight) { throw new RuntimeException("Stub!"); }
public  void onSurfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); }
public  void onSurfaceRedrawNeeded(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void onSurfaceCreated(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void onSurfaceDestroyed(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void notifyColorsChanged() { throw new RuntimeException("Stub!"); }
public  android.app.WallpaperColors onComputeColors() { throw new RuntimeException("Stub!"); }
protected  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter out, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
public  WallpaperService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  android.service.wallpaper.WallpaperService.Engine onCreateEngine();
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter out, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
public static final java.lang.String SERVICE_META_DATA = "android.service.wallpaper";
}
