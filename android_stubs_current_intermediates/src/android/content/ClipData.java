/**
* Copyright (c) 2010, The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.content;
public class ClipData
  implements android.os.Parcelable
{
public static class Item
{
public  Item(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  Item(java.lang.CharSequence text, java.lang.String htmlText) { throw new RuntimeException("Stub!"); }
public  Item(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  Item(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  Item(java.lang.CharSequence text, android.content.Intent intent, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  Item(java.lang.CharSequence text, java.lang.String htmlText, android.content.Intent intent, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  java.lang.String getHtmlText() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getIntent() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence coerceToText(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence coerceToStyledText(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String coerceToHtmlText(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public  ClipData(java.lang.CharSequence label, java.lang.String[] mimeTypes, android.content.ClipData.Item item) { throw new RuntimeException("Stub!"); }
public  ClipData(android.content.ClipDescription description, android.content.ClipData.Item item) { throw new RuntimeException("Stub!"); }
public  ClipData(android.content.ClipData other) { throw new RuntimeException("Stub!"); }
public static  android.content.ClipData newPlainText(java.lang.CharSequence label, java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static  android.content.ClipData newHtmlText(java.lang.CharSequence label, java.lang.CharSequence text, java.lang.String htmlText) { throw new RuntimeException("Stub!"); }
public static  android.content.ClipData newIntent(java.lang.CharSequence label, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static  android.content.ClipData newUri(android.content.ContentResolver resolver, java.lang.CharSequence label, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.content.ClipData newRawUri(java.lang.CharSequence label, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.content.ClipDescription getDescription() { throw new RuntimeException("Stub!"); }
public  void addItem(android.content.ClipData.Item item) { throw new RuntimeException("Stub!"); }
public  void addItem(android.content.ContentResolver resolver, android.content.ClipData.Item item) { throw new RuntimeException("Stub!"); }
public  int getItemCount() { throw new RuntimeException("Stub!"); }
public  android.content.ClipData.Item getItemAt(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.ClipData> CREATOR;
static { CREATOR = null; }
}
