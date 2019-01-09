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
public class ListPreference
  extends android.preference.DialogPreference
{
public  ListPreference(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  ListPreference(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  ListPreference(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  ListPreference(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void setEntries(java.lang.CharSequence[] entries) { throw new RuntimeException("Stub!"); }
public  void setEntries(int entriesResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getEntries() { throw new RuntimeException("Stub!"); }
public  void setEntryValues(java.lang.CharSequence[] entryValues) { throw new RuntimeException("Stub!"); }
public  void setEntryValues(int entryValuesResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getEntryValues() { throw new RuntimeException("Stub!"); }
public  void setValue(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummary() { throw new RuntimeException("Stub!"); }
public  void setSummary(java.lang.CharSequence summary) { throw new RuntimeException("Stub!"); }
public  void setValueIndex(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getEntry() { throw new RuntimeException("Stub!"); }
public  int findIndexOfValue(java.lang.String value) { throw new RuntimeException("Stub!"); }
protected  void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); }
protected  void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object onGetDefaultValue(android.content.res.TypedArray a, int index) { throw new RuntimeException("Stub!"); }
protected  void onSetInitialValue(boolean restoreValue, java.lang.Object defaultValue) { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
}
