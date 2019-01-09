/*
* Copyright (C) 2007-2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public final class CompletionInfo
  implements android.os.Parcelable
{
public  CompletionInfo(long id, int index, java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  CompletionInfo(long id, int index, java.lang.CharSequence text, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  long getId() { throw new RuntimeException("Stub!"); }
public  int getPosition() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.CompletionInfo> CREATOR;
static { CREATOR = null; }
}
