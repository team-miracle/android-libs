/*
* Copyright (C) 2014 The Android Open Source Project
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
public final class Range<T extends java.lang.Comparable<? super T>>
{
public  Range(T lower, T upper) { throw new RuntimeException("Stub!"); }
public static <T extends java.lang.Comparable<? super T>> android.util.Range<T> create(T lower, T upper) { throw new RuntimeException("Stub!"); }
public  T getLower() { throw new RuntimeException("Stub!"); }
public  T getUpper() { throw new RuntimeException("Stub!"); }
public  boolean contains(T value) { throw new RuntimeException("Stub!"); }
public  boolean contains(android.util.Range<T> range) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  T clamp(T value) { throw new RuntimeException("Stub!"); }
public  android.util.Range<T> intersect(android.util.Range<T> range) { throw new RuntimeException("Stub!"); }
public  android.util.Range<T> intersect(T lower, T upper) { throw new RuntimeException("Stub!"); }
public  android.util.Range<T> extend(android.util.Range<T> range) { throw new RuntimeException("Stub!"); }
public  android.util.Range<T> extend(T lower, T upper) { throw new RuntimeException("Stub!"); }
public  android.util.Range<T> extend(T value) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
