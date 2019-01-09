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

package android.content;
public class ContentQueryMap
  extends java.util.Observable
{
public  ContentQueryMap(android.database.Cursor cursor, java.lang.String columnNameOfKey, boolean keepUpdated, android.os.Handler handlerForUpdateNotifications) { throw new RuntimeException("Stub!"); }
public  void setKeepUpdated(boolean keepUpdated) { throw new RuntimeException("Stub!"); }
public synchronized  android.content.ContentValues getValues(java.lang.String rowName) { throw new RuntimeException("Stub!"); }
public  void requery() { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Map<java.lang.String, android.content.ContentValues> getRows() { throw new RuntimeException("Stub!"); }
public synchronized  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
