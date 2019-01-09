/*
* Copyright (C) 2009-2012 The Android Open Source Project
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

package android.renderscript;
public class Matrix4f
{
public  Matrix4f() { throw new RuntimeException("Stub!"); }
public  Matrix4f(float[] dataArray) { throw new RuntimeException("Stub!"); }
public  float[] getArray() { throw new RuntimeException("Stub!"); }
public  float get(int x, int y) { throw new RuntimeException("Stub!"); }
public  void set(int x, int y, float v) { throw new RuntimeException("Stub!"); }
public  void loadIdentity() { throw new RuntimeException("Stub!"); }
public  void load(android.renderscript.Matrix4f src) { throw new RuntimeException("Stub!"); }
public  void loadRotate(float rot, float x, float y, float z) { throw new RuntimeException("Stub!"); }
public  void loadScale(float x, float y, float z) { throw new RuntimeException("Stub!"); }
public  void loadTranslate(float x, float y, float z) { throw new RuntimeException("Stub!"); }
public  void loadMultiply(android.renderscript.Matrix4f lhs, android.renderscript.Matrix4f rhs) { throw new RuntimeException("Stub!"); }
public  void loadOrtho(float l, float r, float b, float t, float n, float f) { throw new RuntimeException("Stub!"); }
public  void loadOrthoWindow(int w, int h) { throw new RuntimeException("Stub!"); }
public  void loadFrustum(float l, float r, float b, float t, float n, float f) { throw new RuntimeException("Stub!"); }
public  void loadPerspective(float fovy, float aspect, float near, float far) { throw new RuntimeException("Stub!"); }
public  void loadProjectionNormalized(int w, int h) { throw new RuntimeException("Stub!"); }
public  void multiply(android.renderscript.Matrix4f rhs) { throw new RuntimeException("Stub!"); }
public  void rotate(float rot, float x, float y, float z) { throw new RuntimeException("Stub!"); }
public  void scale(float x, float y, float z) { throw new RuntimeException("Stub!"); }
public  void translate(float x, float y, float z) { throw new RuntimeException("Stub!"); }
public  boolean inverse() { throw new RuntimeException("Stub!"); }
public  boolean inverseTranspose() { throw new RuntimeException("Stub!"); }
public  void transpose() { throw new RuntimeException("Stub!"); }
}
