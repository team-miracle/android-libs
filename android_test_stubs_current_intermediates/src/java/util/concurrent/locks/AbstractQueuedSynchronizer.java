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
public abstract class AbstractQueuedSynchronizer
  extends java.util.concurrent.locks.AbstractOwnableSynchronizer
  implements java.io.Serializable
{
public class ConditionObject
  implements java.util.concurrent.locks.Condition, java.io.Serializable
{
public  ConditionObject() { throw new RuntimeException("Stub!"); }
public final  void signal() { throw new RuntimeException("Stub!"); }
public final  void signalAll() { throw new RuntimeException("Stub!"); }
public final  void awaitUninterruptibly() { throw new RuntimeException("Stub!"); }
public final  void await() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  long awaitNanos(long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean awaitUntil(java.util.Date deadline) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean await(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
protected final  boolean hasWaiters() { throw new RuntimeException("Stub!"); }
protected final  int getWaitQueueLength() { throw new RuntimeException("Stub!"); }
protected final  java.util.Collection<java.lang.Thread> getWaitingThreads() { throw new RuntimeException("Stub!"); }
}
protected  AbstractQueuedSynchronizer() { throw new RuntimeException("Stub!"); }
protected final  int getState() { throw new RuntimeException("Stub!"); }
protected final  void setState(int newState) { throw new RuntimeException("Stub!"); }
protected final  boolean compareAndSetState(int expect, int update) { throw new RuntimeException("Stub!"); }
protected  boolean tryAcquire(int arg) { throw new RuntimeException("Stub!"); }
protected  boolean tryRelease(int arg) { throw new RuntimeException("Stub!"); }
protected  int tryAcquireShared(int arg) { throw new RuntimeException("Stub!"); }
protected  boolean tryReleaseShared(int arg) { throw new RuntimeException("Stub!"); }
protected  boolean isHeldExclusively() { throw new RuntimeException("Stub!"); }
public final  void acquire(int arg) { throw new RuntimeException("Stub!"); }
public final  void acquireInterruptibly(int arg) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean tryAcquireNanos(int arg, long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean release(int arg) { throw new RuntimeException("Stub!"); }
public final  void acquireShared(int arg) { throw new RuntimeException("Stub!"); }
public final  void acquireSharedInterruptibly(int arg) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean tryAcquireSharedNanos(int arg, long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean releaseShared(int arg) { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  boolean hasContended() { throw new RuntimeException("Stub!"); }
public final  java.lang.Thread getFirstQueuedThread() { throw new RuntimeException("Stub!"); }
public final  boolean isQueued(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedPredecessors() { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getExclusiveQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getSharedQueuedThreads() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  boolean owns(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  boolean hasWaiters(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  int getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getWaitingThreads(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
}
