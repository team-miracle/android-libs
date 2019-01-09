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
public abstract class TwoStatePreference
  extends android.preference.Preference
{
public  TwoStatePreference(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  TwoStatePreference(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  TwoStatePreference(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  TwoStatePreference(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
public  void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
public  boolean isChecked() { throw new RuntimeException("Stub!"); }
public  boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); }
public  void setSummaryOn(java.lang.CharSequence summary) { throw new RuntimeException("Stub!"); }
public  void setSummaryOn(int summaryResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummaryOn() { throw new RuntimeException("Stub!"); }
public  void setSummaryOff(java.lang.CharSequence summary) { throw new RuntimeException("Stub!"); }
public  void setSummaryOff(int summaryResId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummaryOff() { throw new RuntimeException("Stub!"); }
public  boolean getDisableDependentsState() { throw new RuntimeException("Stub!"); }
public  void setDisableDependentsState(boolean disableDependentsState) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object onGetDefaultValue(android.content.res.TypedArray a, int index) { throw new RuntimeException("Stub!"); }
protected  void onSetInitialValue(boolean restoreValue, java.lang.Object defaultValue) { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
}
