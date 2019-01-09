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
public interface IntStream
  extends java.util.stream.BaseStream<java.lang.Integer, java.util.stream.IntStream>
{
public static interface Builder
  extends java.util.function.IntConsumer
{
public abstract  void accept(int t);
default public  java.util.stream.IntStream.Builder add(int t) { throw new RuntimeException("Stub!"); }
public abstract  java.util.stream.IntStream build();
}
public abstract  java.util.stream.IntStream filter(java.util.function.IntPredicate predicate);
public abstract  java.util.stream.IntStream map(java.util.function.IntUnaryOperator mapper);
public abstract <U> java.util.stream.Stream<U> mapToObj(java.util.function.IntFunction<? extends U> mapper);
public abstract  java.util.stream.LongStream mapToLong(java.util.function.IntToLongFunction mapper);
public abstract  java.util.stream.DoubleStream mapToDouble(java.util.function.IntToDoubleFunction mapper);
public abstract  java.util.stream.IntStream flatMap(java.util.function.IntFunction<? extends java.util.stream.IntStream> mapper);
public abstract  java.util.stream.IntStream distinct();
public abstract  java.util.stream.IntStream sorted();
public abstract  java.util.stream.IntStream peek(java.util.function.IntConsumer action);
public abstract  java.util.stream.IntStream limit(long maxSize);
public abstract  java.util.stream.IntStream skip(long n);
public abstract  void forEach(java.util.function.IntConsumer action);
public abstract  void forEachOrdered(java.util.function.IntConsumer action);
public abstract  int[] toArray();
public abstract  int reduce(int identity, java.util.function.IntBinaryOperator op);
public abstract  java.util.OptionalInt reduce(java.util.function.IntBinaryOperator op);
public abstract <R> R collect(java.util.function.Supplier<R> supplier, java.util.function.ObjIntConsumer<R> accumulator, java.util.function.BiConsumer<R, R> combiner);
public abstract  int sum();
public abstract  java.util.OptionalInt min();
public abstract  java.util.OptionalInt max();
public abstract  long count();
public abstract  java.util.OptionalDouble average();
public abstract  java.util.IntSummaryStatistics summaryStatistics();
public abstract  boolean anyMatch(java.util.function.IntPredicate predicate);
public abstract  boolean allMatch(java.util.function.IntPredicate predicate);
public abstract  boolean noneMatch(java.util.function.IntPredicate predicate);
public abstract  java.util.OptionalInt findFirst();
public abstract  java.util.OptionalInt findAny();
public abstract  java.util.stream.LongStream asLongStream();
public abstract  java.util.stream.DoubleStream asDoubleStream();
public abstract  java.util.stream.Stream<java.lang.Integer> boxed();
public abstract  java.util.stream.IntStream sequential();
public abstract  java.util.stream.IntStream parallel();
public abstract  java.util.PrimitiveIterator.OfInt iterator();
public abstract  java.util.Spliterator.OfInt spliterator();
public static  java.util.stream.IntStream.Builder builder() { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream empty() { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream of(int t) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream of(int... values) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream iterate(int seed, java.util.function.IntUnaryOperator f) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream generate(java.util.function.IntSupplier s) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream range(int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream rangeClosed(int startInclusive, int endInclusive) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.IntStream concat(java.util.stream.IntStream a, java.util.stream.IntStream b) { throw new RuntimeException("Stub!"); }
}
