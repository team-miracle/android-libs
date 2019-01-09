/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.os;
public class HwBlob
{
public  HwBlob(int size) { throw new RuntimeException("Stub!"); }
public final native  boolean getBool(long offset);
public final native  byte getInt8(long offset);
public final native  short getInt16(long offset);
public final native  int getInt32(long offset);
public final native  long getInt64(long offset);
public final native  float getFloat(long offset);
public final native  double getDouble(long offset);
public final native  java.lang.String getString(long offset);
public final native  void copyToBoolArray(long offset, boolean[] array, int size);
public final native  void copyToInt8Array(long offset, byte[] array, int size);
public final native  void copyToInt16Array(long offset, short[] array, int size);
public final native  void copyToInt32Array(long offset, int[] array, int size);
public final native  void copyToInt64Array(long offset, long[] array, int size);
public final native  void copyToFloatArray(long offset, float[] array, int size);
public final native  void copyToDoubleArray(long offset, double[] array, int size);
public final native  void putBool(long offset, boolean x);
public final native  void putInt8(long offset, byte x);
public final native  void putInt16(long offset, short x);
public final native  void putInt32(long offset, int x);
public final native  void putInt64(long offset, long x);
public final native  void putFloat(long offset, float x);
public final native  void putDouble(long offset, double x);
public final native  void putString(long offset, java.lang.String x);
public final native  void putBoolArray(long offset, boolean[] x);
public final native  void putInt8Array(long offset, byte[] x);
public final native  void putInt16Array(long offset, short[] x);
public final native  void putInt32Array(long offset, int[] x);
public final native  void putInt64Array(long offset, long[] x);
public final native  void putFloatArray(long offset, float[] x);
public final native  void putDoubleArray(long offset, double[] x);
public final native  void putBlob(long offset, android.os.HwBlob blob);
public final native  long handle();
public static  java.lang.Boolean[] wrapArray(boolean[] array) { throw new RuntimeException("Stub!"); }
public static  java.lang.Long[] wrapArray(long[] array) { throw new RuntimeException("Stub!"); }
public static  java.lang.Byte[] wrapArray(byte[] array) { throw new RuntimeException("Stub!"); }
public static  java.lang.Short[] wrapArray(short[] array) { throw new RuntimeException("Stub!"); }
public static  java.lang.Integer[] wrapArray(int[] array) { throw new RuntimeException("Stub!"); }
public static  java.lang.Float[] wrapArray(float[] array) { throw new RuntimeException("Stub!"); }
public static  java.lang.Double[] wrapArray(double[] array) { throw new RuntimeException("Stub!"); }
}
