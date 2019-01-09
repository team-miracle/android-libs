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

package android.app;
@java.lang.Deprecated()
public class FragmentBreadCrumbs
  extends android.view.ViewGroup
  implements android.app.FragmentManager.OnBackStackChangedListener
{
@java.lang.Deprecated()
public static interface OnBreadCrumbClickListener
{
public abstract  boolean onBreadCrumbClick(android.app.FragmentManager.BackStackEntry backStack, int flags);
}
public  FragmentBreadCrumbs(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  FragmentBreadCrumbs(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  FragmentBreadCrumbs(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setActivity(android.app.Activity a) { throw new RuntimeException("Stub!"); }
public  void setMaxVisible(int visibleCrumbs) { throw new RuntimeException("Stub!"); }
public  void setParentTitle(java.lang.CharSequence title, java.lang.CharSequence shortTitle, android.view.View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnBreadCrumbClickListener(android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.CharSequence title, java.lang.CharSequence shortTitle) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  void onBackStackChanged() { throw new RuntimeException("Stub!"); }
}
