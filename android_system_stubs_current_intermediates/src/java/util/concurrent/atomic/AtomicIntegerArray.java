/*
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

/*
* This file is available under and governed by the GNU General Public
* License version 2 only, as published by the Free Software Foundation.
* However, the following notice accompanied the original version of this
* file:
*
* Written by Doug Lea with assistance from members of JCP JSR-166
* Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

package java.util.concurrent.atomic;
public class AtomicIntegerArray
  implements java.io.Serializable
{
public  AtomicIntegerArray(int length) { throw new RuntimeException("Stub!"); }
public  AtomicIntegerArray(int[] array) { throw new RuntimeException("Stub!"); }
public final  int length() { throw new RuntimeException("Stub!"); }
public final  int get(int i) { throw new RuntimeException("Stub!"); }
public final  void set(int i, int newValue) { throw new RuntimeException("Stub!"); }
public final  void lazySet(int i, int newValue) { throw new RuntimeException("Stub!"); }
public final  int getAndSet(int i, int newValue) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSet(int i, int expect, int update) { throw new RuntimeException("Stub!"); }
public final  boolean weakCompareAndSet(int i, int expect, int update) { throw new RuntimeException("Stub!"); }
public final  int getAndIncrement(int i) { throw new RuntimeException("Stub!"); }
public final  int getAndDecrement(int i) { throw new RuntimeException("Stub!"); }
public final  int getAndAdd(int i, int delta) { throw new RuntimeException("Stub!"); }
public final  int incrementAndGet(int i) { throw new RuntimeException("Stub!"); }
public final  int decrementAndGet(int i) { throw new RuntimeException("Stub!"); }
public final  int addAndGet(int i, int delta) { throw new RuntimeException("Stub!"); }
public final  int getAndUpdate(int i, java.util.function.IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  int updateAndGet(int i, java.util.function.IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  int getAndAccumulate(int i, int x, java.util.function.IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  int accumulateAndGet(int i, int x, java.util.function.IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
