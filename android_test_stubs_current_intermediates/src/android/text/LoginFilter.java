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
public abstract class LoginFilter
  implements android.text.InputFilter
{
public static class UsernameFilterGMail
  extends android.text.LoginFilter
{
public  UsernameFilterGMail() { throw new RuntimeException("Stub!"); }
public  UsernameFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
}
public static class UsernameFilterGeneric
  extends android.text.LoginFilter
{
public  UsernameFilterGeneric() { throw new RuntimeException("Stub!"); }
public  UsernameFilterGeneric(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
}
public static class PasswordFilterGMail
  extends android.text.LoginFilter
{
public  PasswordFilterGMail() { throw new RuntimeException("Stub!"); }
public  PasswordFilterGMail(boolean appendInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isAllowed(char c) { throw new RuntimeException("Stub!"); }
}
LoginFilter() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  void onInvalidCharacter(char c) { throw new RuntimeException("Stub!"); }
public  void onStop() { throw new RuntimeException("Stub!"); }
public abstract  boolean isAllowed(char c);
}
