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
public class BulletSpan
  implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan
{
public  BulletSpan() { throw new RuntimeException("Stub!"); }
public  BulletSpan(int gapWidth) { throw new RuntimeException("Stub!"); }
public  BulletSpan(int gapWidth, int color) { throw new RuntimeException("Stub!"); }
public  BulletSpan(int gapWidth, int color, int bulletRadius) { throw new RuntimeException("Stub!"); }
public  BulletSpan(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
public  int getGapWidth() { throw new RuntimeException("Stub!"); }
public  int getBulletRadius() { throw new RuntimeException("Stub!"); }
public  int getColor() { throw new RuntimeException("Stub!"); }
public  void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static final int STANDARD_GAP_WIDTH = 2;
}
