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

package android.widget;
@android.widget.RemoteViews.RemoteView()
public class ImageView
  extends android.view.View
{
public static enum ScaleType
{
CENTER(),
CENTER_CROP(),
CENTER_INSIDE(),
FIT_CENTER(),
FIT_END(),
FIT_START(),
FIT_XY(),
MATRIX();
}
public  ImageView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ImageView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ImageView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ImageView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public  boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); }
public  boolean getAdjustViewBounds() { throw new RuntimeException("Stub!"); }
public  void setAdjustViewBounds(boolean adjustViewBounds) { throw new RuntimeException("Stub!"); }
public  int getMaxWidth() { throw new RuntimeException("Stub!"); }
public  void setMaxWidth(int maxWidth) { throw new RuntimeException("Stub!"); }
public  int getMaxHeight() { throw new RuntimeException("Stub!"); }
public  void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable() { throw new RuntimeException("Stub!"); }
public  void setImageResource(int resId) { throw new RuntimeException("Stub!"); }
public  void setImageURI(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  void setImageDrawable(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  void setImageIcon(android.graphics.drawable.Icon icon) { throw new RuntimeException("Stub!"); }
public  void setImageTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getImageTintList() { throw new RuntimeException("Stub!"); }
public  void setImageTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getImageTintMode() { throw new RuntimeException("Stub!"); }
public  void setImageBitmap(android.graphics.Bitmap bm) { throw new RuntimeException("Stub!"); }
public  void setImageState(int[] state, boolean merge) { throw new RuntimeException("Stub!"); }
public  void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
public  void setImageLevel(int level) { throw new RuntimeException("Stub!"); }
public  void setScaleType(android.widget.ImageView.ScaleType scaleType) { throw new RuntimeException("Stub!"); }
public  android.widget.ImageView.ScaleType getScaleType() { throw new RuntimeException("Stub!"); }
public  android.graphics.Matrix getImageMatrix() { throw new RuntimeException("Stub!"); }
public  void setImageMatrix(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
public  boolean getCropToPadding() { throw new RuntimeException("Stub!"); }
public  void setCropToPadding(boolean cropToPadding) { throw new RuntimeException("Stub!"); }
public  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
public  void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="layout")
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  void setBaseline(int baseline) { throw new RuntimeException("Stub!"); }
public  void setBaselineAlignBottom(boolean aligned) { throw new RuntimeException("Stub!"); }
public  boolean getBaselineAlignBottom() { throw new RuntimeException("Stub!"); }
public final  void setColorFilter(int color, android.graphics.PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
public final  void setColorFilter(int color) { throw new RuntimeException("Stub!"); }
public final  void clearColorFilter() { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter cf) { throw new RuntimeException("Stub!"); }
public  int getImageAlpha() { throw new RuntimeException("Stub!"); }
public  void setImageAlpha(int alpha) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public  void onVisibilityAggregated(boolean isVisible) { throw new RuntimeException("Stub!"); }
public  void setVisibility(int visibility) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
}
