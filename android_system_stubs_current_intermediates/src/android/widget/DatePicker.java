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
public class DatePicker
  extends android.widget.FrameLayout
{
public static interface OnDateChangedListener
{
public abstract  void onDateChanged(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth);
}
public  DatePicker(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  DatePicker(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  DatePicker(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  DatePicker(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void init(int year, int monthOfYear, int dayOfMonth, android.widget.DatePicker.OnDateChangedListener onDateChangedListener) { throw new RuntimeException("Stub!"); }
public  void setOnDateChangedListener(android.widget.DatePicker.OnDateChangedListener onDateChangedListener) { throw new RuntimeException("Stub!"); }
public  void updateDate(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  int getYear() { throw new RuntimeException("Stub!"); }
public  int getMonth() { throw new RuntimeException("Stub!"); }
public  int getDayOfMonth() { throw new RuntimeException("Stub!"); }
public  long getMinDate() { throw new RuntimeException("Stub!"); }
public  void setMinDate(long minDate) { throw new RuntimeException("Stub!"); }
public  long getMaxDate() { throw new RuntimeException("Stub!"); }
public  void setMaxDate(long maxDate) { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
protected  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void setFirstDayOfWeek(int firstDayOfWeek) { throw new RuntimeException("Stub!"); }
public  int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean getCalendarViewShown() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.widget.CalendarView getCalendarView() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setCalendarViewShown(boolean shown) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean getSpinnersShown() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setSpinnersShown(boolean shown) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void dispatchProvideAutofillStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
public  void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  int getAutofillType() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
}
