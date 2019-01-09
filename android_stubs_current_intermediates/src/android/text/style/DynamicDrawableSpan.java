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
public abstract class DynamicDrawableSpan
  extends android.text.style.ReplacementSpan
{
public  DynamicDrawableSpan() { throw new RuntimeException("Stub!"); }
protected  DynamicDrawableSpan(int verticalAlignment) { throw new RuntimeException("Stub!"); }
public  int getVerticalAlignment() { throw new RuntimeException("Stub!"); }
public abstract  android.graphics.drawable.Drawable getDrawable();
public  int getSize(android.graphics.Paint paint, java.lang.CharSequence text, int start, int end, android.graphics.Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int start, int end, float x, int top, int y, int bottom, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public static final int ALIGN_BASELINE = 1;
public static final int ALIGN_BOTTOM = 0;
protected final int mVerticalAlignment;
}
