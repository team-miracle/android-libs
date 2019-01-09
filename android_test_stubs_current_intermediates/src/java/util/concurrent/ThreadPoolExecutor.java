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
public class ThreadPoolExecutor
  extends java.util.concurrent.AbstractExecutorService
{
public static class CallerRunsPolicy
  implements java.util.concurrent.RejectedExecutionHandler
{
public  CallerRunsPolicy() { throw new RuntimeException("Stub!"); }
public  void rejectedExecution(java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
}
public static class AbortPolicy
  implements java.util.concurrent.RejectedExecutionHandler
{
public  AbortPolicy() { throw new RuntimeException("Stub!"); }
public  void rejectedExecution(java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
}
public static class DiscardPolicy
  implements java.util.concurrent.RejectedExecutionHandler
{
public  DiscardPolicy() { throw new RuntimeException("Stub!"); }
public  void rejectedExecution(java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
}
public static class DiscardOldestPolicy
  implements java.util.concurrent.RejectedExecutionHandler
{
public  DiscardOldestPolicy() { throw new RuntimeException("Stub!"); }
public  void rejectedExecution(java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor e) { throw new RuntimeException("Stub!"); }
}
public  ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, java.util.concurrent.TimeUnit unit, java.util.concurrent.BlockingQueue<java.lang.Runnable> workQueue) { throw new RuntimeException("Stub!"); }
public  ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, java.util.concurrent.TimeUnit unit, java.util.concurrent.BlockingQueue<java.lang.Runnable> workQueue, java.util.concurrent.ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
public  ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, java.util.concurrent.TimeUnit unit, java.util.concurrent.BlockingQueue<java.lang.Runnable> workQueue, java.util.concurrent.RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); }
public  ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, java.util.concurrent.TimeUnit unit, java.util.concurrent.BlockingQueue<java.lang.Runnable> workQueue, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); }
public  void execute(java.lang.Runnable command) { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
public  boolean isShutdown() { throw new RuntimeException("Stub!"); }
public  boolean isTerminating() { throw new RuntimeException("Stub!"); }
public  boolean isTerminated() { throw new RuntimeException("Stub!"); }
public  boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  void setThreadFactory(java.util.concurrent.ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ThreadFactory getThreadFactory() { throw new RuntimeException("Stub!"); }
public  void setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.RejectedExecutionHandler getRejectedExecutionHandler() { throw new RuntimeException("Stub!"); }
public  void setCorePoolSize(int corePoolSize) { throw new RuntimeException("Stub!"); }
public  int getCorePoolSize() { throw new RuntimeException("Stub!"); }
public  boolean prestartCoreThread() { throw new RuntimeException("Stub!"); }
public  int prestartAllCoreThreads() { throw new RuntimeException("Stub!"); }
public  boolean allowsCoreThreadTimeOut() { throw new RuntimeException("Stub!"); }
public  void allowCoreThreadTimeOut(boolean value) { throw new RuntimeException("Stub!"); }
public  void setMaximumPoolSize(int maximumPoolSize) { throw new RuntimeException("Stub!"); }
public  int getMaximumPoolSize() { throw new RuntimeException("Stub!"); }
public  void setKeepAliveTime(long time, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  long getKeepAliveTime(java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.BlockingQueue<java.lang.Runnable> getQueue() { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Runnable task) { throw new RuntimeException("Stub!"); }
public  void purge() { throw new RuntimeException("Stub!"); }
public  int getPoolSize() { throw new RuntimeException("Stub!"); }
public  int getActiveCount() { throw new RuntimeException("Stub!"); }
public  int getLargestPoolSize() { throw new RuntimeException("Stub!"); }
public  long getTaskCount() { throw new RuntimeException("Stub!"); }
public  long getCompletedTaskCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  void beforeExecute(java.lang.Thread t, java.lang.Runnable r) { throw new RuntimeException("Stub!"); }
protected  void afterExecute(java.lang.Runnable r, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
protected  void terminated() { throw new RuntimeException("Stub!"); }
}
