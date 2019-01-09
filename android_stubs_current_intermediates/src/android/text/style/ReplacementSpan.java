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
public abstract class ReplacementSpan
  extends android.text.style.MetricAffectingSpan
{
public  ReplacementSpan() { throw new RuntimeException("Stub!"); }
public abstract  int getSize(android.graphics.Paint paint, java.lang.CharSequence text, int start, int end, android.graphics.Paint.FontMetricsInt fm);
public abstract  void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, android.graphics.Paint paint);
public  void updateMeasureState(android.text.TextPaint p) { throw new RuntimeException("Stub!"); }
public  void updateDrawState(android.text.TextPaint ds) { throw new RuntimeException("Stub!"); }
}
