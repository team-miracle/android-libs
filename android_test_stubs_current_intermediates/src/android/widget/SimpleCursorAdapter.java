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
public class SimpleCursorAdapter
  extends android.widget.ResourceCursorAdapter
{
public static interface ViewBinder
{
public abstract  boolean setViewValue(android.view.View view, android.database.Cursor cursor, int columnIndex);
}
public static interface CursorToStringConverter
{
public abstract  java.lang.CharSequence convertToString(android.database.Cursor cursor);
}
@java.lang.Deprecated()
public  SimpleCursorAdapter(android.content.Context context, int layout, android.database.Cursor c, java.lang.String[] from, int[] to) { super((android.content.Context)null,0,(android.database.Cursor)null,0); throw new RuntimeException("Stub!"); }
public  SimpleCursorAdapter(android.content.Context context, int layout, android.database.Cursor c, java.lang.String[] from, int[] to, int flags) { super((android.content.Context)null,0,(android.database.Cursor)null,0); throw new RuntimeException("Stub!"); }
public  void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.widget.SimpleCursorAdapter.ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
public  void setViewBinder(android.widget.SimpleCursorAdapter.ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
public  void setViewImage(android.widget.ImageView v, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setViewText(android.widget.TextView v, java.lang.String text) { throw new RuntimeException("Stub!"); }
public  int getStringConversionColumn() { throw new RuntimeException("Stub!"); }
public  void setStringConversionColumn(int stringConversionColumn) { throw new RuntimeException("Stub!"); }
public  android.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() { throw new RuntimeException("Stub!"); }
public  void setCursorToStringConverter(android.widget.SimpleCursorAdapter.CursorToStringConverter cursorToStringConverter) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence convertToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor swapCursor(android.database.Cursor c) { throw new RuntimeException("Stub!"); }
public  void changeCursorAndColumns(android.database.Cursor c, java.lang.String[] from, int[] to) { throw new RuntimeException("Stub!"); }
}
