/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2003, 2012, Oracle and/or its affiliates. All rights reserved.
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
public class EnumMap<K extends java.lang.Enum<K>, V>
  extends java.util.AbstractMap<K, V>
  implements java.io.Serializable, java.lang.Cloneable
{
public  EnumMap(java.lang.Class<K> keyType) { throw new RuntimeException("Stub!"); }
public  EnumMap(java.util.EnumMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  EnumMap(java.util.Map<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  void putAll(java.util.Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.util.EnumMap<K, V> clone() { throw new RuntimeException("Stub!"); }
}
