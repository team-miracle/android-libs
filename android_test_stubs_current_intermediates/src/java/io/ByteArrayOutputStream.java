/*
* Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
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
public class ByteArrayOutputStream
  extends java.io.OutputStream
{
public  ByteArrayOutputStream() { throw new RuntimeException("Stub!"); }
public  ByteArrayOutputStream(int size) { throw new RuntimeException("Stub!"); }
public synchronized  void write(int b) { throw new RuntimeException("Stub!"); }
public synchronized  void write(byte[] b, int off, int len) { throw new RuntimeException("Stub!"); }
public synchronized  void writeTo(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void reset() { throw new RuntimeException("Stub!"); }
public synchronized  byte[] toByteArray() { throw new RuntimeException("Stub!"); }
public synchronized  int size() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString(java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public synchronized  java.lang.String toString(int hibyte) { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected byte[] buf = null;
protected int count;
}
