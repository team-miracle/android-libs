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

package android.database.sqlite;
public class SQLiteCursor
  extends android.database.AbstractWindowedCursor
{
@java.lang.Deprecated()
public  SQLiteCursor(android.database.sqlite.SQLiteDatabase db, android.database.sqlite.SQLiteCursorDriver driver, java.lang.String editTable, android.database.sqlite.SQLiteQuery query) { throw new RuntimeException("Stub!"); }
public  SQLiteCursor(android.database.sqlite.SQLiteCursorDriver driver, java.lang.String editTable, android.database.sqlite.SQLiteQuery query) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase getDatabase() { throw new RuntimeException("Stub!"); }
public  boolean onMove(int oldPosition, int newPosition) { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  int getColumnIndex(java.lang.String columnName) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getColumnNames() { throw new RuntimeException("Stub!"); }
public  void deactivate() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean requery() { throw new RuntimeException("Stub!"); }
public  void setWindow(android.database.CursorWindow window) { throw new RuntimeException("Stub!"); }
public  void setSelectionArguments(java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  void setFillWindowForwardOnly(boolean fillWindowForwardOnly) { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
}
