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
public abstract class CompoundButton
  extends android.widget.Button
  implements android.widget.Checkable
{
public static interface OnCheckedChangeListener
{
public abstract  void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked);
}
public  CompoundButton(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  CompoundButton(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  CompoundButton(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  CompoundButton(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void toggle() { throw new RuntimeException("Stub!"); }
public  boolean performClick() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  boolean isChecked() { throw new RuntimeException("Stub!"); }
public  void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
public  void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void setButtonDrawable(int resId) { throw new RuntimeException("Stub!"); }
public  void setButtonDrawable(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getButtonDrawable() { throw new RuntimeException("Stub!"); }
public  void setButtonTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getButtonTintList() { throw new RuntimeException("Stub!"); }
public  void setButtonTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getButtonTintMode() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void onProvideAutofillStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
public  void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  int getAutofillType() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
}
