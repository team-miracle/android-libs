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

package android.widget;
public abstract class AbsSpinner
  extends android.widget.AdapterView<android.widget.SpinnerAdapter>
{
public  AbsSpinner(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsSpinner(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsSpinner(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsSpinner(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
public  void setSelection(int position, boolean animate) { throw new RuntimeException("Stub!"); }
public  void setSelection(int position) { throw new RuntimeException("Stub!"); }
public  android.view.View getSelectedView() { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
public  android.widget.SpinnerAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public  int getCount() { throw new RuntimeException("Stub!"); }
public  int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  int getAutofillType() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
}
