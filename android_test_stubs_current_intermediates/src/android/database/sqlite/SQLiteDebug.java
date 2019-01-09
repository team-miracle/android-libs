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
public final class SQLiteDebug
{
public static class PagerStats
{
public  PagerStats() { throw new RuntimeException("Stub!"); }
public java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> dbStats;
public int largestMemAlloc;
public int memoryUsed;
public int pageCacheOverflow;
}
public static class DbStats
{
public  DbStats(java.lang.String dbName, long pageCount, long pageSize, int lookaside, int hits, int misses, int cachesize) { throw new RuntimeException("Stub!"); }
public java.lang.String cache;
public java.lang.String dbName;
public long dbSize;
public int lookaside;
public long pageSize;
}
SQLiteDebug() { throw new RuntimeException("Stub!"); }
public static  android.database.sqlite.SQLiteDebug.PagerStats getDatabaseInfo() { throw new RuntimeException("Stub!"); }
public static  void dump(android.util.Printer printer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public static final boolean DEBUG_SQL_LOG;
public static final boolean DEBUG_SQL_STATEMENTS;
public static final boolean DEBUG_SQL_TIME;
static { DEBUG_SQL_LOG = false; DEBUG_SQL_STATEMENTS = false; DEBUG_SQL_TIME = false; }
}
