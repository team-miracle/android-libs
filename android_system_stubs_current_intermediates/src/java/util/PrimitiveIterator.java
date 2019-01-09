/*
* Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
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
public interface PrimitiveIterator<T, T_CONS>
  extends java.util.Iterator<T>
{
public static interface OfInt
  extends java.util.PrimitiveIterator<java.lang.Integer, java.util.function.IntConsumer>
{
public abstract  int nextInt();
default public  void forEachRemaining(java.util.function.IntConsumer action) { throw new RuntimeException("Stub!"); }
default public  java.lang.Integer next() { throw new RuntimeException("Stub!"); }
default public  void forEachRemaining(java.util.function.Consumer<? super java.lang.Integer> action) { throw new RuntimeException("Stub!"); }
}
public static interface OfLong
  extends java.util.PrimitiveIterator<java.lang.Long, java.util.function.LongConsumer>
{
public abstract  long nextLong();
default public  void forEachRemaining(java.util.function.LongConsumer action) { throw new RuntimeException("Stub!"); }
default public  java.lang.Long next() { throw new RuntimeException("Stub!"); }
default public  void forEachRemaining(java.util.function.Consumer<? super java.lang.Long> action) { throw new RuntimeException("Stub!"); }
}
public static interface OfDouble
  extends java.util.PrimitiveIterator<java.lang.Double, java.util.function.DoubleConsumer>
{
public abstract  double nextDouble();
default public  void forEachRemaining(java.util.function.DoubleConsumer action) { throw new RuntimeException("Stub!"); }
default public  java.lang.Double next() { throw new RuntimeException("Stub!"); }
default public  void forEachRemaining(java.util.function.Consumer<? super java.lang.Double> action) { throw new RuntimeException("Stub!"); }
}
@java.lang.SuppressWarnings(value={"overloads"})
public abstract  void forEachRemaining(T_CONS action);
}
