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

package java.util.concurrent.locks;
public class ReentrantReadWriteLock
  implements java.util.concurrent.locks.ReadWriteLock, java.io.Serializable
{
public static class ReadLock
  implements java.util.concurrent.locks.Lock, java.io.Serializable
{
protected  ReadLock(java.util.concurrent.locks.ReentrantReadWriteLock lock) { throw new RuntimeException("Stub!"); }
public  void lock() { throw new RuntimeException("Stub!"); }
public  void lockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean tryLock() { throw new RuntimeException("Stub!"); }
public  boolean tryLock(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void unlock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Condition newCondition() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class WriteLock
  implements java.util.concurrent.locks.Lock, java.io.Serializable
{
protected  WriteLock(java.util.concurrent.locks.ReentrantReadWriteLock lock) { throw new RuntimeException("Stub!"); }
public  void lock() { throw new RuntimeException("Stub!"); }
public  void lockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean tryLock() { throw new RuntimeException("Stub!"); }
public  boolean tryLock(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void unlock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Condition newCondition() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean isHeldByCurrentThread() { throw new RuntimeException("Stub!"); }
public  int getHoldCount() { throw new RuntimeException("Stub!"); }
}
public  ReentrantReadWriteLock() { throw new RuntimeException("Stub!"); }
public  ReentrantReadWriteLock(boolean fair) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock() { throw new RuntimeException("Stub!"); }
public final  boolean isFair() { throw new RuntimeException("Stub!"); }
protected  java.lang.Thread getOwner() { throw new RuntimeException("Stub!"); }
public  int getReadLockCount() { throw new RuntimeException("Stub!"); }
public  boolean isWriteLocked() { throw new RuntimeException("Stub!"); }
public  boolean isWriteLockedByCurrentThread() { throw new RuntimeException("Stub!"); }
public  int getWriteHoldCount() { throw new RuntimeException("Stub!"); }
public  int getReadHoldCount() { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getQueuedWriterThreads() { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getQueuedReaderThreads() { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThread(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public  boolean hasWaiters(java.util.concurrent.locks.Condition condition) { throw new RuntimeException("Stub!"); }
public  int getWaitQueueLength(java.util.concurrent.locks.Condition condition) { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getWaitingThreads(java.util.concurrent.locks.Condition condition) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
