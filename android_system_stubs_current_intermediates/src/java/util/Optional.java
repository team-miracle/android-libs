/*
* Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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
public final class Optional<T>
{
Optional() { throw new RuntimeException("Stub!"); }
public static <T> java.util.Optional<T> empty() { throw new RuntimeException("Stub!"); }
public static <T> java.util.Optional<T> of(T value) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Optional<T> ofNullable(T value) { throw new RuntimeException("Stub!"); }
public  T get() { throw new RuntimeException("Stub!"); }
public  boolean isPresent() { throw new RuntimeException("Stub!"); }
public  void ifPresent(java.util.function.Consumer<? super T> consumer) { throw new RuntimeException("Stub!"); }
public  java.util.Optional<T> filter(java.util.function.Predicate<? super T> predicate) { throw new RuntimeException("Stub!"); }
public <U> java.util.Optional<U> map(java.util.function.Function<? super T, ? extends U> mapper) { throw new RuntimeException("Stub!"); }
public <U> java.util.Optional<U> flatMap(java.util.function.Function<? super T, java.util.Optional<U>> mapper) { throw new RuntimeException("Stub!"); }
public  T orElse(T other) { throw new RuntimeException("Stub!"); }
public  T orElseGet(java.util.function.Supplier<? extends T> other) { throw new RuntimeException("Stub!"); }
public <X extends java.lang.Throwable> T orElseThrow(java.util.function.Supplier<? extends X> exceptionSupplier) throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
