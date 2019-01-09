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
@java.lang.Deprecated()
public class Gallery
  extends android.widget.AbsSpinner
  implements android.view.GestureDetector.OnGestureListener
{
public static class LayoutParams
  extends android.view.ViewGroup.LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
}
public  Gallery(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Gallery(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Gallery(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Gallery(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
public  void setCallbackDuringFling(boolean shouldCallback) { throw new RuntimeException("Stub!"); }
public  void setAnimationDuration(int animationDurationMillis) { throw new RuntimeException("Stub!"); }
public  void setSpacing(int spacing) { throw new RuntimeException("Stub!"); }
public  void setUnselectedAlpha(float unselectedAlpha) { throw new RuntimeException("Stub!"); }
protected  boolean getChildStaticTransformation(android.view.View child, android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollExtent() { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onSingleTapUp(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
public  boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); }
public  boolean onDown(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  void onLongPress(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  void onShowPress(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); }
protected  void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
protected  android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView, float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenu() { throw new RuntimeException("Stub!"); }
public  boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
protected  int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
}
