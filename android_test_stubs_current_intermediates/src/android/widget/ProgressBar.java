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
public class ProgressBar
  extends android.view.View
{
public  ProgressBar(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ProgressBar(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ProgressBar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ProgressBar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="progress")
public synchronized  boolean isIndeterminate() { throw new RuntimeException("Stub!"); }
public synchronized  void setIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getIndeterminateDrawable() { throw new RuntimeException("Stub!"); }
public  void setIndeterminateDrawable(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
public  void setIndeterminateTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getIndeterminateTintList() { throw new RuntimeException("Stub!"); }
public  void setIndeterminateTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getIndeterminateTintMode() { throw new RuntimeException("Stub!"); }
public  void setIndeterminateDrawableTiled(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getProgressDrawable() { throw new RuntimeException("Stub!"); }
public  void setProgressDrawable(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
public  void setProgressTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getProgressTintList() { throw new RuntimeException("Stub!"); }
public  void setProgressTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getProgressTintMode() { throw new RuntimeException("Stub!"); }
public  void setProgressBackgroundTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getProgressBackgroundTintList() { throw new RuntimeException("Stub!"); }
public  void setProgressBackgroundTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getProgressBackgroundTintMode() { throw new RuntimeException("Stub!"); }
public  void setSecondaryProgressTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getSecondaryProgressTintList() { throw new RuntimeException("Stub!"); }
public  void setSecondaryProgressTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getSecondaryProgressTintMode() { throw new RuntimeException("Stub!"); }
public  void setProgressDrawableTiled(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
public  void postInvalidate() { throw new RuntimeException("Stub!"); }
public synchronized  void setProgress(int progress) { throw new RuntimeException("Stub!"); }
public  void setProgress(int progress, boolean animate) { throw new RuntimeException("Stub!"); }
public synchronized  void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="progress")
public synchronized  int getProgress() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="progress")
public synchronized  int getSecondaryProgress() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="progress")
public synchronized  int getMin() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="progress")
public synchronized  int getMax() { throw new RuntimeException("Stub!"); }
public synchronized  void setMin(int min) { throw new RuntimeException("Stub!"); }
public synchronized  void setMax(int max) { throw new RuntimeException("Stub!"); }
public final synchronized  void incrementProgressBy(int diff) { throw new RuntimeException("Stub!"); }
public final synchronized  void incrementSecondaryProgressBy(int diff) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.content.Context context, int resID) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.view.animation.Interpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  void onVisibilityAggregated(boolean isVisible) { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
protected synchronized  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected synchronized  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  boolean isAnimating() { throw new RuntimeException("Stub!"); }
}
