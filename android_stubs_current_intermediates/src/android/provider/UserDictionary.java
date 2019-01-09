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

package android.provider;
public class UserDictionary
{
public static class Words
  implements android.provider.BaseColumns
{
public  Words() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void addWord(android.content.Context context, java.lang.String word, int frequency, int localeType) { throw new RuntimeException("Stub!"); }
public static  void addWord(android.content.Context context, java.lang.String word, int frequency, java.lang.String shortcut, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final java.lang.String APP_ID = "appid";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String DEFAULT_SORT_ORDER = "frequency DESC";
public static final java.lang.String FREQUENCY = "frequency";
public static final java.lang.String LOCALE = "locale";
@java.lang.Deprecated()
public static final int LOCALE_TYPE_ALL = 0;
@java.lang.Deprecated()
public static final int LOCALE_TYPE_CURRENT = 1;
public static final java.lang.String SHORTCUT = "shortcut";
public static final java.lang.String WORD = "word";
public static final java.lang.String _ID = "_id";
static { CONTENT_URI = null; }
}
public  UserDictionary() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "user_dictionary";
public static final android.net.Uri CONTENT_URI;
static { CONTENT_URI = null; }
}
