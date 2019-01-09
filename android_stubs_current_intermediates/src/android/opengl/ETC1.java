/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.opengl;
public class ETC1
{
public  ETC1() { throw new RuntimeException("Stub!"); }
public static native  void encodeBlock(java.nio.Buffer in, int validPixelMask, java.nio.Buffer out);
public static native  void decodeBlock(java.nio.Buffer in, java.nio.Buffer out);
public static native  int getEncodedDataSize(int width, int height);
public static native  void encodeImage(java.nio.Buffer in, int width, int height, int pixelSize, int stride, java.nio.Buffer out);
public static native  void decodeImage(java.nio.Buffer in, java.nio.Buffer out, int width, int height, int pixelSize, int stride);
public static native  void formatHeader(java.nio.Buffer header, int width, int height);
public static native  boolean isValid(java.nio.Buffer header);
public static native  int getWidth(java.nio.Buffer header);
public static native  int getHeight(java.nio.Buffer header);
public static final int DECODED_BLOCK_SIZE = 48;
public static final int ENCODED_BLOCK_SIZE = 8;
public static final int ETC1_RGB8_OES = 36196;
public static final int ETC_PKM_HEADER_SIZE = 16;
}
