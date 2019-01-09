/*
* Copyright (C) 2009 The Android Open Source Project
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
public class AppWidgetHost
{
public  AppWidgetHost(android.content.Context context, int hostId) { throw new RuntimeException("Stub!"); }
public  void startListening() { throw new RuntimeException("Stub!"); }
public  void stopListening() { throw new RuntimeException("Stub!"); }
public  int allocateAppWidgetId() { throw new RuntimeException("Stub!"); }
public final  void startAppWidgetConfigureActivityForResult(android.app.Activity activity, int appWidgetId, int intentFlags, int requestCode, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  int[] getAppWidgetIds() { throw new RuntimeException("Stub!"); }
public  void deleteAppWidgetId(int appWidgetId) { throw new RuntimeException("Stub!"); }
public  void deleteHost() { throw new RuntimeException("Stub!"); }
public static  void deleteAllHosts() { throw new RuntimeException("Stub!"); }
public final  android.appwidget.AppWidgetHostView createView(android.content.Context context, int appWidgetId, android.appwidget.AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
protected  android.appwidget.AppWidgetHostView onCreateView(android.content.Context context, int appWidgetId, android.appwidget.AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
protected  void onProviderChanged(int appWidgetId, android.appwidget.AppWidgetProviderInfo appWidget) { throw new RuntimeException("Stub!"); }
protected  void onProvidersChanged() { throw new RuntimeException("Stub!"); }
protected  void clearViews() { throw new RuntimeException("Stub!"); }
}
