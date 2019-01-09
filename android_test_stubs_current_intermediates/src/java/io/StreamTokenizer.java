/*
* Copyright (c) 1995, 2012, Oracle and/or its affiliates. All rights reserved.
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
public class StreamTokenizer
{
@java.lang.Deprecated()
public  StreamTokenizer(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
public  StreamTokenizer(java.io.Reader r) { throw new RuntimeException("Stub!"); }
public  void resetSyntax() { throw new RuntimeException("Stub!"); }
public  void wordChars(int low, int hi) { throw new RuntimeException("Stub!"); }
public  void whitespaceChars(int low, int hi) { throw new RuntimeException("Stub!"); }
public  void ordinaryChars(int low, int hi) { throw new RuntimeException("Stub!"); }
public  void ordinaryChar(int ch) { throw new RuntimeException("Stub!"); }
public  void commentChar(int ch) { throw new RuntimeException("Stub!"); }
public  void quoteChar(int ch) { throw new RuntimeException("Stub!"); }
public  void parseNumbers() { throw new RuntimeException("Stub!"); }
public  void eolIsSignificant(boolean flag) { throw new RuntimeException("Stub!"); }
public  void slashStarComments(boolean flag) { throw new RuntimeException("Stub!"); }
public  void slashSlashComments(boolean flag) { throw new RuntimeException("Stub!"); }
public  void lowerCaseMode(boolean fl) { throw new RuntimeException("Stub!"); }
public  int nextToken() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void pushBack() { throw new RuntimeException("Stub!"); }
public  int lineno() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int TT_EOF = -1;
public static final int TT_EOL = 10;
public static final int TT_NUMBER = -2;
public static final int TT_WORD = -3;
public double nval;
public java.lang.String sval;
public int ttype;
}
