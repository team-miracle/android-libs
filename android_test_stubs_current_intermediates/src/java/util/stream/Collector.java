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
package java.util.stream;
public interface Collector<T, A, R>
{
public static enum Characteristics
{
CONCURRENT(),
IDENTITY_FINISH(),
UNORDERED();
}
public abstract  java.util.function.Supplier<A> supplier();
public abstract  java.util.function.BiConsumer<A, T> accumulator();
public abstract  java.util.function.BinaryOperator<A> combiner();
public abstract  java.util.function.Function<A, R> finisher();
public abstract  java.util.Set<java.util.stream.Collector.Characteristics> characteristics();
public static <T, R> java.util.stream.Collector<T, R, R> of(java.util.function.Supplier<R> supplier, java.util.function.BiConsumer<R, T> accumulator, java.util.function.BinaryOperator<R> combiner, java.util.stream.Collector.Characteristics... characteristics) { throw new RuntimeException("Stub!"); }
public static <T, A, R> java.util.stream.Collector<T, A, R> of(java.util.function.Supplier<A> supplier, java.util.function.BiConsumer<A, T> accumulator, java.util.function.BinaryOperator<A> combiner, java.util.function.Function<A, R> finisher, java.util.stream.Collector.Characteristics... characteristics) { throw new RuntimeException("Stub!"); }
}
