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
public abstract class AtomicIntegerFieldUpdater<T>
{
protected  AtomicIntegerFieldUpdater() { throw new RuntimeException("Stub!"); }
public static <U> java.util.concurrent.atomic.AtomicIntegerFieldUpdater<U> newUpdater(java.lang.Class<U> tclass, java.lang.String fieldName) { throw new RuntimeException("Stub!"); }
public abstract  boolean compareAndSet(T obj, int expect, int update);
public abstract  boolean weakCompareAndSet(T obj, int expect, int update);
public abstract  void set(T obj, int newValue);
public abstract  void lazySet(T obj, int newValue);
public abstract  int get(T obj);
public  int getAndSet(T obj, int newValue) { throw new RuntimeException("Stub!"); }
public  int getAndIncrement(T obj) { throw new RuntimeException("Stub!"); }
public  int getAndDecrement(T obj) { throw new RuntimeException("Stub!"); }
public  int getAndAdd(T obj, int delta) { throw new RuntimeException("Stub!"); }
public  int incrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
public  int decrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
public  int addAndGet(T obj, int delta) { throw new RuntimeException("Stub!"); }
public final  int getAndUpdate(T obj, java.util.function.IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  int updateAndGet(T obj, java.util.function.IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
public final  int getAndAccumulate(T obj, int x, java.util.function.IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
public final  int accumulateAndGet(T obj, int x, java.util.function.IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
}
