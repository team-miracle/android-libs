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

package android.os;
public final class Bundle
  extends android.os.BaseBundle
  implements java.lang.Cloneable, android.os.Parcelable
{
public  Bundle() { throw new RuntimeException("Stub!"); }
public  Bundle(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  Bundle(int capacity) { throw new RuntimeException("Stub!"); }
public  Bundle(android.os.Bundle b) { throw new RuntimeException("Stub!"); }
public  Bundle(android.os.PersistableBundle b) { throw new RuntimeException("Stub!"); }
public  void setClassLoader(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  java.lang.ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle deepCopy() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  void remove(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void putAll(android.os.Bundle bundle) { throw new RuntimeException("Stub!"); }
public  boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
public  void putByte(java.lang.String key, byte value) { throw new RuntimeException("Stub!"); }
public  void putChar(java.lang.String key, char value) { throw new RuntimeException("Stub!"); }
public  void putShort(java.lang.String key, short value) { throw new RuntimeException("Stub!"); }
public  void putFloat(java.lang.String key, float value) { throw new RuntimeException("Stub!"); }
public  void putCharSequence(java.lang.String key, java.lang.CharSequence value) { throw new RuntimeException("Stub!"); }
public  void putParcelable(java.lang.String key, android.os.Parcelable value) { throw new RuntimeException("Stub!"); }
public  void putSize(java.lang.String key, android.util.Size value) { throw new RuntimeException("Stub!"); }
public  void putSizeF(java.lang.String key, android.util.SizeF value) { throw new RuntimeException("Stub!"); }
public  void putParcelableArray(java.lang.String key, android.os.Parcelable[] value) { throw new RuntimeException("Stub!"); }
public  void putParcelableArrayList(java.lang.String key, java.util.ArrayList<? extends android.os.Parcelable> value) { throw new RuntimeException("Stub!"); }
public  void putSparseParcelableArray(java.lang.String key, android.util.SparseArray<? extends android.os.Parcelable> value) { throw new RuntimeException("Stub!"); }
public  void putIntegerArrayList(java.lang.String key, java.util.ArrayList<java.lang.Integer> value) { throw new RuntimeException("Stub!"); }
public  void putStringArrayList(java.lang.String key, java.util.ArrayList<java.lang.String> value) { throw new RuntimeException("Stub!"); }
public  void putCharSequenceArrayList(java.lang.String key, java.util.ArrayList<java.lang.CharSequence> value) { throw new RuntimeException("Stub!"); }
public  void putSerializable(java.lang.String key, java.io.Serializable value) { throw new RuntimeException("Stub!"); }
public  void putByteArray(java.lang.String key, byte[] value) { throw new RuntimeException("Stub!"); }
public  void putShortArray(java.lang.String key, short[] value) { throw new RuntimeException("Stub!"); }
public  void putCharArray(java.lang.String key, char[] value) { throw new RuntimeException("Stub!"); }
public  void putFloatArray(java.lang.String key, float[] value) { throw new RuntimeException("Stub!"); }
public  void putCharSequenceArray(java.lang.String key, java.lang.CharSequence[] value) { throw new RuntimeException("Stub!"); }
public  void putBundle(java.lang.String key, android.os.Bundle value) { throw new RuntimeException("Stub!"); }
public  void putBinder(java.lang.String key, android.os.IBinder value) { throw new RuntimeException("Stub!"); }
public  byte getByte(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Byte getByte(java.lang.String key, byte defaultValue) { throw new RuntimeException("Stub!"); }
public  char getChar(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  char getChar(java.lang.String key, char defaultValue) { throw new RuntimeException("Stub!"); }
public  short getShort(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  short getShort(java.lang.String key, short defaultValue) { throw new RuntimeException("Stub!"); }
public  float getFloat(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  float getFloat(java.lang.String key, float defaultValue) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCharSequence(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCharSequence(java.lang.String key, java.lang.CharSequence defaultValue) { throw new RuntimeException("Stub!"); }
public  android.util.Size getSize(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.util.SizeF getSizeF(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBundle(java.lang.String key) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> T getParcelable(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable[] getParcelableArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> java.util.ArrayList<T> getParcelableArrayList(java.lang.String key) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> android.util.SparseArray<T> getSparseParcelableArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.io.Serializable getSerializable(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.Integer> getIntegerArrayList(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayList(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  byte[] getByteArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  short[] getShortArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  char[] getCharArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  float[] getFloatArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getCharSequenceArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder getBinder(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel parcel) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.Bundle> CREATOR;
public static final android.os.Bundle EMPTY;
static { CREATOR = null; EMPTY = null; }
}
