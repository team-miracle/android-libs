/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.view.textservice;
public final class SpellCheckerSubtype
  implements android.os.Parcelable
{
@java.lang.Deprecated()
public  SpellCheckerSubtype(int nameId, java.lang.String locale, java.lang.String extraValue) { throw new RuntimeException("Stub!"); }
public  int getNameResId() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getLocale() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLanguageTag() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtraValue() { throw new RuntimeException("Stub!"); }
public  boolean containsExtraValueKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtraValueOf(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDisplayName(android.content.Context context, java.lang.String packageName, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textservice.SpellCheckerSubtype> CREATOR;
static { CREATOR = null; }
}
