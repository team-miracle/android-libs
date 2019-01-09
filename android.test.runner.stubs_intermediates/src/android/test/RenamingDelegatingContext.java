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

package android.test;
@java.lang.Deprecated()
public class RenamingDelegatingContext
  extends android.content.ContextWrapper
{
public  RenamingDelegatingContext(android.content.Context context, java.lang.String filePrefix) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RenamingDelegatingContext(android.content.Context context, android.content.Context fileContext, java.lang.String filePrefix) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> T providerWithRenamedContext(java.lang.Class<T> contentProvider, android.content.Context c, java.lang.String filePrefix) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> T providerWithRenamedContext(java.lang.Class<T> contentProvider, android.content.Context c, java.lang.String filePrefix, boolean allowAccessToExistingFilesAndDbs) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
public  void makeExistingFilesAndDbsAccessible() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDatabasePrefix() { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
public  boolean deleteDatabase(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.File getDatabasePath(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] databaseList() { throw new RuntimeException("Stub!"); }
public  java.io.FileInputStream openFileInput(java.lang.String name) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.FileOutputStream openFileOutput(java.lang.String name, int mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.File getFileStreamPath(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean deleteFile(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] fileList() { throw new RuntimeException("Stub!"); }
public  java.io.File getCacheDir() { throw new RuntimeException("Stub!"); }
}
