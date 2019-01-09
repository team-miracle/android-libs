/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.text;
public class TextUtils
{
public static interface StringSplitter
  extends java.lang.Iterable<java.lang.String>
{
public abstract  void setString(java.lang.String string);
}
public static class SimpleStringSplitter
  implements android.text.TextUtils.StringSplitter, java.util.Iterator<java.lang.String>
{
public  SimpleStringSplitter(char delimiter) { throw new RuntimeException("Stub!"); }
public  void setString(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.String> iterator() { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  java.lang.String next() { throw new RuntimeException("Stub!"); }
public  void remove() { throw new RuntimeException("Stub!"); }
}
public static enum TruncateAt
{
END(),
MARQUEE(),
MIDDLE(),
START();
}
public static interface EllipsizeCallback
{
public abstract  void ellipsized(int start, int end);
}
TextUtils() { throw new RuntimeException("Stub!"); }
public static  void getChars(java.lang.CharSequence s, int start, int end, char[] dest, int destoff) { throw new RuntimeException("Stub!"); }
public static  int indexOf(java.lang.CharSequence s, char ch) { throw new RuntimeException("Stub!"); }
public static  int indexOf(java.lang.CharSequence s, char ch, int start) { throw new RuntimeException("Stub!"); }
public static  int indexOf(java.lang.CharSequence s, char ch, int start, int end) { throw new RuntimeException("Stub!"); }
public static  int lastIndexOf(java.lang.CharSequence s, char ch) { throw new RuntimeException("Stub!"); }
public static  int lastIndexOf(java.lang.CharSequence s, char ch, int last) { throw new RuntimeException("Stub!"); }
public static  int lastIndexOf(java.lang.CharSequence s, char ch, int start, int last) { throw new RuntimeException("Stub!"); }
public static  int indexOf(java.lang.CharSequence s, java.lang.CharSequence needle) { throw new RuntimeException("Stub!"); }
public static  int indexOf(java.lang.CharSequence s, java.lang.CharSequence needle, int start) { throw new RuntimeException("Stub!"); }
public static  int indexOf(java.lang.CharSequence s, java.lang.CharSequence needle, int start, int end) { throw new RuntimeException("Stub!"); }
public static  boolean regionMatches(java.lang.CharSequence one, int toffset, java.lang.CharSequence two, int ooffset, int len) { throw new RuntimeException("Stub!"); }
public static  java.lang.String substring(java.lang.CharSequence source, int start, int end) { throw new RuntimeException("Stub!"); }
public static  java.lang.String join(java.lang.CharSequence delimiter, java.lang.Object[] tokens) { throw new RuntimeException("Stub!"); }
public static  java.lang.String join(java.lang.CharSequence delimiter, java.lang.Iterable tokens) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] split(java.lang.String text, java.lang.String expression) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] split(java.lang.String text, java.util.regex.Pattern pattern) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence stringOrSpannedString(java.lang.CharSequence source) { throw new RuntimeException("Stub!"); }
public static  boolean isEmpty(java.lang.CharSequence str) { throw new RuntimeException("Stub!"); }
public static  int getTrimmedLength(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public static  boolean equals(java.lang.CharSequence a, java.lang.CharSequence b) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.CharSequence getReverse(java.lang.CharSequence source, int start, int end) { throw new RuntimeException("Stub!"); }
public static  void writeToParcel(java.lang.CharSequence cs, android.os.Parcel p, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static  void dumpSpans(java.lang.CharSequence cs, android.util.Printer printer, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence replace(java.lang.CharSequence template, java.lang.String[] sources, java.lang.CharSequence[] destinations) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence expandTemplate(java.lang.CharSequence template, java.lang.CharSequence... values) { throw new RuntimeException("Stub!"); }
public static  int getOffsetBefore(java.lang.CharSequence text, int offset) { throw new RuntimeException("Stub!"); }
public static  int getOffsetAfter(java.lang.CharSequence text, int offset) { throw new RuntimeException("Stub!"); }
public static  void copySpansFrom(android.text.Spanned source, int start, int end, java.lang.Class kind, android.text.Spannable dest, int destoff) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence ellipsize(java.lang.CharSequence text, android.text.TextPaint p, float avail, android.text.TextUtils.TruncateAt where) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence ellipsize(java.lang.CharSequence text, android.text.TextPaint paint, float avail, android.text.TextUtils.TruncateAt where, boolean preserveLength, android.text.TextUtils.EllipsizeCallback callback) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence listEllipsize(android.content.Context context, java.util.List<java.lang.CharSequence> elements, java.lang.String separator, android.text.TextPaint paint, float avail, int moreId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.CharSequence commaEllipsize(java.lang.CharSequence text, android.text.TextPaint p, float avail, java.lang.String oneMore, java.lang.String more) { throw new RuntimeException("Stub!"); }
public static  java.lang.String htmlEncode(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  java.lang.CharSequence concat(java.lang.CharSequence... text) { throw new RuntimeException("Stub!"); }
public static  boolean isGraphic(java.lang.CharSequence str) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isGraphic(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isDigitsOnly(java.lang.CharSequence str) { throw new RuntimeException("Stub!"); }
public static  int getCapsMode(java.lang.CharSequence cs, int off, int reqModes) { throw new RuntimeException("Stub!"); }
public static  int getLayoutDirectionFromLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final int CAP_MODE_CHARACTERS = 4096;
public static final int CAP_MODE_SENTENCES = 16384;
public static final int CAP_MODE_WORDS = 8192;
public static final android.os.Parcelable.Creator<java.lang.CharSequence> CHAR_SEQUENCE_CREATOR;
static { CHAR_SEQUENCE_CREATOR = null; }
}
