/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.io;
public class PrintStream
  extends java.io.FilterOutputStream
  implements java.lang.Appendable, java.io.Closeable
{
public  PrintStream(java.io.OutputStream out) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.OutputStream out, boolean autoFlush) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.OutputStream out, boolean autoFlush, java.lang.String encoding) throws java.io.UnsupportedEncodingException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.lang.String fileName) throws java.io.FileNotFoundException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.lang.String fileName, java.lang.String csn) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.File file) throws java.io.FileNotFoundException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.File file, java.lang.String csn) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean checkError() { throw new RuntimeException("Stub!"); }
protected  void setError() { throw new RuntimeException("Stub!"); }
protected  void clearError() { throw new RuntimeException("Stub!"); }
public  void write(int b) { throw new RuntimeException("Stub!"); }
public  void write(byte[] buf, int off, int len) { throw new RuntimeException("Stub!"); }
public  void print(boolean b) { throw new RuntimeException("Stub!"); }
public  void print(char c) { throw new RuntimeException("Stub!"); }
public  void print(int i) { throw new RuntimeException("Stub!"); }
public  void print(long l) { throw new RuntimeException("Stub!"); }
public  void print(float f) { throw new RuntimeException("Stub!"); }
public  void print(double d) { throw new RuntimeException("Stub!"); }
public  void print(char[] s) { throw new RuntimeException("Stub!"); }
public  void print(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  void print(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void println() { throw new RuntimeException("Stub!"); }
public  void println(boolean x) { throw new RuntimeException("Stub!"); }
public  void println(char x) { throw new RuntimeException("Stub!"); }
public  void println(int x) { throw new RuntimeException("Stub!"); }
public  void println(long x) { throw new RuntimeException("Stub!"); }
public  void println(float x) { throw new RuntimeException("Stub!"); }
public  void println(double x) { throw new RuntimeException("Stub!"); }
public  void println(char[] x) { throw new RuntimeException("Stub!"); }
public  void println(java.lang.String x) { throw new RuntimeException("Stub!"); }
public  void println(java.lang.Object x) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream printf(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream printf(java.util.Locale l, java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream format(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream format(java.util.Locale l, java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream append(java.lang.CharSequence csq) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream append(java.lang.CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream append(char c) { throw new RuntimeException("Stub!"); }
}
