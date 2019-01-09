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
public class Matrix
{
public static enum ScaleToFit
{
CENTER(),
END(),
FILL(),
START();
}
public  Matrix() { throw new RuntimeException("Stub!"); }
public  Matrix(android.graphics.Matrix src) { throw new RuntimeException("Stub!"); }
public  boolean isIdentity() { throw new RuntimeException("Stub!"); }
public  boolean isAffine() { throw new RuntimeException("Stub!"); }
public  boolean rectStaysRect() { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.Matrix src) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void setTranslate(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void setScale(float sx, float sy, float px, float py) { throw new RuntimeException("Stub!"); }
public  void setScale(float sx, float sy) { throw new RuntimeException("Stub!"); }
public  void setRotate(float degrees, float px, float py) { throw new RuntimeException("Stub!"); }
public  void setRotate(float degrees) { throw new RuntimeException("Stub!"); }
public  void setSinCos(float sinValue, float cosValue, float px, float py) { throw new RuntimeException("Stub!"); }
public  void setSinCos(float sinValue, float cosValue) { throw new RuntimeException("Stub!"); }
public  void setSkew(float kx, float ky, float px, float py) { throw new RuntimeException("Stub!"); }
public  void setSkew(float kx, float ky) { throw new RuntimeException("Stub!"); }
public  boolean setConcat(android.graphics.Matrix a, android.graphics.Matrix b) { throw new RuntimeException("Stub!"); }
public  boolean preTranslate(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  boolean preScale(float sx, float sy, float px, float py) { throw new RuntimeException("Stub!"); }
public  boolean preScale(float sx, float sy) { throw new RuntimeException("Stub!"); }
public  boolean preRotate(float degrees, float px, float py) { throw new RuntimeException("Stub!"); }
public  boolean preRotate(float degrees) { throw new RuntimeException("Stub!"); }
public  boolean preSkew(float kx, float ky, float px, float py) { throw new RuntimeException("Stub!"); }
public  boolean preSkew(float kx, float ky) { throw new RuntimeException("Stub!"); }
public  boolean preConcat(android.graphics.Matrix other) { throw new RuntimeException("Stub!"); }
public  boolean postTranslate(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  boolean postScale(float sx, float sy, float px, float py) { throw new RuntimeException("Stub!"); }
public  boolean postScale(float sx, float sy) { throw new RuntimeException("Stub!"); }
public  boolean postRotate(float degrees, float px, float py) { throw new RuntimeException("Stub!"); }
public  boolean postRotate(float degrees) { throw new RuntimeException("Stub!"); }
public  boolean postSkew(float kx, float ky, float px, float py) { throw new RuntimeException("Stub!"); }
public  boolean postSkew(float kx, float ky) { throw new RuntimeException("Stub!"); }
public  boolean postConcat(android.graphics.Matrix other) { throw new RuntimeException("Stub!"); }
public  boolean setRectToRect(android.graphics.RectF src, android.graphics.RectF dst, android.graphics.Matrix.ScaleToFit stf) { throw new RuntimeException("Stub!"); }
public  boolean setPolyToPoly(float[] src, int srcIndex, float[] dst, int dstIndex, int pointCount) { throw new RuntimeException("Stub!"); }
public  boolean invert(android.graphics.Matrix inverse) { throw new RuntimeException("Stub!"); }
public  void mapPoints(float[] dst, int dstIndex, float[] src, int srcIndex, int pointCount) { throw new RuntimeException("Stub!"); }
public  void mapVectors(float[] dst, int dstIndex, float[] src, int srcIndex, int vectorCount) { throw new RuntimeException("Stub!"); }
public  void mapPoints(float[] dst, float[] src) { throw new RuntimeException("Stub!"); }
public  void mapVectors(float[] dst, float[] src) { throw new RuntimeException("Stub!"); }
public  void mapPoints(float[] pts) { throw new RuntimeException("Stub!"); }
public  void mapVectors(float[] vecs) { throw new RuntimeException("Stub!"); }
public  boolean mapRect(android.graphics.RectF dst, android.graphics.RectF src) { throw new RuntimeException("Stub!"); }
public  boolean mapRect(android.graphics.RectF rect) { throw new RuntimeException("Stub!"); }
public  float mapRadius(float radius) { throw new RuntimeException("Stub!"); }
public  void getValues(float[] values) { throw new RuntimeException("Stub!"); }
public  void setValues(float[] values) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toShortString() { throw new RuntimeException("Stub!"); }
public static final int MPERSP_0 = 6;
public static final int MPERSP_1 = 7;
public static final int MPERSP_2 = 8;
public static final int MSCALE_X = 0;
public static final int MSCALE_Y = 4;
public static final int MSKEW_X = 1;
public static final int MSKEW_Y = 3;
public static final int MTRANS_X = 2;
public static final int MTRANS_Y = 5;
}
