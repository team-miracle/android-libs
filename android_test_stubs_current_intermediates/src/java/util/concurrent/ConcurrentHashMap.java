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
public class ConcurrentHashMap<K, V>
  extends java.util.AbstractMap<K, V>
  implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable
{
 abstract static class CollectionView<K, V, E>
  implements java.util.Collection<E>, java.io.Serializable
{
CollectionView() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentHashMap<K, V> getMap() { throw new RuntimeException("Stub!"); }
public final  void clear() { throw new RuntimeException("Stub!"); }
public final  int size() { throw new RuntimeException("Stub!"); }
public final  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Iterator<E> iterator();
public abstract  boolean contains(java.lang.Object o);
public abstract  boolean remove(java.lang.Object o);
public final  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public final <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  boolean containsAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public final  boolean removeAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public final  boolean retainAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
}
public static class KeySetView<K, V>
  extends java.util.concurrent.ConcurrentHashMap.CollectionView<K, V, K>
  implements java.util.Set<K>, java.io.Serializable
{
KeySetView() { throw new RuntimeException("Stub!"); }
public  V getMappedValue() { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<K> iterator() { throw new RuntimeException("Stub!"); }
public  boolean add(K e) { throw new RuntimeException("Stub!"); }
public  boolean addAll(java.util.Collection<? extends K> c) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.util.Spliterator<K> spliterator() { throw new RuntimeException("Stub!"); }
public  void forEach(java.util.function.Consumer<? super K> action) { throw new RuntimeException("Stub!"); }
}
public  ConcurrentHashMap() { throw new RuntimeException("Stub!"); }
public  ConcurrentHashMap(int initialCapacity) { throw new RuntimeException("Stub!"); }
public  ConcurrentHashMap(java.util.Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  ConcurrentHashMap(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); }
public  ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  void putAll(java.util.Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object key, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
public  V replace(K key, V value) { throw new RuntimeException("Stub!"); }
public  V getOrDefault(java.lang.Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
public  void forEach(java.util.function.BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
public  void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
public  V computeIfAbsent(K key, java.util.function.Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
public  V computeIfPresent(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
public  V compute(K key, java.util.function.BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
public  V merge(K key, V value, java.util.function.BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<K> keys() { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<V> elements() { throw new RuntimeException("Stub!"); }
public  long mappingCount() { throw new RuntimeException("Stub!"); }
public static <K> java.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean> newKeySet() { throw new RuntimeException("Stub!"); }
public static <K> java.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean> newKeySet(int initialCapacity) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentHashMap.KeySetView<K, V> keySet(V mappedValue) { throw new RuntimeException("Stub!"); }
public  void forEach(long parallelismThreshold, java.util.function.BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
public <U> void forEach(long parallelismThreshold, java.util.function.BiFunction<? super K, ? super V, ? extends U> transformer, java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
public <U> U search(long parallelismThreshold, java.util.function.BiFunction<? super K, ? super V, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
public <U> U reduce(long parallelismThreshold, java.util.function.BiFunction<? super K, ? super V, ? extends U> transformer, java.util.function.BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
public  double reduceToDouble(long parallelismThreshold, java.util.function.ToDoubleBiFunction<? super K, ? super V> transformer, double basis, java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  long reduceToLong(long parallelismThreshold, java.util.function.ToLongBiFunction<? super K, ? super V> transformer, long basis, java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  int reduceToInt(long parallelismThreshold, java.util.function.ToIntBiFunction<? super K, ? super V> transformer, int basis, java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  void forEachKey(long parallelismThreshold, java.util.function.Consumer<? super K> action) { throw new RuntimeException("Stub!"); }
public <U> void forEachKey(long parallelismThreshold, java.util.function.Function<? super K, ? extends U> transformer, java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
public <U> U searchKeys(long parallelismThreshold, java.util.function.Function<? super K, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
public  K reduceKeys(long parallelismThreshold, java.util.function.BiFunction<? super K, ? super K, ? extends K> reducer) { throw new RuntimeException("Stub!"); }
public <U> U reduceKeys(long parallelismThreshold, java.util.function.Function<? super K, ? extends U> transformer, java.util.function.BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
public  double reduceKeysToDouble(long parallelismThreshold, java.util.function.ToDoubleFunction<? super K> transformer, double basis, java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  long reduceKeysToLong(long parallelismThreshold, java.util.function.ToLongFunction<? super K> transformer, long basis, java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  int reduceKeysToInt(long parallelismThreshold, java.util.function.ToIntFunction<? super K> transformer, int basis, java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  void forEachValue(long parallelismThreshold, java.util.function.Consumer<? super V> action) { throw new RuntimeException("Stub!"); }
public <U> void forEachValue(long parallelismThreshold, java.util.function.Function<? super V, ? extends U> transformer, java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
public <U> U searchValues(long parallelismThreshold, java.util.function.Function<? super V, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
public  V reduceValues(long parallelismThreshold, java.util.function.BiFunction<? super V, ? super V, ? extends V> reducer) { throw new RuntimeException("Stub!"); }
public <U> U reduceValues(long parallelismThreshold, java.util.function.Function<? super V, ? extends U> transformer, java.util.function.BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
public  double reduceValuesToDouble(long parallelismThreshold, java.util.function.ToDoubleFunction<? super V> transformer, double basis, java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  long reduceValuesToLong(long parallelismThreshold, java.util.function.ToLongFunction<? super V> transformer, long basis, java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  int reduceValuesToInt(long parallelismThreshold, java.util.function.ToIntFunction<? super V> transformer, int basis, java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  void forEachEntry(long parallelismThreshold, java.util.function.Consumer<? super java.util.Map.Entry<K, V>> action) { throw new RuntimeException("Stub!"); }
public <U> void forEachEntry(long parallelismThreshold, java.util.function.Function<java.util.Map.Entry<K, V>, ? extends U> transformer, java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
public <U> U searchEntries(long parallelismThreshold, java.util.function.Function<java.util.Map.Entry<K, V>, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> reduceEntries(long parallelismThreshold, java.util.function.BiFunction<java.util.Map.Entry<K, V>, java.util.Map.Entry<K, V>, ? extends java.util.Map.Entry<K, V>> reducer) { throw new RuntimeException("Stub!"); }
public <U> U reduceEntries(long parallelismThreshold, java.util.function.Function<java.util.Map.Entry<K, V>, ? extends U> transformer, java.util.function.BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
public  double reduceEntriesToDouble(long parallelismThreshold, java.util.function.ToDoubleFunction<java.util.Map.Entry<K, V>> transformer, double basis, java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  long reduceEntriesToLong(long parallelismThreshold, java.util.function.ToLongFunction<java.util.Map.Entry<K, V>> transformer, long basis, java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
public  int reduceEntriesToInt(long parallelismThreshold, java.util.function.ToIntFunction<java.util.Map.Entry<K, V>> transformer, int basis, java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
}
