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
public class LinearLayout
  extends android.view.ViewGroup
{
public static class LayoutParams
  extends android.view.ViewGroup.MarginLayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height, float weight) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams p) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.widget.LinearLayout.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  java.lang.String debug(java.lang.String output) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="layout",mapping={@android.view.ViewDebug.IntToString(from=-1,to="NONE"),@android.view.ViewDebug.IntToString(from=0,to="NONE"),@android.view.ViewDebug.IntToString(from=48,to="TOP"),@android.view.ViewDebug.IntToString(from=80,to="BOTTOM"),@android.view.ViewDebug.IntToString(from=3,to="LEFT"),@android.view.ViewDebug.IntToString(from=5,to="RIGHT"),@android.view.ViewDebug.IntToString(from=8388611,to="START"),@android.view.ViewDebug.IntToString(from=8388613,to="END"),@android.view.ViewDebug.IntToString(from=16,to="CENTER_VERTICAL"),@android.view.ViewDebug.IntToString(from=112,to="FILL_VERTICAL"),@android.view.ViewDebug.IntToString(from=1,to="CENTER_HORIZONTAL"),@android.view.ViewDebug.IntToString(from=7,to="FILL_HORIZONTAL"),@android.view.ViewDebug.IntToString(from=17,to="CENTER"),@android.view.ViewDebug.IntToString(from=119,to="FILL")})
public int gravity;
@android.view.ViewDebug.ExportedProperty(category="layout")
public float weight;
}
public  LinearLayout(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  LinearLayout(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  LinearLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  LinearLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setShowDividers(int showDividers) { throw new RuntimeException("Stub!"); }
public  boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
public  int getShowDividers() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDividerDrawable() { throw new RuntimeException("Stub!"); }
public  void setDividerDrawable(android.graphics.drawable.Drawable divider) { throw new RuntimeException("Stub!"); }
public  void setDividerPadding(int padding) { throw new RuntimeException("Stub!"); }
public  int getDividerPadding() { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  boolean isBaselineAligned() { throw new RuntimeException("Stub!"); }
public  void setBaselineAligned(boolean baselineAligned) { throw new RuntimeException("Stub!"); }
public  boolean isMeasureWithLargestChildEnabled() { throw new RuntimeException("Stub!"); }
public  void setMeasureWithLargestChildEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  int getBaselineAlignedChildIndex() { throw new RuntimeException("Stub!"); }
public  void setBaselineAlignedChildIndex(int i) { throw new RuntimeException("Stub!"); }
public  float getWeightSum() { throw new RuntimeException("Stub!"); }
public  void setWeightSum(float weightSum) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public  void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
public  int getOrientation() { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); }
public  void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); }
public  android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public static final int HORIZONTAL = 0;
public static final int SHOW_DIVIDER_BEGINNING = 1;
public static final int SHOW_DIVIDER_END = 4;
public static final int SHOW_DIVIDER_MIDDLE = 2;
public static final int SHOW_DIVIDER_NONE = 0;
public static final int VERTICAL = 1;
}
