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
public abstract class AbstractMap<K, V>
  implements java.util.Map<K, V>
{
public static class SimpleEntry<K, V>
  implements java.util.Map.Entry<K, V>, java.io.Serializable
{
public  SimpleEntry(K key, V value) { throw new RuntimeException("Stub!"); }
public  SimpleEntry(java.util.Map.Entry<? extends K, ? extends V> entry) { throw new RuntimeException("Stub!"); }
public  K getKey() { throw new RuntimeException("Stub!"); }
public  V getValue() { throw new RuntimeException("Stub!"); }
public  V setValue(V value) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class SimpleImmutableEntry<K, V>
  implements java.util.Map.Entry<K, V>, java.io.Serializable
{
public  SimpleImmutableEntry(K key, V value) { throw new RuntimeException("Stub!"); }
public  SimpleImmutableEntry(java.util.Map.Entry<? extends K, ? extends V> entry) { throw new RuntimeException("Stub!"); }
public  K getKey() { throw new RuntimeException("Stub!"); }
public  V getValue() { throw new RuntimeException("Stub!"); }
public  V setValue(V value) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
protected  AbstractMap() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  void putAll(java.util.Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Set<java.util.Map.Entry<K, V>> entrySet();
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
