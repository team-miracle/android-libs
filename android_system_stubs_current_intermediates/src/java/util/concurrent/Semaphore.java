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
public class Semaphore
  implements java.io.Serializable
{
public  Semaphore(int permits) { throw new RuntimeException("Stub!"); }
public  Semaphore(int permits, boolean fair) { throw new RuntimeException("Stub!"); }
public  void acquire() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void acquireUninterruptibly() { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire() { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void acquire(int permits) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void acquireUninterruptibly(int permits) { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire(int permits) { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire(int permits, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void release(int permits) { throw new RuntimeException("Stub!"); }
public  int availablePermits() { throw new RuntimeException("Stub!"); }
public  int drainPermits() { throw new RuntimeException("Stub!"); }
protected  void reducePermits(int reduction) { throw new RuntimeException("Stub!"); }
public  boolean isFair() { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
