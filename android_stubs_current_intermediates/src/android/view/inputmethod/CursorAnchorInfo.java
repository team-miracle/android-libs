/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public final class CursorAnchorInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.CursorAnchorInfo.Builder setSelectionRange(int newStart, int newEnd) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.CursorAnchorInfo.Builder setComposingText(int composingTextStart, java.lang.CharSequence composingText) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarkerLocation(float horizontalPosition, float lineTop, float lineBaseline, float lineBottom, int flags) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(int index, float left, float top, float right, float bottom, int flags) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.CursorAnchorInfo.Builder setMatrix(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.CursorAnchorInfo build() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
}
public  CursorAnchorInfo(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getSelectionStart() { throw new RuntimeException("Stub!"); }
public  int getSelectionEnd() { throw new RuntimeException("Stub!"); }
public  int getComposingTextStart() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getComposingText() { throw new RuntimeException("Stub!"); }
public  int getInsertionMarkerFlags() { throw new RuntimeException("Stub!"); }
public  float getInsertionMarkerHorizontal() { throw new RuntimeException("Stub!"); }
public  float getInsertionMarkerTop() { throw new RuntimeException("Stub!"); }
public  float getInsertionMarkerBaseline() { throw new RuntimeException("Stub!"); }
public  float getInsertionMarkerBottom() { throw new RuntimeException("Stub!"); }
public  android.graphics.RectF getCharacterBounds(int index) { throw new RuntimeException("Stub!"); }
public  int getCharacterBoundsFlags(int index) { throw new RuntimeException("Stub!"); }
public  android.graphics.Matrix getMatrix() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.CursorAnchorInfo> CREATOR;
public static final int FLAG_HAS_INVISIBLE_REGION = 2;
public static final int FLAG_HAS_VISIBLE_REGION = 1;
public static final int FLAG_IS_RTL = 4;
static { CREATOR = null; }
}
