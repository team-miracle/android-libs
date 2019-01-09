/*
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

/*
* (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
* (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
*
*   The original version of this source code and documentation is copyrighted
* and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
* materials are provided under terms of a License Agreement between Taligent
* and Sun. This technology is protected by multiple US and International
* patents. This notice and attribution to Taligent may not be removed.
*   Taligent is a registered trademark of Taligent, Inc.
*
*/

package java.text;
public class ChoiceFormat
  extends java.text.NumberFormat
{
public  ChoiceFormat(java.lang.String newPattern) { throw new RuntimeException("Stub!"); }
public  ChoiceFormat(double[] limits, java.lang.String[] formats) { throw new RuntimeException("Stub!"); }
public  void applyPattern(java.lang.String newPattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
public  void setChoices(double[] limits, java.lang.String[] formats) { throw new RuntimeException("Stub!"); }
public  double[] getLimits() { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] getFormats() { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(long number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition status) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition status) { throw new RuntimeException("Stub!"); }
public  java.lang.Number parse(java.lang.String text, java.text.ParsePosition status) { throw new RuntimeException("Stub!"); }
public static final  double nextDouble(double d) { throw new RuntimeException("Stub!"); }
public static final  double previousDouble(double d) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static  double nextDouble(double d, boolean positive) { throw new RuntimeException("Stub!"); }
}
