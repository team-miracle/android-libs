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
public class ListView
  extends android.widget.AbsListView
{
public class FixedViewInfo
{
public  FixedViewInfo() { throw new RuntimeException("Stub!"); }
public java.lang.Object data;
public boolean isSelectable;
public android.view.View view;
}
public  ListView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ListView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ListView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ListView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  int getMaxScrollAmount() { throw new RuntimeException("Stub!"); }
public  void addHeaderView(android.view.View v, java.lang.Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); }
public  void addHeaderView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  int getHeaderViewsCount() { throw new RuntimeException("Stub!"); }
public  boolean removeHeaderView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  void addFooterView(android.view.View v, java.lang.Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); }
public  void addFooterView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  int getFooterViewsCount() { throw new RuntimeException("Stub!"); }
public  boolean removeFooterView(android.view.View v) { throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public  void setRemoteViewsAdapter(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.ListAdapter adapter) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); }
public  void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); }
public  void smoothScrollByOffset(int offset) { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void layoutChildren() { throw new RuntimeException("Stub!"); }
protected  boolean canAnimate() { throw new RuntimeException("Stub!"); }
public  void setSelection(int position) { throw new RuntimeException("Stub!"); }
public  void setSelectionAfterHeaderView() { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void setItemsCanFocus(boolean itemsCanFocus) { throw new RuntimeException("Stub!"); }
public  boolean getItemsCanFocus() { throw new RuntimeException("Stub!"); }
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public  void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long drawingTime) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDivider() { throw new RuntimeException("Stub!"); }
public  void setDivider(android.graphics.drawable.Drawable divider) { throw new RuntimeException("Stub!"); }
public  int getDividerHeight() { throw new RuntimeException("Stub!"); }
public  void setDividerHeight(int height) { throw new RuntimeException("Stub!"); }
public  void setHeaderDividersEnabled(boolean headerDividersEnabled) { throw new RuntimeException("Stub!"); }
public  boolean areHeaderDividersEnabled() { throw new RuntimeException("Stub!"); }
public  void setFooterDividersEnabled(boolean footerDividersEnabled) { throw new RuntimeException("Stub!"); }
public  boolean areFooterDividersEnabled() { throw new RuntimeException("Stub!"); }
public  void setOverscrollHeader(android.graphics.drawable.Drawable header) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getOverscrollHeader() { throw new RuntimeException("Stub!"); }
public  void setOverscrollFooter(android.graphics.drawable.Drawable footer) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getOverscrollFooter() { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onFinishInflate() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  long[] getCheckItemIds() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void onInitializeAccessibilityNodeInfoForItem(android.view.View view, int position, android.view.accessibility.AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
}
