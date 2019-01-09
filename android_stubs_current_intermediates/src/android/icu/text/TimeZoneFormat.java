/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2011-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/
package android.icu.text;
public class TimeZoneFormat
  extends android.icu.text.UFormat
  implements android.icu.util.Freezable<android.icu.text.TimeZoneFormat>, java.io.Serializable
{
public static enum Style
{
EXEMPLAR_LOCATION(),
GENERIC_LOCATION(),
GENERIC_LONG(),
GENERIC_SHORT(),
ISO_BASIC_FIXED(),
ISO_BASIC_FULL(),
ISO_BASIC_LOCAL_FIXED(),
ISO_BASIC_LOCAL_FULL(),
ISO_BASIC_LOCAL_SHORT(),
ISO_BASIC_SHORT(),
ISO_EXTENDED_FIXED(),
ISO_EXTENDED_FULL(),
ISO_EXTENDED_LOCAL_FIXED(),
ISO_EXTENDED_LOCAL_FULL(),
LOCALIZED_GMT(),
LOCALIZED_GMT_SHORT(),
SPECIFIC_LONG(),
SPECIFIC_SHORT(),
ZONE_ID(),
ZONE_ID_SHORT();
}
public static enum GMTOffsetPatternType
{
NEGATIVE_H(),
NEGATIVE_HM(),
NEGATIVE_HMS(),
POSITIVE_H(),
POSITIVE_HM(),
POSITIVE_HMS();
}
public static enum TimeType
{
DAYLIGHT(),
STANDARD(),
UNKNOWN();
}
public static enum ParseOption
{
ALL_STYLES(),
TZ_DATABASE_ABBREVIATIONS();
}
protected  TimeZoneFormat(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.TimeZoneFormat getInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.TimeZoneFormat getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneNames getTimeZoneNames() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat setTimeZoneNames(android.icu.text.TimeZoneNames tznames) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGMTPattern() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat setGMTPattern(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGMTOffsetPattern(android.icu.text.TimeZoneFormat.GMTOffsetPatternType type) { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat setGMTOffsetPattern(android.icu.text.TimeZoneFormat.GMTOffsetPatternType type, java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGMTOffsetDigits() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat setGMTOffsetDigits(java.lang.String digits) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGMTZeroFormat() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat setGMTZeroFormat(java.lang.String gmtZeroFormat) { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat setDefaultParseOptions(java.util.EnumSet<android.icu.text.TimeZoneFormat.ParseOption> options) { throw new RuntimeException("Stub!"); }
public  java.util.EnumSet<android.icu.text.TimeZoneFormat.ParseOption> getDefaultParseOptions() { throw new RuntimeException("Stub!"); }
public final  java.lang.String formatOffsetISO8601Basic(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) { throw new RuntimeException("Stub!"); }
public final  java.lang.String formatOffsetISO8601Extended(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) { throw new RuntimeException("Stub!"); }
public  java.lang.String formatOffsetLocalizedGMT(int offset) { throw new RuntimeException("Stub!"); }
public  java.lang.String formatOffsetShortLocalizedGMT(int offset) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(android.icu.text.TimeZoneFormat.Style style, android.icu.util.TimeZone tz, long date) { throw new RuntimeException("Stub!"); }
public  java.lang.String format(android.icu.text.TimeZoneFormat.Style style, android.icu.util.TimeZone tz, long date, android.icu.util.Output<android.icu.text.TimeZoneFormat.TimeType> timeType) { throw new RuntimeException("Stub!"); }
public final  int parseOffsetISO8601(java.lang.String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  int parseOffsetLocalizedGMT(java.lang.String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  int parseOffsetShortLocalizedGMT(java.lang.String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  android.icu.util.TimeZone parse(android.icu.text.TimeZoneFormat.Style style, java.lang.String text, java.text.ParsePosition pos, java.util.EnumSet<android.icu.text.TimeZoneFormat.ParseOption> options, android.icu.util.Output<android.icu.text.TimeZoneFormat.TimeType> timeType) { throw new RuntimeException("Stub!"); }
public  android.icu.util.TimeZone parse(android.icu.text.TimeZoneFormat.Style style, java.lang.String text, java.text.ParsePosition pos, android.icu.util.Output<android.icu.text.TimeZoneFormat.TimeType> timeType) { throw new RuntimeException("Stub!"); }
public final  android.icu.util.TimeZone parse(java.lang.String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public final  android.icu.util.TimeZone parse(java.lang.String text) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  boolean isFrozen() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat freeze() { throw new RuntimeException("Stub!"); }
public  android.icu.text.TimeZoneFormat cloneAsThawed() { throw new RuntimeException("Stub!"); }
}
