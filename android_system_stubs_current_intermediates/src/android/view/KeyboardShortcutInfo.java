/*
* Copyright (C) 2015 The Android Open Source Project
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
public final class KeyboardShortcutInfo
  implements android.os.Parcelable
{
public  KeyboardShortcutInfo(java.lang.CharSequence label, int keycode, int modifiers) { throw new RuntimeException("Stub!"); }
public  KeyboardShortcutInfo(java.lang.CharSequence label, char baseCharacter, int modifiers) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  int getKeycode() { throw new RuntimeException("Stub!"); }
public  char getBaseCharacter() { throw new RuntimeException("Stub!"); }
public  int getModifiers() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.KeyboardShortcutInfo> CREATOR;
static { CREATOR = null; }
}
