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

package android.appwidget;
public class AppWidgetProvider
  extends android.content.BroadcastReceiver
{
public  AppWidgetProvider() { throw new RuntimeException("Stub!"); }
public  void onReceive(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) { throw new RuntimeException("Stub!"); }
public  void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) { throw new RuntimeException("Stub!"); }
public  void onDeleted(android.content.Context context, int[] appWidgetIds) { throw new RuntimeException("Stub!"); }
public  void onEnabled(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void onDisabled(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void onRestored(android.content.Context context, int[] oldWidgetIds, int[] newWidgetIds) { throw new RuntimeException("Stub!"); }
}
