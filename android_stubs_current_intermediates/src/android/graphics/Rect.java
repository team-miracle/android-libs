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

package android.graphics;
public final class Rect
  implements android.os.Parcelable
{
public  Rect() { throw new RuntimeException("Stub!"); }
public  Rect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  Rect(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toShortString() { throw new RuntimeException("Stub!"); }
public  java.lang.String flattenToString() { throw new RuntimeException("Stub!"); }
public static  android.graphics.Rect unflattenFromString(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int width() { throw new RuntimeException("Stub!"); }
public  int height() { throw new RuntimeException("Stub!"); }
public  int centerX() { throw new RuntimeException("Stub!"); }
public  int centerY() { throw new RuntimeException("Stub!"); }
public  float exactCenterX() { throw new RuntimeException("Stub!"); }
public  float exactCenterY() { throw new RuntimeException("Stub!"); }
public  void setEmpty() { throw new RuntimeException("Stub!"); }
public  void set(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.Rect src) { throw new RuntimeException("Stub!"); }
public  void offset(int dx, int dy) { throw new RuntimeException("Stub!"); }
public  void offsetTo(int newLeft, int newTop) { throw new RuntimeException("Stub!"); }
public  void inset(int dx, int dy) { throw new RuntimeException("Stub!"); }
public  boolean contains(int x, int y) { throw new RuntimeException("Stub!"); }
public  boolean contains(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  boolean contains(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  boolean intersect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  boolean intersect(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  boolean setIntersect(android.graphics.Rect a, android.graphics.Rect b) { throw new RuntimeException("Stub!"); }
public  boolean intersects(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public static  boolean intersects(android.graphics.Rect a, android.graphics.Rect b) { throw new RuntimeException("Stub!"); }
public  void union(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void union(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  void union(int x, int y) { throw new RuntimeException("Stub!"); }
public  void sort() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.graphics.Rect> CREATOR;
public int bottom;
public int left;
public int right;
public int top;
static { CREATOR = null; }
}
