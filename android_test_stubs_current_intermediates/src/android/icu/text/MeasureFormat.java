/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
**********************************************************************
* Copyright (c) 2004-2016, International Business Machines
* Corporation and others.  All Rights Reserved.
**********************************************************************
* Author: Alan Liu
* Created: April 20, 2004
* Since: ICU 3.0
**********************************************************************
*/
package android.icu.text;
public class MeasureFormat
  extends android.icu.text.UFormat
{
public static enum FormatWidth
{
NARROW(),
NUMERIC(),
SHORT(),
WIDE();
}
MeasureFormat() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getInstance(android.icu.util.ULocale locale, android.icu.text.MeasureFormat.FormatWidth formatWidth) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getInstance(java.util.Locale locale, android.icu.text.MeasureFormat.FormatWidth formatWidth) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getInstance(android.icu.util.ULocale locale, android.icu.text.MeasureFormat.FormatWidth formatWidth, android.icu.text.NumberFormat format) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getInstance(java.util.Locale locale, android.icu.text.MeasureFormat.FormatWidth formatWidth, android.icu.text.NumberFormat format) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public final  java.lang.String formatMeasures(android.icu.util.Measure... measures) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuilder formatMeasurePerUnit(android.icu.util.Measure measure, android.icu.util.MeasureUnit perUnit, java.lang.StringBuilder appendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuilder formatMeasures(java.lang.StringBuilder appendTo, java.text.FieldPosition fieldPosition, android.icu.util.Measure... measures) { throw new RuntimeException("Stub!"); }
public  java.lang.String getUnitDisplayName(android.icu.util.MeasureUnit unit) { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public  android.icu.text.MeasureFormat.FormatWidth getWidth() { throw new RuntimeException("Stub!"); }
public final  android.icu.util.ULocale getLocale() { throw new RuntimeException("Stub!"); }
public  android.icu.text.NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getCurrencyFormat(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getCurrencyFormat(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.MeasureFormat getCurrencyFormat() { throw new RuntimeException("Stub!"); }
public  android.icu.util.Measure parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
}
