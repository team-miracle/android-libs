/*
* Copyright (C) 2014 The Android Open Source Project
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
public class SearchIndexablesContract
{
public static final class XmlResource
  extends android.provider.SearchIndexablesContract.BaseColumns
{
XmlResource() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_XML_RESID = "xmlResId";
public static final java.lang.String MIME_TYPE = "vnd.android.cursor.dir/indexables_xml_res";
}
public static final class RawData
  extends android.provider.SearchIndexablesContract.BaseColumns
{
RawData() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_ENTRIES = "entries";
public static final java.lang.String COLUMN_KEY = "key";
public static final java.lang.String COLUMN_KEYWORDS = "keywords";
public static final java.lang.String COLUMN_SCREEN_TITLE = "screenTitle";
public static final java.lang.String COLUMN_SUMMARY_OFF = "summaryOff";
public static final java.lang.String COLUMN_SUMMARY_ON = "summaryOn";
public static final java.lang.String COLUMN_TITLE = "title";
public static final java.lang.String COLUMN_USER_ID = "user_id";
public static final java.lang.String MIME_TYPE = "vnd.android.cursor.dir/indexables_raw";
}
public static final class NonIndexableKey
  extends android.provider.SearchIndexablesContract.BaseColumns
{
NonIndexableKey() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_KEY_VALUE = "key";
public static final java.lang.String MIME_TYPE = "vnd.android.cursor.dir/non_indexables_key";
}
public static class BaseColumns
{
BaseColumns() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_CLASS_NAME = "className";
public static final java.lang.String COLUMN_ICON_RESID = "iconResId";
public static final java.lang.String COLUMN_INTENT_ACTION = "intentAction";
public static final java.lang.String COLUMN_INTENT_TARGET_CLASS = "intentTargetClass";
public static final java.lang.String COLUMN_INTENT_TARGET_PACKAGE = "intentTargetPackage";
public static final java.lang.String COLUMN_RANK = "rank";
}
public  SearchIndexablesContract() { throw new RuntimeException("Stub!"); }
public static final int COLUMN_INDEX_NON_INDEXABLE_KEYS_KEY_VALUE = 0;
public static final int COLUMN_INDEX_RAW_CLASS_NAME = 7;
public static final int COLUMN_INDEX_RAW_ENTRIES = 4;
public static final int COLUMN_INDEX_RAW_ICON_RESID = 8;
public static final int COLUMN_INDEX_RAW_INTENT_ACTION = 9;
public static final int COLUMN_INDEX_RAW_INTENT_TARGET_CLASS = 11;
public static final int COLUMN_INDEX_RAW_INTENT_TARGET_PACKAGE = 10;
public static final int COLUMN_INDEX_RAW_KEY = 12;
public static final int COLUMN_INDEX_RAW_KEYWORDS = 5;
public static final int COLUMN_INDEX_RAW_RANK = 0;
public static final int COLUMN_INDEX_RAW_SCREEN_TITLE = 6;
public static final int COLUMN_INDEX_RAW_SUMMARY_OFF = 3;
public static final int COLUMN_INDEX_RAW_SUMMARY_ON = 2;
public static final int COLUMN_INDEX_RAW_TITLE = 1;
public static final int COLUMN_INDEX_RAW_USER_ID = 13;
public static final int COLUMN_INDEX_XML_RES_CLASS_NAME = 2;
public static final int COLUMN_INDEX_XML_RES_ICON_RESID = 3;
public static final int COLUMN_INDEX_XML_RES_INTENT_ACTION = 4;
public static final int COLUMN_INDEX_XML_RES_INTENT_TARGET_CLASS = 6;
public static final int COLUMN_INDEX_XML_RES_INTENT_TARGET_PACKAGE = 5;
public static final int COLUMN_INDEX_XML_RES_RANK = 0;
public static final int COLUMN_INDEX_XML_RES_RESID = 1;
public static final java.lang.String INDEXABLES_RAW = "indexables_raw";
public static final java.lang.String[] INDEXABLES_RAW_COLUMNS = null;
public static final java.lang.String INDEXABLES_RAW_PATH = "settings/indexables_raw";
public static final java.lang.String INDEXABLES_XML_RES = "indexables_xml_res";
public static final java.lang.String[] INDEXABLES_XML_RES_COLUMNS = null;
public static final java.lang.String INDEXABLES_XML_RES_PATH = "settings/indexables_xml_res";
public static final java.lang.String NON_INDEXABLES_KEYS = "non_indexables_key";
public static final java.lang.String[] NON_INDEXABLES_KEYS_COLUMNS = null;
public static final java.lang.String NON_INDEXABLES_KEYS_PATH = "settings/non_indexables_key";
public static final java.lang.String PROVIDER_INTERFACE = "android.content.action.SEARCH_INDEXABLES_PROVIDER";
}
