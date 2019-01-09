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
public interface TextClassifier
{
public static final class EntityConfig
  implements android.os.Parcelable
{
EntityConfig() { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.TextClassifier.EntityConfig createWithHints(java.util.Collection<java.lang.String> hints) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.TextClassifier.EntityConfig create(java.util.Collection<java.lang.String> hints, java.util.Collection<java.lang.String> includedEntityTypes, java.util.Collection<java.lang.String> excludedEntityTypes) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.TextClassifier.EntityConfig createWithExplicitEntityList(java.util.Collection<java.lang.String> entityTypes) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.String> resolveEntityListModifications(java.util.Collection<java.lang.String> entities) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.String> getHints() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifier.EntityConfig> CREATOR;
static { CREATOR = null; }
}
default public  android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextSelection.Request request) { throw new RuntimeException("Stub!"); }
default public  android.view.textclassifier.TextSelection suggestSelection(java.lang.CharSequence text, int selectionStartIndex, int selectionEndIndex, android.os.LocaleList defaultLocales) { throw new RuntimeException("Stub!"); }
default public  android.view.textclassifier.TextClassification classifyText(android.view.textclassifier.TextClassification.Request request) { throw new RuntimeException("Stub!"); }
default public  android.view.textclassifier.TextClassification classifyText(java.lang.CharSequence text, int startIndex, int endIndex, android.os.LocaleList defaultLocales) { throw new RuntimeException("Stub!"); }
default public  android.view.textclassifier.TextLinks generateLinks(android.view.textclassifier.TextLinks.Request request) { throw new RuntimeException("Stub!"); }
default public  int getMaxGenerateLinksTextLength() { throw new RuntimeException("Stub!"); }
default public  void onSelectionEvent(android.view.textclassifier.SelectionEvent event) { throw new RuntimeException("Stub!"); }
default public  void destroy() { throw new RuntimeException("Stub!"); }
default public  boolean isDestroyed() { throw new RuntimeException("Stub!"); }
public static final java.lang.String HINT_TEXT_IS_EDITABLE = "android.text_is_editable";
public static final java.lang.String HINT_TEXT_IS_NOT_EDITABLE = "android.text_is_not_editable";
public static final android.view.textclassifier.TextClassifier NO_OP = null;
public static final java.lang.String TYPE_ADDRESS = "address";
public static final java.lang.String TYPE_DATE = "date";
public static final java.lang.String TYPE_DATE_TIME = "datetime";
public static final java.lang.String TYPE_EMAIL = "email";
public static final java.lang.String TYPE_FLIGHT_NUMBER = "flight";
public static final java.lang.String TYPE_OTHER = "other";
public static final java.lang.String TYPE_PHONE = "phone";
public static final java.lang.String TYPE_UNKNOWN = "";
public static final java.lang.String TYPE_URL = "url";
public static final java.lang.String WIDGET_TYPE_CUSTOM_EDITTEXT = "customedit";
public static final java.lang.String WIDGET_TYPE_CUSTOM_TEXTVIEW = "customview";
public static final java.lang.String WIDGET_TYPE_CUSTOM_UNSELECTABLE_TEXTVIEW = "nosel-customview";
public static final java.lang.String WIDGET_TYPE_EDITTEXT = "edittext";
public static final java.lang.String WIDGET_TYPE_EDIT_WEBVIEW = "edit-webview";
public static final java.lang.String WIDGET_TYPE_TEXTVIEW = "textview";
public static final java.lang.String WIDGET_TYPE_UNKNOWN = "unknown";
public static final java.lang.String WIDGET_TYPE_UNSELECTABLE_TEXTVIEW = "nosel-textview";
public static final java.lang.String WIDGET_TYPE_WEBVIEW = "webview";
}
