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

package android.graphics.drawable;
public class AdaptiveIconDrawable
  extends android.graphics.drawable.Drawable
  implements android.graphics.drawable.Drawable.Callback
{
public  AdaptiveIconDrawable(android.graphics.drawable.Drawable backgroundDrawable, android.graphics.drawable.Drawable foregroundDrawable) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  float getExtraInsetFraction() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path getIconMask() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getForeground() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBackground() { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void invalidateSelf() { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  android.graphics.Region getSafeZone() { throw new RuntimeException("Stub!"); }
public  android.graphics.Region getTransparentRegion() { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when) { throw new RuntimeException("Stub!"); }
public  void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
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
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
public static final float MASK_SIZE = 100.0f;
}
