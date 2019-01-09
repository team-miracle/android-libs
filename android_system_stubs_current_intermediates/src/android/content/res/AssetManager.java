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
public final class AssetManager
  implements java.lang.AutoCloseable
{
public final class AssetInputStream
  extends java.io.InputStream
{
AssetInputStream() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
AssetManager() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream open(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream open(java.lang.String fileName, int accessMode) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openFd(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] list(java.lang.String path) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openNonAssetFd(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openNonAssetFd(int cookie, java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser openXmlResourceParser(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser openXmlResourceParser(int cookie, java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getLocales() { throw new RuntimeException("Stub!"); }
public static final int ACCESS_BUFFER = 3;
public static final int ACCESS_RANDOM = 1;
public static final int ACCESS_STREAMING = 2;
public static final int ACCESS_UNKNOWN = 0;
}
