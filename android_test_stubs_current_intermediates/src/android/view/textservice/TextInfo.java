/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.view.textservice;
public final class TextInfo
  implements android.os.Parcelable
{
public  TextInfo(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  TextInfo(java.lang.String text, int cookie, int sequenceNumber) { throw new RuntimeException("Stub!"); }
public  TextInfo(java.lang.CharSequence charSequence, int start, int end, int cookie, int sequenceNumber) { throw new RuntimeException("Stub!"); }
public  TextInfo(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String getText() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCharSequence() { throw new RuntimeException("Stub!"); }
public  int getCookie() { throw new RuntimeException("Stub!"); }
public  int getSequence() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textservice.TextInfo> CREATOR;
static { CREATOR = null; }
}
