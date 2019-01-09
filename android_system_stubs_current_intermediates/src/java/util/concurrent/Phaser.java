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
public class Phaser
{
public  Phaser() { throw new RuntimeException("Stub!"); }
public  Phaser(int parties) { throw new RuntimeException("Stub!"); }
public  Phaser(java.util.concurrent.Phaser parent) { throw new RuntimeException("Stub!"); }
public  Phaser(java.util.concurrent.Phaser parent, int parties) { throw new RuntimeException("Stub!"); }
public  int register() { throw new RuntimeException("Stub!"); }
public  int bulkRegister(int parties) { throw new RuntimeException("Stub!"); }
public  int arrive() { throw new RuntimeException("Stub!"); }
public  int arriveAndDeregister() { throw new RuntimeException("Stub!"); }
public  int arriveAndAwaitAdvance() { throw new RuntimeException("Stub!"); }
public  int awaitAdvance(int phase) { throw new RuntimeException("Stub!"); }
public  int awaitAdvanceInterruptibly(int phase) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  int awaitAdvanceInterruptibly(int phase, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public  void forceTermination() { throw new RuntimeException("Stub!"); }
public final  int getPhase() { throw new RuntimeException("Stub!"); }
public  int getRegisteredParties() { throw new RuntimeException("Stub!"); }
public  int getArrivedParties() { throw new RuntimeException("Stub!"); }
public  int getUnarrivedParties() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Phaser getParent() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Phaser getRoot() { throw new RuntimeException("Stub!"); }
public  boolean isTerminated() { throw new RuntimeException("Stub!"); }
protected  boolean onAdvance(int phase, int registeredParties) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
