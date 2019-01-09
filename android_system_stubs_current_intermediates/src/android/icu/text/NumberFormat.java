/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 1996-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/

package android.icu.text;
public abstract class NumberFormat
  extends android.icu.text.UFormat
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String fieldName) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final android.icu.text.NumberFormat.Field CURRENCY;
public static final android.icu.text.NumberFormat.Field DECIMAL_SEPARATOR;
public static final android.icu.text.NumberFormat.Field EXPONENT;
public static final android.icu.text.NumberFormat.Field EXPONENT_SIGN;
public static final android.icu.text.NumberFormat.Field EXPONENT_SYMBOL;
public static final android.icu.text.NumberFormat.Field FRACTION;
public static final android.icu.text.NumberFormat.Field GROUPING_SEPARATOR;
public static final android.icu.text.NumberFormat.Field INTEGER;
public static final android.icu.text.NumberFormat.Field PERCENT;
public static final android.icu.text.NumberFormat.Field PERMILLE;
public static final android.icu.text.NumberFormat.Field SIGN;
static { CURRENCY = null; DECIMAL_SEPARATOR = null; EXPONENT = null; EXPONENT_SIGN = null; EXPONENT_SYMBOL = null; FRACTION = null; GROUPING_SEPARATOR = null; INTEGER = null; PERCENT = null; PERMILLE = null; SIGN = null; }
}
public  NumberFormat() { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(java.lang.Object number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public final  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition parsePosition) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(double number) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(long number) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(java.math.BigInteger number) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(java.math.BigDecimal number) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(android.icu.math.BigDecimal number) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(android.icu.util.CurrencyAmount currAmt) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public abstract  java.lang.StringBuffer format(long number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public abstract  java.lang.StringBuffer format(java.math.BigInteger number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public abstract  java.lang.StringBuffer format(java.math.BigDecimal number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public abstract  java.lang.StringBuffer format(android.icu.math.BigDecimal number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
public  java.lang.StringBuffer format(android.icu.util.CurrencyAmount currAmt, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Number parse(java.lang.String text, java.text.ParsePosition parsePosition);
public  java.lang.Number parse(java.lang.String text) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
public  void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
public  void setParseStrict(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean isParseStrict() { throw new RuntimeException("Stub!"); }
public  void setContext(android.icu.text.DisplayContext context) { throw new RuntimeException("Stub!"); }
public  android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type type) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getInstance(android.icu.util.ULocale inLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getInstance(int style) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getInstance(java.util.Locale inLocale, int style) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getNumberInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getNumberInstance(android.icu.util.ULocale inLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getIntegerInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getIntegerInstance(android.icu.util.ULocale inLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getCurrencyInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getCurrencyInstance(android.icu.util.ULocale inLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getPercentInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getPercentInstance(android.icu.util.ULocale inLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.NumberFormat getScientificInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getScientificInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getScientificInstance(android.icu.util.ULocale inLocale) { throw new RuntimeException("Stub!"); }
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
public  void setCurrency(android.icu.util.Currency theCurrency) { throw new RuntimeException("Stub!"); }
public  android.icu.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
public  int getRoundingMode() { throw new RuntimeException("Stub!"); }
public  void setRoundingMode(int roundingMode) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.NumberFormat getInstance(android.icu.util.ULocale desiredLocale, int choice) { throw new RuntimeException("Stub!"); }
protected static  java.lang.String getPattern(android.icu.util.ULocale forLocale, int choice) { throw new RuntimeException("Stub!"); }
public static final int ACCOUNTINGCURRENCYSTYLE = 7;
public static final int CASHCURRENCYSTYLE = 8;
public static final int CURRENCYSTYLE = 1;
public static final int FRACTION_FIELD = 1;
public static final int INTEGERSTYLE = 4;
public static final int INTEGER_FIELD = 0;
public static final int ISOCURRENCYSTYLE = 5;
public static final int NUMBERSTYLE = 0;
public static final int PERCENTSTYLE = 2;
public static final int PLURALCURRENCYSTYLE = 6;
public static final int SCIENTIFICSTYLE = 3;
public static final int STANDARDCURRENCYSTYLE = 9;
}
