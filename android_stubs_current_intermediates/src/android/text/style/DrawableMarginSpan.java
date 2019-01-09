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

package android.text.style;
public class DrawableMarginSpan
  implements android.text.style.LeadingMarginSpan, android.text.style.LineHeightSpan
{
public  DrawableMarginSpan(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  DrawableMarginSpan(android.graphics.drawable.Drawable drawable, int pad) { throw new RuntimeException("Stub!"); }
public  int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
public  void drawLeadingMargin(android.graphics.Canvas c, android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public  void chooseHeight(java.lang.CharSequence text, int start, int end, int istartv, int v, android.graphics.Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!"); }
}
