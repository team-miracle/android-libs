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

package android.view.textclassifier;
public final class TextSelection
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(int startIndex, int endIndex) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextSelection.Builder setEntityType(java.lang.String type, float confidenceScore) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextSelection.Builder setId(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextSelection build() { throw new RuntimeException("Stub!"); }
}
public static final class Request
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(java.lang.CharSequence text, int startIndex, int endIndex) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(android.os.LocaleList defaultLocales) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextSelection.Request build() { throw new RuntimeException("Stub!"); }
}
Request() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  int getStartIndex() { throw new RuntimeException("Stub!"); }
public  int getEndIndex() { throw new RuntimeException("Stub!"); }
public  android.os.LocaleList getDefaultLocales() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection.Request> CREATOR;
static { CREATOR = null; }
}
TextSelection() { throw new RuntimeException("Stub!"); }
public  int getSelectionStartIndex() { throw new RuntimeException("Stub!"); }
public  int getSelectionEndIndex() { throw new RuntimeException("Stub!"); }
public  int getEntityCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEntity(int index) { throw new RuntimeException("Stub!"); }
public  float getConfidenceScore(java.lang.String entity) { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection> CREATOR;
static { CREATOR = null; }
}
