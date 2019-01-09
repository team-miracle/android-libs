/*
* Copyright (c) 1997, 2014, Oracle and/or its affiliates. All rights reserved.
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
public interface List<E>
  extends java.util.Collection<E>
{
public abstract  int size();
public abstract  boolean isEmpty();
public abstract  boolean contains(java.lang.Object o);
public abstract  java.util.Iterator<E> iterator();
public abstract  java.lang.Object[] toArray();
public abstract <T> T[] toArray(T[] a);
public abstract  boolean add(E e);
public abstract  boolean remove(java.lang.Object o);
public abstract  boolean containsAll(java.util.Collection<?> c);
public abstract  boolean addAll(java.util.Collection<? extends E> c);
public abstract  boolean addAll(int index, java.util.Collection<? extends E> c);
public abstract  boolean removeAll(java.util.Collection<?> c);
public abstract  boolean retainAll(java.util.Collection<?> c);
default public  void replaceAll(java.util.function.UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked","rawtypes"})
default public  void sort(java.util.Comparator<? super E> c) { throw new RuntimeException("Stub!"); }
public abstract  void clear();
public abstract  boolean equals(java.lang.Object o);
public abstract  int hashCode();
public abstract  E get(int index);
public abstract  E set(int index, E element);
public abstract  void add(int index, E element);
public abstract  E remove(int index);
public abstract  int indexOf(java.lang.Object o);
public abstract  int lastIndexOf(java.lang.Object o);
public abstract  java.util.ListIterator<E> listIterator();
public abstract  java.util.ListIterator<E> listIterator(int index);
public abstract  java.util.List<E> subList(int fromIndex, int toIndex);
default public  java.util.Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
}
