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

package java.util;
public interface NavigableMap<K, V>
  extends java.util.SortedMap<K, V>
{
public abstract  java.util.Map.Entry<K, V> lowerEntry(K key);
public abstract  K lowerKey(K key);
public abstract  java.util.Map.Entry<K, V> floorEntry(K key);
public abstract  K floorKey(K key);
public abstract  java.util.Map.Entry<K, V> ceilingEntry(K key);
public abstract  K ceilingKey(K key);
public abstract  java.util.Map.Entry<K, V> higherEntry(K key);
public abstract  K higherKey(K key);
public abstract  java.util.Map.Entry<K, V> firstEntry();
public abstract  java.util.Map.Entry<K, V> lastEntry();
public abstract  java.util.Map.Entry<K, V> pollFirstEntry();
public abstract  java.util.Map.Entry<K, V> pollLastEntry();
public abstract  java.util.NavigableMap<K, V> descendingMap();
public abstract  java.util.NavigableSet<K> navigableKeySet();
public abstract  java.util.NavigableSet<K> descendingKeySet();
public abstract  java.util.NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive);
public abstract  java.util.NavigableMap<K, V> headMap(K toKey, boolean inclusive);
public abstract  java.util.NavigableMap<K, V> tailMap(K fromKey, boolean inclusive);
public abstract  java.util.SortedMap<K, V> subMap(K fromKey, K toKey);
public abstract  java.util.SortedMap<K, V> headMap(K toKey);
public abstract  java.util.SortedMap<K, V> tailMap(K fromKey);
}
