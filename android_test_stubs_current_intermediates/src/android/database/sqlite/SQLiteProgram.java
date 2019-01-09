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
public abstract class SQLiteProgram
  extends android.database.sqlite.SQLiteClosable
{
SQLiteProgram() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public final  int getUniqueId() { throw new RuntimeException("Stub!"); }
public  void bindNull(int index) { throw new RuntimeException("Stub!"); }
public  void bindLong(int index, long value) { throw new RuntimeException("Stub!"); }
public  void bindDouble(int index, double value) { throw new RuntimeException("Stub!"); }
public  void bindString(int index, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void bindBlob(int index, byte[] value) { throw new RuntimeException("Stub!"); }
public  void clearBindings() { throw new RuntimeException("Stub!"); }
public  void bindAllArgsAsStrings(java.lang.String[] bindArgs) { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
}
