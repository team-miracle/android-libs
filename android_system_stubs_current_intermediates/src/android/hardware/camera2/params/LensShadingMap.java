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
public final class LensShadingMap
{
LensShadingMap() { throw new RuntimeException("Stub!"); }
public  int getRowCount() { throw new RuntimeException("Stub!"); }
public  int getColumnCount() { throw new RuntimeException("Stub!"); }
public  int getGainFactorCount() { throw new RuntimeException("Stub!"); }
public  float getGainFactor(int colorChannel, int column, int row) { throw new RuntimeException("Stub!"); }
public  android.hardware.camera2.params.RggbChannelVector getGainFactorVector(int column, int row) { throw new RuntimeException("Stub!"); }
public  void copyGainFactors(float[] destination, int offset) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final float MINIMUM_GAIN_FACTOR = 1.0f;
}
