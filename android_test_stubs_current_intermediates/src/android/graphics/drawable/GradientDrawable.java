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
public class GradientDrawable
  extends android.graphics.drawable.Drawable
{
public static enum Orientation
{
BL_TR(),
BOTTOM_TOP(),
BR_TL(),
LEFT_RIGHT(),
RIGHT_LEFT(),
TL_BR(),
TOP_BOTTOM(),
TR_BL();
}
public  GradientDrawable() { throw new RuntimeException("Stub!"); }
public  GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation orientation, int[] colors) { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void setCornerRadii(float[] radii) { throw new RuntimeException("Stub!"); }
public  float[] getCornerRadii() { throw new RuntimeException("Stub!"); }
public  void setCornerRadius(float radius) { throw new RuntimeException("Stub!"); }
public  float getCornerRadius() { throw new RuntimeException("Stub!"); }
public  void setStroke(int width, int color) { throw new RuntimeException("Stub!"); }
public  void setStroke(int width, android.content.res.ColorStateList colorStateList) { throw new RuntimeException("Stub!"); }
public  void setStroke(int width, int color, float dashWidth, float dashGap) { throw new RuntimeException("Stub!"); }
public  void setStroke(int width, android.content.res.ColorStateList colorStateList, float dashWidth, float dashGap) { throw new RuntimeException("Stub!"); }
public  void setSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  void setShape(int shape) { throw new RuntimeException("Stub!"); }
public  int getShape() { throw new RuntimeException("Stub!"); }
public  void setGradientType(int gradient) { throw new RuntimeException("Stub!"); }
public  int getGradientType() { throw new RuntimeException("Stub!"); }
public  void setGradientCenter(float x, float y) { throw new RuntimeException("Stub!"); }
public  float getGradientCenterX() { throw new RuntimeException("Stub!"); }
public  float getGradientCenterY() { throw new RuntimeException("Stub!"); }
public  void setGradientRadius(float gradientRadius) { throw new RuntimeException("Stub!"); }
public  float getGradientRadius() { throw new RuntimeException("Stub!"); }
public  void setUseLevel(boolean useLevel) { throw new RuntimeException("Stub!"); }
public  boolean getUseLevel() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.GradientDrawable.Orientation getOrientation() { throw new RuntimeException("Stub!"); }
public  void setOrientation(android.graphics.drawable.GradientDrawable.Orientation orientation) { throw new RuntimeException("Stub!"); }
public  void setColors(int[] colors) { throw new RuntimeException("Stub!"); }
public  int[] getColors() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void setColor(int argb) { throw new RuntimeException("Stub!"); }
public  void setColor(android.content.res.ColorStateList colorStateList) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getColor() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
public  void setTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  void setTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
protected  boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
public static final int LINE = 2;
public static final int LINEAR_GRADIENT = 0;
public static final int OVAL = 1;
public static final int RADIAL_GRADIENT = 1;
public static final int RECTANGLE = 0;
public static final int RING = 3;
public static final int SWEEP_GRADIENT = 2;
}
