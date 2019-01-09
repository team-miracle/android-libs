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
public class PreferenceManager
{
public static interface OnActivityResultListener
{
public abstract  boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data);
}
public static interface OnActivityStopListener
{
public abstract  void onActivityStop();
}
public static interface OnActivityDestroyListener
{
public abstract  void onActivityDestroy();
}
PreferenceManager() { throw new RuntimeException("Stub!"); }
public  void setPreferenceDataStore(android.preference.PreferenceDataStore dataStore) { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceDataStore getPreferenceDataStore() { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceScreen createPreferenceScreen(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSharedPreferencesName() { throw new RuntimeException("Stub!"); }
public  void setSharedPreferencesName(java.lang.String sharedPreferencesName) { throw new RuntimeException("Stub!"); }
public  int getSharedPreferencesMode() { throw new RuntimeException("Stub!"); }
public  void setSharedPreferencesMode(int sharedPreferencesMode) { throw new RuntimeException("Stub!"); }
public  void setStorageDefault() { throw new RuntimeException("Stub!"); }
public  void setStorageDeviceProtected() { throw new RuntimeException("Stub!"); }
public  void setStorageCredentialProtected() { throw new RuntimeException("Stub!"); }
public  boolean isStorageDefault() { throw new RuntimeException("Stub!"); }
public  boolean isStorageDeviceProtected() { throw new RuntimeException("Stub!"); }
public  boolean isStorageCredentialProtected() { throw new RuntimeException("Stub!"); }
public  android.content.SharedPreferences getSharedPreferences() { throw new RuntimeException("Stub!"); }
public static  android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDefaultSharedPreferencesName(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
public static  void setDefaultValues(android.content.Context context, int resId, boolean readAgain) { throw new RuntimeException("Stub!"); }
public static  void setDefaultValues(android.content.Context context, java.lang.String sharedPreferencesName, int sharedPreferencesMode, int resId, boolean readAgain) { throw new RuntimeException("Stub!"); }
public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
public static final java.lang.String METADATA_KEY_PREFERENCES = "android.preference";
}
