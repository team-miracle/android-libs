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

package android.content.res;
public class AssetFileDescriptor
  implements android.os.Parcelable, java.io.Closeable
{
public static class AutoCloseInputStream
  extends android.os.ParcelFileDescriptor.AutoCloseInputStream
{
public  AutoCloseInputStream(android.content.res.AssetFileDescriptor fd) throws java.io.IOException { super((android.os.ParcelFileDescriptor)null); throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public synchronized  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public static class AutoCloseOutputStream
  extends android.os.ParcelFileDescriptor.AutoCloseOutputStream
{
public  AutoCloseOutputStream(android.content.res.AssetFileDescriptor fd) throws java.io.IOException { super((android.os.ParcelFileDescriptor)null); throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int oneByte) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public  AssetFileDescriptor(android.os.ParcelFileDescriptor fd, long startOffset, long length) { throw new RuntimeException("Stub!"); }
public  AssetFileDescriptor(android.os.ParcelFileDescriptor fd, long startOffset, long length, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor getParcelFileDescriptor() { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
public  long getStartOffset() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  long getLength() { throw new RuntimeException("Stub!"); }
public  long getDeclaredLength() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.FileInputStream createInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.FileOutputStream createOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.res.AssetFileDescriptor> CREATOR;
public static final long UNKNOWN_LENGTH = -1L;
static { CREATOR = null; }
}
