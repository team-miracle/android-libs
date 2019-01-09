/*
* Copyright (C) 2010 The Android Open Source Project
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
public final class InputMethodSubtype
  implements android.os.Parcelable
{
public static class InputMethodSubtypeBuilder
{
public  InputMethodSubtypeBuilder() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAuxiliary(boolean isAuxiliary) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean overridesImplicitlyEnabledSubtype) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAsciiCapable(boolean isAsciiCapable) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeIconResId(int subtypeIconResId) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameResId(int subtypeNameResId) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeId(int subtypeId) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeLocale(java.lang.String subtypeLocale) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLanguageTag(java.lang.String languageTag) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeMode(java.lang.String subtypeMode) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeExtraValue(java.lang.String subtypeExtraValue) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype build() { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public  InputMethodSubtype(int nameId, int iconId, java.lang.String locale, java.lang.String mode, java.lang.String extraValue, boolean isAuxiliary, boolean overridesImplicitlyEnabledSubtype) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  InputMethodSubtype(int nameId, int iconId, java.lang.String locale, java.lang.String mode, java.lang.String extraValue, boolean isAuxiliary, boolean overridesImplicitlyEnabledSubtype, int id) { throw new RuntimeException("Stub!"); }
public  int getNameResId() { throw new RuntimeException("Stub!"); }
public  int getIconResId() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getLocale() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLanguageTag() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMode() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtraValue() { throw new RuntimeException("Stub!"); }
public  boolean isAuxiliary() { throw new RuntimeException("Stub!"); }
public  boolean overridesImplicitlyEnabledSubtype() { throw new RuntimeException("Stub!"); }
public  boolean isAsciiCapable() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDisplayName(android.content.Context context, java.lang.String packageName, android.content.pm.ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
public  boolean containsExtraValueKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtraValueOf(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodSubtype> CREATOR;
static { CREATOR = null; }
}
