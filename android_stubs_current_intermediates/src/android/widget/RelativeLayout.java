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
public class RelativeLayout
  extends android.view.ViewGroup
{
public static class LayoutParams
  extends android.view.ViewGroup.MarginLayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.widget.RelativeLayout.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  java.lang.String debug(java.lang.String output) { throw new RuntimeException("Stub!"); }
public  void addRule(int verb) { throw new RuntimeException("Stub!"); }
public  void addRule(int verb, int subject) { throw new RuntimeException("Stub!"); }
public  void removeRule(int verb) { throw new RuntimeException("Stub!"); }
public  int getRule(int verb) { throw new RuntimeException("Stub!"); }
public  int[] getRules() { throw new RuntimeException("Stub!"); }
public  void resolveLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="layout")
public boolean alignWithParent;
}
public  RelativeLayout(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  RelativeLayout(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  RelativeLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  RelativeLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
public  void setIgnoreGravity(int viewId) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); }
public  void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  android.widget.RelativeLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public static final int ABOVE = 2;
public static final int ALIGN_BASELINE = 4;
public static final int ALIGN_BOTTOM = 8;
public static final int ALIGN_END = 19;
public static final int ALIGN_LEFT = 5;
public static final int ALIGN_PARENT_BOTTOM = 12;
public static final int ALIGN_PARENT_END = 21;
public static final int ALIGN_PARENT_LEFT = 9;
public static final int ALIGN_PARENT_RIGHT = 11;
public static final int ALIGN_PARENT_START = 20;
public static final int ALIGN_PARENT_TOP = 10;
public static final int ALIGN_RIGHT = 7;
public static final int ALIGN_START = 18;
public static final int ALIGN_TOP = 6;
public static final int BELOW = 3;
public static final int CENTER_HORIZONTAL = 14;
public static final int CENTER_IN_PARENT = 13;
public static final int CENTER_VERTICAL = 15;
public static final int END_OF = 17;
public static final int LEFT_OF = 0;
public static final int RIGHT_OF = 1;
public static final int START_OF = 16;
public static final int TRUE = -1;
}
