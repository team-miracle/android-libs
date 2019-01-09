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
public interface LeadingMarginSpan
  extends android.text.style.ParagraphStyle
{
public static interface LeadingMarginSpan2
  extends android.text.style.LeadingMarginSpan, android.text.style.WrapTogetherSpan
{
public abstract  int getLeadingMarginLineCount();
}
public static class Standard
  implements android.text.style.LeadingMarginSpan, android.text.ParcelableSpan
{
public  Standard(int first, int rest) { throw new RuntimeException("Stub!"); }
public  Standard(int every) { throw new RuntimeException("Stub!"); }
public  Standard(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
public  void drawLeadingMargin(android.graphics.Canvas c, android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout) { throw new RuntimeException("Stub!"); }
}
public abstract  int getLeadingMargin(boolean first);
public abstract  void drawLeadingMargin(android.graphics.Canvas c, android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout layout);
}
