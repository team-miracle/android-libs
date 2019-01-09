/*
* Copyright (C) 2010 The Android Open Source Project
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
@java.lang.Deprecated()
public class CursorLoader
  extends android.content.AsyncTaskLoader<android.database.Cursor>
{
public  CursorLoader(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  CursorLoader(android.content.Context context, android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  android.database.Cursor loadInBackground() { throw new RuntimeException("Stub!"); }
public  void cancelLoadInBackground() { throw new RuntimeException("Stub!"); }
public  void deliverResult(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
protected  void onStartLoading() { throw new RuntimeException("Stub!"); }
protected  void onStopLoading() { throw new RuntimeException("Stub!"); }
public  void onCanceled(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
protected  void onReset() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  void setUri(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getProjection() { throw new RuntimeException("Stub!"); }
public  void setProjection(java.lang.String[] projection) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSelection() { throw new RuntimeException("Stub!"); }
public  void setSelection(java.lang.String selection) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSelectionArgs() { throw new RuntimeException("Stub!"); }
public  void setSelectionArgs(java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSortOrder() { throw new RuntimeException("Stub!"); }
public  void setSortOrder(java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
