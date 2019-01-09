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
package java.util;
public final class Spliterators
{
public abstract static class AbstractSpliterator<T>
  implements java.util.Spliterator<T>
{
protected  AbstractSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public  java.util.Spliterator<T> trySplit() { throw new RuntimeException("Stub!"); }
public  long estimateSize() { throw new RuntimeException("Stub!"); }
public  int characteristics() { throw new RuntimeException("Stub!"); }
}
public abstract static class AbstractIntSpliterator
  implements java.util.Spliterator.OfInt
{
protected  AbstractIntSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public  java.util.Spliterator.OfInt trySplit() { throw new RuntimeException("Stub!"); }
public  long estimateSize() { throw new RuntimeException("Stub!"); }
public  int characteristics() { throw new RuntimeException("Stub!"); }
}
public abstract static class AbstractLongSpliterator
  implements java.util.Spliterator.OfLong
{
protected  AbstractLongSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public  java.util.Spliterator.OfLong trySplit() { throw new RuntimeException("Stub!"); }
public  long estimateSize() { throw new RuntimeException("Stub!"); }
public  int characteristics() { throw new RuntimeException("Stub!"); }
}
public abstract static class AbstractDoubleSpliterator
  implements java.util.Spliterator.OfDouble
{
protected  AbstractDoubleSpliterator(long est, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public  java.util.Spliterator.OfDouble trySplit() { throw new RuntimeException("Stub!"); }
public  long estimateSize() { throw new RuntimeException("Stub!"); }
public  int characteristics() { throw new RuntimeException("Stub!"); }
}
Spliterators() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public static <T> java.util.Spliterator<T> emptySpliterator() { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfInt emptyIntSpliterator() { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfLong emptyLongSpliterator() { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfDouble emptyDoubleSpliterator() { throw new RuntimeException("Stub!"); }
public static <T> java.util.Spliterator<T> spliterator(java.lang.Object[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Spliterator<T> spliterator(java.lang.Object[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfInt spliterator(int[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfInt spliterator(int[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfLong spliterator(long[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfLong spliterator(long[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfDouble spliterator(double[] array, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfDouble spliterator(double[] array, int fromIndex, int toIndex, int additionalCharacteristics) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Spliterator<T> spliterator(java.util.Collection<? extends T> c, int characteristics) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Spliterator<T> spliterator(java.util.Iterator<? extends T> iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Spliterator<T> spliteratorUnknownSize(java.util.Iterator<? extends T> iterator, int characteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfInt spliterator(java.util.PrimitiveIterator.OfInt iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfInt spliteratorUnknownSize(java.util.PrimitiveIterator.OfInt iterator, int characteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfLong spliterator(java.util.PrimitiveIterator.OfLong iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfLong spliteratorUnknownSize(java.util.PrimitiveIterator.OfLong iterator, int characteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfDouble spliterator(java.util.PrimitiveIterator.OfDouble iterator, long size, int characteristics) { throw new RuntimeException("Stub!"); }
public static  java.util.Spliterator.OfDouble spliteratorUnknownSize(java.util.PrimitiveIterator.OfDouble iterator, int characteristics) { throw new RuntimeException("Stub!"); }
public static <T> java.util.Iterator<T> iterator(java.util.Spliterator<? extends T> spliterator) { throw new RuntimeException("Stub!"); }
public static  java.util.PrimitiveIterator.OfInt iterator(java.util.Spliterator.OfInt spliterator) { throw new RuntimeException("Stub!"); }
public static  java.util.PrimitiveIterator.OfLong iterator(java.util.Spliterator.OfLong spliterator) { throw new RuntimeException("Stub!"); }
public static  java.util.PrimitiveIterator.OfDouble iterator(java.util.Spliterator.OfDouble spliterator) { throw new RuntimeException("Stub!"); }
}
