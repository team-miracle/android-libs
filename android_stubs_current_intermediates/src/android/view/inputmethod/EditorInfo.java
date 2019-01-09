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

package android.view.inputmethod;
public class EditorInfo
  implements android.text.InputType, android.os.Parcelable
{
public  EditorInfo() { throw new RuntimeException("Stub!"); }
public final  void makeCompatible(int targetSdkVersion) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.EditorInfo> CREATOR;
public static final int IME_ACTION_DONE = 6;
public static final int IME_ACTION_GO = 2;
public static final int IME_ACTION_NEXT = 5;
public static final int IME_ACTION_NONE = 1;
public static final int IME_ACTION_PREVIOUS = 7;
public static final int IME_ACTION_SEARCH = 3;
public static final int IME_ACTION_SEND = 4;
public static final int IME_ACTION_UNSPECIFIED = 0;
public static final int IME_FLAG_FORCE_ASCII = -2147483648;
public static final int IME_FLAG_NAVIGATE_NEXT = 134217728;
public static final int IME_FLAG_NAVIGATE_PREVIOUS = 67108864;
public static final int IME_FLAG_NO_ACCESSORY_ACTION = 536870912;
public static final int IME_FLAG_NO_ENTER_ACTION = 1073741824;
public static final int IME_FLAG_NO_EXTRACT_UI = 268435456;
public static final int IME_FLAG_NO_FULLSCREEN = 33554432;
public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
public static final int IME_MASK_ACTION = 255;
public static final int IME_NULL = 0;
public int actionId;
public java.lang.CharSequence actionLabel;
public java.lang.String[] contentMimeTypes = null;
public android.os.Bundle extras;
public int fieldId;
public java.lang.String fieldName;
public android.os.LocaleList hintLocales;
public java.lang.CharSequence hintText;
public int imeOptions;
public int initialCapsMode;
public int initialSelEnd;
public int initialSelStart;
public int inputType;
public java.lang.CharSequence label;
public java.lang.String packageName;
public java.lang.String privateImeOptions;
static { CREATOR = null; }
}
