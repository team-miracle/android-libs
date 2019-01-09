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

package android.graphics.drawable;
public class LayerDrawable
  extends android.graphics.drawable.Drawable
  implements android.graphics.drawable.Drawable.Callback
{
public  LayerDrawable(android.graphics.drawable.Drawable[] layers) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public  int addLayer(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable findDrawableByLayerId(int id) { throw new RuntimeException("Stub!"); }
public  void setId(int index, int id) { throw new RuntimeException("Stub!"); }
public  int getId(int index) { throw new RuntimeException("Stub!"); }
public  int getNumberOfLayers() { throw new RuntimeException("Stub!"); }
public  boolean setDrawableByLayerId(int id, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  int findIndexByLayerId(int id) { throw new RuntimeException("Stub!"); }
public  void setDrawable(int index, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerSize(int index, int w, int h) { throw new RuntimeException("Stub!"); }
public  void setLayerWidth(int index, int w) { throw new RuntimeException("Stub!"); }
public  int getLayerWidth(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerHeight(int index, int h) { throw new RuntimeException("Stub!"); }
public  int getLayerHeight(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerGravity(int index, int gravity) { throw new RuntimeException("Stub!"); }
public  int getLayerGravity(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerInset(int index, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetRelative(int index, int s, int t, int e, int b) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetLeft(int index, int l) { throw new RuntimeException("Stub!"); }
public  int getLayerInsetLeft(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetRight(int index, int r) { throw new RuntimeException("Stub!"); }
public  int getLayerInsetRight(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetTop(int index, int t) { throw new RuntimeException("Stub!"); }
public  int getLayerInsetTop(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetBottom(int index, int b) { throw new RuntimeException("Stub!"); }
public  int getLayerInsetBottom(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetStart(int index, int s) { throw new RuntimeException("Stub!"); }
public  int getLayerInsetStart(int index) { throw new RuntimeException("Stub!"); }
public  void setLayerInsetEnd(int index, int e) { throw new RuntimeException("Stub!"); }
public  int getLayerInsetEnd(int index) { throw new RuntimeException("Stub!"); }
public  void setPaddingMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getPaddingMode() { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when) { throw new RuntimeException("Stub!"); }
public  void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
public  int getLeftPadding() { throw new RuntimeException("Stub!"); }
public  int getRightPadding() { throw new RuntimeException("Stub!"); }
public  int getStartPadding() { throw new RuntimeException("Stub!"); }
public  int getEndPadding() { throw new RuntimeException("Stub!"); }
public  int getTopPadding() { throw new RuntimeException("Stub!"); }
public  int getBottomPadding() { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
public  void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void getHotspotBounds(android.graphics.Rect outRect) { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
public  void setTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  void setTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  void setOpacity(int opacity) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
public  boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
public  void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
protected  boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
public  boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public static final int INSET_UNDEFINED = -2147483648;
public static final int PADDING_MODE_NEST = 0;
public static final int PADDING_MODE_STACK = 1;
}
