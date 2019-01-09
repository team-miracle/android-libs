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
public interface BlockingDeque<E>
  extends java.util.concurrent.BlockingQueue<E>, java.util.Deque<E>
{
public abstract  void addFirst(E e);
public abstract  void addLast(E e);
public abstract  boolean offerFirst(E e);
public abstract  boolean offerLast(E e);
public abstract  void putFirst(E e) throws java.lang.InterruptedException;
public abstract  void putLast(E e) throws java.lang.InterruptedException;
public abstract  boolean offerFirst(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean offerLast(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E takeFirst() throws java.lang.InterruptedException;
public abstract  E takeLast() throws java.lang.InterruptedException;
public abstract  E pollFirst(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E pollLast(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean removeFirstOccurrence(java.lang.Object o);
public abstract  boolean removeLastOccurrence(java.lang.Object o);
public abstract  boolean add(E e);
public abstract  boolean offer(E e);
public abstract  void put(E e) throws java.lang.InterruptedException;
public abstract  boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E remove();
public abstract  E poll();
public abstract  E take() throws java.lang.InterruptedException;
public abstract  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E element();
public abstract  E peek();
public abstract  boolean remove(java.lang.Object o);
public abstract  boolean contains(java.lang.Object o);
public abstract  int size();
public abstract  java.util.Iterator<E> iterator();
public abstract  void push(E e);
}
