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

package android.media;
public class FaceDetector
{
public class Face
{
Face() { throw new RuntimeException("Stub!"); }
public  float confidence() { throw new RuntimeException("Stub!"); }
public  void getMidPoint(android.graphics.PointF point) { throw new RuntimeException("Stub!"); }
public  float eyesDistance() { throw new RuntimeException("Stub!"); }
public  float pose(int euler) { throw new RuntimeException("Stub!"); }
public static final float CONFIDENCE_THRESHOLD = 0.4f;
public static final int EULER_X = 0;
public static final int EULER_Y = 1;
public static final int EULER_Z = 2;
}
public  FaceDetector(int width, int height, int maxFaces) { throw new RuntimeException("Stub!"); }
public  int findFaces(android.graphics.Bitmap bitmap, android.media.FaceDetector.Face[] faces) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
