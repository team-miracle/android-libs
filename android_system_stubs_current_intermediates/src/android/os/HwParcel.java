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
public class HwParcel
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface Status
{
}
public  HwParcel() { throw new RuntimeException("Stub!"); }
public final native  void writeInterfaceToken(java.lang.String interfaceName);
public final native  void writeBool(boolean val);
public final native  void writeInt8(byte val);
public final native  void writeInt16(short val);
public final native  void writeInt32(int val);
public final native  void writeInt64(long val);
public final native  void writeFloat(float val);
public final native  void writeDouble(double val);
public final native  void writeString(java.lang.String val);
public final  void writeBoolVector(java.util.ArrayList<java.lang.Boolean> val) { throw new RuntimeException("Stub!"); }
public final  void writeInt8Vector(java.util.ArrayList<java.lang.Byte> val) { throw new RuntimeException("Stub!"); }
public final  void writeInt16Vector(java.util.ArrayList<java.lang.Short> val) { throw new RuntimeException("Stub!"); }
public final  void writeInt32Vector(java.util.ArrayList<java.lang.Integer> val) { throw new RuntimeException("Stub!"); }
public final  void writeInt64Vector(java.util.ArrayList<java.lang.Long> val) { throw new RuntimeException("Stub!"); }
public final  void writeFloatVector(java.util.ArrayList<java.lang.Float> val) { throw new RuntimeException("Stub!"); }
public final  void writeDoubleVector(java.util.ArrayList<java.lang.Double> val) { throw new RuntimeException("Stub!"); }
public final  void writeStringVector(java.util.ArrayList<java.lang.String> val) { throw new RuntimeException("Stub!"); }
public final native  void writeStrongBinder(android.os.IHwBinder binder);
public final native  void enforceInterface(java.lang.String interfaceName);
public final native  boolean readBool();
public final native  byte readInt8();
public final native  short readInt16();
public final native  int readInt32();
public final native  long readInt64();
public final native  float readFloat();
public final native  double readDouble();
public final native  java.lang.String readString();
public final  java.util.ArrayList<java.lang.Boolean> readBoolVector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.Byte> readInt8Vector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.Short> readInt16Vector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.Integer> readInt32Vector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.Long> readInt64Vector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.Float> readFloatVector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.Double> readDoubleVector() { throw new RuntimeException("Stub!"); }
public final  java.util.ArrayList<java.lang.String> readStringVector() { throw new RuntimeException("Stub!"); }
public final native  android.os.IHwBinder readStrongBinder();
public final native  android.os.HwBlob readBuffer(long expectedSize);
public final native  android.os.HwBlob readEmbeddedBuffer(long expectedSize, long parentHandle, long offset, boolean nullable);
public final native  void writeBuffer(android.os.HwBlob blob);
public final native  void writeStatus(int status);
public final native  void verifySuccess();
public final native  void releaseTemporaryStorage();
public final native  void release();
public final native  void send();
public static final int STATUS_SUCCESS = 0;
}
