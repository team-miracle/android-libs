/*
* Copyright (C) 2008 The Android Open Source Project
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
public class SearchRecentSuggestionsProvider
  extends android.content.ContentProvider
{
public  SearchRecentSuggestionsProvider() { throw new RuntimeException("Stub!"); }
protected  void setupSuggestions(java.lang.String authority, int mode) { throw new RuntimeException("Stub!"); }
public  int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  boolean onCreate() { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public  int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static final int DATABASE_MODE_2LINES = 2;
public static final int DATABASE_MODE_QUERIES = 1;
}
