/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.appwidget;
public class AppWidgetHostView
  extends android.widget.FrameLayout
{
public  AppWidgetHostView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
public  AppWidgetHostView(android.content.Context context, int animationIn, int animationOut) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setAppWidget(int appWidgetId, android.appwidget.AppWidgetProviderInfo info) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Rect getDefaultPaddingForWidget(android.content.Context context, android.content.ComponentName component, android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  int getAppWidgetId() { throw new RuntimeException("Stub!"); }
public  android.appwidget.AppWidgetProviderInfo getAppWidgetInfo() { throw new RuntimeException("Stub!"); }
protected  void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void updateAppWidgetSize(android.os.Bundle newOptions, int minWidth, int minHeight, int maxWidth, int maxHeight) { throw new RuntimeException("Stub!"); }
public  void updateAppWidgetOptions(android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  void setExecutor(java.util.concurrent.Executor executor) { throw new RuntimeException("Stub!"); }
public  void updateAppWidget(android.widget.RemoteViews remoteViews) { throw new RuntimeException("Stub!"); }
protected  void prepareView(android.view.View view) { throw new RuntimeException("Stub!"); }
protected  android.view.View getDefaultView() { throw new RuntimeException("Stub!"); }
protected  android.view.View getErrorView() { throw new RuntimeException("Stub!"); }
}
