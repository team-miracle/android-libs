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
public abstract class CursorAdapter
  extends android.widget.BaseAdapter
  implements android.widget.Filterable, android.widget.ThemedSpinnerAdapter
{
@java.lang.Deprecated()
public  CursorAdapter(android.content.Context context, android.database.Cursor c) { throw new RuntimeException("Stub!"); }
public  CursorAdapter(android.content.Context context, android.database.Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); }
public  CursorAdapter(android.content.Context context, android.database.Cursor c, int flags) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  void init(android.content.Context context, android.database.Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); }
public  void setDropDownViewTheme(android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources.Theme getDropDownViewTheme() { throw new RuntimeException("Stub!"); }
public  android.database.Cursor getCursor() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getItem(int position) { throw new RuntimeException("Stub!"); }
public  long getItemId(int position) { throw new RuntimeException("Stub!"); }
public  boolean hasStableIds() { throw new RuntimeException("Stub!"); }
public  android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  android.view.View getDropDownView(int position, android.view.View convertView, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public abstract  android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent);
public  android.view.View newDropDownView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public abstract  void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor);
public  void changeCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor swapCursor(android.database.Cursor newCursor) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence convertToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence constraint) { throw new RuntimeException("Stub!"); }
public  android.widget.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  android.widget.FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); }
public  void setFilterQueryProvider(android.widget.FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); }
protected  void onContentChanged() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final int FLAG_AUTO_REQUERY = 1;
public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
}
