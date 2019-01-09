/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2013-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/
package android.icu.text;
public final class RelativeDateTimeFormatter
{
public static enum Style
{
LONG(),
NARROW(),
SHORT();
}
public static enum RelativeUnit
{
DAYS(),
HOURS(),
MINUTES(),
MONTHS(),
SECONDS(),
WEEKS(),
YEARS();
}
public static enum AbsoluteUnit
{
DAY(),
FRIDAY(),
MONDAY(),
MONTH(),
NOW(),
SATURDAY(),
SUNDAY(),
THURSDAY(),
TUESDAY(),
WEDNESDAY(),
WEEK(),
YEAR();
}
public static enum Direction
{
LAST(),
LAST_2(),
NEXT(),
NEXT_2(),
PLAIN(),
THIS();
}
public static enum RelativeDateTimeUnit
{
DAY(),
FRIDAY(),
HOUR(),
MINUTE(),
MONDAY(),
MONTH(),
QUARTER(),
SATURDAY(),
SECOND(),
SUNDAY(),
THURSDAY(),
TUESDAY(),
WEDNESDAY(),
WEEK(),
YEAR();
}
RelativeDateTimeFormatter() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.RelativeDateTimeFormatter getInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.RelativeDateTimeFormatter getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale locale, android.icu.text.NumberFormat nf) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale locale, android.icu.text.NumberFormat nf, android.icu.text.RelativeDateTimeFormatter.Style style, android.icu.text.DisplayContext capitalizationContext) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.RelativeDateTimeFormatter getInstance(java.util.Locale locale, android.icu.text.NumberFormat nf) { throw new RuntimeException("Stub!"); }
public  java.lang.String format(double quantity, android.icu.text.RelativeDateTimeFormatter.Direction direction, android.icu.text.RelativeDateTimeFormatter.RelativeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.lang.String formatNumeric(double offset, android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.lang.String format(android.icu.text.RelativeDateTimeFormatter.Direction direction, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit unit) { throw new RuntimeException("Stub!"); }
public  java.lang.String format(double offset, android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.lang.String combineDateAndTime(java.lang.String relativeDateString, java.lang.String timeString) { throw new RuntimeException("Stub!"); }
public  android.icu.text.NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
public  android.icu.text.DisplayContext getCapitalizationContext() { throw new RuntimeException("Stub!"); }
public  android.icu.text.RelativeDateTimeFormatter.Style getFormatStyle() { throw new RuntimeException("Stub!"); }
}
