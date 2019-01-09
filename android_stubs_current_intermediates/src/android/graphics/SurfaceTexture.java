/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.graphics;
public class SurfaceTexture
{
public static interface OnFrameAvailableListener
{
public abstract  void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture);
}
@java.lang.SuppressWarnings(value={"serial"})
@java.lang.Deprecated()
public static class OutOfResourcesException
  extends java.lang.Exception
{
public  OutOfResourcesException() { throw new RuntimeException("Stub!"); }
public  OutOfResourcesException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public  SurfaceTexture(int texName) { throw new RuntimeException("Stub!"); }
public  SurfaceTexture(int texName, boolean singleBufferMode) { throw new RuntimeException("Stub!"); }
public  SurfaceTexture(boolean singleBufferMode) { throw new RuntimeException("Stub!"); }
public  void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setDefaultBufferSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  void updateTexImage() { throw new RuntimeException("Stub!"); }
public  void releaseTexImage() { throw new RuntimeException("Stub!"); }
public  void detachFromGLContext() { throw new RuntimeException("Stub!"); }
public  void attachToGLContext(int texName) { throw new RuntimeException("Stub!"); }
public  void getTransformMatrix(float[] mtx) { throw new RuntimeException("Stub!"); }
public  long getTimestamp() { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  boolean isReleased() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
