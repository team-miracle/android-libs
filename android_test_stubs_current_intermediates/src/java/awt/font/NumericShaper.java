/*
* Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.awt.font;
public final class NumericShaper
  implements java.io.Serializable
{
public static enum Range
{
ARABIC(),
BALINESE(),
BENGALI(),
CHAM(),
DEVANAGARI(),
EASTERN_ARABIC(),
ETHIOPIC(),
EUROPEAN(),
GUJARATI(),
GURMUKHI(),
JAVANESE(),
KANNADA(),
KAYAH_LI(),
KHMER(),
LAO(),
LEPCHA(),
LIMBU(),
MALAYALAM(),
MEETEI_MAYEK(),
MONGOLIAN(),
MYANMAR(),
MYANMAR_SHAN(),
NEW_TAI_LUE(),
NKO(),
OL_CHIKI(),
ORIYA(),
SAURASHTRA(),
SUNDANESE(),
TAI_THAM_HORA(),
TAI_THAM_THAM(),
TAMIL(),
TELUGU(),
THAI(),
TIBETAN(),
VAI();
}
NumericShaper() { throw new RuntimeException("Stub!"); }
public static  java.awt.font.NumericShaper getShaper(int singleRange) { throw new RuntimeException("Stub!"); }
public static  java.awt.font.NumericShaper getShaper(java.awt.font.NumericShaper.Range singleRange) { throw new RuntimeException("Stub!"); }
public static  java.awt.font.NumericShaper getContextualShaper(int ranges) { throw new RuntimeException("Stub!"); }
public static  java.awt.font.NumericShaper getContextualShaper(java.util.Set<java.awt.font.NumericShaper.Range> ranges) { throw new RuntimeException("Stub!"); }
public static  java.awt.font.NumericShaper getContextualShaper(int ranges, int defaultContext) { throw new RuntimeException("Stub!"); }
public static  java.awt.font.NumericShaper getContextualShaper(java.util.Set<java.awt.font.NumericShaper.Range> ranges, java.awt.font.NumericShaper.Range defaultContext) { throw new RuntimeException("Stub!"); }
public  void shape(char[] text, int start, int count) { throw new RuntimeException("Stub!"); }
public  void shape(char[] text, int start, int count, int context) { throw new RuntimeException("Stub!"); }
public  void shape(char[] text, int start, int count, java.awt.font.NumericShaper.Range context) { throw new RuntimeException("Stub!"); }
public  boolean isContextual() { throw new RuntimeException("Stub!"); }
public  int getRanges() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.awt.font.NumericShaper.Range> getRangeSet() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ALL_RANGES = 524287;
public static final int ARABIC = 2;
public static final int BENGALI = 16;
public static final int DEVANAGARI = 8;
public static final int EASTERN_ARABIC = 4;
public static final int ETHIOPIC = 65536;
public static final int EUROPEAN = 1;
public static final int GUJARATI = 64;
public static final int GURMUKHI = 32;
public static final int KANNADA = 1024;
public static final int KHMER = 131072;
public static final int LAO = 8192;
public static final int MALAYALAM = 2048;
public static final int MONGOLIAN = 262144;
public static final int MYANMAR = 32768;
public static final int ORIYA = 128;
public static final int TAMIL = 256;
public static final int TELUGU = 512;
public static final int THAI = 4096;
public static final int TIBETAN = 16384;
}
