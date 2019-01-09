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
public class PointF
  implements android.os.Parcelable
{
public  PointF() { throw new RuntimeException("Stub!"); }
public  PointF(float x, float y) { throw new RuntimeException("Stub!"); }
public  PointF(android.graphics.Point p) { throw new RuntimeException("Stub!"); }
public final  void set(float x, float y) { throw new RuntimeException("Stub!"); }
public final  void set(android.graphics.PointF p) { throw new RuntimeException("Stub!"); }
public final  void negate() { throw new RuntimeException("Stub!"); }
public final  void offset(float dx, float dy) { throw new RuntimeException("Stub!"); }
public final  boolean equals(float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  float length() { throw new RuntimeException("Stub!"); }
public static  float length(float x, float y) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.graphics.PointF> CREATOR;
public float x;
public float y;
static { CREATOR = null; }
}
