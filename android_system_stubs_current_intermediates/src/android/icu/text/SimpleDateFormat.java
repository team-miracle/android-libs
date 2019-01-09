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
public class SimpleDateFormat
  extends android.icu.text.DateFormat
{
public  SimpleDateFormat() { throw new RuntimeException("Stub!"); }
public  SimpleDateFormat(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  SimpleDateFormat(java.lang.String pattern, java.util.Locale loc) { throw new RuntimeException("Stub!"); }
public  SimpleDateFormat(java.lang.String pattern, android.icu.util.ULocale loc) { throw new RuntimeException("Stub!"); }
public  SimpleDateFormat(java.lang.String pattern, java.lang.String override, android.icu.util.ULocale loc) { throw new RuntimeException("Stub!"); }
public  SimpleDateFormat(java.lang.String pattern, android.icu.text.DateFormatSymbols formatData) { throw new RuntimeException("Stub!"); }
public  void set2DigitYearStart(java.util.Date startDate) { throw new RuntimeException("Stub!"); }
public  java.util.Date get2DigitYearStart() { throw new RuntimeException("Stub!"); }
public  void setContext(android.icu.text.DisplayContext context) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(android.icu.util.Calendar cal, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
protected  android.icu.text.DateFormat.Field patternCharToDateFormatField(char ch) { throw new RuntimeException("Stub!"); }
protected  java.lang.String subFormat(char ch, int count, int beginOffset, java.text.FieldPosition pos, android.icu.text.DateFormatSymbols fmtData, android.icu.util.Calendar cal) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void setNumberFormat(android.icu.text.NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }
protected  java.lang.String zeroPaddingNumber(long value, int minDigits, int maxDigits) { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String text, android.icu.util.Calendar cal, java.text.ParsePosition parsePos) { throw new RuntimeException("Stub!"); }
protected  int matchString(java.lang.String text, int start, int field, java.lang.String[] data, android.icu.util.Calendar cal) { throw new RuntimeException("Stub!"); }
protected  int matchQuarterString(java.lang.String text, int start, int field, java.lang.String[] data, android.icu.util.Calendar cal) { throw new RuntimeException("Stub!"); }
protected  int subParse(java.lang.String text, int start, char ch, int count, boolean obeyCount, boolean allowNegative, boolean[] ambiguousYear, android.icu.util.Calendar cal) { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
public  java.lang.String toLocalizedPattern() { throw new RuntimeException("Stub!"); }
public  void applyPattern(java.lang.String pat) { throw new RuntimeException("Stub!"); }
public  void applyLocalizedPattern(java.lang.String pat) { throw new RuntimeException("Stub!"); }
public  android.icu.text.DateFormatSymbols getDateFormatSymbols() { throw new RuntimeException("Stub!"); }
public  void setDateFormatSymbols(android.icu.text.DateFormatSymbols newFormatSymbols) { throw new RuntimeException("Stub!"); }
protected  android.icu.text.DateFormatSymbols getSymbols() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat getTimeZoneFormat() { throw new RuntimeException("Stub!"); }
public  void setTimeZoneFormat(android.icu.text.TimeZoneFormat tzfmt) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void setNumberFormat(java.lang.String fields, android.icu.text.NumberFormat overrideNF) { throw new RuntimeException("Stub!"); }
public  android.icu.text.NumberFormat getNumberFormat(char field) { throw new RuntimeException("Stub!"); }
}
