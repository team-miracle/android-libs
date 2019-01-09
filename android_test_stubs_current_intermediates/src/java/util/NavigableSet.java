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
* Written by Doug Lea and Josh Bloch with assistance from members of JCP
* JSR-166 Expert Group and released to the public domain, as explained at
* http://creativecommons.org/publicdomain/zero/1.0/
*/

// BEGIN android-note
// removed link to collections framework docs
// END android-note

package java.util;
public interface NavigableSet<E>
  extends java.util.SortedSet<E>
{
public abstract  E lower(E e);
public abstract  E floor(E e);
public abstract  E ceiling(E e);
public abstract  E higher(E e);
public abstract  E pollFirst();
public abstract  E pollLast();
public abstract  java.util.Iterator<E> iterator();
public abstract  java.util.NavigableSet<E> descendingSet();
public abstract  java.util.Iterator<E> descendingIterator();
public abstract  java.util.NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);
public abstract  java.util.NavigableSet<E> headSet(E toElement, boolean inclusive);
public abstract  java.util.NavigableSet<E> tailSet(E fromElement, boolean inclusive);
public abstract  java.util.SortedSet<E> subSet(E fromElement, E toElement);
public abstract  java.util.SortedSet<E> headSet(E toElement);
public abstract  java.util.SortedSet<E> tailSet(E fromElement);
}
