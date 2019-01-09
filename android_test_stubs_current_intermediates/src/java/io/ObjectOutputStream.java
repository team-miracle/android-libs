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
public class ObjectOutputStream
  extends java.io.OutputStream
  implements java.io.ObjectOutput, java.io.ObjectStreamConstants
{
public abstract static class PutField
{
public  PutField() { throw new RuntimeException("Stub!"); }
public abstract  void put(java.lang.String name, boolean val);
public abstract  void put(java.lang.String name, byte val);
public abstract  void put(java.lang.String name, char val);
public abstract  void put(java.lang.String name, short val);
public abstract  void put(java.lang.String name, int val);
public abstract  void put(java.lang.String name, long val);
public abstract  void put(java.lang.String name, float val);
public abstract  void put(java.lang.String name, double val);
public abstract  void put(java.lang.String name, java.lang.Object val);
@java.lang.Deprecated()
public abstract  void write(java.io.ObjectOutput out) throws java.io.IOException;
}
public  ObjectOutputStream(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  ObjectOutputStream() throws java.io.IOException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void useProtocolVersion(int version) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeObject(java.lang.Object obj) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void writeObjectOverride(java.lang.Object obj) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeUnshared(java.lang.Object obj) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void defaultWriteObject() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.ObjectOutputStream.PutField putFields() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeFields() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void annotateClass(java.lang.Class<?> cl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void annotateProxyClass(java.lang.Class<?> cl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  java.lang.Object replaceObject(java.lang.Object obj) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean enableReplaceObject(boolean enable) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
protected  void writeStreamHeader() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void writeClassDescriptor(java.io.ObjectStreamClass desc) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buf, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void drain() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeBoolean(boolean val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeByte(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeShort(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeChar(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeInt(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLong(long val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeFloat(float val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeDouble(double val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeBytes(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeChars(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeUTF(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
