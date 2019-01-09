/*
* Copyright 2017 The Android Open Source Project
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
public final class TextLinks
  implements android.os.Parcelable
{
public static final class TextLink
  implements android.os.Parcelable
{
TextLink() { throw new RuntimeException("Stub!"); }
public  int getStart() { throw new RuntimeException("Stub!"); }
public  int getEnd() { throw new RuntimeException("Stub!"); }
public  int getEntityCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEntity(int index) { throw new RuntimeException("Stub!"); }
public  float getConfidenceScore(java.lang.String entityType) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLinks.TextLink> CREATOR;
static { CREATOR = null; }
}
public static final class Request
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextLinks.Request.Builder setDefaultLocales(android.os.LocaleList defaultLocales) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextLinks.Request.Builder setEntityConfig(android.view.textclassifier.TextClassifier.EntityConfig entityConfig) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextLinks.Request build() { throw new RuntimeException("Stub!"); }
}
Request() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  android.os.LocaleList getDefaultLocales() { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextClassifier.EntityConfig getEntityConfig() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLinks.Request> CREATOR;
static { CREATOR = null; }
}
public static class TextLinkSpan
  extends android.text.style.ClickableSpan
{
public  TextLinkSpan(android.view.textclassifier.TextLinks.TextLink textLink) { throw new RuntimeException("Stub!"); }
public  void onClick(android.view.View widget) { throw new RuntimeException("Stub!"); }
public final  android.view.textclassifier.TextLinks.TextLink getTextLink() { throw new RuntimeException("Stub!"); }
}
public static final class Builder
{
public  Builder(java.lang.String fullText) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextLinks.Builder addLink(int start, int end, java.util.Map<java.lang.String, java.lang.Float> entityScores) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextLinks.Builder clearTextLinks() { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextLinks build() { throw new RuntimeException("Stub!"); }
}
TextLinks() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<android.view.textclassifier.TextLinks.TextLink> getLinks() { throw new RuntimeException("Stub!"); }
public  int apply(android.text.Spannable text, int applyStrategy, java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> spanFactory) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int APPLY_STRATEGY_IGNORE = 0;
public static final int APPLY_STRATEGY_REPLACE = 1;
public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLinks> CREATOR;
public static final int STATUS_DIFFERENT_TEXT = 3;
public static final int STATUS_LINKS_APPLIED = 0;
public static final int STATUS_NO_LINKS_APPLIED = 2;
public static final int STATUS_NO_LINKS_FOUND = 1;
static { CREATOR = null; }
}
