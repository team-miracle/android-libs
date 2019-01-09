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

package android.database.sqlite;
public final class SQLiteDirectCursorDriver
  implements android.database.sqlite.SQLiteCursorDriver
{
public  SQLiteDirectCursorDriver(android.database.sqlite.SQLiteDatabase db, java.lang.String sql, java.lang.String editTable, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.database.sqlite.SQLiteDatabase.CursorFactory factory, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  void cursorClosed() { throw new RuntimeException("Stub!"); }
public  void setBindArguments(java.lang.String[] bindArgs) { throw new RuntimeException("Stub!"); }
public  void cursorDeactivated() { throw new RuntimeException("Stub!"); }
public  void cursorRequeried(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
