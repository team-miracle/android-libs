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
public interface DoubleStream
  extends java.util.stream.BaseStream<java.lang.Double, java.util.stream.DoubleStream>
{
public static interface Builder
  extends java.util.function.DoubleConsumer
{
public abstract  void accept(double t);
default public  java.util.stream.DoubleStream.Builder add(double t) { throw new RuntimeException("Stub!"); }
public abstract  java.util.stream.DoubleStream build();
}
public abstract  java.util.stream.DoubleStream filter(java.util.function.DoublePredicate predicate);
public abstract  java.util.stream.DoubleStream map(java.util.function.DoubleUnaryOperator mapper);
public abstract <U> java.util.stream.Stream<U> mapToObj(java.util.function.DoubleFunction<? extends U> mapper);
public abstract  java.util.stream.IntStream mapToInt(java.util.function.DoubleToIntFunction mapper);
public abstract  java.util.stream.LongStream mapToLong(java.util.function.DoubleToLongFunction mapper);
public abstract  java.util.stream.DoubleStream flatMap(java.util.function.DoubleFunction<? extends java.util.stream.DoubleStream> mapper);
public abstract  java.util.stream.DoubleStream distinct();
public abstract  java.util.stream.DoubleStream sorted();
public abstract  java.util.stream.DoubleStream peek(java.util.function.DoubleConsumer action);
public abstract  java.util.stream.DoubleStream limit(long maxSize);
public abstract  java.util.stream.DoubleStream skip(long n);
public abstract  void forEach(java.util.function.DoubleConsumer action);
public abstract  void forEachOrdered(java.util.function.DoubleConsumer action);
public abstract  double[] toArray();
public abstract  double reduce(double identity, java.util.function.DoubleBinaryOperator op);
public abstract  java.util.OptionalDouble reduce(java.util.function.DoubleBinaryOperator op);
public abstract <R> R collect(java.util.function.Supplier<R> supplier, java.util.function.ObjDoubleConsumer<R> accumulator, java.util.function.BiConsumer<R, R> combiner);
public abstract  double sum();
public abstract  java.util.OptionalDouble min();
public abstract  java.util.OptionalDouble max();
public abstract  long count();
public abstract  java.util.OptionalDouble average();
public abstract  java.util.DoubleSummaryStatistics summaryStatistics();
public abstract  boolean anyMatch(java.util.function.DoublePredicate predicate);
public abstract  boolean allMatch(java.util.function.DoublePredicate predicate);
public abstract  boolean noneMatch(java.util.function.DoublePredicate predicate);
public abstract  java.util.OptionalDouble findFirst();
public abstract  java.util.OptionalDouble findAny();
public abstract  java.util.stream.Stream<java.lang.Double> boxed();
public abstract  java.util.stream.DoubleStream sequential();
public abstract  java.util.stream.DoubleStream parallel();
public abstract  java.util.PrimitiveIterator.OfDouble iterator();
public abstract  java.util.Spliterator.OfDouble spliterator();
public static  java.util.stream.DoubleStream.Builder builder() { throw new RuntimeException("Stub!"); }
public static  java.util.stream.DoubleStream empty() { throw new RuntimeException("Stub!"); }
public static  java.util.stream.DoubleStream of(double t) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.DoubleStream of(double... values) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.DoubleStream iterate(double seed, java.util.function.DoubleUnaryOperator f) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.DoubleStream generate(java.util.function.DoubleSupplier s) { throw new RuntimeException("Stub!"); }
public static  java.util.stream.DoubleStream concat(java.util.stream.DoubleStream a, java.util.stream.DoubleStream b) { throw new RuntimeException("Stub!"); }
}
