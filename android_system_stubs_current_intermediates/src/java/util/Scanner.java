/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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
public final class Scanner
  implements java.util.Iterator<java.lang.String>, java.io.Closeable
{
public  Scanner(java.lang.Readable source) { throw new RuntimeException("Stub!"); }
public  Scanner(java.io.InputStream source) { throw new RuntimeException("Stub!"); }
public  Scanner(java.io.InputStream source, java.lang.String charsetName) { throw new RuntimeException("Stub!"); }
public  Scanner(java.io.File source) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  Scanner(java.io.File source, java.lang.String charsetName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  Scanner(java.nio.file.Path source) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  Scanner(java.nio.file.Path source, java.lang.String charsetName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  Scanner(java.lang.String source) { throw new RuntimeException("Stub!"); }
public  Scanner(java.nio.channels.ReadableByteChannel source) { throw new RuntimeException("Stub!"); }
public  Scanner(java.nio.channels.ReadableByteChannel source, java.lang.String charsetName) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.io.IOException ioException() { throw new RuntimeException("Stub!"); }
public  java.util.regex.Pattern delimiter() { throw new RuntimeException("Stub!"); }
public  java.util.Scanner useDelimiter(java.util.regex.Pattern pattern) { throw new RuntimeException("Stub!"); }
public  java.util.Scanner useDelimiter(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.util.Locale locale() { throw new RuntimeException("Stub!"); }
public  java.util.Scanner useLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  int radix() { throw new RuntimeException("Stub!"); }
public  java.util.Scanner useRadix(int radix) { throw new RuntimeException("Stub!"); }
public  java.util.regex.MatchResult match() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  java.lang.String next() { throw new RuntimeException("Stub!"); }
public  void remove() { throw new RuntimeException("Stub!"); }
public  boolean hasNext(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String next(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  boolean hasNext(java.util.regex.Pattern pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String next(java.util.regex.Pattern pattern) { throw new RuntimeException("Stub!"); }
public  boolean hasNextLine() { throw new RuntimeException("Stub!"); }
public  java.lang.String nextLine() { throw new RuntimeException("Stub!"); }
public  java.lang.String findInLine(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String findInLine(java.util.regex.Pattern pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String findWithinHorizon(java.lang.String pattern, int horizon) { throw new RuntimeException("Stub!"); }
public  java.lang.String findWithinHorizon(java.util.regex.Pattern pattern, int horizon) { throw new RuntimeException("Stub!"); }
public  java.util.Scanner skip(java.util.regex.Pattern pattern) { throw new RuntimeException("Stub!"); }
public  java.util.Scanner skip(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  boolean hasNextBoolean() { throw new RuntimeException("Stub!"); }
public  boolean nextBoolean() { throw new RuntimeException("Stub!"); }
public  boolean hasNextByte() { throw new RuntimeException("Stub!"); }
public  boolean hasNextByte(int radix) { throw new RuntimeException("Stub!"); }
public  byte nextByte() { throw new RuntimeException("Stub!"); }
public  byte nextByte(int radix) { throw new RuntimeException("Stub!"); }
public  boolean hasNextShort() { throw new RuntimeException("Stub!"); }
public  boolean hasNextShort(int radix) { throw new RuntimeException("Stub!"); }
public  short nextShort() { throw new RuntimeException("Stub!"); }
public  short nextShort(int radix) { throw new RuntimeException("Stub!"); }
public  boolean hasNextInt() { throw new RuntimeException("Stub!"); }
public  boolean hasNextInt(int radix) { throw new RuntimeException("Stub!"); }
public  int nextInt() { throw new RuntimeException("Stub!"); }
public  int nextInt(int radix) { throw new RuntimeException("Stub!"); }
public  boolean hasNextLong() { throw new RuntimeException("Stub!"); }
public  boolean hasNextLong(int radix) { throw new RuntimeException("Stub!"); }
public  long nextLong() { throw new RuntimeException("Stub!"); }
public  long nextLong(int radix) { throw new RuntimeException("Stub!"); }
public  boolean hasNextFloat() { throw new RuntimeException("Stub!"); }
public  float nextFloat() { throw new RuntimeException("Stub!"); }
public  boolean hasNextDouble() { throw new RuntimeException("Stub!"); }
public  double nextDouble() { throw new RuntimeException("Stub!"); }
public  boolean hasNextBigInteger() { throw new RuntimeException("Stub!"); }
public  boolean hasNextBigInteger(int radix) { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger nextBigInteger() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger nextBigInteger(int radix) { throw new RuntimeException("Stub!"); }
public  boolean hasNextBigDecimal() { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal nextBigDecimal() { throw new RuntimeException("Stub!"); }
public  java.util.Scanner reset() { throw new RuntimeException("Stub!"); }
}
