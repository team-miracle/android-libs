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
public class StampedLock
  implements java.io.Serializable
{
public  StampedLock() { throw new RuntimeException("Stub!"); }
public  long writeLock() { throw new RuntimeException("Stub!"); }
public  long tryWriteLock() { throw new RuntimeException("Stub!"); }
public  long tryWriteLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long writeLockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long readLock() { throw new RuntimeException("Stub!"); }
public  long tryReadLock() { throw new RuntimeException("Stub!"); }
public  long tryReadLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long readLockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  long tryOptimisticRead() { throw new RuntimeException("Stub!"); }
public  boolean validate(long stamp) { throw new RuntimeException("Stub!"); }
public  void unlockWrite(long stamp) { throw new RuntimeException("Stub!"); }
public  void unlockRead(long stamp) { throw new RuntimeException("Stub!"); }
public  void unlock(long stamp) { throw new RuntimeException("Stub!"); }
public  long tryConvertToWriteLock(long stamp) { throw new RuntimeException("Stub!"); }
public  long tryConvertToReadLock(long stamp) { throw new RuntimeException("Stub!"); }
public  long tryConvertToOptimisticRead(long stamp) { throw new RuntimeException("Stub!"); }
public  boolean tryUnlockWrite() { throw new RuntimeException("Stub!"); }
public  boolean tryUnlockRead() { throw new RuntimeException("Stub!"); }
public  boolean isWriteLocked() { throw new RuntimeException("Stub!"); }
public  boolean isReadLocked() { throw new RuntimeException("Stub!"); }
public  int getReadLockCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Lock asReadLock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Lock asWriteLock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.ReadWriteLock asReadWriteLock() { throw new RuntimeException("Stub!"); }
}
