/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/**
*******************************************************************************
* Copyright (C) 2001-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/
package android.icu.util;
public class Currency
  extends android.icu.util.MeasureUnit
{
public static enum CurrencyUsage
{
CASH(),
STANDARD();
}
protected  Currency(java.lang.String theISOCode) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.Currency getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.Currency getInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getAvailableCurrencyCodes(android.icu.util.ULocale loc, java.util.Date d) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getAvailableCurrencyCodes(java.util.Locale loc, java.util.Date d) { throw new RuntimeException("Stub!"); }
public static  java.util.Set<android.icu.util.Currency> getAvailableCurrencies() { throw new RuntimeException("Stub!"); }
public static  android.icu.util.Currency getInstance(java.lang.String theISOCode) { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale[] getAvailableULocales() { throw new RuntimeException("Stub!"); }
public static final  java.lang.String[] getKeywordValuesForLocale(java.lang.String key, android.icu.util.ULocale locale, boolean commonlyUsed) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCurrencyCode() { throw new RuntimeException("Stub!"); }
public  int getNumericCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSymbol() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSymbol(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSymbol(android.icu.util.ULocale uloc) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName(java.util.Locale locale, int nameStyle, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName(android.icu.util.ULocale locale, int nameStyle, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName(java.util.Locale locale, int nameStyle, java.lang.String pluralCount, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName(android.icu.util.ULocale locale, int nameStyle, java.lang.String pluralCount, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"javadoc"})
public  java.lang.String getDisplayName() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"javadoc"})
public  java.lang.String getDisplayName(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  int getDefaultFractionDigits() { throw new RuntimeException("Stub!"); }
public  int getDefaultFractionDigits(android.icu.util.Currency.CurrencyUsage Usage) { throw new RuntimeException("Stub!"); }
public  double getRoundingIncrement() { throw new RuntimeException("Stub!"); }
public  double getRoundingIncrement(android.icu.util.Currency.CurrencyUsage Usage) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  boolean isAvailable(java.lang.String code, java.util.Date from, java.util.Date to) { throw new RuntimeException("Stub!"); }
public static final int LONG_NAME = 1;
public static final int PLURAL_LONG_NAME = 2;
public static final int SYMBOL_NAME = 0;
}
