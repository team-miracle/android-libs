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
public abstract class SQLiteOpenHelper
{
public  SQLiteOpenHelper(android.content.Context context, java.lang.String name, android.database.sqlite.SQLiteDatabase.CursorFactory factory, int version) { throw new RuntimeException("Stub!"); }
public  SQLiteOpenHelper(android.content.Context context, java.lang.String name, android.database.sqlite.SQLiteDatabase.CursorFactory factory, int version, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
public  SQLiteOpenHelper(android.content.Context context, java.lang.String name, int version, android.database.sqlite.SQLiteDatabase.OpenParams openParams) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDatabaseName() { throw new RuntimeException("Stub!"); }
public  void setWriteAheadLoggingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setLookasideConfig(int slotSize, int slotCount) { throw new RuntimeException("Stub!"); }
public  void setOpenParams(android.database.sqlite.SQLiteDatabase.OpenParams openParams) { throw new RuntimeException("Stub!"); }
public  void setIdleConnectionTimeout(long idleConnectionTimeoutMs) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase getWritableDatabase() { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase getReadableDatabase() { throw new RuntimeException("Stub!"); }
public synchronized  void close() { throw new RuntimeException("Stub!"); }
public  void onConfigure(android.database.sqlite.SQLiteDatabase db) { throw new RuntimeException("Stub!"); }
public abstract  void onCreate(android.database.sqlite.SQLiteDatabase db);
public abstract  void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion);
public  void onDowngrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) { throw new RuntimeException("Stub!"); }
public  void onOpen(android.database.sqlite.SQLiteDatabase db) { throw new RuntimeException("Stub!"); }
}
