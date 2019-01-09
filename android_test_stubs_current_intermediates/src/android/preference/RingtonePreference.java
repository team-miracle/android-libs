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
public class RingtonePreference
  extends android.preference.Preference
  implements android.preference.PreferenceManager.OnActivityResultListener
{
public  RingtonePreference(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RingtonePreference(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RingtonePreference(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  RingtonePreference(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  int getRingtoneType() { throw new RuntimeException("Stub!"); }
public  void setRingtoneType(int type) { throw new RuntimeException("Stub!"); }
public  boolean getShowDefault() { throw new RuntimeException("Stub!"); }
public  void setShowDefault(boolean showDefault) { throw new RuntimeException("Stub!"); }
public  boolean getShowSilent() { throw new RuntimeException("Stub!"); }
public  void setShowSilent(boolean showSilent) { throw new RuntimeException("Stub!"); }
protected  void onClick() { throw new RuntimeException("Stub!"); }
protected  void onPrepareRingtonePickerIntent(android.content.Intent ringtonePickerIntent) { throw new RuntimeException("Stub!"); }
protected  void onSaveRingtone(android.net.Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
protected  android.net.Uri onRestoreRingtone() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object onGetDefaultValue(android.content.res.TypedArray a, int index) { throw new RuntimeException("Stub!"); }
protected  void onSetInitialValue(boolean restorePersistedValue, java.lang.Object defaultValueObj) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToHierarchy(android.preference.PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); }
public  boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
}
