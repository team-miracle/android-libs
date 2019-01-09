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
public class Canvas
{
public static enum EdgeType
{
AA(),
BW();
}
public static enum VertexMode
{
TRIANGLES(),
TRIANGLE_FAN(),
TRIANGLE_STRIP();
}
public  Canvas() { throw new RuntimeException("Stub!"); }
public  Canvas(android.graphics.Bitmap bitmap) { throw new RuntimeException("Stub!"); }
public  boolean isHardwareAccelerated() { throw new RuntimeException("Stub!"); }
public  void setBitmap(android.graphics.Bitmap bitmap) { throw new RuntimeException("Stub!"); }
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getDensity() { throw new RuntimeException("Stub!"); }
public  void setDensity(int density) { throw new RuntimeException("Stub!"); }
public  int getMaximumBitmapWidth() { throw new RuntimeException("Stub!"); }
public  int getMaximumBitmapHeight() { throw new RuntimeException("Stub!"); }
public  int save() { throw new RuntimeException("Stub!"); }
@Deprecated
public  int saveLayer(android.graphics.RectF bounds, android.graphics.Paint paint, int saveFlags) { throw new RuntimeException("Stub!"); }
public  int saveLayer(android.graphics.RectF bounds, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
@Deprecated
public  int saveLayer(float left, float top, float right, float bottom, android.graphics.Paint paint, int saveFlags) { throw new RuntimeException("Stub!"); }
public  int saveLayer(float left, float top, float right, float bottom, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
@Deprecated
public  int saveLayerAlpha(android.graphics.RectF bounds, int alpha, int saveFlags) { throw new RuntimeException("Stub!"); }
public  int saveLayerAlpha(android.graphics.RectF bounds, int alpha) { throw new RuntimeException("Stub!"); }
@Deprecated
public  int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) { throw new RuntimeException("Stub!"); }
public  int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) { throw new RuntimeException("Stub!"); }
public  void restore() { throw new RuntimeException("Stub!"); }
public  int getSaveCount() { throw new RuntimeException("Stub!"); }
public  void restoreToCount(int saveCount) { throw new RuntimeException("Stub!"); }
public  void translate(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void scale(float sx, float sy) { throw new RuntimeException("Stub!"); }
public final  void scale(float sx, float sy, float px, float py) { throw new RuntimeException("Stub!"); }
public  void rotate(float degrees) { throw new RuntimeException("Stub!"); }
public final  void rotate(float degrees, float px, float py) { throw new RuntimeException("Stub!"); }
public  void skew(float sx, float sy) { throw new RuntimeException("Stub!"); }
public  void concat(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
public  void setMatrix(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void getMatrix(android.graphics.Matrix ctm) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public final  android.graphics.Matrix getMatrix() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean clipRect(android.graphics.RectF rect, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean clipRect(android.graphics.Rect rect, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean clipRect(android.graphics.RectF rect) { throw new RuntimeException("Stub!"); }
public  boolean clipOutRect(android.graphics.RectF rect) { throw new RuntimeException("Stub!"); }
public  boolean clipRect(android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public  boolean clipOutRect(android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean clipRect(float left, float top, float right, float bottom, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean clipRect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  boolean clipOutRect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
public  boolean clipRect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  boolean clipOutRect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean clipPath(android.graphics.Path path, android.graphics.Region.Op op) { throw new RuntimeException("Stub!"); }
public  boolean clipPath(android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  boolean clipOutPath(android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  android.graphics.DrawFilter getDrawFilter() { throw new RuntimeException("Stub!"); }
public  void setDrawFilter(android.graphics.DrawFilter filter) { throw new RuntimeException("Stub!"); }
public  boolean quickReject(android.graphics.RectF rect, android.graphics.Canvas.EdgeType type) { throw new RuntimeException("Stub!"); }
public  boolean quickReject(android.graphics.Path path, android.graphics.Canvas.EdgeType type) { throw new RuntimeException("Stub!"); }
public  boolean quickReject(float left, float top, float right, float bottom, android.graphics.Canvas.EdgeType type) { throw new RuntimeException("Stub!"); }
public  boolean getClipBounds(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public final  android.graphics.Rect getClipBounds() { throw new RuntimeException("Stub!"); }
public  void drawPicture(android.graphics.Picture picture) { throw new RuntimeException("Stub!"); }
public  void drawPicture(android.graphics.Picture picture, android.graphics.RectF dst) { throw new RuntimeException("Stub!"); }
public  void drawPicture(android.graphics.Picture picture, android.graphics.Rect dst) { throw new RuntimeException("Stub!"); }
public  void drawArc(android.graphics.RectF oval, float startAngle, float sweepAngle, boolean useCenter, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); }
public  void drawBitmap(android.graphics.Bitmap bitmap, float left, float top, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect src, android.graphics.RectF dst, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect src, android.graphics.Rect dst, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawBitmapMesh(android.graphics.Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawCircle(float cx, float cy, float radius, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawColor(int color) { throw new RuntimeException("Stub!"); }
public  void drawColor(int color, android.graphics.PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
public  void drawLine(float startX, float startY, float stopX, float stopY, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawLines(float[] pts, int offset, int count, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawLines(float[] pts, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawOval(android.graphics.RectF oval, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawOval(float left, float top, float right, float bottom, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawPaint(android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawPath(android.graphics.Path path, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawPoint(float x, float y, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawPoints(float[] pts, int offset, int count, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawPoints(float[] pts, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void drawPosText(char[] text, int index, int count, float[] pos, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void drawPosText(java.lang.String text, float[] pos, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawRect(android.graphics.RectF rect, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawRect(android.graphics.Rect r, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawRect(float left, float top, float right, float bottom, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawRGB(int r, int g, int b) { throw new RuntimeException("Stub!"); }
public  void drawRoundRect(android.graphics.RectF rect, float rx, float ry, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawText(char[] text, int index, int count, float x, float y, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawText(java.lang.String text, float x, float y, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawText(java.lang.String text, int start, int end, float x, float y, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawText(java.lang.CharSequence text, int start, int end, float x, float y, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawTextOnPath(char[] text, int index, int count, android.graphics.Path path, float hOffset, float vOffset, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawTextOnPath(java.lang.String text, android.graphics.Path path, float hOffset, float vOffset, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawTextRun(java.lang.CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void drawVertices(android.graphics.Canvas.VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public static final int ALL_SAVE_FLAG = 31;
}
