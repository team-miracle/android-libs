/* Copyright (C) 2010 The Android Open Source Project
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
public final class BitmapRegionDecoder
{
BitmapRegionDecoder() { throw new RuntimeException("Stub!"); }
public static  android.graphics.BitmapRegionDecoder newInstance(byte[] data, int offset, int length, boolean isShareable) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.BitmapRegionDecoder newInstance(java.io.FileDescriptor fd, boolean isShareable) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.BitmapRegionDecoder newInstance(java.io.InputStream is, boolean isShareable) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.BitmapRegionDecoder newInstance(java.lang.String pathName, boolean isShareable) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap decodeRegion(android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public  boolean isRecycled() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
