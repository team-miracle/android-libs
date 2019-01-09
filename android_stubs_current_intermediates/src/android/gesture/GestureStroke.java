/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.gesture;
public class GestureStroke
{
public  GestureStroke(java.util.ArrayList<android.gesture.GesturePoint> points) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path getPath() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path toPath(float width, float height, int numSample) { throw new RuntimeException("Stub!"); }
public  void clearPath() { throw new RuntimeException("Stub!"); }
public  android.gesture.OrientedBoundingBox computeOrientedBoundingBox() { throw new RuntimeException("Stub!"); }
public final android.graphics.RectF boundingBox;
public final float length;
public final float[] points = null;
}
