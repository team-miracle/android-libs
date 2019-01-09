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
public abstract class DoubleBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.DoubleBuffer>
{
DoubleBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.DoubleBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.DoubleBuffer wrap(double[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  java.nio.DoubleBuffer wrap(double[] array) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.DoubleBuffer slice();
public abstract  java.nio.DoubleBuffer duplicate();
public abstract  java.nio.DoubleBuffer asReadOnlyBuffer();
public abstract  double get();
public abstract  java.nio.DoubleBuffer put(double d);
public abstract  double get(int index);
public abstract  java.nio.DoubleBuffer put(int index, double d);
public  java.nio.DoubleBuffer get(double[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
public  java.nio.DoubleBuffer get(double[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.DoubleBuffer put(java.nio.DoubleBuffer src) { throw new RuntimeException("Stub!"); }
public  java.nio.DoubleBuffer put(double[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
public final  java.nio.DoubleBuffer put(double[] src) { throw new RuntimeException("Stub!"); }
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public final  double[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.DoubleBuffer compact();
public abstract  boolean isDirect();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ob) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.nio.DoubleBuffer that) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteOrder order();
}
