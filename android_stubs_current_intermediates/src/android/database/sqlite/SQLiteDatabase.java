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
public final class SQLiteDatabase
  extends android.database.sqlite.SQLiteClosable
{
public static interface CursorFactory
{
public abstract  android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase db, android.database.sqlite.SQLiteCursorDriver masterQuery, java.lang.String editTable, android.database.sqlite.SQLiteQuery query);
}
public static final class OpenParams
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.database.sqlite.SQLiteDatabase.OpenParams params) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setLookasideConfig(int slotSize, int slotCount) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setOpenFlags(int openFlags) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder addOpenFlags(int openFlags) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder removeOpenFlags(int openFlags) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setCursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setErrorHandler(android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setIdleConnectionTimeout(long idleConnectionTimeoutMs) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setJournalMode(java.lang.String journalMode) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams.Builder setSynchronousMode(java.lang.String syncMode) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.OpenParams build() { throw new RuntimeException("Stub!"); }
}
OpenParams() { throw new RuntimeException("Stub!"); }
public  int getLookasideSlotSize() { throw new RuntimeException("Stub!"); }
public  int getLookasideSlotCount() { throw new RuntimeException("Stub!"); }
public  int getOpenFlags() { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase.CursorFactory getCursorFactory() { throw new RuntimeException("Stub!"); }
public  android.database.DatabaseErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
public  long getIdleConnectionTimeout() { throw new RuntimeException("Stub!"); }
public  java.lang.String getJournalMode() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSynchronousMode() { throw new RuntimeException("Stub!"); }
}
SQLiteDatabase() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
public static  int releaseMemory() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setLockingEnabled(boolean lockingEnabled) { throw new RuntimeException("Stub!"); }
public  void beginTransaction() { throw new RuntimeException("Stub!"); }
public  void beginTransactionNonExclusive() { throw new RuntimeException("Stub!"); }
public  void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); }
public  void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); }
public  void endTransaction() { throw new RuntimeException("Stub!"); }
public  void setTransactionSuccessful() { throw new RuntimeException("Stub!"); }
public  boolean inTransaction() { throw new RuntimeException("Stub!"); }
public  boolean isDbLockedByCurrentThread() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isDbLockedByOtherThreads() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean yieldIfContended() { throw new RuntimeException("Stub!"); }
public  boolean yieldIfContendedSafely() { throw new RuntimeException("Stub!"); }
public  boolean yieldIfContendedSafely(long sleepAfterYieldDelay) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.Map<java.lang.String, java.lang.String> getSyncedTables() { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String path, android.database.sqlite.SQLiteDatabase.CursorFactory factory, int flags) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openDatabase(java.io.File path, android.database.sqlite.SQLiteDatabase.OpenParams openParams) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String path, android.database.sqlite.SQLiteDatabase.CursorFactory factory, int flags, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.io.File file, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String path, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String path, android.database.sqlite.SQLiteDatabase.CursorFactory factory, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
public static  boolean deleteDatabase(java.io.File file) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase create(android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDatabase createInMemory(android.database.sqlite.SQLiteDatabase.OpenParams openParams) { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  void setVersion(int version) { throw new RuntimeException("Stub!"); }
public  long getMaximumSize() { throw new RuntimeException("Stub!"); }
public  long setMaximumSize(long numBytes) { throw new RuntimeException("Stub!"); }
public  long getPageSize() { throw new RuntimeException("Stub!"); }
public  void setPageSize(long numBytes) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void markTableSyncable(java.lang.String table, java.lang.String deletedTable) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void markTableSyncable(java.lang.String table, java.lang.String foreignKey, java.lang.String updateTable) { throw new RuntimeException("Stub!"); }
public static  java.lang.String findEditTable(java.lang.String tables) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteStatement compileStatement(java.lang.String sql) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor queryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor queryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor rawQuery(java.lang.String sql, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor rawQuery(java.lang.String sql, java.lang.String[] selectionArgs, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String sql, java.lang.String[] selectionArgs, java.lang.String editTable) { throw new RuntimeException("Stub!"); }
public  android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String sql, java.lang.String[] selectionArgs, java.lang.String editTable, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  long insert(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  long insertOrThrow(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues values) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  long replace(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues initialValues) { throw new RuntimeException("Stub!"); }
public  long replaceOrThrow(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues initialValues) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  long insertWithOnConflict(java.lang.String table, java.lang.String nullColumnHack, android.content.ContentValues initialValues, int conflictAlgorithm) { throw new RuntimeException("Stub!"); }
public  int delete(java.lang.String table, java.lang.String whereClause, java.lang.String[] whereArgs) { throw new RuntimeException("Stub!"); }
public  int update(java.lang.String table, android.content.ContentValues values, java.lang.String whereClause, java.lang.String[] whereArgs) { throw new RuntimeException("Stub!"); }
public  int updateWithOnConflict(java.lang.String table, android.content.ContentValues values, java.lang.String whereClause, java.lang.String[] whereArgs, int conflictAlgorithm) { throw new RuntimeException("Stub!"); }
public  void execSQL(java.lang.String sql) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  void execSQL(java.lang.String sql, java.lang.Object[] bindArgs) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
public  void validateSql(java.lang.String sql, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  boolean needUpgrade(int newVersion) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  void setMaxSqlCacheSize(int cacheSize) { throw new RuntimeException("Stub!"); }
public  void setForeignKeyConstraintsEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean enableWriteAheadLogging() { throw new RuntimeException("Stub!"); }
public  void disableWriteAheadLogging() { throw new RuntimeException("Stub!"); }
public  boolean isWriteAheadLoggingEnabled() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() { throw new RuntimeException("Stub!"); }
public  boolean isDatabaseIntegrityOk() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int CONFLICT_ABORT = 2;
public static final int CONFLICT_FAIL = 3;
public static final int CONFLICT_IGNORE = 4;
public static final int CONFLICT_NONE = 0;
public static final int CONFLICT_REPLACE = 5;
public static final int CONFLICT_ROLLBACK = 1;
public static final int CREATE_IF_NECESSARY = 268435456;
public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
public static final int MAX_SQL_CACHE_SIZE = 100;
public static final int NO_LOCALIZED_COLLATORS = 16;
public static final int OPEN_READONLY = 1;
public static final int OPEN_READWRITE = 0;
public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
}
