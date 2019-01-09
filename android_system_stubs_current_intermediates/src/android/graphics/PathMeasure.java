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
public class PathMeasure
{
public  PathMeasure() { throw new RuntimeException("Stub!"); }
public  PathMeasure(android.graphics.Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); }
public  void setPath(android.graphics.Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); }
public  float getLength() { throw new RuntimeException("Stub!"); }
public  boolean getPosTan(float distance, float[] pos, float[] tan) { throw new RuntimeException("Stub!"); }
public  boolean getMatrix(float distance, android.graphics.Matrix matrix, int flags) { throw new RuntimeException("Stub!"); }
public  boolean getSegment(float startD, float stopD, android.graphics.Path dst, boolean startWithMoveTo) { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  boolean nextContour() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int POSITION_MATRIX_FLAG = 1;
public static final int TANGENT_MATRIX_FLAG = 2;
}
