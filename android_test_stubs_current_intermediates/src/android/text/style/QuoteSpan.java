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
public class QuoteSpan
  implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan
{
public  QuoteSpan() { throw new RuntimeException("Stub!"); }
public  QuoteSpan(int color) { throw new RuntimeException("Stub!"); }
public  QuoteSpan(int color, int stripeWidth, int gapWidth) { throw new RuntimeException("Stub!"); }
public  QuoteSpan(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getColor() { throw new RuntimeException("Stub!"); }
public  int getStripeWidth() { throw new RuntimeException("Stub!"); }
public  int getGapWidth() { throw new RuntimeException("Stub!"); }
public  int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
public  void drawLeadingMargin(android.graphics.Canvas c, android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
public static final int STANDARD_COLOR = -16776961;
public static final int STANDARD_GAP_WIDTH_PX = 2;
public static final int STANDARD_STRIPE_WIDTH_PX = 2;
}
