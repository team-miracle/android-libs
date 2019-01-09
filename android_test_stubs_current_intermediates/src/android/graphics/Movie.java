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

package android.graphics;
@Deprecated
public class Movie
{
Movie() { throw new RuntimeException("Stub!"); }
public native  int width();
public native  int height();
public native  boolean isOpaque();
public native  int duration();
public native  boolean setTime(int relativeMilliseconds);
public  void draw(android.graphics.Canvas canvas, float x, float y, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, float x, float y) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Movie decodeStream(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
public static native  android.graphics.Movie decodeByteArray(byte[] data, int offset, int length);
public static  android.graphics.Movie decodeFile(java.lang.String pathName) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
