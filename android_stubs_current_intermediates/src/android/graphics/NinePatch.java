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
public class NinePatch
{
public  NinePatch(android.graphics.Bitmap bitmap, byte[] chunk) { throw new RuntimeException("Stub!"); }
public  NinePatch(android.graphics.Bitmap bitmap, byte[] chunk, java.lang.String srcName) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint getPaint() { throw new RuntimeException("Stub!"); }
public  void setPaint(android.graphics.Paint p) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getBitmap() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, android.graphics.RectF location) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, android.graphics.Rect location) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, android.graphics.Rect location, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  int getDensity() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public final  boolean hasAlpha() { throw new RuntimeException("Stub!"); }
public final  android.graphics.Region getTransparentRegion(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public static native  boolean isNinePatchChunk(byte[] chunk);
}
