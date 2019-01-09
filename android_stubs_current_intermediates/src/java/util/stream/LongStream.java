/*
* Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
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
public interface LongStream
  extends java.util.stream.BaseStream<java.lang.Long, java.util.stream.LongStream>
{
public static interface Builder
  extends java.util.function.LongConsumer
{
public abstract  void accept(long t);
default public  java.util.stream.LongStream.Builder add(long t) { throw new RuntimeException("Stub!"); }
public abstract  java.util.stream.LongStream build();
}
public abstract  java.util.stream.LongStream filter(java.util.function.LongPredicate predicate);
public abstract  java.util.stream.LongStream map(java.util.function.LongUnaryOperator mapper);
public abstract <U> java.util.stream.Stream<U> mapToObj(java.util.function.LongFunction<? extends U> mapper);
public abstract  java.util.stream.IntStream mapToInt(java.util.function.LongToIntFunction mapper);
public abstract  java.util.stream.DoubleStream mapToDouble(java.util.function.LongToDoubleFunction mapper);
public abstract  java.util.stream.LongStream flatMap(java.util.function.LongFunction<? extends java.util.stream.LongStream> mapper);
public abstract  java.util.stream.LongStream distinct();
public abstract  java.util.stream.LongStream sorted();
public abstract  java.util.stream.LongStream peek(java.util.function.LongConsumer action);
public abstract  java.util.stream.LongStream limit(long maxSize);
public abstract  java.util.stream.LongStream skip(long n);
public abstract  void forEach(java.util.function.LongConsumer action);
public abstract  void forEachOrdered(java.util.function.LongConsumer action);
public abstract  long[] toArray();
public abstract  long reduce(long identity, java.util.function.LongBinaryOperator op);
public abstract  java.util.OptionalLong reduce(java.util.function.LongBinaryOperator op);
public abstract <R> R collect(java.util.function.Supplier<R> supplier, java.util.function.ObjLongConsumer<R> accumulator, java.util.function.BiConsumer<R, R> combiner);
public abstract  long sum();
public abstract  java.util.OptionalLong min();
public abstract  java.util.OptionalLong max();
public abstract  long count();
public abstract  java.util.OptionalDouble average();
public abstract  java.util.LongSummaryStatistics summaryStatistics();
public abstract  boolean anyMatch(java.util.function.LongPredicate predicate);
public abstract  boolean allMatch(java.util.function.LongPredicate predicate);
public abstract  boolean noneMatch(java.util.function.LongPredicate predicate);
public abstract  java.util.OptionalLong findFirst();
public abstract  java.util.OptionalLong findAny();
public abstract  java.util.stream.DoubleStream asDoubleStream();
public abstract  java.util.stream.Stream<java.lang.Long> boxed();
public abstract  java.util.stream.LongStream sequential();
public abstract  java.util.stream.LongStream parallel();
public abstract  java.util.PrimitiveIterator.OfLong iterator();
public abstract  java.util.Spliterator.OfLong spliterator();
public static  java.util.stream.LongStream.Builder builder() { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream empty() { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream of(long t) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream of(long... values) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream iterate(long seed, java.util.function.LongUnaryOperator f) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream generate(java.util.function.LongSupplier s) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream range(long startInclusive, long endExclusive) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream rangeClosed(long startInclusive, long endInclusive) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.LongStream concat(java.util.stream.LongStream a, java.util.stream.LongStream b) { throw new RuntimeException("Stub!"); }
}
