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
public abstract class Image
  implements java.lang.AutoCloseable
{
public abstract static class Plane
{
Plane() { throw new RuntimeException("Stub!"); }
public abstract  int getRowStride();
public abstract  int getPixelStride();
public abstract  java.nio.ByteBuffer getBuffer();
}
Image() { throw new RuntimeException("Stub!"); }
public abstract  int getFormat();
public abstract  int getWidth();
public abstract  int getHeight();
public abstract  long getTimestamp();
public  android.hardware.HardwareBuffer getHardwareBuffer() { throw new RuntimeException("Stub!"); }
public  void setTimestamp(long timestamp) { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getCropRect() { throw new RuntimeException("Stub!"); }
public  void setCropRect(android.graphics.Rect cropRect) { throw new RuntimeException("Stub!"); }
public abstract  android.media.Image.Plane[] getPlanes();
public abstract  void close();
}
