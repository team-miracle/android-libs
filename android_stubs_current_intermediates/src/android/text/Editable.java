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

package android.text;
public interface Editable
  extends java.lang.CharSequence, android.text.GetChars, android.text.Spannable, java.lang.Appendable
{
public static class Factory
{
public  Factory() { throw new RuntimeException("Stub!"); }
public static  android.text.Editable.Factory getInstance() { throw new RuntimeException("Stub!"); }
public  android.text.Editable newEditable(java.lang.CharSequence source) { throw new RuntimeException("Stub!"); }
}
public abstract  android.text.Editable replace(int st, int en, java.lang.CharSequence source, int start, int end);
public abstract  android.text.Editable replace(int st, int en, java.lang.CharSequence text);
public abstract  android.text.Editable insert(int where, java.lang.CharSequence text, int start, int end);
public abstract  android.text.Editable insert(int where, java.lang.CharSequence text);
public abstract  android.text.Editable delete(int st, int en);
public abstract  android.text.Editable append(java.lang.CharSequence text);
public abstract  android.text.Editable append(java.lang.CharSequence text, int start, int end);
public abstract  android.text.Editable append(char text);
public abstract  void clear();
public abstract  void clearSpans();
public abstract  void setFilters(android.text.InputFilter[] filters);
public abstract  android.text.InputFilter[] getFilters();
}
