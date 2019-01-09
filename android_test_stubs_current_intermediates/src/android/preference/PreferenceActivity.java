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

package android.preference;
public abstract class PreferenceActivity
  extends android.app.ListActivity
  implements android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback
{
public static final class Header
  implements android.os.Parcelable
{
public  Header() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle(android.content.res.Resources res) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummary(android.content.res.Resources res) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getBreadCrumbTitle(android.content.res.Resources res) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getBreadCrumbShortTitle(android.content.res.Resources res) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.preference.PreferenceActivity.Header> CREATOR;
public java.lang.CharSequence breadCrumbShortTitle;
public int breadCrumbShortTitleRes;
public java.lang.CharSequence breadCrumbTitle;
public int breadCrumbTitleRes;
public android.os.Bundle extras;
public java.lang.String fragment;
public android.os.Bundle fragmentArguments;
public int iconRes;
public long id;
public android.content.Intent intent;
public java.lang.CharSequence summary;
public int summaryRes;
public java.lang.CharSequence title;
public int titleRes;
static { CREATOR = null; }
}
public  PreferenceActivity() { throw new RuntimeException("Stub!"); }
public  boolean onOptionsItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onBackPressed() { throw new RuntimeException("Stub!"); }
public  boolean hasHeaders() { throw new RuntimeException("Stub!"); }
public  boolean isMultiPane() { throw new RuntimeException("Stub!"); }
public  boolean onIsMultiPane() { throw new RuntimeException("Stub!"); }
public  boolean onIsHidingHeaders() { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceActivity.Header onGetInitialHeader() { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceActivity.Header onGetNewHeader() { throw new RuntimeException("Stub!"); }
public  void onBuildHeaders(java.util.List<android.preference.PreferenceActivity.Header> target) { throw new RuntimeException("Stub!"); }
public  void invalidateHeaders() { throw new RuntimeException("Stub!"); }
public  void loadHeadersFromResource(int resid, java.util.List<android.preference.PreferenceActivity.Header> target) { throw new RuntimeException("Stub!"); }
protected  boolean isValidFragment(java.lang.String fragmentName) { throw new RuntimeException("Stub!"); }
public  void setListFooter(android.view.View view) { throw new RuntimeException("Stub!"); }
protected  void onStop() { throw new RuntimeException("Stub!"); }
protected  void onDestroy() { throw new RuntimeException("Stub!"); }
protected  void onSaveInstanceState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Bundle state) { throw new RuntimeException("Stub!"); }
protected  void onActivityResult(int requestCode, int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
public  void onContentChanged() { throw new RuntimeException("Stub!"); }
protected  void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) { throw new RuntimeException("Stub!"); }
public  void onHeaderClick(android.preference.PreferenceActivity.Header header, int position) { throw new RuntimeException("Stub!"); }
public  android.content.Intent onBuildStartFragmentIntent(java.lang.String fragmentName, android.os.Bundle args, int titleRes, int shortTitleRes) { throw new RuntimeException("Stub!"); }
public  void startWithFragment(java.lang.String fragmentName, android.os.Bundle args, android.app.Fragment resultTo, int resultRequestCode) { throw new RuntimeException("Stub!"); }
public  void startWithFragment(java.lang.String fragmentName, android.os.Bundle args, android.app.Fragment resultTo, int resultRequestCode, int titleRes, int shortTitleRes) { throw new RuntimeException("Stub!"); }
public  void showBreadCrumbs(java.lang.CharSequence title, java.lang.CharSequence shortTitle) { throw new RuntimeException("Stub!"); }
public  void setParentTitle(java.lang.CharSequence title, java.lang.CharSequence shortTitle, android.view.View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void switchToHeader(java.lang.String fragmentName, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public  void switchToHeader(android.preference.PreferenceActivity.Header header) { throw new RuntimeException("Stub!"); }
public  void startPreferenceFragment(android.app.Fragment fragment, boolean push) { throw new RuntimeException("Stub!"); }
public  void startPreferencePanel(java.lang.String fragmentClass, android.os.Bundle args, int titleRes, java.lang.CharSequence titleText, android.app.Fragment resultTo, int resultRequestCode) { throw new RuntimeException("Stub!"); }
public  void finishPreferencePanel(android.app.Fragment caller, int resultCode, android.content.Intent resultData) { throw new RuntimeException("Stub!"); }
public  boolean onPreferenceStartFragment(android.preference.PreferenceFragment caller, android.preference.Preference pref) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.preference.PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setPreferenceScreen(android.preference.PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.preference.PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void addPreferencesFromIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean onPreferenceTreeClick(android.preference.PreferenceScreen preferenceScreen, android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
protected  void onNewIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_NO_HEADERS = ":android:no_headers";
public static final java.lang.String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";
public static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";
public static final java.lang.String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = ":android:show_fragment_short_title";
public static final java.lang.String EXTRA_SHOW_FRAGMENT_TITLE = ":android:show_fragment_title";
public static final long HEADER_ID_UNDEFINED = -1L;
}
