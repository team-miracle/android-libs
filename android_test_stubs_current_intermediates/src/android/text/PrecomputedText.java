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

package android.text;
public class PrecomputedText
  implements android.text.Spannable
{
public static final class Params
{
public static class Builder
{
public  Builder(android.text.TextPaint paint) { throw new RuntimeException("Stub!"); }
public  android.text.PrecomputedText.Params.Builder setBreakStrategy(int strategy) { throw new RuntimeException("Stub!"); }
public  android.text.PrecomputedText.Params.Builder setHyphenationFrequency(int frequency) { throw new RuntimeException("Stub!"); }
public  android.text.PrecomputedText.Params.Builder setTextDirection(android.text.TextDirectionHeuristic textDir) { throw new RuntimeException("Stub!"); }
public  android.text.PrecomputedText.Params build() { throw new RuntimeException("Stub!"); }
}
Params() { throw new RuntimeException("Stub!"); }
public  android.text.TextPaint getTextPaint() { throw new RuntimeException("Stub!"); }
public  android.text.TextDirectionHeuristic getTextDirection() { throw new RuntimeException("Stub!"); }
public  int getBreakStrategy() { throw new RuntimeException("Stub!"); }
public  int getHyphenationFrequency() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
PrecomputedText() { throw new RuntimeException("Stub!"); }
public static  android.text.PrecomputedText create(java.lang.CharSequence text, android.text.PrecomputedText.Params params) { throw new RuntimeException("Stub!"); }
public  android.text.PrecomputedText.Params getParams() { throw new RuntimeException("Stub!"); }
public  int getParagraphCount() { throw new RuntimeException("Stub!"); }
public  int getParagraphStart(int paraIndex) { throw new RuntimeException("Stub!"); }
public  int getParagraphEnd(int paraIndex) { throw new RuntimeException("Stub!"); }
public  float getWidth(int start, int end) { throw new RuntimeException("Stub!"); }
public  void getBounds(int start, int end, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  void setSpan(java.lang.Object what, int start, int end, int flags) { throw new RuntimeException("Stub!"); }
public  void removeSpan(java.lang.Object what) { throw new RuntimeException("Stub!"); }
public <T> T[] getSpans(int start, int end, java.lang.Class<T> type) { throw new RuntimeException("Stub!"); }
public  int getSpanStart(java.lang.Object tag) { throw new RuntimeException("Stub!"); }
public  int getSpanEnd(java.lang.Object tag) { throw new RuntimeException("Stub!"); }
public  int getSpanFlags(java.lang.Object tag) { throw new RuntimeException("Stub!"); }
public  int nextSpanTransition(int start, int limit, java.lang.Class type) { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  char charAt(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
