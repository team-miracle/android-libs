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
public abstract class SimpleCursorTreeAdapter
  extends android.widget.ResourceCursorTreeAdapter
{
public static interface ViewBinder
{
public abstract  boolean setViewValue(android.view.View view, android.database.Cursor cursor, int columnIndex);
}
public  SimpleCursorTreeAdapter(android.content.Context context, android.database.Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, int childLayout, int lastChildLayout, java.lang.String[] childFrom, int[] childTo) { super((android.content.Context)null,(android.database.Cursor)null,0,0); throw new RuntimeException("Stub!"); }
public  SimpleCursorTreeAdapter(android.content.Context context, android.database.Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, java.lang.String[] groupFrom, int[] groupTo, int childLayout, java.lang.String[] childFrom, int[] childTo) { super((android.content.Context)null,(android.database.Cursor)null,0,0); throw new RuntimeException("Stub!"); }
public  SimpleCursorTreeAdapter(android.content.Context context, android.database.Cursor cursor, int groupLayout, java.lang.String[] groupFrom, int[] groupTo, int childLayout, java.lang.String[] childFrom, int[] childTo) { super((android.content.Context)null,(android.database.Cursor)null,0,0); throw new RuntimeException("Stub!"); }
public  android.widget.SimpleCursorTreeAdapter.ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
public  void setViewBinder(android.widget.SimpleCursorTreeAdapter.ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
protected  void bindChildView(android.view.View view, android.content.Context context, android.database.Cursor cursor, boolean isLastChild) { throw new RuntimeException("Stub!"); }
protected  void bindGroupView(android.view.View view, android.content.Context context, android.database.Cursor cursor, boolean isExpanded) { throw new RuntimeException("Stub!"); }
protected  void setViewImage(android.widget.ImageView v, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setViewText(android.widget.TextView v, java.lang.String text) { throw new RuntimeException("Stub!"); }
}
