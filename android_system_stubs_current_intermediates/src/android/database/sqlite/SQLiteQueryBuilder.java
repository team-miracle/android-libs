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
public class SQLiteQueryBuilder
{
public  SQLiteQueryBuilder() { throw new RuntimeException("Stub!"); }
public  void setDistinct(boolean distinct) { throw new RuntimeException("Stub!"); }
public  java.lang.String getTables() { throw new RuntimeException("Stub!"); }
public  void setTables(java.lang.String inTables) { throw new RuntimeException("Stub!"); }
public  void appendWhere(java.lang.CharSequence inWhere) { throw new RuntimeException("Stub!"); }
public  void appendWhereEscapeString(java.lang.String inWhere) { throw new RuntimeException("Stub!"); }
public  void setProjectionMap(java.util.Map<java.lang.String, java.lang.String> columnMap) { throw new RuntimeException("Stub!"); }
public  void setCursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public  void setStrict(boolean flag) { throw new RuntimeException("Stub!"); }
public static  java.lang.String buildQueryString(boolean distinct, java.lang.String tables, java.lang.String[] columns, java.lang.String where, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public static  void appendColumns(java.lang.StringBuilder s, java.lang.String[] columns) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.database.sqlite.SQLiteDatabase db, java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.database.sqlite.SQLiteDatabase db, java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.database.sqlite.SQLiteDatabase db, java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder, java.lang.String limit, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  java.lang.String buildQuery(java.lang.String[] projectionIn, java.lang.String selection, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String buildQuery(java.lang.String[] projectionIn, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  java.lang.String buildUnionSubQuery(java.lang.String typeDiscriminatorColumn, java.lang.String[] unionColumns, java.util.Set<java.lang.String> columnsPresentInTable, int computedColumnsOffset, java.lang.String typeDiscriminatorValue, java.lang.String selection, java.lang.String groupBy, java.lang.String having) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String buildUnionSubQuery(java.lang.String typeDiscriminatorColumn, java.lang.String[] unionColumns, java.util.Set<java.lang.String> columnsPresentInTable, int computedColumnsOffset, java.lang.String typeDiscriminatorValue, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having) { throw new RuntimeException("Stub!"); }
public  java.lang.String buildUnionQuery(java.lang.String[] subQueries, java.lang.String sortOrder, java.lang.String limit) { throw new RuntimeException("Stub!"); }
}
