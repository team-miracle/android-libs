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
public abstract class NumberFormat
  extends java.text.Format
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String name) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.NumberFormat.Field CURRENCY;
public static final java.text.NumberFormat.Field DECIMAL_SEPARATOR;
public static final java.text.NumberFormat.Field EXPONENT;
public static final java.text.NumberFormat.Field EXPONENT_SIGN;
public static final java.text.NumberFormat.Field EXPONENT_SYMBOL;
public static final java.text.NumberFormat.Field FRACTION;
public static final java.text.NumberFormat.Field GROUPING_SEPARATOR;
public static final java.text.NumberFormat.Field INTEGER;
public static final java.text.NumberFormat.Field PERCENT;
public static final java.text.NumberFormat.Field PERMILLE;
public static final java.text.NumberFormat.Field SIGN;
static { CURRENCY = null; DECIMAL_SEPARATOR = null; EXPONENT = null; EXPONENT_SIGN = null; EXPONENT_SYMBOL = null; FRACTION = null; GROUPING_SEPARATOR = null; INTEGER = null; PERCENT = null; PERMILLE = null; SIGN = null; }
}
protected  NumberFormat() { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(java.lang.Object number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public final  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(double number) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(long number) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public abstract  java.lang.StringBuffer format(long number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public abstract  java.lang.Number parse(java.lang.String source, java.text.ParsePosition parsePosition);
public  java.lang.Number parse(java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
public  void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getNumberInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getIntegerInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getCurrencyInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getPercentInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
public  void setGroupingUsed(boolean newValue) { throw new RuntimeException("Stub!"); }
public  int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
public  void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
public  void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
public  void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
public  void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  java.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
public  void setCurrency(java.util.Currency currency) { throw new RuntimeException("Stub!"); }
public  java.math.RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }
public  void setRoundingMode(java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
public static final int FRACTION_FIELD = 1;
public static final int INTEGER_FIELD = 0;
}
