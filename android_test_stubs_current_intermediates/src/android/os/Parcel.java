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

package android.os;
public final class Parcel
{
Parcel() { throw new RuntimeException("Stub!"); }
public static  android.os.Parcel obtain() { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public  int dataSize() { throw new RuntimeException("Stub!"); }
public  int dataAvail() { throw new RuntimeException("Stub!"); }
public  int dataPosition() { throw new RuntimeException("Stub!"); }
public  int dataCapacity() { throw new RuntimeException("Stub!"); }
public  void setDataSize(int size) { throw new RuntimeException("Stub!"); }
public  void setDataPosition(int pos) { throw new RuntimeException("Stub!"); }
public  void setDataCapacity(int size) { throw new RuntimeException("Stub!"); }
public  byte[] marshall() { throw new RuntimeException("Stub!"); }
public  void unmarshall(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
public  void appendFrom(android.os.Parcel parcel, int offset, int length) { throw new RuntimeException("Stub!"); }
public  boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
public  void writeInterfaceToken(java.lang.String interfaceName) { throw new RuntimeException("Stub!"); }
public  void enforceInterface(java.lang.String interfaceName) { throw new RuntimeException("Stub!"); }
public  void writeByteArray(byte[] b) { throw new RuntimeException("Stub!"); }
public  void writeByteArray(byte[] b, int offset, int len) { throw new RuntimeException("Stub!"); }
public  void writeInt(int val) { throw new RuntimeException("Stub!"); }
public  void writeLong(long val) { throw new RuntimeException("Stub!"); }
public  void writeFloat(float val) { throw new RuntimeException("Stub!"); }
public  void writeDouble(double val) { throw new RuntimeException("Stub!"); }
public  void writeString(java.lang.String val) { throw new RuntimeException("Stub!"); }
public  void writeStrongBinder(android.os.IBinder val) { throw new RuntimeException("Stub!"); }
public  void writeStrongInterface(android.os.IInterface val) { throw new RuntimeException("Stub!"); }
public  void writeFileDescriptor(java.io.FileDescriptor val) { throw new RuntimeException("Stub!"); }
public  void writeByte(byte val) { throw new RuntimeException("Stub!"); }
public  void writeMap(java.util.Map val) { throw new RuntimeException("Stub!"); }
public  void writeBundle(android.os.Bundle val) { throw new RuntimeException("Stub!"); }
public  void writePersistableBundle(android.os.PersistableBundle val) { throw new RuntimeException("Stub!"); }
public  void writeSize(android.util.Size val) { throw new RuntimeException("Stub!"); }
public  void writeSizeF(android.util.SizeF val) { throw new RuntimeException("Stub!"); }
public  void writeList(java.util.List val) { throw new RuntimeException("Stub!"); }
public  void writeArray(java.lang.Object[] val) { throw new RuntimeException("Stub!"); }
public  void writeSparseArray(android.util.SparseArray<java.lang.Object> val) { throw new RuntimeException("Stub!"); }
public  void writeSparseBooleanArray(android.util.SparseBooleanArray val) { throw new RuntimeException("Stub!"); }
public  void writeBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); }
public  boolean[] createBooleanArray() { throw new RuntimeException("Stub!"); }
public  void readBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); }
public  void writeCharArray(char[] val) { throw new RuntimeException("Stub!"); }
public  char[] createCharArray() { throw new RuntimeException("Stub!"); }
public  void readCharArray(char[] val) { throw new RuntimeException("Stub!"); }
public  void writeIntArray(int[] val) { throw new RuntimeException("Stub!"); }
public  int[] createIntArray() { throw new RuntimeException("Stub!"); }
public  void readIntArray(int[] val) { throw new RuntimeException("Stub!"); }
public  void writeLongArray(long[] val) { throw new RuntimeException("Stub!"); }
public  long[] createLongArray() { throw new RuntimeException("Stub!"); }
public  void readLongArray(long[] val) { throw new RuntimeException("Stub!"); }
public  void writeFloatArray(float[] val) { throw new RuntimeException("Stub!"); }
public  float[] createFloatArray() { throw new RuntimeException("Stub!"); }
public  void readFloatArray(float[] val) { throw new RuntimeException("Stub!"); }
public  void writeDoubleArray(double[] val) { throw new RuntimeException("Stub!"); }
public  double[] createDoubleArray() { throw new RuntimeException("Stub!"); }
public  void readDoubleArray(double[] val) { throw new RuntimeException("Stub!"); }
public  void writeStringArray(java.lang.String[] val) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] createStringArray() { throw new RuntimeException("Stub!"); }
public  void readStringArray(java.lang.String[] val) { throw new RuntimeException("Stub!"); }
public  void writeBinderArray(android.os.IBinder[] val) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder[] createBinderArray() { throw new RuntimeException("Stub!"); }
public  void readBinderArray(android.os.IBinder[] val) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> val) { throw new RuntimeException("Stub!"); }
public  void writeStringList(java.util.List<java.lang.String> val) { throw new RuntimeException("Stub!"); }
public  void writeBinderList(java.util.List<android.os.IBinder> val) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> void writeTypedArray(T[] val, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> void writeTypedObject(T val, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  void writeValue(java.lang.Object v) { throw new RuntimeException("Stub!"); }
public  void writeParcelable(android.os.Parcelable p, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  void writeSerializable(java.io.Serializable s) { throw new RuntimeException("Stub!"); }
public  void writeException(java.lang.Exception e) { throw new RuntimeException("Stub!"); }
public  void writeNoException() { throw new RuntimeException("Stub!"); }
public  void readException() { throw new RuntimeException("Stub!"); }
public  void readException(int code, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  int readInt() { throw new RuntimeException("Stub!"); }
public  long readLong() { throw new RuntimeException("Stub!"); }
public  float readFloat() { throw new RuntimeException("Stub!"); }
public  double readDouble() { throw new RuntimeException("Stub!"); }
public  java.lang.String readString() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder readStrongBinder() { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor readFileDescriptor() { throw new RuntimeException("Stub!"); }
public  byte readByte() { throw new RuntimeException("Stub!"); }
public  void readMap(java.util.Map outVal, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  void readList(java.util.List outVal, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  java.util.HashMap readHashMap(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle readBundle() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle readBundle(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle readPersistableBundle() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle readPersistableBundle(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  android.util.Size readSize() { throw new RuntimeException("Stub!"); }
public  android.util.SizeF readSizeF() { throw new RuntimeException("Stub!"); }
public  byte[] createByteArray() { throw new RuntimeException("Stub!"); }
public  void readByteArray(byte[] val) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList readArrayList(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] readArray(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  android.util.SparseArray readSparseArray(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  android.util.SparseBooleanArray readSparseBooleanArray() { throw new RuntimeException("Stub!"); }
public <T> java.util.ArrayList<T> createTypedArrayList(android.os.Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
public <T> void readTypedList(java.util.List<T> list, android.os.Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> createStringArrayList() { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.os.IBinder> createBinderArrayList() { throw new RuntimeException("Stub!"); }
public  void readStringList(java.util.List<java.lang.String> list) { throw new RuntimeException("Stub!"); }
public  void readBinderList(java.util.List<android.os.IBinder> list) { throw new RuntimeException("Stub!"); }
public <T> T[] createTypedArray(android.os.Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
public <T> void readTypedArray(T[] val, android.os.Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
public <T> T readTypedObject(android.os.Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> void writeParcelableArray(T[] value, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.Object readValue(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <T extends android.os.Parcelable> T readParcelable(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable[] readParcelableArray(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  java.io.Serializable readSerializable() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<java.lang.String> STRING_CREATOR;
static { STRING_CREATOR = null; }
}
