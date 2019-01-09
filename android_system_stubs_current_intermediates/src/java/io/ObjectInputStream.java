/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

package java.io;
public class ObjectInputStream
  extends java.io.InputStream
  implements java.io.ObjectInput, java.io.ObjectStreamConstants
{
public abstract static class GetField
{
public  GetField() { throw new RuntimeException("Stub!"); }
public abstract  java.io.ObjectStreamClass getObjectStreamClass();
public abstract  boolean defaulted(java.lang.String name) throws java.io.IOException;
public abstract  boolean get(java.lang.String name, boolean val) throws java.io.IOException;
public abstract  byte get(java.lang.String name, byte val) throws java.io.IOException;
public abstract  char get(java.lang.String name, char val) throws java.io.IOException;
public abstract  short get(java.lang.String name, short val) throws java.io.IOException;
public abstract  int get(java.lang.String name, int val) throws java.io.IOException;
public abstract  long get(java.lang.String name, long val) throws java.io.IOException;
public abstract  float get(java.lang.String name, float val) throws java.io.IOException;
public abstract  double get(java.lang.String name, double val) throws java.io.IOException;
public abstract  java.lang.Object get(java.lang.String name, java.lang.Object val) throws java.io.IOException;
}
public  ObjectInputStream(java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  ObjectInputStream() throws java.io.IOException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object readObject() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readObjectOverride() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  java.lang.Object readUnshared() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  void defaultReadObject() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.ObjectInputStream.GetField readFields() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  void registerValidation(java.io.ObjectInputValidation obj, int prio) throws java.io.NotActiveException, java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> resolveClass(java.io.ObjectStreamClass desc) throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> resolveProxyClass(java.lang.String[] interfaces) throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Object resolveObject(java.lang.Object obj) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean enableResolveObject(boolean enable) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
protected  void readStreamHeader() throws java.io.IOException, java.io.StreamCorruptedException { throw new RuntimeException("Stub!"); }
protected  java.io.ObjectStreamClass readClassDescriptor() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buf, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean readBoolean() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte readByte() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readUnsignedByte() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  char readChar() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  short readShort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readUnsignedShort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readInt() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long readLong() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  float readFloat() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  double readDouble() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void readFully(byte[] buf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void readFully(byte[] buf, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int skipBytes(int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String readLine() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readUTF() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
