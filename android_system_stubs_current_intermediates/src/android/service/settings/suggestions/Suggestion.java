/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.service.settings.suggestions;
public final class Suggestion
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  android.service.settings.suggestions.Suggestion.Builder setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  android.service.settings.suggestions.Suggestion.Builder setSummary(java.lang.CharSequence summary) { throw new RuntimeException("Stub!"); }
public  android.service.settings.suggestions.Suggestion.Builder setIcon(android.graphics.drawable.Icon icon) { throw new RuntimeException("Stub!"); }
public  android.service.settings.suggestions.Suggestion.Builder setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.service.settings.suggestions.Suggestion.Builder setPendingIntent(android.app.PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
public  android.service.settings.suggestions.Suggestion build() { throw new RuntimeException("Stub!"); }
}
Suggestion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummary() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon getIcon() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getPendingIntent() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.settings.suggestions.Suggestion> CREATOR;
public static final int FLAG_HAS_BUTTON = 1;
static { CREATOR = null; }
}
