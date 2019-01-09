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
public interface ExecutorService
  extends java.util.concurrent.Executor
{
public abstract  void shutdown();
public abstract  java.util.List<java.lang.Runnable> shutdownNow();
public abstract  boolean isShutdown();
public abstract  boolean isTerminated();
public abstract  boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task);
public abstract <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result);
public abstract  java.util.concurrent.Future<?> submit(java.lang.Runnable task);
public abstract <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException;
public abstract <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException;
public abstract <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException;
}
