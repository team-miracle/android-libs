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
public class DrawableContainer
  extends android.graphics.drawable.Drawable
  implements android.graphics.drawable.Drawable.Callback
{
public abstract static class DrawableContainerState
  extends android.graphics.drawable.Drawable.ConstantState
{
DrawableContainerState() { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public final  int addChild(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public final  int getChildCount() { throw new RuntimeException("Stub!"); }
public final  android.graphics.drawable.Drawable[] getChildren() { throw new RuntimeException("Stub!"); }
public final  android.graphics.drawable.Drawable getChild(int index) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public final  void setVariablePadding(boolean variable) { throw new RuntimeException("Stub!"); }
public final  android.graphics.Rect getConstantPadding() { throw new RuntimeException("Stub!"); }
public final  void setConstantSize(boolean constant) { throw new RuntimeException("Stub!"); }
public final  boolean isConstantSize() { throw new RuntimeException("Stub!"); }
public final  int getConstantWidth() { throw new RuntimeException("Stub!"); }
public final  int getConstantHeight() { throw new RuntimeException("Stub!"); }
public final  int getConstantMinimumWidth() { throw new RuntimeException("Stub!"); }
public final  int getConstantMinimumHeight() { throw new RuntimeException("Stub!"); }
protected  void computeConstantSize() { throw new RuntimeException("Stub!"); }
public final  void setEnterFadeDuration(int duration) { throw new RuntimeException("Stub!"); }
public final  int getEnterFadeDuration() { throw new RuntimeException("Stub!"); }
public final  void setExitFadeDuration(int duration) { throw new RuntimeException("Stub!"); }
public final  int getExitFadeDuration() { throw new RuntimeException("Stub!"); }
public final  int getOpacity() { throw new RuntimeException("Stub!"); }
public final  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  void growArray(int oldSize, int newSize) { throw new RuntimeException("Stub!"); }
public synchronized  boolean canConstantState() { throw new RuntimeException("Stub!"); }
}
public  DrawableContainer() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
public  void setTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  void setTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  void setEnterFadeDuration(int ms) { throw new RuntimeException("Stub!"); }
public  void setExitFadeDuration(int ms) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
public  boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
public  void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
public  void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
public  void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void getHotspotBounds(android.graphics.Rect outRect) { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
protected  boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
public  boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  int getMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getMinimumHeight() { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when) { throw new RuntimeException("Stub!"); }
public  void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  boolean selectDrawable(int index) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getCurrent() { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
protected  void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState state) { throw new RuntimeException("Stub!"); }
}
