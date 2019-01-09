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

package android.graphics;
public class BitmapFactory
{
public static class Options
{
public  Options() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void requestCancelDecode() { throw new RuntimeException("Stub!"); }
public android.graphics.Bitmap inBitmap;
public int inDensity;
@Deprecated
public boolean inDither;
@java.lang.Deprecated()
public boolean inInputShareable;
public boolean inJustDecodeBounds;
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
public boolean inMutable;
@java.lang.Deprecated()
public boolean inPreferQualityOverSpeed;
public android.graphics.ColorSpace inPreferredColorSpace;
public android.graphics.Bitmap.Config inPreferredConfig;
public boolean inPremultiplied;
@java.lang.Deprecated()
public boolean inPurgeable;
public int inSampleSize;
public boolean inScaled;
public int inScreenDensity;
public int inTargetDensity;
public byte[] inTempStorage = null;
@java.lang.Deprecated()
public boolean mCancel;
public android.graphics.ColorSpace outColorSpace;
public android.graphics.Bitmap.Config outConfig;
public int outHeight;
public java.lang.String outMimeType;
public int outWidth;
}
public  BitmapFactory() { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeFile(java.lang.String pathName, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeFile(java.lang.String pathName) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeResourceStream(android.content.res.Resources res, android.util.TypedValue value, java.io.InputStream is, android.graphics.Rect pad, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeResource(android.content.res.Resources res, int id, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeResource(android.content.res.Resources res, int id) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeByteArray(byte[] data, int offset, int length, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeByteArray(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeStream(java.io.InputStream is, android.graphics.Rect outPadding, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeStream(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor fd, android.graphics.Rect outPadding, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
}
