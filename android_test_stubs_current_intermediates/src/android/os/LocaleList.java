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

package android.os;
public final class LocaleList
  implements android.os.Parcelable
{
public  LocaleList(java.util.Locale... list) { throw new RuntimeException("Stub!"); }
public  java.util.Locale get(int index) { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  int indexOf(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toLanguageTags() { throw new RuntimeException("Stub!"); }
public static  android.os.LocaleList getEmptyLocaleList() { throw new RuntimeException("Stub!"); }
public static  android.os.LocaleList forLanguageTags(java.lang.String list) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getFirstMatch(java.lang.String[] supportedLocales) { throw new RuntimeException("Stub!"); }
public static  android.os.LocaleList getDefault() { throw new RuntimeException("Stub!"); }
public static  android.os.LocaleList getAdjustedDefault() { throw new RuntimeException("Stub!"); }
public static  void setDefault(android.os.LocaleList locales) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.LocaleList> CREATOR;
static { CREATOR = null; }
}
