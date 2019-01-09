/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.test.mock;
@java.lang.Deprecated()
public class MockCursor
  implements android.database.Cursor
{
public  MockCursor() { throw new RuntimeException("Stub!"); }
public  int getColumnCount() { throw new RuntimeException("Stub!"); }
public  int getColumnIndex(java.lang.String columnName) { throw new RuntimeException("Stub!"); }
public  int getColumnIndexOrThrow(java.lang.String columnName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getColumnNames() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
public  int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
public  long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
public  short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
public  float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
public  double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
public  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int getPosition() { throw new RuntimeException("Stub!"); }
public  boolean isAfterLast() { throw new RuntimeException("Stub!"); }
public  boolean isBeforeFirst() { throw new RuntimeException("Stub!"); }
public  boolean isFirst() { throw new RuntimeException("Stub!"); }
public  boolean isLast() { throw new RuntimeException("Stub!"); }
public  boolean move(int offset) { throw new RuntimeException("Stub!"); }
public  boolean moveToFirst() { throw new RuntimeException("Stub!"); }
public  boolean moveToLast() { throw new RuntimeException("Stub!"); }
public  boolean moveToNext() { throw new RuntimeException("Stub!"); }
public  boolean moveToPrevious() { throw new RuntimeException("Stub!"); }
public  boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int columnIndex, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void deactivate() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean requery() { throw new RuntimeException("Stub!"); }
public  void registerContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void registerDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle respond(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); }
public  void setNotificationUri(android.content.ContentResolver cr, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.net.Uri getNotificationUri() { throw new RuntimeException("Stub!"); }
public  void unregisterContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterDataSetObserver(android.database.DataSetObserver observer) { throw new RuntimeException("Stub!"); }
public  int getType(int columnIndex) { throw new RuntimeException("Stub!"); }
}
