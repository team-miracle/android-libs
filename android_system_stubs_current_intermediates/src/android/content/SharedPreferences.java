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

package android.content;
public interface SharedPreferences
{
public static interface OnSharedPreferenceChangeListener
{
public abstract  void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key);
}
public static interface Editor
{
public abstract  android.content.SharedPreferences.Editor putString(java.lang.String key, java.lang.String value);
public abstract  android.content.SharedPreferences.Editor putStringSet(java.lang.String key, java.util.Set<java.lang.String> values);
public abstract  android.content.SharedPreferences.Editor putInt(java.lang.String key, int value);
public abstract  android.content.SharedPreferences.Editor putLong(java.lang.String key, long value);
public abstract  android.content.SharedPreferences.Editor putFloat(java.lang.String key, float value);
public abstract  android.content.SharedPreferences.Editor putBoolean(java.lang.String key, boolean value);
public abstract  android.content.SharedPreferences.Editor remove(java.lang.String key);
public abstract  android.content.SharedPreferences.Editor clear();
public abstract  boolean commit();
public abstract  void apply();
}
public abstract  java.util.Map<java.lang.String, ?> getAll();
public abstract  java.lang.String getString(java.lang.String key, java.lang.String defValue);
public abstract  java.util.Set<java.lang.String> getStringSet(java.lang.String key, java.util.Set<java.lang.String> defValues);
public abstract  int getInt(java.lang.String key, int defValue);
public abstract  long getLong(java.lang.String key, long defValue);
public abstract  float getFloat(java.lang.String key, float defValue);
public abstract  boolean getBoolean(java.lang.String key, boolean defValue);
public abstract  boolean contains(java.lang.String key);
public abstract  android.content.SharedPreferences.Editor edit();
public abstract  void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener listener);
public abstract  void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener listener);
}
