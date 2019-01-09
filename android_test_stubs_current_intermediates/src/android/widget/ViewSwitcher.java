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
public class ViewSwitcher
  extends android.widget.ViewAnimator
{
public static interface ViewFactory
{
public abstract  android.view.View makeView();
}
public  ViewSwitcher(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  ViewSwitcher(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null); throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  android.view.View getNextView() { throw new RuntimeException("Stub!"); }
public  void setFactory(android.widget.ViewSwitcher.ViewFactory factory) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
}
