/*
* Copyright (C) 2007 The Android Open Source Project
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
public class Surface
  implements android.os.Parcelable
{
@java.lang.SuppressWarnings(value={"serial"})
public static class OutOfResourcesException
  extends java.lang.RuntimeException
{
public  OutOfResourcesException() { throw new RuntimeException("Stub!"); }
public  OutOfResourcesException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public  Surface(android.graphics.SurfaceTexture surfaceTexture) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  boolean isValid() { throw new RuntimeException("Stub!"); }
public  android.graphics.Canvas lockCanvas(android.graphics.Rect inOutDirty) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void unlockCanvasAndPost(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  android.graphics.Canvas lockHardwareCanvas() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unlockCanvas(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.Surface> CREATOR;
public static final int ROTATION_0 = 0;
public static final int ROTATION_180 = 2;
public static final int ROTATION_270 = 3;
public static final int ROTATION_90 = 1;
static { CREATOR = null; }
}
