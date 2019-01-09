/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.hardware.camera2.params;
public final class TonemapCurve
{
public  TonemapCurve(float[] red, float[] green, float[] blue) { throw new RuntimeException("Stub!"); }
public  int getPointCount(int colorChannel) { throw new RuntimeException("Stub!"); }
public  android.graphics.PointF getPoint(int colorChannel, int index) { throw new RuntimeException("Stub!"); }
public  void copyColorCurve(int colorChannel, float[] destination, int offset) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int CHANNEL_BLUE = 2;
public static final int CHANNEL_GREEN = 1;
public static final int CHANNEL_RED = 0;
public static final float LEVEL_BLACK = 0.0f;
public static final float LEVEL_WHITE = 1.0f;
public static final int POINT_SIZE = 2;
}
