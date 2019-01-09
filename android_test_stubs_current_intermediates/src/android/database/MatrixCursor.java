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

package android.database;
public class MatrixCursor
  extends android.database.AbstractCursor
{
public class RowBuilder
{
RowBuilder() { throw new RuntimeException("Stub!"); }
public  android.database.MatrixCursor.RowBuilder add(java.lang.Object columnValue) { throw new RuntimeException("Stub!"); }
public  android.database.MatrixCursor.RowBuilder add(java.lang.String columnName, java.lang.Object value) { throw new RuntimeException("Stub!"); }
}
public  MatrixCursor(java.lang.String[] columnNames, int initialCapacity) { throw new RuntimeException("Stub!"); }
public  MatrixCursor(java.lang.String[] columnNames) { throw new RuntimeException("Stub!"); }
public  android.database.MatrixCursor.RowBuilder newRow() { throw new RuntimeException("Stub!"); }
public  void addRow(java.lang.Object[] columnValues) { throw new RuntimeException("Stub!"); }
public  void addRow(java.lang.Iterable<?> columnValues) { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getColumnNames() { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int column) { throw new RuntimeException("Stub!"); }
public  short getShort(int column) { throw new RuntimeException("Stub!"); }
public  int getInt(int column) { throw new RuntimeException("Stub!"); }
public  long getLong(int column) { throw new RuntimeException("Stub!"); }
public  float getFloat(int column) { throw new RuntimeException("Stub!"); }
public  double getDouble(int column) { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int column) { throw new RuntimeException("Stub!"); }
public  int getType(int column) { throw new RuntimeException("Stub!"); }
public  boolean isNull(int column) { throw new RuntimeException("Stub!"); }
}
