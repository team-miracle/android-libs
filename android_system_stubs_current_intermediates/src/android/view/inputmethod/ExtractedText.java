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
public class ExtractedText
  implements android.os.Parcelable
{
public  ExtractedText() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.ExtractedText> CREATOR;
public static final int FLAG_SELECTING = 2;
public static final int FLAG_SINGLE_LINE = 1;
public int flags;
public java.lang.CharSequence hint;
public int partialEndOffset;
public int partialStartOffset;
public int selectionEnd;
public int selectionStart;
public int startOffset;
public java.lang.CharSequence text;
static { CREATOR = null; }
}
