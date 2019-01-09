/*
* Copyright (c) 1995, 2014, Oracle and/or its affiliates. All rights reserved.
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

package java.util;
public class BitSet
  implements java.lang.Cloneable, java.io.Serializable
{
public  BitSet() { throw new RuntimeException("Stub!"); }
public  BitSet(int nbits) { throw new RuntimeException("Stub!"); }
public static  java.util.BitSet valueOf(long[] longs) { throw new RuntimeException("Stub!"); }
public static  java.util.BitSet valueOf(java.nio.LongBuffer lb) { throw new RuntimeException("Stub!"); }
public static  java.util.BitSet valueOf(byte[] bytes) { throw new RuntimeException("Stub!"); }
public static  java.util.BitSet valueOf(java.nio.ByteBuffer bb) { throw new RuntimeException("Stub!"); }
public  byte[] toByteArray() { throw new RuntimeException("Stub!"); }
public  long[] toLongArray() { throw new RuntimeException("Stub!"); }
public  void flip(int bitIndex) { throw new RuntimeException("Stub!"); }
public  void flip(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
public  void set(int bitIndex) { throw new RuntimeException("Stub!"); }
public  void set(int bitIndex, boolean value) { throw new RuntimeException("Stub!"); }
public  void set(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
public  void set(int fromIndex, int toIndex, boolean value) { throw new RuntimeException("Stub!"); }
public  void clear(int bitIndex) { throw new RuntimeException("Stub!"); }
public  void clear(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  boolean get(int bitIndex) { throw new RuntimeException("Stub!"); }
public  java.util.BitSet get(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
public  int nextSetBit(int fromIndex) { throw new RuntimeException("Stub!"); }
public  int nextClearBit(int fromIndex) { throw new RuntimeException("Stub!"); }
public  int previousSetBit(int fromIndex) { throw new RuntimeException("Stub!"); }
public  int previousClearBit(int fromIndex) { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  boolean intersects(java.util.BitSet set) { throw new RuntimeException("Stub!"); }
public  int cardinality() { throw new RuntimeException("Stub!"); }
public  void and(java.util.BitSet set) { throw new RuntimeException("Stub!"); }
public  void or(java.util.BitSet set) { throw new RuntimeException("Stub!"); }
public  void xor(java.util.BitSet set) { throw new RuntimeException("Stub!"); }
public  void andNot(java.util.BitSet set) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.util.stream.IntStream stream() { throw new RuntimeException("Stub!"); }
}
