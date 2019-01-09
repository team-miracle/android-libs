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
public class DatePickerDialog
  extends android.app.AlertDialog
  implements android.content.DialogInterface.OnClickListener, android.widget.DatePicker.OnDateChangedListener
{
public static interface OnDateSetListener
{
public abstract  void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth);
}
public  DatePickerDialog(android.content.Context context) { super((android.content.Context)null,0); throw new RuntimeException("Stub!"); }
public  DatePickerDialog(android.content.Context context, int themeResId) { super((android.content.Context)null,0); throw new RuntimeException("Stub!"); }
public  DatePickerDialog(android.content.Context context, android.app.DatePickerDialog.OnDateSetListener listener, int year, int month, int dayOfMonth) { super((android.content.Context)null,0); throw new RuntimeException("Stub!"); }
public  DatePickerDialog(android.content.Context context, int themeResId, android.app.DatePickerDialog.OnDateSetListener listener, int year, int monthOfYear, int dayOfMonth) { super((android.content.Context)null,0); throw new RuntimeException("Stub!"); }
public  void onDateChanged(android.widget.DatePicker view, int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  void setOnDateSetListener(android.app.DatePickerDialog.OnDateSetListener listener) { throw new RuntimeException("Stub!"); }
public  void onClick(android.content.DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
public  android.widget.DatePicker getDatePicker() { throw new RuntimeException("Stub!"); }
public  void updateDate(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
}
