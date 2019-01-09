/*
* Copyright (C) 2007 The Android Open Source Project
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
public abstract class AbsSeekBar
  extends android.widget.ProgressBar
{
public  AbsSeekBar(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsSeekBar(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsSeekBar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsSeekBar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setThumb(android.graphics.drawable.Drawable thumb) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getThumb() { throw new RuntimeException("Stub!"); }
public  void setThumbTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getThumbTintList() { throw new RuntimeException("Stub!"); }
public  void setThumbTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getThumbTintMode() { throw new RuntimeException("Stub!"); }
public  int getThumbOffset() { throw new RuntimeException("Stub!"); }
public  void setThumbOffset(int thumbOffset) { throw new RuntimeException("Stub!"); }
public  void setSplitTrack(boolean splitTrack) { throw new RuntimeException("Stub!"); }
public  boolean getSplitTrack() { throw new RuntimeException("Stub!"); }
public  void setTickMark(android.graphics.drawable.Drawable tickMark) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getTickMark() { throw new RuntimeException("Stub!"); }
public  void setTickMarkTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getTickMarkTintList() { throw new RuntimeException("Stub!"); }
public  void setTickMarkTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getTickMarkTintMode() { throw new RuntimeException("Stub!"); }
public  void setKeyProgressIncrement(int increment) { throw new RuntimeException("Stub!"); }
public  int getKeyProgressIncrement() { throw new RuntimeException("Stub!"); }
public synchronized  void setMin(int min) { throw new RuntimeException("Stub!"); }
public synchronized  void setMax(int max) { throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
protected synchronized  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected synchronized  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
}
