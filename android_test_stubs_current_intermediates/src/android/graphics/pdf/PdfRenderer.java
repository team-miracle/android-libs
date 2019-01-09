/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.graphics.pdf;
public final class PdfRenderer
  implements java.lang.AutoCloseable
{
public final class Page
  implements java.lang.AutoCloseable
{
Page() { throw new RuntimeException("Stub!"); }
public  int getIndex() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  void render(android.graphics.Bitmap destination, android.graphics.Rect destClip, android.graphics.Matrix transform, int renderMode) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int RENDER_MODE_FOR_DISPLAY = 1;
public static final int RENDER_MODE_FOR_PRINT = 2;
}
public  PdfRenderer(android.os.ParcelFileDescriptor input) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  int getPageCount() { throw new RuntimeException("Stub!"); }
public  boolean shouldScaleForPrinting() { throw new RuntimeException("Stub!"); }
public  android.graphics.pdf.PdfRenderer.Page openPage(int index) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
