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
public abstract class AbstractWindowedCursor
  extends android.database.AbstractCursor
{
public  AbstractWindowedCursor() { throw new RuntimeException("Stub!"); }
public  byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
public  void copyStringToBuffer(int columnIndex, android.database.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public  short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
public  int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
public  long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
public  float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
public  double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
public  boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isString(int columnIndex) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isLong(int columnIndex) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
public  int getType(int columnIndex) { throw new RuntimeException("Stub!"); }
protected  void checkPosition() { throw new RuntimeException("Stub!"); }
public  android.database.CursorWindow getWindow() { throw new RuntimeException("Stub!"); }
public  void setWindow(android.database.CursorWindow window) { throw new RuntimeException("Stub!"); }
public  boolean hasWindow() { throw new RuntimeException("Stub!"); }
protected android.database.CursorWindow mWindow;
}
