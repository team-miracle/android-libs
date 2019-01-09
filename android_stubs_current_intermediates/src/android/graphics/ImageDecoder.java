/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class ImageDecoder
  implements java.lang.AutoCloseable
{
public abstract static class Source
{
Source() { throw new RuntimeException("Stub!"); }
}
public static class ImageInfo
{
ImageInfo() { throw new RuntimeException("Stub!"); }
public  android.util.Size getSize() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMimeType() { throw new RuntimeException("Stub!"); }
public  boolean isAnimated() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorSpace getColorSpace() { throw new RuntimeException("Stub!"); }
}
public static interface OnHeaderDecodedListener
{
public abstract  void onHeaderDecoded(android.graphics.ImageDecoder decoder, android.graphics.ImageDecoder.ImageInfo info, android.graphics.ImageDecoder.Source source);
}
public static final class DecodeException
  extends java.io.IOException
{
DecodeException() { throw new RuntimeException("Stub!"); }
public  int getError() { throw new RuntimeException("Stub!"); }
public  android.graphics.ImageDecoder.Source getSource() { throw new RuntimeException("Stub!"); }
public static final int SOURCE_EXCEPTION = 1;
public static final int SOURCE_INCOMPLETE = 2;
public static final int SOURCE_MALFORMED_DATA = 3;
}
public static interface OnPartialImageListener
{
public abstract  boolean onPartialImage(android.graphics.ImageDecoder.DecodeException exception);
}
ImageDecoder() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static  android.graphics.ImageDecoder.Source createSource(android.content.res.Resources res, int resId) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ImageDecoder.Source createSource(android.content.ContentResolver cr, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ImageDecoder.Source createSource(android.content.res.AssetManager assets, java.lang.String fileName) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ImageDecoder.Source createSource(java.nio.ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
public static  android.graphics.ImageDecoder.Source createSource(java.io.File file) { throw new RuntimeException("Stub!"); }
public  void setTargetSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  void setTargetSampleSize(int sampleSize) { throw new RuntimeException("Stub!"); }
public  void setAllocator(int allocator) { throw new RuntimeException("Stub!"); }
public  int getAllocator() { throw new RuntimeException("Stub!"); }
public  void setUnpremultipliedRequired(boolean unpremultipliedRequired) { throw new RuntimeException("Stub!"); }
public  boolean isUnpremultipliedRequired() { throw new RuntimeException("Stub!"); }
public  void setPostProcessor(android.graphics.PostProcessor postProcessor) { throw new RuntimeException("Stub!"); }
public  android.graphics.PostProcessor getPostProcessor() { throw new RuntimeException("Stub!"); }
public  void setOnPartialImageListener(android.graphics.ImageDecoder.OnPartialImageListener listener) { throw new RuntimeException("Stub!"); }
public  android.graphics.ImageDecoder.OnPartialImageListener getOnPartialImageListener() { throw new RuntimeException("Stub!"); }
public  void setCrop(android.graphics.Rect subset) { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getCrop() { throw new RuntimeException("Stub!"); }
public  void setMutableRequired(boolean mutable) { throw new RuntimeException("Stub!"); }
public  boolean isMutableRequired() { throw new RuntimeException("Stub!"); }
public  void setMemorySizePolicy(int policy) { throw new RuntimeException("Stub!"); }
public  int getMemorySizePolicy() { throw new RuntimeException("Stub!"); }
public  void setDecodeAsAlphaMaskEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isDecodeAsAlphaMaskEnabled() { throw new RuntimeException("Stub!"); }
public  void setTargetColorSpace(android.graphics.ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source src, android.graphics.ImageDecoder.OnHeaderDecodedListener listener) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source src) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source src, android.graphics.ImageDecoder.OnHeaderDecodedListener listener) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source src) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int ALLOCATOR_DEFAULT = 0;
public static final int ALLOCATOR_HARDWARE = 3;
public static final int ALLOCATOR_SHARED_MEMORY = 2;
public static final int ALLOCATOR_SOFTWARE = 1;
public static final int MEMORY_POLICY_DEFAULT = 1;
public static final int MEMORY_POLICY_LOW_RAM = 0;
}
