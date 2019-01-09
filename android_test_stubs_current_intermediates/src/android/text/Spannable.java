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
public interface Spannable
  extends android.text.Spanned
{
public static class Factory
{
public  Factory() { throw new RuntimeException("Stub!"); }
public static  android.text.Spannable.Factory getInstance() { throw new RuntimeException("Stub!"); }
public  android.text.Spannable newSpannable(java.lang.CharSequence source) { throw new RuntimeException("Stub!"); }
}
public abstract  void setSpan(java.lang.Object what, int start, int end, int flags);
public abstract  void removeSpan(java.lang.Object what);
}
