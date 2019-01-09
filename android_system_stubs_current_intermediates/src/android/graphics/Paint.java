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
public class Paint
{
public static enum Style
{
FILL(),
FILL_AND_STROKE(),
STROKE();
}
public static enum Cap
{
BUTT(),
ROUND(),
SQUARE();
}
public static enum Join
{
BEVEL(),
MITER(),
ROUND();
}
public static enum Align
{
CENTER(),
LEFT(),
RIGHT();
}
public static class FontMetrics
{
public  FontMetrics() { throw new RuntimeException("Stub!"); }
public float ascent;
public float bottom;
public float descent;
public float leading;
public float top;
}
public static class FontMetricsInt
{
public  FontMetricsInt() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public int ascent;
public int bottom;
public int descent;
public int leading;
public int top;
}
public  Paint() { throw new RuntimeException("Stub!"); }
public  Paint(int flags) { throw new RuntimeException("Stub!"); }
public  Paint(android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.Paint src) { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  void setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  int getHinting() { throw new RuntimeException("Stub!"); }
public  void setHinting(int mode) { throw new RuntimeException("Stub!"); }
public final  boolean isAntiAlias() { throw new RuntimeException("Stub!"); }
public  void setAntiAlias(boolean aa) { throw new RuntimeException("Stub!"); }
public final  boolean isDither() { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public final  boolean isLinearText() { throw new RuntimeException("Stub!"); }
public  void setLinearText(boolean linearText) { throw new RuntimeException("Stub!"); }
public final  boolean isSubpixelText() { throw new RuntimeException("Stub!"); }
public  void setSubpixelText(boolean subpixelText) { throw new RuntimeException("Stub!"); }
public final  boolean isUnderlineText() { throw new RuntimeException("Stub!"); }
public  void setUnderlineText(boolean underlineText) { throw new RuntimeException("Stub!"); }
public final  boolean isStrikeThruText() { throw new RuntimeException("Stub!"); }
public  void setStrikeThruText(boolean strikeThruText) { throw new RuntimeException("Stub!"); }
public final  boolean isFakeBoldText() { throw new RuntimeException("Stub!"); }
public  void setFakeBoldText(boolean fakeBoldText) { throw new RuntimeException("Stub!"); }
public final  boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
public  void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.Style getStyle() { throw new RuntimeException("Stub!"); }
public  void setStyle(android.graphics.Paint.Style style) { throw new RuntimeException("Stub!"); }
public  int getColor() { throw new RuntimeException("Stub!"); }
public  void setColor(int color) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setAlpha(int a) { throw new RuntimeException("Stub!"); }
public  void setARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); }
public  float getStrokeWidth() { throw new RuntimeException("Stub!"); }
public  void setStrokeWidth(float width) { throw new RuntimeException("Stub!"); }
public  float getStrokeMiter() { throw new RuntimeException("Stub!"); }
public  void setStrokeMiter(float miter) { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.Cap getStrokeCap() { throw new RuntimeException("Stub!"); }
public  void setStrokeCap(android.graphics.Paint.Cap cap) { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.Join getStrokeJoin() { throw new RuntimeException("Stub!"); }
public  void setStrokeJoin(android.graphics.Paint.Join join) { throw new RuntimeException("Stub!"); }
public  boolean getFillPath(android.graphics.Path src, android.graphics.Path dst) { throw new RuntimeException("Stub!"); }
public  android.graphics.Shader getShader() { throw new RuntimeException("Stub!"); }
public  android.graphics.Shader setShader(android.graphics.Shader shader) { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter setColorFilter(android.graphics.ColorFilter filter) { throw new RuntimeException("Stub!"); }
public  android.graphics.Xfermode getXfermode() { throw new RuntimeException("Stub!"); }
public  android.graphics.Xfermode setXfermode(android.graphics.Xfermode xfermode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PathEffect getPathEffect() { throw new RuntimeException("Stub!"); }
public  android.graphics.PathEffect setPathEffect(android.graphics.PathEffect effect) { throw new RuntimeException("Stub!"); }
public  android.graphics.MaskFilter getMaskFilter() { throw new RuntimeException("Stub!"); }
public  android.graphics.MaskFilter setMaskFilter(android.graphics.MaskFilter maskfilter) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface getTypeface() { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface setTypeface(android.graphics.Typeface typeface) { throw new RuntimeException("Stub!"); }
public  void setShadowLayer(float radius, float dx, float dy, int shadowColor) { throw new RuntimeException("Stub!"); }
public  void clearShadowLayer() { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.Align getTextAlign() { throw new RuntimeException("Stub!"); }
public  void setTextAlign(android.graphics.Paint.Align align) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getTextLocale() { throw new RuntimeException("Stub!"); }
public  android.os.LocaleList getTextLocales() { throw new RuntimeException("Stub!"); }
public  void setTextLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  void setTextLocales(android.os.LocaleList locales) { throw new RuntimeException("Stub!"); }
public  boolean isElegantTextHeight() { throw new RuntimeException("Stub!"); }
public  void setElegantTextHeight(boolean elegant) { throw new RuntimeException("Stub!"); }
public  float getTextSize() { throw new RuntimeException("Stub!"); }
public  void setTextSize(float textSize) { throw new RuntimeException("Stub!"); }
public  float getTextScaleX() { throw new RuntimeException("Stub!"); }
public  void setTextScaleX(float scaleX) { throw new RuntimeException("Stub!"); }
public  float getTextSkewX() { throw new RuntimeException("Stub!"); }
public  void setTextSkewX(float skewX) { throw new RuntimeException("Stub!"); }
public  float getLetterSpacing() { throw new RuntimeException("Stub!"); }
public  void setLetterSpacing(float letterSpacing) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFontFeatureSettings() { throw new RuntimeException("Stub!"); }
public  void setFontFeatureSettings(java.lang.String settings) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFontVariationSettings() { throw new RuntimeException("Stub!"); }
public  boolean setFontVariationSettings(java.lang.String fontVariationSettings) { throw new RuntimeException("Stub!"); }
public  float ascent() { throw new RuntimeException("Stub!"); }
public  float descent() { throw new RuntimeException("Stub!"); }
public  float getFontMetrics(android.graphics.Paint.FontMetrics metrics) { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.FontMetrics getFontMetrics() { throw new RuntimeException("Stub!"); }
public  int getFontMetricsInt(android.graphics.Paint.FontMetricsInt fmi) { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint.FontMetricsInt getFontMetricsInt() { throw new RuntimeException("Stub!"); }
public  float getFontSpacing() { throw new RuntimeException("Stub!"); }
public  float measureText(char[] text, int index, int count) { throw new RuntimeException("Stub!"); }
public  float measureText(java.lang.String text, int start, int end) { throw new RuntimeException("Stub!"); }
public  float measureText(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  float measureText(java.lang.CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
public  int breakText(char[] text, int index, int count, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
public  int breakText(java.lang.CharSequence text, int start, int end, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
public  int breakText(java.lang.String text, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(char[] text, int index, int count, float[] widths) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(java.lang.CharSequence text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(java.lang.String text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); }
public  int getTextWidths(java.lang.String text, float[] widths) { throw new RuntimeException("Stub!"); }
public  void getTextPath(char[] text, int index, int count, float x, float y, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  void getTextPath(java.lang.String text, int start, int end, float x, float y, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public  void getTextBounds(java.lang.String text, int start, int end, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  void getTextBounds(char[] text, int index, int count, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  boolean hasGlyph(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  float getRunAdvance(char[] text, int start, int end, int contextStart, int contextEnd, boolean isRtl, int offset) { throw new RuntimeException("Stub!"); }
public  float getRunAdvance(java.lang.CharSequence text, int start, int end, int contextStart, int contextEnd, boolean isRtl, int offset) { throw new RuntimeException("Stub!"); }
public  int getOffsetForAdvance(char[] text, int start, int end, int contextStart, int contextEnd, boolean isRtl, float advance) { throw new RuntimeException("Stub!"); }
public  int getOffsetForAdvance(java.lang.CharSequence text, int start, int end, int contextStart, int contextEnd, boolean isRtl, float advance) { throw new RuntimeException("Stub!"); }
public  boolean equalsForTextMeasurement(android.graphics.Paint other) { throw new RuntimeException("Stub!"); }
public static final int ANTI_ALIAS_FLAG = 1;
public static final int DEV_KERN_TEXT_FLAG = 256;
public static final int DITHER_FLAG = 4;
public static final int EMBEDDED_BITMAP_TEXT_FLAG = 1024;
public static final int FAKE_BOLD_TEXT_FLAG = 32;
public static final int FILTER_BITMAP_FLAG = 2;
public static final int HINTING_OFF = 0;
public static final int HINTING_ON = 1;
public static final int LINEAR_TEXT_FLAG = 64;
public static final int STRIKE_THRU_TEXT_FLAG = 16;
public static final int SUBPIXEL_TEXT_FLAG = 128;
public static final int UNDERLINE_TEXT_FLAG = 8;
}
