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
public interface ConcurrentMap<K, V>
  extends java.util.Map<K, V>
{
default public  V getOrDefault(java.lang.Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
default public  void forEach(java.util.function.BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
public abstract  V putIfAbsent(K key, V value);
public abstract  boolean remove(java.lang.Object key, java.lang.Object value);
public abstract  boolean replace(K key, V oldValue, V newValue);
public abstract  V replace(K key, V value);
default public  void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
default public  V computeIfAbsent(K key, java.util.function.Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
default public  V computeIfPresent(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
default public  V compute(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
default public  V merge(K key, V value, java.util.function.BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
}
