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

package java.util.concurrent;
public abstract class CountedCompleter<T>
  extends java.util.concurrent.ForkJoinTask<T>
{
protected  CountedCompleter(java.util.concurrent.CountedCompleter<?> completer, int initialPendingCount) { throw new RuntimeException("Stub!"); }
protected  CountedCompleter(java.util.concurrent.CountedCompleter<?> completer) { throw new RuntimeException("Stub!"); }
protected  CountedCompleter() { throw new RuntimeException("Stub!"); }
public abstract  void compute();
public  void onCompletion(java.util.concurrent.CountedCompleter<?> caller) { throw new RuntimeException("Stub!"); }
public  boolean onExceptionalCompletion(java.lang.Throwable ex, java.util.concurrent.CountedCompleter<?> caller) { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> getCompleter() { throw new RuntimeException("Stub!"); }
public final  int getPendingCount() { throw new RuntimeException("Stub!"); }
public final  void setPendingCount(int count) { throw new RuntimeException("Stub!"); }
public final  void addToPendingCount(int delta) { throw new RuntimeException("Stub!"); }
public final  boolean compareAndSetPendingCount(int expected, int count) { throw new RuntimeException("Stub!"); }
public final  int decrementPendingCountUnlessZero() { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> getRoot() { throw new RuntimeException("Stub!"); }
public final  void tryComplete() { throw new RuntimeException("Stub!"); }
public final  void propagateCompletion() { throw new RuntimeException("Stub!"); }
public  void complete(T rawResult) { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> firstComplete() { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.CountedCompleter<?> nextComplete() { throw new RuntimeException("Stub!"); }
public final  void quietlyCompleteRoot() { throw new RuntimeException("Stub!"); }
public final  void helpComplete(int maxTasks) { throw new RuntimeException("Stub!"); }
protected final  boolean exec() { throw new RuntimeException("Stub!"); }
public  T getRawResult() { throw new RuntimeException("Stub!"); }
protected  void setRawResult(T t) { throw new RuntimeException("Stub!"); }
}
