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
public class Spinner
  extends android.widget.AbsSpinner
  implements android.content.DialogInterface.OnClickListener
{
public  Spinner(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Spinner(android.content.Context context, int mode) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Spinner(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Spinner(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Spinner(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int mode) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Spinner(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes, int mode) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Spinner(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes, int mode, android.content.res.Resources.Theme popupTheme) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  android.content.Context getPopupContext() { throw new RuntimeException("Stub!"); }
public  void setPopupBackgroundDrawable(android.graphics.drawable.Drawable background) { throw new RuntimeException("Stub!"); }
public  void setPopupBackgroundResource(int resId) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getPopupBackground() { throw new RuntimeException("Stub!"); }
public  void setDropDownVerticalOffset(int pixels) { throw new RuntimeException("Stub!"); }
public  int getDropDownVerticalOffset() { throw new RuntimeException("Stub!"); }
public  void setDropDownHorizontalOffset(int pixels) { throw new RuntimeException("Stub!"); }
public  int getDropDownHorizontalOffset() { throw new RuntimeException("Stub!"); }
public  void setDropDownWidth(int pixels) { throw new RuntimeException("Stub!"); }
public  int getDropDownWidth() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  boolean performClick() { throw new RuntimeException("Stub!"); }
public  void onClick(android.content.DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void setPrompt(java.lang.CharSequence prompt) { throw new RuntimeException("Stub!"); }
public  void setPromptId(int promptId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPrompt() { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
public static final int MODE_DIALOG = 0;
public static final int MODE_DROPDOWN = 1;
}
