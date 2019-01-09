/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.view;
public final class ViewTreeObserver
{
public static interface OnWindowAttachListener
{
public abstract  void onWindowAttached();
public abstract  void onWindowDetached();
}
public static interface OnWindowFocusChangeListener
{
public abstract  void onWindowFocusChanged(boolean hasFocus);
}
public static interface OnGlobalFocusChangeListener
{
public abstract  void onGlobalFocusChanged(android.view.View oldFocus, android.view.View newFocus);
}
public static interface OnGlobalLayoutListener
{
public abstract  void onGlobalLayout();
}
public static interface OnPreDrawListener
{
public abstract  boolean onPreDraw();
}
public static interface OnDrawListener
{
public abstract  void onDraw();
}
public static interface OnTouchModeChangeListener
{
public abstract  void onTouchModeChanged(boolean isInTouchMode);
}
public static interface OnScrollChangedListener
{
public abstract  void onScrollChanged();
}
ViewTreeObserver() { throw new RuntimeException("Stub!"); }
public  void addOnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeGlobalOnLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); }
public  void removeOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnDrawListener(android.view.ViewTreeObserver.OnDrawListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnDrawListener(android.view.ViewTreeObserver.OnDrawListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener victim) { throw new RuntimeException("Stub!"); }
public  void addOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener victim) { throw new RuntimeException("Stub!"); }
public  boolean isAlive() { throw new RuntimeException("Stub!"); }
public  void dispatchOnGlobalLayout() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  boolean dispatchOnPreDraw() { throw new RuntimeException("Stub!"); }
public  void dispatchOnDraw() { throw new RuntimeException("Stub!"); }
}
