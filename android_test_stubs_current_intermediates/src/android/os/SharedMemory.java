/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class SharedMemory
  implements android.os.Parcelable, java.io.Closeable
{
SharedMemory() { throw new RuntimeException("Stub!"); }
public static  android.os.SharedMemory create(java.lang.String name, int size) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public  boolean setProtect(int prot) { throw new RuntimeException("Stub!"); }
public  int getSize() { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer mapReadWrite() throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer mapReadOnly() throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer map(int prot, int offset, int length) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void unmap(java.nio.ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.SharedMemory> CREATOR;
static { CREATOR = null; }
}
