/*
* Copyright (c) 1997, 2014, Oracle and/or its affiliates. All rights reserved.
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
@java.lang.FunctionalInterface()
public interface Comparator<T>
{
public abstract  int compare(T o1, T o2);
public abstract  boolean equals(java.lang.Object obj);
default public  java.util.Comparator<T> reversed() { throw new RuntimeException("Stub!"); }
default public  java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> other) { throw new RuntimeException("Stub!"); }
default public <U> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator) { throw new RuntimeException("Stub!"); }
default public <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> keyExtractor) { throw new RuntimeException("Stub!"); }
default public  java.util.Comparator<T> thenComparingInt(java.util.function.ToIntFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
default public  java.util.Comparator<T> thenComparingLong(java.util.function.ToLongFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
default public  java.util.Comparator<T> thenComparingDouble(java.util.function.ToDoubleFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder() { throw new RuntimeException("Stub!"); }
public static <T> java.util.Comparator<T> nullsFirst(java.util.Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
public static <T, U> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator) { throw new RuntimeException("Stub!"); }
public static <T, U extends java.lang.Comparable<? super U>> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U> keyExtractor) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Comparator<T> comparingInt(java.util.function.ToIntFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Comparator<T> comparingLong(java.util.function.ToLongFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Comparator<T> comparingDouble(java.util.function.ToDoubleFunction<? super T> keyExtractor) { throw new RuntimeException("Stub!"); }
}
