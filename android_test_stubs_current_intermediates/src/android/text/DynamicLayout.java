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
public class DynamicLayout
  extends android.text.Layout
{
public static final class Builder
{
Builder() { throw new RuntimeException("Stub!"); }
public static  android.text.DynamicLayout.Builder obtain(java.lang.CharSequence base, android.text.TextPaint paint, int width) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setDisplayText(java.lang.CharSequence display) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setAlignment(android.text.Layout.Alignment alignment) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setTextDirection(android.text.TextDirectionHeuristic textDir) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setLineSpacing(float spacingAdd, float spacingMult) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setIncludePad(boolean includePad) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setUseLineSpacingFromFallbacks(boolean useLineSpacingFromFallbacks) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setEllipsizedWidth(int ellipsizedWidth) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setEllipsize(android.text.TextUtils.TruncateAt ellipsize) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setBreakStrategy(int breakStrategy) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setHyphenationFrequency(int hyphenationFrequency) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout.Builder setJustificationMode(int justificationMode) { throw new RuntimeException("Stub!"); }
public  android.text.DynamicLayout build() { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public  DynamicLayout(java.lang.CharSequence base, android.text.TextPaint paint, int width, android.text.Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) { super((java.lang.CharSequence)null,(android.text.TextPaint)null,0,(android.text.Layout.Alignment)null,0,0); throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  DynamicLayout(java.lang.CharSequence base, java.lang.CharSequence display, android.text.TextPaint paint, int width, android.text.Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) { super((java.lang.CharSequence)null,(android.text.TextPaint)null,0,(android.text.Layout.Alignment)null,0,0); throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  DynamicLayout(java.lang.CharSequence base, java.lang.CharSequence display, android.text.TextPaint paint, int width, android.text.Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad, android.text.TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { super((java.lang.CharSequence)null,(android.text.TextPaint)null,0,(android.text.Layout.Alignment)null,0,0); throw new RuntimeException("Stub!"); }
public  int getLineCount() { throw new RuntimeException("Stub!"); }
public  int getLineTop(int line) { throw new RuntimeException("Stub!"); }
public  int getLineDescent(int line) { throw new RuntimeException("Stub!"); }
public  int getLineStart(int line) { throw new RuntimeException("Stub!"); }
public  boolean getLineContainsTab(int line) { throw new RuntimeException("Stub!"); }
public  int getParagraphDirection(int line) { throw new RuntimeException("Stub!"); }
public final  android.text.Layout.Directions getLineDirections(int line) { throw new RuntimeException("Stub!"); }
public  int getTopPadding() { throw new RuntimeException("Stub!"); }
public  int getBottomPadding() { throw new RuntimeException("Stub!"); }
public  int getEllipsizedWidth() { throw new RuntimeException("Stub!"); }
public  int getEllipsisStart(int line) { throw new RuntimeException("Stub!"); }
public  int getEllipsisCount(int line) { throw new RuntimeException("Stub!"); }
}
