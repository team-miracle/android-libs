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
public class FutureTask<V>
  implements java.util.concurrent.RunnableFuture<V>
{
public  FutureTask(java.util.concurrent.Callable<V> callable) { throw new RuntimeException("Stub!"); }
public  FutureTask(java.lang.Runnable runnable, V result) { throw new RuntimeException("Stub!"); }
public  boolean isCancelled() { throw new RuntimeException("Stub!"); }
public  boolean isDone() { throw new RuntimeException("Stub!"); }
public  boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
public  V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException { throw new RuntimeException("Stub!"); }
public  V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
protected  void done() { throw new RuntimeException("Stub!"); }
protected  void set(V v) { throw new RuntimeException("Stub!"); }
protected  void setException(java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
protected  boolean runAndReset() { throw new RuntimeException("Stub!"); }
}
