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

package android.widget;
public class TimePicker
  extends android.widget.FrameLayout
{
public static interface OnTimeChangedListener
{
public abstract  void onTimeChanged(android.widget.TimePicker view, int hourOfDay, int minute);
}
public  TimePicker(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TimePicker(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TimePicker(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TimePicker(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setHour(int hour) { throw new RuntimeException("Stub!"); }
public  int getHour() { throw new RuntimeException("Stub!"); }
public  void setMinute(int minute) { throw new RuntimeException("Stub!"); }
public  int getMinute() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setCurrentHour(java.lang.Integer currentHour) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.Integer getCurrentHour() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setCurrentMinute(java.lang.Integer currentMinute) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.Integer getCurrentMinute() { throw new RuntimeException("Stub!"); }
public  void setIs24HourView(java.lang.Boolean is24HourView) { throw new RuntimeException("Stub!"); }
public  boolean is24HourView() { throw new RuntimeException("Stub!"); }
public  void setOnTimeChangedListener(android.widget.TimePicker.OnTimeChangedListener onTimeChangedListener) { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  boolean validateInput() { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void dispatchProvideAutofillStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
public  void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  int getAutofillType() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
}
