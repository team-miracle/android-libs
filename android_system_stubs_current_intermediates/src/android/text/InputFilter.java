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
public interface InputFilter
{
public static class AllCaps
  implements android.text.InputFilter
{
public  AllCaps() { throw new RuntimeException("Stub!"); }
public  AllCaps(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
}
public static class LengthFilter
  implements android.text.InputFilter
{
public  LengthFilter(int max) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
public  int getMax() { throw new RuntimeException("Stub!"); }
}
public abstract  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend);
}
