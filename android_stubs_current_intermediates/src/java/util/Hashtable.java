/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
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
public class Hashtable<K, V>
  extends java.util.Dictionary<K, V>
  implements java.util.Map<K, V>, java.lang.Cloneable, java.io.Serializable
{
public  Hashtable(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); }
public  Hashtable(int initialCapacity) { throw new RuntimeException("Stub!"); }
public  Hashtable() { throw new RuntimeException("Stub!"); }
public  Hashtable(java.util.Map<? extends K, ? extends V> t) { throw new RuntimeException("Stub!"); }
public synchronized  int size() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Enumeration<K> keys() { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Enumeration<V> elements() { throw new RuntimeException("Stub!"); }
public synchronized  boolean contains(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public synchronized  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public synchronized  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
protected  void rehash() { throw new RuntimeException("Stub!"); }
public synchronized  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public synchronized  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public synchronized  void putAll(java.util.Map<? extends K, ? extends V> t) { throw new RuntimeException("Stub!"); }
public synchronized  void clear() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }
public synchronized  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public synchronized  int hashCode() { throw new RuntimeException("Stub!"); }
public synchronized  V getOrDefault(java.lang.Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public synchronized  void forEach(java.util.function.BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public synchronized  void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
public synchronized  V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
public synchronized  boolean remove(java.lang.Object key, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public synchronized  boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
public synchronized  V replace(K key, V value) { throw new RuntimeException("Stub!"); }
public synchronized  V computeIfAbsent(K key, java.util.function.Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
public synchronized  V computeIfPresent(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
public synchronized  V compute(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
public synchronized  V merge(K key, V value, java.util.function.BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
}
