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
public class MultiAutoCompleteTextView
  extends android.widget.AutoCompleteTextView
{
public static interface Tokenizer
{
public abstract  int findTokenStart(java.lang.CharSequence text, int cursor);
public abstract  int findTokenEnd(java.lang.CharSequence text, int cursor);
public abstract  java.lang.CharSequence terminateToken(java.lang.CharSequence text);
}
public static class CommaTokenizer
  implements android.widget.MultiAutoCompleteTextView.Tokenizer
{
public  CommaTokenizer() { throw new RuntimeException("Stub!"); }
public  int findTokenStart(java.lang.CharSequence text, int cursor) { throw new RuntimeException("Stub!"); }
public  int findTokenEnd(java.lang.CharSequence text, int cursor) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence terminateToken(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
}
public  MultiAutoCompleteTextView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0,(android.content.res.Resources.Theme)null); throw new RuntimeException("Stub!"); }
public  MultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0,(android.content.res.Resources.Theme)null); throw new RuntimeException("Stub!"); }
public  MultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0,(android.content.res.Resources.Theme)null); throw new RuntimeException("Stub!"); }
public  MultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0,(android.content.res.Resources.Theme)null); throw new RuntimeException("Stub!"); }
public  void setTokenizer(android.widget.MultiAutoCompleteTextView.Tokenizer t) { throw new RuntimeException("Stub!"); }
protected  void performFiltering(java.lang.CharSequence text, int keyCode) { throw new RuntimeException("Stub!"); }
public  boolean enoughToFilter() { throw new RuntimeException("Stub!"); }
public  void performValidation() { throw new RuntimeException("Stub!"); }
protected  void performFiltering(java.lang.CharSequence text, int start, int end, int keyCode) { throw new RuntimeException("Stub!"); }
protected  void replaceText(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
}
