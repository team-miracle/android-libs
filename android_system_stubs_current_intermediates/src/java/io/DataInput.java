/*
* Copyright (c) 1995, 2013, Oracle and/or its affiliates. All rights reserved.
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
public interface DataInput
{
public abstract  void readFully(byte[] b) throws java.io.IOException;
public abstract  void readFully(byte[] b, int off, int len) throws java.io.IOException;
public abstract  int skipBytes(int n) throws java.io.IOException;
public abstract  boolean readBoolean() throws java.io.IOException;
public abstract  byte readByte() throws java.io.IOException;
public abstract  int readUnsignedByte() throws java.io.IOException;
public abstract  short readShort() throws java.io.IOException;
public abstract  int readUnsignedShort() throws java.io.IOException;
public abstract  char readChar() throws java.io.IOException;
public abstract  int readInt() throws java.io.IOException;
public abstract  long readLong() throws java.io.IOException;
public abstract  float readFloat() throws java.io.IOException;
public abstract  double readDouble() throws java.io.IOException;
public abstract  java.lang.String readLine() throws java.io.IOException;
public abstract  java.lang.String readUTF() throws java.io.IOException;
}
