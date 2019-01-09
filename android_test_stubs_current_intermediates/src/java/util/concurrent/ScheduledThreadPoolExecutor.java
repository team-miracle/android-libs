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
public class ScheduledThreadPoolExecutor
  extends java.util.concurrent.ThreadPoolExecutor
  implements java.util.concurrent.ScheduledExecutorService
{
public  ScheduledThreadPoolExecutor(int corePoolSize) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
public  ScheduledThreadPoolExecutor(int corePoolSize, java.util.concurrent.ThreadFactory threadFactory) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
public  ScheduledThreadPoolExecutor(int corePoolSize, java.util.concurrent.RejectedExecutionHandler handler) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
public  ScheduledThreadPoolExecutor(int corePoolSize, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler handler) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
protected <V> java.util.concurrent.RunnableScheduledFuture<V> decorateTask(java.lang.Runnable runnable, java.util.concurrent.RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); }
protected <V> java.util.concurrent.RunnableScheduledFuture<V> decorateTask(java.util.concurrent.Callable<V> callable, java.util.concurrent.RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  void execute(java.lang.Runnable command) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<?> submit(java.lang.Runnable task) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) { throw new RuntimeException("Stub!"); }
public  void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); }
public  void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); }
public  void setRemoveOnCancelPolicy(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getRemoveOnCancelPolicy() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.BlockingQueue<java.lang.Runnable> getQueue() { throw new RuntimeException("Stub!"); }
}
