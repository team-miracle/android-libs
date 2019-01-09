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
public abstract class PreferenceGroup
  extends android.preference.Preference
{
public  PreferenceGroup(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  PreferenceGroup(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  PreferenceGroup(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void setOrderingAsAdded(boolean orderingAsAdded) { throw new RuntimeException("Stub!"); }
public  boolean isOrderingAsAdded() { throw new RuntimeException("Stub!"); }
public  void addItemFromInflater(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  int getPreferenceCount() { throw new RuntimeException("Stub!"); }
public  android.preference.Preference getPreference(int index) { throw new RuntimeException("Stub!"); }
public  boolean addPreference(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  boolean removePreference(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  void removeAll() { throw new RuntimeException("Stub!"); }
protected  boolean onPrepareAddPreference(android.preference.Preference preference) { throw new RuntimeException("Stub!"); }
public  android.preference.Preference findPreference(java.lang.CharSequence key) { throw new RuntimeException("Stub!"); }
protected  boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToActivity() { throw new RuntimeException("Stub!"); }
protected  void onPrepareForRemoval() { throw new RuntimeException("Stub!"); }
public  void notifyDependencyChange(boolean disableDependents) { throw new RuntimeException("Stub!"); }
protected  void dispatchSaveInstanceState(android.os.Bundle container) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.os.Bundle container) { throw new RuntimeException("Stub!"); }
}
