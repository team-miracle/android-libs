/*
* Copyright (C) 2010 The Android Open Source Project
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
public class ActionMenuView
  extends android.widget.LinearLayout
{
public static interface OnMenuItemClickListener
{
public abstract  boolean onMenuItemClick(android.view.MenuItem item);
}
public static class LayoutParams
  extends android.widget.LinearLayout.LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.widget.LinearLayout.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams other) { super((android.widget.LinearLayout.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.widget.ActionMenuView.LayoutParams other) { super((android.widget.LinearLayout.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height) { super((android.widget.LinearLayout.LayoutParams)null); throw new RuntimeException("Stub!"); }
}
public  ActionMenuView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ActionMenuView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setPopupTheme(int resId) { throw new RuntimeException("Stub!"); }
public  int getPopupTheme() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void setOnMenuItemClickListener(android.widget.ActionMenuView.OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void setOverflowIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getOverflowIcon() { throw new RuntimeException("Stub!"); }
protected  android.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
public  android.widget.ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  android.view.Menu getMenu() { throw new RuntimeException("Stub!"); }
public  boolean showOverflowMenu() { throw new RuntimeException("Stub!"); }
public  boolean hideOverflowMenu() { throw new RuntimeException("Stub!"); }
public  boolean isOverflowMenuShowing() { throw new RuntimeException("Stub!"); }
public  void dismissPopupMenus() { throw new RuntimeException("Stub!"); }
}
