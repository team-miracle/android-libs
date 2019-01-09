/*
* Copyright (C) 2007 The Android Open Source Project
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
public class Point
  implements android.os.Parcelable
{
public  Point() { throw new RuntimeException("Stub!"); }
public  Point(int x, int y) { throw new RuntimeException("Stub!"); }
public  Point(android.graphics.Point src) { throw new RuntimeException("Stub!"); }
public  void set(int x, int y) { throw new RuntimeException("Stub!"); }
public final  void negate() { throw new RuntimeException("Stub!"); }
public final  void offset(int dx, int dy) { throw new RuntimeException("Stub!"); }
public final  boolean equals(int x, int y) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.graphics.Point> CREATOR;
public int x;
public int y;
static { CREATOR = null; }
}
