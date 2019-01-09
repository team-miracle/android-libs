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

package android.app;
public class TimePickerDialog
  extends android.app.AlertDialog
  implements android.content.DialogInterface.OnClickListener, android.widget.TimePicker.OnTimeChangedListener
{
public static interface OnTimeSetListener
{
public abstract  void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute);
}
public  TimePickerDialog(android.content.Context context, android.app.TimePickerDialog.OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) { super((android.content.Context)null,0); throw new RuntimeException("Stub!"); }
public  TimePickerDialog(android.content.Context context, int themeResId, android.app.TimePickerDialog.OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) { super((android.content.Context)null,0); throw new RuntimeException("Stub!"); }
public  void onTimeChanged(android.widget.TimePicker view, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); }
public  void show() { throw new RuntimeException("Stub!"); }
public  void onClick(android.content.DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
public  void updateTime(int hourOfDay, int minuteOfHour) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
}
