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
public class ParcelFileDescriptor
  implements android.os.Parcelable, java.io.Closeable
{
public static class AutoCloseInputStream
  extends java.io.FileInputStream
{
public  AutoCloseInputStream(android.os.ParcelFileDescriptor pfd) { super((java.io.FileDescriptor)null); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public static class AutoCloseOutputStream
  extends java.io.FileOutputStream
{
public  AutoCloseOutputStream(android.os.ParcelFileDescriptor pfd) { super((java.io.FileDescriptor)null); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
public static interface OnCloseListener
{
public abstract  void onClose(java.io.IOException e);
}
public static class FileDescriptorDetachedException
  extends java.io.IOException
{
public  FileDescriptorDetachedException() { throw new RuntimeException("Stub!"); }
}
public  ParcelFileDescriptor(android.os.ParcelFileDescriptor wrapped) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor open(java.io.File file, int mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor open(java.io.File file, int mode, android.os.Handler handler, android.os.ParcelFileDescriptor.OnCloseListener listener) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor dup(java.io.FileDescriptor orig) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor dup() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor fromFd(int fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor adoptFd(int fd) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor fromSocket(java.net.Socket socket) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor fromDatagramSocket(java.net.DatagramSocket datagramSocket) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor[] createPipe() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor[] createReliablePipe() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor[] createSocketPair() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor[] createReliableSocketPair() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  int parseMode(java.lang.String mode) { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
public  long getStatSize() { throw new RuntimeException("Stub!"); }
public  int getFd() { throw new RuntimeException("Stub!"); }
public  int detachFd() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void closeWithError(java.lang.String msg) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean canDetectErrors() { throw new RuntimeException("Stub!"); }
public  void checkError() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.ParcelFileDescriptor> CREATOR;
public static final int MODE_APPEND = 33554432;
public static final int MODE_CREATE = 134217728;
public static final int MODE_READ_ONLY = 268435456;
public static final int MODE_READ_WRITE = 805306368;
public static final int MODE_TRUNCATE = 67108864;
@java.lang.Deprecated()
public static final int MODE_WORLD_READABLE = 1;
@java.lang.Deprecated()
public static final int MODE_WORLD_WRITEABLE = 2;
public static final int MODE_WRITE_ONLY = 536870912;
static { CREATOR = null; }
}
