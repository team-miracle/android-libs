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
public abstract class RemoteViewsService
  extends android.app.Service
{
public static interface RemoteViewsFactory
{
public abstract  void onCreate();
public abstract  void onDataSetChanged();
public abstract  void onDestroy();
public abstract  int getCount();
public abstract  android.widget.RemoteViews getViewAt(int position);
public abstract  android.widget.RemoteViews getLoadingView();
public abstract  int getViewTypeCount();
public abstract  long getItemId(int position);
public abstract  boolean hasStableIds();
}
public  RemoteViewsService() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent intent);
}
