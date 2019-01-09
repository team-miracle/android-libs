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
public abstract class ResourceCursorAdapter
  extends android.widget.CursorAdapter
{
@java.lang.Deprecated()
public  ResourceCursorAdapter(android.content.Context context, int layout, android.database.Cursor c) { super((android.content.Context)null,(android.database.Cursor)null,0); throw new RuntimeException("Stub!"); }
public  ResourceCursorAdapter(android.content.Context context, int layout, android.database.Cursor c, boolean autoRequery) { super((android.content.Context)null,(android.database.Cursor)null,0); throw new RuntimeException("Stub!"); }
public  ResourceCursorAdapter(android.content.Context context, int layout, android.database.Cursor c, int flags) { super((android.content.Context)null,(android.database.Cursor)null,0); throw new RuntimeException("Stub!"); }
public  void setDropDownViewTheme(android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public  android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View newDropDownView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  void setViewResource(int layout) { throw new RuntimeException("Stub!"); }
public  void setDropDownViewResource(int dropDownLayout) { throw new RuntimeException("Stub!"); }
}
