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
public class PixelFormat
{
public  PixelFormat() { throw new RuntimeException("Stub!"); }
public static  void getPixelFormatInfo(int format, android.graphics.PixelFormat info) { throw new RuntimeException("Stub!"); }
public static  boolean formatHasAlpha(int format) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final int A_8 = 8;
@java.lang.Deprecated()
public static final int JPEG = 256;
@java.lang.Deprecated()
public static final int LA_88 = 10;
@java.lang.Deprecated()
public static final int L_8 = 9;
public static final int OPAQUE = -1;
public static final int RGBA_1010102 = 43;
@java.lang.Deprecated()
public static final int RGBA_4444 = 7;
@java.lang.Deprecated()
public static final int RGBA_5551 = 6;
public static final int RGBA_8888 = 1;
public static final int RGBA_F16 = 22;
public static final int RGBX_8888 = 2;
@java.lang.Deprecated()
public static final int RGB_332 = 11;
public static final int RGB_565 = 4;
public static final int RGB_888 = 3;
public static final int TRANSLUCENT = -3;
public static final int TRANSPARENT = -2;
public static final int UNKNOWN = 0;
@java.lang.Deprecated()
public static final int YCbCr_420_SP = 17;
@java.lang.Deprecated()
public static final int YCbCr_422_I = 20;
@java.lang.Deprecated()
public static final int YCbCr_422_SP = 16;
public int bitsPerPixel;
public int bytesPerPixel;
}
