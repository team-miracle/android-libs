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

package java.util.concurrent.atomic;
public class AtomicMarkableReference<V>
{
public  AtomicMarkableReference(V initialRef, boolean initialMark) { throw new RuntimeException("Stub!"); }
public  V getReference() { throw new RuntimeException("Stub!"); }
public  boolean isMarked() { throw new RuntimeException("Stub!"); }
public  V get(boolean[] markHolder) { throw new RuntimeException("Stub!"); }
public  boolean weakCompareAndSet(V expectedReference, V newReference, boolean expectedMark, boolean newMark) { throw new RuntimeException("Stub!"); }
public  boolean compareAndSet(V expectedReference, V newReference, boolean expectedMark, boolean newMark) { throw new RuntimeException("Stub!"); }
public  void set(V newReference, boolean newMark) { throw new RuntimeException("Stub!"); }
public  boolean attemptMark(V expectedReference, boolean newMark) { throw new RuntimeException("Stub!"); }
}
