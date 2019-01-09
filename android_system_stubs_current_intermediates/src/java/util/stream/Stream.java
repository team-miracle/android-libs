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
public interface Stream<T>
  extends java.util.stream.BaseStream<T, java.util.stream.Stream<T>>
{
public static interface Builder<T>
  extends java.util.function.Consumer<T>
{
public abstract  void accept(T t);
default public  java.util.stream.Stream.Builder<T> add(T t) { throw new RuntimeException("Stub!"); }
public abstract  java.util.stream.Stream<T> build();
}
public abstract  java.util.stream.Stream<T> filter(java.util.function.Predicate<? super T> predicate);
public abstract <R> java.util.stream.Stream<R> map(java.util.function.Function<? super T, ? extends R> mapper);
public abstract  java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction<? super T> mapper);
public abstract  java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction<? super T> mapper);
public abstract  java.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction<? super T> mapper);
public abstract <R> java.util.stream.Stream<R> flatMap(java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends R>> mapper);
public abstract  java.util.stream.IntStream flatMapToInt(java.util.function.Function<? super T, ? extends java.util.stream.IntStream> mapper);
public abstract  java.util.stream.LongStream flatMapToLong(java.util.function.Function<? super T, ? extends java.util.stream.LongStream> mapper);
public abstract  java.util.stream.DoubleStream flatMapToDouble(java.util.function.Function<? super T, ? extends java.util.stream.DoubleStream> mapper);
public abstract  java.util.stream.Stream<T> distinct();
public abstract  java.util.stream.Stream<T> sorted();
public abstract  java.util.stream.Stream<T> sorted(java.util.Comparator<? super T> comparator);
public abstract  java.util.stream.Stream<T> peek(java.util.function.Consumer<? super T> action);
public abstract  java.util.stream.Stream<T> limit(long maxSize);
public abstract  java.util.stream.Stream<T> skip(long n);
public abstract  void forEach(java.util.function.Consumer<? super T> action);
public abstract  void forEachOrdered(java.util.function.Consumer<? super T> action);
public abstract  java.lang.Object[] toArray();
public abstract <A> A[] toArray(java.util.function.IntFunction<A[]> generator);
public abstract  T reduce(T identity, java.util.function.BinaryOperator<T> accumulator);
public abstract  java.util.Optional<T> reduce(java.util.function.BinaryOperator<T> accumulator);
public abstract <U> U reduce(U identity, java.util.function.BiFunction<U, ? super T, U> accumulator, java.util.function.BinaryOperator<U> combiner);
public abstract <R> R collect(java.util.function.Supplier<R> supplier, java.util.function.BiConsumer<R, ? super T> accumulator, java.util.function.BiConsumer<R, R> combiner);
public abstract <R, A> R collect(java.util.stream.Collector<? super T, A, R> collector);
public abstract  java.util.Optional<T> min(java.util.Comparator<? super T> comparator);
public abstract  java.util.Optional<T> max(java.util.Comparator<? super T> comparator);
public abstract  long count();
public abstract  boolean anyMatch(java.util.function.Predicate<? super T> predicate);
public abstract  boolean allMatch(java.util.function.Predicate<? super T> predicate);
public abstract  boolean noneMatch(java.util.function.Predicate<? super T> predicate);
public abstract  java.util.Optional<T> findFirst();
public abstract  java.util.Optional<T> findAny();
public static <T> java.util.stream.Stream.Builder<T> builder() { throw new RuntimeException("Stub!"); }
public static <T> java.util.stream.Stream<T> empty() { throw new RuntimeException("Stub!"); }
public static <T> java.util.stream.Stream<T> of(T t) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
@java.lang.SuppressWarnings(value={"varargs"})
public static <T> java.util.stream.Stream<T> of(T... values) { throw new RuntimeException("Stub!"); }
public static <T> java.util.stream.Stream<T> iterate(T seed, java.util.function.UnaryOperator<T> f) { throw new RuntimeException("Stub!"); }
public static <T> java.util.stream.Stream<T> generate(java.util.function.Supplier<T> s) { throw new RuntimeException("Stub!"); }
public static <T> java.util.stream.Stream<T> concat(java.util.stream.Stream<? extends T> a, java.util.stream.Stream<? extends T> b) { throw new RuntimeException("Stub!"); }
}
