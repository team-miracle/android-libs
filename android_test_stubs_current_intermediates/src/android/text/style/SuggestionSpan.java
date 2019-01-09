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

package android.text.style;
public class SuggestionSpan
  extends android.text.style.CharacterStyle
  implements android.text.ParcelableSpan
{
public  SuggestionSpan(android.content.Context context, java.lang.String[] suggestions, int flags) { throw new RuntimeException("Stub!"); }
public  SuggestionSpan(java.util.Locale locale, java.lang.String[] suggestions, int flags) { throw new RuntimeException("Stub!"); }
public  SuggestionSpan(android.content.Context context, java.util.Locale locale, java.lang.String[] suggestions, int flags, java.lang.Class<?> notificationTargetClass) { throw new RuntimeException("Stub!"); }
public  SuggestionSpan(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSuggestions() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getLocale() { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocaleObject() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  void setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void updateDrawState(android.text.TextPaint tp) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";
public static final android.os.Parcelable.Creator<android.text.style.SuggestionSpan> CREATOR;
public static final int FLAG_AUTO_CORRECTION = 4;
public static final int FLAG_EASY_CORRECT = 1;
public static final int FLAG_MISSPELLED = 2;
public static final int SUGGESTIONS_MAX_SIZE = 5;
public static final java.lang.String SUGGESTION_SPAN_PICKED_AFTER = "after";
public static final java.lang.String SUGGESTION_SPAN_PICKED_BEFORE = "before";
public static final java.lang.String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";
static { CREATOR = null; }
}
