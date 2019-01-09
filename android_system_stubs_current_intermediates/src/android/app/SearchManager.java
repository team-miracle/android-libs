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

package android.app;
public class SearchManager
  implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener
{
public static interface OnDismissListener
{
public abstract  void onDismiss();
}
public static interface OnCancelListener
{
public abstract  void onCancel();
}
SearchManager() { throw new RuntimeException("Stub!"); }
public  void startSearch(java.lang.String initialQuery, boolean selectInitialQuery, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, boolean globalSearch) { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getGlobalSearchActivity() { throw new RuntimeException("Stub!"); }
public  void triggerSearch(java.lang.String query, android.content.ComponentName launchActivity, android.os.Bundle appSearchData) { throw new RuntimeException("Stub!"); }
public  void stopSearch() { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.app.SearchManager.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnCancelListener(android.app.SearchManager.OnCancelListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onCancel(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onDismiss(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public  android.app.SearchableInfo getSearchableInfo(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.SearchableInfo> getSearchablesInGlobalSearch() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_KEY = "action_key";
public static final java.lang.String ACTION_MSG = "action_msg";
public static final java.lang.String APP_DATA = "app_data";
public static final java.lang.String CURSOR_EXTRA_KEY_IN_PROGRESS = "in_progress";
public static final java.lang.String EXTRA_DATA_KEY = "intent_extra_data_key";
public static final java.lang.String EXTRA_NEW_SEARCH = "new_search";
public static final java.lang.String EXTRA_SELECT_QUERY = "select_query";
public static final java.lang.String EXTRA_WEB_SEARCH_PENDINGINTENT = "web_search_pendingintent";
public static final int FLAG_QUERY_REFINEMENT = 1;
public static final java.lang.String INTENT_ACTION_GLOBAL_SEARCH = "android.search.action.GLOBAL_SEARCH";
public static final java.lang.String INTENT_ACTION_SEARCHABLES_CHANGED = "android.search.action.SEARCHABLES_CHANGED";
public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";
public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS_CHANGED = "android.search.action.SETTINGS_CHANGED";
public static final java.lang.String INTENT_ACTION_WEB_SEARCH_SETTINGS = "android.search.action.WEB_SEARCH_SETTINGS";
public static final java.lang.String INTENT_GLOBAL_SEARCH_ACTIVITY_CHANGED = "android.search.action.GLOBAL_SEARCH_ACTIVITY_CHANGED";
public static final char MENU_KEY = 115;
public static final int MENU_KEYCODE = 47;
public static final java.lang.String QUERY = "query";
public static final java.lang.String SHORTCUT_MIME_TYPE = "vnd.android.cursor.item/vnd.android.search.suggest";
public static final java.lang.String SUGGEST_COLUMN_AUDIO_CHANNEL_CONFIG = "suggest_audio_channel_config";
public static final java.lang.String SUGGEST_COLUMN_CONTENT_TYPE = "suggest_content_type";
public static final java.lang.String SUGGEST_COLUMN_DURATION = "suggest_duration";
public static final java.lang.String SUGGEST_COLUMN_FLAGS = "suggest_flags";
public static final java.lang.String SUGGEST_COLUMN_FORMAT = "suggest_format";
public static final java.lang.String SUGGEST_COLUMN_ICON_1 = "suggest_icon_1";
public static final java.lang.String SUGGEST_COLUMN_ICON_2 = "suggest_icon_2";
public static final java.lang.String SUGGEST_COLUMN_INTENT_ACTION = "suggest_intent_action";
public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA = "suggest_intent_data";
public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA_ID = "suggest_intent_data_id";
public static final java.lang.String SUGGEST_COLUMN_INTENT_EXTRA_DATA = "suggest_intent_extra_data";
public static final java.lang.String SUGGEST_COLUMN_IS_LIVE = "suggest_is_live";
public static final java.lang.String SUGGEST_COLUMN_LAST_ACCESS_HINT = "suggest_last_access_hint";
public static final java.lang.String SUGGEST_COLUMN_PRODUCTION_YEAR = "suggest_production_year";
public static final java.lang.String SUGGEST_COLUMN_PURCHASE_PRICE = "suggest_purchase_price";
public static final java.lang.String SUGGEST_COLUMN_QUERY = "suggest_intent_query";
public static final java.lang.String SUGGEST_COLUMN_RATING_SCORE = "suggest_rating_score";
public static final java.lang.String SUGGEST_COLUMN_RATING_STYLE = "suggest_rating_style";
public static final java.lang.String SUGGEST_COLUMN_RENTAL_PRICE = "suggest_rental_price";
public static final java.lang.String SUGGEST_COLUMN_RESULT_CARD_IMAGE = "suggest_result_card_image";
public static final java.lang.String SUGGEST_COLUMN_SHORTCUT_ID = "suggest_shortcut_id";
public static final java.lang.String SUGGEST_COLUMN_SPINNER_WHILE_REFRESHING = "suggest_spinner_while_refreshing";
public static final java.lang.String SUGGEST_COLUMN_TEXT_1 = "suggest_text_1";
public static final java.lang.String SUGGEST_COLUMN_TEXT_2 = "suggest_text_2";
public static final java.lang.String SUGGEST_COLUMN_TEXT_2_URL = "suggest_text_2_url";
public static final java.lang.String SUGGEST_COLUMN_VIDEO_HEIGHT = "suggest_video_height";
public static final java.lang.String SUGGEST_COLUMN_VIDEO_WIDTH = "suggest_video_width";
public static final java.lang.String SUGGEST_MIME_TYPE = "vnd.android.cursor.dir/vnd.android.search.suggest";
public static final java.lang.String SUGGEST_NEVER_MAKE_SHORTCUT = "_-1";
public static final java.lang.String SUGGEST_PARAMETER_LIMIT = "limit";
public static final java.lang.String SUGGEST_URI_PATH_QUERY = "search_suggest_query";
public static final java.lang.String SUGGEST_URI_PATH_SHORTCUT = "search_suggest_shortcut";
public static final java.lang.String USER_QUERY = "user_query";
}
