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

package android.media;
public class ImageReader
  implements java.lang.AutoCloseable
{
public static interface OnImageAvailableListener
{
public abstract  void onImageAvailable(android.media.ImageReader reader);
}
ImageReader() { throw new RuntimeException("Stub!"); }
public static  android.media.ImageReader newInstance(int width, int height, int format, int maxImages) { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getImageFormat() { throw new RuntimeException("Stub!"); }
public  int getMaxImages() { throw new RuntimeException("Stub!"); }
public  android.view.Surface getSurface() { throw new RuntimeException("Stub!"); }
public  android.media.Image acquireLatestImage() { throw new RuntimeException("Stub!"); }
public  android.media.Image acquireNextImage() { throw new RuntimeException("Stub!"); }
public  void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void discardFreeBuffers() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
