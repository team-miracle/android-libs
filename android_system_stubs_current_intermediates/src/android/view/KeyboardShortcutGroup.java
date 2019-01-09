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
public final class KeyboardShortcutGroup
  implements android.os.Parcelable
{
public  KeyboardShortcutGroup(java.lang.CharSequence label, java.util.List<android.view.KeyboardShortcutInfo> items) { throw new RuntimeException("Stub!"); }
public  KeyboardShortcutGroup(java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.KeyboardShortcutInfo> getItems() { throw new RuntimeException("Stub!"); }
public  void addItem(android.view.KeyboardShortcutInfo item) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.KeyboardShortcutGroup> CREATOR;
static { CREATOR = null; }
}
