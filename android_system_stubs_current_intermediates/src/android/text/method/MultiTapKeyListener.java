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

package android.text.method;
public class MultiTapKeyListener
  extends android.text.method.BaseKeyListener
  implements android.text.SpanWatcher
{
public  MultiTapKeyListener(android.text.method.TextKeyListener.Capitalize cap, boolean autotext) { throw new RuntimeException("Stub!"); }
public static  android.text.method.MultiTapKeyListener getInstance(boolean autotext, android.text.method.TextKeyListener.Capitalize cap) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.view.View view, android.text.Editable content, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onSpanChanged(android.text.Spannable buf, java.lang.Object what, int s, int e, int start, int stop) { throw new RuntimeException("Stub!"); }
public  void onSpanAdded(android.text.Spannable s, java.lang.Object what, int start, int end) { throw new RuntimeException("Stub!"); }
public  void onSpanRemoved(android.text.Spannable s, java.lang.Object what, int start, int end) { throw new RuntimeException("Stub!"); }
}
