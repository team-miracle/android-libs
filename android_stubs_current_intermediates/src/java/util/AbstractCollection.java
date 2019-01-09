/*
* Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.util;
public abstract class AbstractCollection<E>
  implements java.util.Collection<E>
{
protected  AbstractCollection() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Iterator<E> iterator();
public abstract  int size();
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
public  boolean add(E e) { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean containsAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public  boolean addAll(java.util.Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
public  boolean removeAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public  boolean retainAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
