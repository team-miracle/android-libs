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
public abstract class Property<T, V>
{
public  Property(java.lang.Class<V> type, java.lang.String name) { throw new RuntimeException("Stub!"); }
public static <T, V> android.util.Property<T, V> of(java.lang.Class<T> hostType, java.lang.Class<V> valueType, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public  void set(T object, V value) { throw new RuntimeException("Stub!"); }
public abstract  V get(T object);
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.Class<V> getType() { throw new RuntimeException("Stub!"); }
}
