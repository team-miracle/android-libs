/*
* Copyright (C) 2011 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.util;
public class LruCache<K, V>
{
public  LruCache(int maxSize) { throw new RuntimeException("Stub!"); }
public  void resize(int maxSize) { throw new RuntimeException("Stub!"); }
public final  V get(K key) { throw new RuntimeException("Stub!"); }
public final  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  void trimToSize(int maxSize) { throw new RuntimeException("Stub!"); }
public final  V remove(K key) { throw new RuntimeException("Stub!"); }
protected  void entryRemoved(boolean evicted, K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
protected  V create(K key) { throw new RuntimeException("Stub!"); }
protected  int sizeOf(K key, V value) { throw new RuntimeException("Stub!"); }
public final  void evictAll() { throw new RuntimeException("Stub!"); }
public final synchronized  int size() { throw new RuntimeException("Stub!"); }
public final synchronized  int maxSize() { throw new RuntimeException("Stub!"); }
public final synchronized  int hitCount() { throw new RuntimeException("Stub!"); }
public final synchronized  int missCount() { throw new RuntimeException("Stub!"); }
public final synchronized  int createCount() { throw new RuntimeException("Stub!"); }
public final synchronized  int putCount() { throw new RuntimeException("Stub!"); }
public final synchronized  int evictionCount() { throw new RuntimeException("Stub!"); }
public final synchronized  java.util.Map<K, V> snapshot() { throw new RuntimeException("Stub!"); }
public final synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
