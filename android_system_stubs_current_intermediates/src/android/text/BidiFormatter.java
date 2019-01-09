/*
* Copyright (C) 2013 The Android Open Source Project
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
public final class BidiFormatter
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(boolean rtlContext) { throw new RuntimeException("Stub!"); }
public  Builder(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  android.text.BidiFormatter.Builder stereoReset(boolean stereoReset) { throw new RuntimeException("Stub!"); }
public  android.text.BidiFormatter.Builder setTextDirectionHeuristic(android.text.TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); }
public  android.text.BidiFormatter build() { throw new RuntimeException("Stub!"); }
}
BidiFormatter() { throw new RuntimeException("Stub!"); }
public static  android.text.BidiFormatter getInstance() { throw new RuntimeException("Stub!"); }
public static  android.text.BidiFormatter getInstance(boolean rtlContext) { throw new RuntimeException("Stub!"); }
public static  android.text.BidiFormatter getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  boolean isRtlContext() { throw new RuntimeException("Stub!"); }
public  boolean getStereoReset() { throw new RuntimeException("Stub!"); }
public  boolean isRtl(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  boolean isRtl(java.lang.CharSequence str) { throw new RuntimeException("Stub!"); }
public  java.lang.String unicodeWrap(java.lang.String str, android.text.TextDirectionHeuristic heuristic, boolean isolate) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence unicodeWrap(java.lang.CharSequence str, android.text.TextDirectionHeuristic heuristic, boolean isolate) { throw new RuntimeException("Stub!"); }
public  java.lang.String unicodeWrap(java.lang.String str, android.text.TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence unicodeWrap(java.lang.CharSequence str, android.text.TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); }
public  java.lang.String unicodeWrap(java.lang.String str, boolean isolate) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence unicodeWrap(java.lang.CharSequence str, boolean isolate) { throw new RuntimeException("Stub!"); }
public  java.lang.String unicodeWrap(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence unicodeWrap(java.lang.CharSequence str) { throw new RuntimeException("Stub!"); }
}
