/*
* Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;
public abstract class ShortBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.ShortBuffer>
{
ShortBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.ShortBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.ShortBuffer wrap(short[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  java.nio.ShortBuffer wrap(short[] array) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ShortBuffer slice();
public abstract  java.nio.ShortBuffer duplicate();
public abstract  java.nio.ShortBuffer asReadOnlyBuffer();
public abstract  short get();
public abstract  java.nio.ShortBuffer put(short s);
public abstract  short get(int index);
public abstract  java.nio.ShortBuffer put(int index, short s);
public  java.nio.ShortBuffer get(short[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
public  java.nio.ShortBuffer get(short[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.ShortBuffer put(java.nio.ShortBuffer src) { throw new RuntimeException("Stub!"); }
public  java.nio.ShortBuffer put(short[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
public final  java.nio.ShortBuffer put(short[] src) { throw new RuntimeException("Stub!"); }
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public final  short[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ShortBuffer compact();
public abstract  boolean isDirect();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ob) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.nio.ShortBuffer that) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteOrder order();
}
