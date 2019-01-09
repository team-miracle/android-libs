/*
* Copyright (C) 2011 The Android Open Source Project
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
public class GridLayout
  extends android.view.ViewGroup
{
public static class LayoutParams
  extends android.view.ViewGroup.MarginLayoutParams
{
public  LayoutParams(android.widget.GridLayout.Spec rowSpec, android.widget.GridLayout.Spec columnSpec) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams params) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams params) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.widget.GridLayout.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.content.Context context, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
protected  void setBaseAttributes(android.content.res.TypedArray attributes, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public android.widget.GridLayout.Spec columnSpec;
public android.widget.GridLayout.Spec rowSpec;
}
public static class Spec
{
Spec() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object that) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
public abstract static class Alignment
{
Alignment() { throw new RuntimeException("Stub!"); }
}
public  GridLayout(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  GridLayout(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  GridLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  GridLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  int getOrientation() { throw new RuntimeException("Stub!"); }
public  void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
public  int getRowCount() { throw new RuntimeException("Stub!"); }
public  void setRowCount(int rowCount) { throw new RuntimeException("Stub!"); }
public  int getColumnCount() { throw new RuntimeException("Stub!"); }
public  void setColumnCount(int columnCount) { throw new RuntimeException("Stub!"); }
public  boolean getUseDefaultMargins() { throw new RuntimeException("Stub!"); }
public  void setUseDefaultMargins(boolean useDefaultMargins) { throw new RuntimeException("Stub!"); }
public  int getAlignmentMode() { throw new RuntimeException("Stub!"); }
public  void setAlignmentMode(int alignmentMode) { throw new RuntimeException("Stub!"); }
public  boolean isRowOrderPreserved() { throw new RuntimeException("Stub!"); }
public  void setRowOrderPreserved(boolean rowOrderPreserved) { throw new RuntimeException("Stub!"); }
public  boolean isColumnOrderPreserved() { throw new RuntimeException("Stub!"); }
public  void setColumnOrderPreserved(boolean columnOrderPreserved) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.widget.GridLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
public  android.widget.GridLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.widget.GridLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
public  void onViewAdded(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void onViewRemoved(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthSpec, int heightSpec) { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, int size, android.widget.GridLayout.Alignment alignment, float weight) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, android.widget.GridLayout.Alignment alignment, float weight) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, int size, float weight) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, float weight) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, int size, android.widget.GridLayout.Alignment alignment) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, android.widget.GridLayout.Alignment alignment) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start, int size) { throw new RuntimeException("Stub!"); }
public static  android.widget.GridLayout.Spec spec(int start) { throw new RuntimeException("Stub!"); }
public static final int ALIGN_BOUNDS = 0;
public static final int ALIGN_MARGINS = 1;
public static final android.widget.GridLayout.Alignment BASELINE;
public static final android.widget.GridLayout.Alignment BOTTOM;
public static final android.widget.GridLayout.Alignment CENTER;
public static final android.widget.GridLayout.Alignment END;
public static final android.widget.GridLayout.Alignment FILL;
public static final int HORIZONTAL = 0;
public static final android.widget.GridLayout.Alignment LEFT;
public static final android.widget.GridLayout.Alignment RIGHT;
public static final android.widget.GridLayout.Alignment START;
public static final android.widget.GridLayout.Alignment TOP;
public static final int UNDEFINED = -2147483648;
public static final int VERTICAL = 1;
static { BASELINE = null; BOTTOM = null; CENTER = null; END = null; FILL = null; LEFT = null; RIGHT = null; START = null; TOP = null; }
}
