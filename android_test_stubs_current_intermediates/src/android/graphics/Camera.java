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
public class Camera
{
public  Camera() { throw new RuntimeException("Stub!"); }
public native  void save();
public native  void restore();
public native  void translate(float x, float y, float z);
public native  void rotateX(float deg);
public native  void rotateY(float deg);
public native  void rotateZ(float deg);
public native  void rotate(float x, float y, float z);
public native  float getLocationX();
public native  float getLocationY();
public native  float getLocationZ();
public native  void setLocation(float x, float y, float z);
public  void getMatrix(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
public  void applyToCanvas(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public native  float dotWithNormal(float dx, float dy, float dz);
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
