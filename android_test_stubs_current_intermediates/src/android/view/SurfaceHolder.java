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

package android.view;
public interface SurfaceHolder
{
public static class BadSurfaceTypeException
  extends java.lang.RuntimeException
{
public  BadSurfaceTypeException() { throw new RuntimeException("Stub!"); }
public  BadSurfaceTypeException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static interface Callback
{
public abstract  void surfaceCreated(android.view.SurfaceHolder holder);
public abstract  void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height);
public abstract  void surfaceDestroyed(android.view.SurfaceHolder holder);
}
public static interface Callback2
  extends android.view.SurfaceHolder.Callback
{
public abstract  void surfaceRedrawNeeded(android.view.SurfaceHolder holder);
default public  void surfaceRedrawNeededAsync(android.view.SurfaceHolder holder, java.lang.Runnable drawingFinished) { throw new RuntimeException("Stub!"); }
}
public abstract  void addCallback(android.view.SurfaceHolder.Callback callback);
public abstract  void removeCallback(android.view.SurfaceHolder.Callback callback);
public abstract  boolean isCreating();
@java.lang.Deprecated()
public abstract  void setType(int type);
public abstract  void setFixedSize(int width, int height);
public abstract  void setSizeFromLayout();
public abstract  void setFormat(int format);
public abstract  void setKeepScreenOn(boolean screenOn);
public abstract  android.graphics.Canvas lockCanvas();
public abstract  android.graphics.Canvas lockCanvas(android.graphics.Rect dirty);
default public  android.graphics.Canvas lockHardwareCanvas() { throw new RuntimeException("Stub!"); }
public abstract  void unlockCanvasAndPost(android.graphics.Canvas canvas);
public abstract  android.graphics.Rect getSurfaceFrame();
public abstract  android.view.Surface getSurface();
@java.lang.Deprecated()
public static final int SURFACE_TYPE_GPU = 2;
@java.lang.Deprecated()
public static final int SURFACE_TYPE_HARDWARE = 1;
@java.lang.Deprecated()
public static final int SURFACE_TYPE_NORMAL = 0;
@java.lang.Deprecated()
public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;
}
