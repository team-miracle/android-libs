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

package android.preference;
@java.lang.Deprecated()
public abstract class PreferenceFragment
  extends android.app.Fragment
{
@java.lang.Deprecated()
public static interface OnPreferenceStartFragmentCallback
{
public abstract  boolean onPreferenceStartFragment(android.preference.PreferenceFragment caller, android.preference.Preference pref);
}
public  PreferenceFragment() { throw new RuntimeException("Stub!"); }
public  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onActivityCreated(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  void onStop() { throw new RuntimeException("Stub!"); }
public  void onDestroyView() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onSaveInstanceState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
public  void onActivityResult(int requestCode, int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
public  void setPreferenceScreen(android.preference.PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); }
public  android.preference.PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); }
public  void addPreferencesFromIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); }
public  boolean onPreferenceTreeClick(android.preference.PreferenceScreen preferenceScreen, android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
}
