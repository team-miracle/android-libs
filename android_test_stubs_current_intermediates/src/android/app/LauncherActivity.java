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

package android.app;
public abstract class LauncherActivity
  extends android.app.ListActivity
{
public static class ListItem
{
public  ListItem() { throw new RuntimeException("Stub!"); }
public java.lang.String className;
public android.os.Bundle extras;
public android.graphics.drawable.Drawable icon;
public java.lang.CharSequence label;
public java.lang.String packageName;
public android.content.pm.ResolveInfo resolveInfo;
}
public class IconResizer
{
public  IconResizer() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable createIconThumbnail(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
}
public  LauncherActivity() { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle icicle) { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  void setTitle(int titleId) { throw new RuntimeException("Stub!"); }
protected  void onSetContentView() { throw new RuntimeException("Stub!"); }
protected  void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) { throw new RuntimeException("Stub!"); }
protected  android.content.Intent intentForPosition(int position) { throw new RuntimeException("Stub!"); }
protected  android.app.LauncherActivity.ListItem itemForPosition(int position) { throw new RuntimeException("Stub!"); }
protected  android.content.Intent getTargetIntent() { throw new RuntimeException("Stub!"); }
protected  java.util.List<android.content.pm.ResolveInfo> onQueryPackageManager(android.content.Intent queryIntent) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.LauncherActivity.ListItem> makeListItems() { throw new RuntimeException("Stub!"); }
}
