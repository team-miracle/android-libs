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

package android.database;
public class CursorWindow
  extends android.database.sqlite.SQLiteClosable
  implements android.os.Parcelable
{
public  CursorWindow(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  CursorWindow(java.lang.String name, long windowSizeBytes) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  CursorWindow(boolean localWindow) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  int getStartPosition() { throw new RuntimeException("Stub!"); }
public  void setStartPosition(int pos) { throw new RuntimeException("Stub!"); }
public  int getNumRows() { throw new RuntimeException("Stub!"); }
public  boolean setNumColumns(int columnNum) { throw new RuntimeException("Stub!"); }
public  boolean allocRow() { throw new RuntimeException("Stub!"); }
public  void freeLastRow() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isNull(int row, int column) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isBlob(int row, int column) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isLong(int row, int column) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isFloat(int row, int column) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isString(int row, int column) { throw new RuntimeException("Stub!"); }
public  int getType(int row, int column) { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int row, int column) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int row, int column) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int row, int column, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public  long getLong(int row, int column) { throw new RuntimeException("Stub!"); }
public  double getDouble(int row, int column) { throw new RuntimeException("Stub!"); }
public  short getShort(int row, int column) { throw new RuntimeException("Stub!"); }
public  int getInt(int row, int column) { throw new RuntimeException("Stub!"); }
public  float getFloat(int row, int column) { throw new RuntimeException("Stub!"); }
public  boolean putBlob(byte[] value, int row, int column) { throw new RuntimeException("Stub!"); }
public  boolean putString(java.lang.String value, int row, int column) { throw new RuntimeException("Stub!"); }
public  boolean putLong(long value, int row, int column) { throw new RuntimeException("Stub!"); }
public  boolean putDouble(double value, int row, int column) { throw new RuntimeException("Stub!"); }
public  boolean putNull(int row, int column) { throw new RuntimeException("Stub!"); }
public static  android.database.CursorWindow newFromParcel(android.os.Parcel p) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
protected  void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.database.CursorWindow> CREATOR;
static { CREATOR = null; }
}
