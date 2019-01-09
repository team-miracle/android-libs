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
public final class MeteringRectangle
{
public  MeteringRectangle(int x, int y, int width, int height, int meteringWeight) { throw new RuntimeException("Stub!"); }
public  MeteringRectangle(android.graphics.Point xy, android.util.Size dimensions, int meteringWeight) { throw new RuntimeException("Stub!"); }
public  MeteringRectangle(android.graphics.Rect rect, int meteringWeight) { throw new RuntimeException("Stub!"); }
public  int getX() { throw new RuntimeException("Stub!"); }
public  int getY() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getMeteringWeight() { throw new RuntimeException("Stub!"); }
public  android.graphics.Point getUpperLeftPoint() { throw new RuntimeException("Stub!"); }
public  android.util.Size getSize() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getRect() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  boolean equals(android.hardware.camera2.params.MeteringRectangle other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int METERING_WEIGHT_DONT_CARE = 0;
public static final int METERING_WEIGHT_MAX = 1000;
public static final int METERING_WEIGHT_MIN = 0;
}
