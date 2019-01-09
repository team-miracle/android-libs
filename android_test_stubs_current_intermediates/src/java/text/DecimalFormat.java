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
public class DecimalFormat
  extends java.text.NumberFormat
{
public  DecimalFormat() { throw new RuntimeException("Stub!"); }
public  DecimalFormat(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  DecimalFormat(java.lang.String pattern, java.text.DecimalFormatSymbols symbols) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(double number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(long number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.Number parse(java.lang.String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.text.DecimalFormatSymbols getDecimalFormatSymbols() { throw new RuntimeException("Stub!"); }
public  void setDecimalFormatSymbols(java.text.DecimalFormatSymbols newSymbols) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPositivePrefix() { throw new RuntimeException("Stub!"); }
public  void setPositivePrefix(java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getNegativePrefix() { throw new RuntimeException("Stub!"); }
public  void setNegativePrefix(java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPositiveSuffix() { throw new RuntimeException("Stub!"); }
public  void setPositiveSuffix(java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getNegativeSuffix() { throw new RuntimeException("Stub!"); }
public  void setNegativeSuffix(java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  int getMultiplier() { throw new RuntimeException("Stub!"); }
public  void setMultiplier(int newValue) { throw new RuntimeException("Stub!"); }
public  void setGroupingUsed(boolean newValue) { throw new RuntimeException("Stub!"); }
public  boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
public  int getGroupingSize() { throw new RuntimeException("Stub!"); }
public  void setGroupingSize(int newValue) { throw new RuntimeException("Stub!"); }
public  boolean isDecimalSeparatorAlwaysShown() { throw new RuntimeException("Stub!"); }
public  void setDecimalSeparatorAlwaysShown(boolean newValue) { throw new RuntimeException("Stub!"); }
public  boolean isParseBigDecimal() { throw new RuntimeException("Stub!"); }
public  void setParseBigDecimal(boolean newValue) { throw new RuntimeException("Stub!"); }
public  boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
public  void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
public  java.lang.String toLocalizedPattern() { throw new RuntimeException("Stub!"); }
public  void applyPattern(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  void applyLocalizedPattern(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
public  int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
public  int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
public  int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
public  int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
public  java.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
public  void setCurrency(java.util.Currency currency) { throw new RuntimeException("Stub!"); }
public  java.math.RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }
public  void setRoundingMode(java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
}
