/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2003, 2016, Oracle and/or its affiliates. All rights reserved.
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

package java.lang;
 abstract class AbstractStringBuilder
  implements java.lang.Appendable, java.lang.CharSequence
{
AbstractStringBuilder() { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  int capacity() { throw new RuntimeException("Stub!"); }
public  void ensureCapacity(int minimumCapacity) { throw new RuntimeException("Stub!"); }
public  void trimToSize() { throw new RuntimeException("Stub!"); }
public  void setLength(int newLength) { throw new RuntimeException("Stub!"); }
public  char charAt(int index) { throw new RuntimeException("Stub!"); }
public  int codePointAt(int index) { throw new RuntimeException("Stub!"); }
public  int codePointBefore(int index) { throw new RuntimeException("Stub!"); }
public  int codePointCount(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
public  int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
public  void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }
public  void setCharAt(int index, char ch) { throw new RuntimeException("Stub!"); }
public  java.lang.String substring(int start) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
public  java.lang.String substring(int start, int end) { throw new RuntimeException("Stub!"); }
public  int indexOf(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  int indexOf(java.lang.String str, int fromIndex) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(java.lang.String str, int fromIndex) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String toString();
public  java.lang.AbstractStringBuilder append(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public  java.lang.AbstractStringBuilder append(java.lang.CharSequence s, int start, int end) { throw new RuntimeException("Stub!"); }
public  java.lang.AbstractStringBuilder append(char c) { throw new RuntimeException("Stub!"); }
}
