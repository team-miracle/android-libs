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
public abstract class AsyncQueryHandler
  extends android.os.Handler
{
protected static final class WorkerArgs
{
protected  WorkerArgs() { throw new RuntimeException("Stub!"); }
public java.lang.Object cookie;
public android.os.Handler handler;
public java.lang.String orderBy;
public java.lang.String[] projection = null;
public java.lang.Object result;
public java.lang.String selection;
public java.lang.String[] selectionArgs = null;
public android.net.Uri uri;
public android.content.ContentValues values;
}
protected class WorkerHandler
  extends android.os.Handler
{
public  WorkerHandler(android.os.Looper looper) { throw new RuntimeException("Stub!"); }
public  void handleMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
}
public  AsyncQueryHandler(android.content.ContentResolver cr) { throw new RuntimeException("Stub!"); }
protected  android.os.Handler createHandler(android.os.Looper looper) { throw new RuntimeException("Stub!"); }
public  void startQuery(int token, java.lang.Object cookie, android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String orderBy) { throw new RuntimeException("Stub!"); }
public final  void cancelOperation(int token) { throw new RuntimeException("Stub!"); }
public final  void startInsert(int token, java.lang.Object cookie, android.net.Uri uri, android.content.ContentValues initialValues) { throw new RuntimeException("Stub!"); }
public final  void startUpdate(int token, java.lang.Object cookie, android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  void startDelete(int token, java.lang.Object cookie, android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
protected  void onQueryComplete(int token, java.lang.Object cookie, android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
protected  void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
protected  void onUpdateComplete(int token, java.lang.Object cookie, int result) { throw new RuntimeException("Stub!"); }
protected  void onDeleteComplete(int token, java.lang.Object cookie, int result) { throw new RuntimeException("Stub!"); }
public  void handleMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
}
