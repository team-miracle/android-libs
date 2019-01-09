/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*   Copyright (C) 1996-2016, International Business Machines
*   Corporation and others.  All Rights Reserved.
*/

package android.icu.text;
public abstract class DateFormat
  extends android.icu.text.UFormat
{
public static enum BooleanAttribute
{
PARSE_ALLOW_NUMERIC(),
PARSE_ALLOW_WHITESPACE(),
PARSE_MULTIPLE_PATTERNS_FOR_MATCH(),
PARSE_PARTIAL_LITERAL_MATCH();
}
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String name, int calendarField) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public static  android.icu.text.DateFormat.Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!"); }
public  int getCalendarField() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final android.icu.text.DateFormat.Field AM_PM;
public static final android.icu.text.DateFormat.Field AM_PM_MIDNIGHT_NOON;
public static final android.icu.text.DateFormat.Field DAY_OF_MONTH;
public static final android.icu.text.DateFormat.Field DAY_OF_WEEK;
public static final android.icu.text.DateFormat.Field DAY_OF_WEEK_IN_MONTH;
public static final android.icu.text.DateFormat.Field DAY_OF_YEAR;
public static final android.icu.text.DateFormat.Field DOW_LOCAL;
public static final android.icu.text.DateFormat.Field ERA;
public static final android.icu.text.DateFormat.Field EXTENDED_YEAR;
public static final android.icu.text.DateFormat.Field FLEXIBLE_DAY_PERIOD;
public static final android.icu.text.DateFormat.Field HOUR0;
public static final android.icu.text.DateFormat.Field HOUR1;
public static final android.icu.text.DateFormat.Field HOUR_OF_DAY0;
public static final android.icu.text.DateFormat.Field HOUR_OF_DAY1;
public static final android.icu.text.DateFormat.Field JULIAN_DAY;
public static final android.icu.text.DateFormat.Field MILLISECOND;
public static final android.icu.text.DateFormat.Field MILLISECONDS_IN_DAY;
public static final android.icu.text.DateFormat.Field MINUTE;
public static final android.icu.text.DateFormat.Field MONTH;
public static final android.icu.text.DateFormat.Field QUARTER;
public static final android.icu.text.DateFormat.Field SECOND;
public static final android.icu.text.DateFormat.Field TIME_ZONE;
public static final android.icu.text.DateFormat.Field WEEK_OF_MONTH;
public static final android.icu.text.DateFormat.Field WEEK_OF_YEAR;
public static final android.icu.text.DateFormat.Field YEAR;
public static final android.icu.text.DateFormat.Field YEAR_WOY;
static { AM_PM = null; AM_PM_MIDNIGHT_NOON = null; DAY_OF_MONTH = null; DAY_OF_WEEK = null; DAY_OF_WEEK_IN_MONTH = null; DAY_OF_YEAR = null; DOW_LOCAL = null; ERA = null; EXTENDED_YEAR = null; FLEXIBLE_DAY_PERIOD = null; HOUR0 = null; HOUR1 = null; HOUR_OF_DAY0 = null; HOUR_OF_DAY1 = null; JULIAN_DAY = null; MILLISECOND = null; MILLISECONDS_IN_DAY = null; MINUTE = null; MONTH = null; QUARTER = null; SECOND = null; TIME_ZONE = null; WEEK_OF_MONTH = null; WEEK_OF_YEAR = null; YEAR = null; YEAR_WOY = null; }
}
protected  DateFormat() { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(android.icu.util.Calendar cal, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition);
public  java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  java.util.Date parse(java.lang.String text) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public abstract  void parse(java.lang.String text, android.icu.util.Calendar cal, java.text.ParsePosition pos);
public  java.util.Date parse(java.lang.String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance(int style, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance(int style, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance() { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance(int style, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance(int style, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstance() { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public  void setCalendar(android.icu.util.Calendar newCalendar) { throw new RuntimeException("Stub!"); }
public  android.icu.util.Calendar getCalendar() { throw new RuntimeException("Stub!"); }
public  void setNumberFormat(android.icu.text.NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }
public  android.icu.text.NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
public  void setTimeZone(android.icu.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
public  android.icu.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
public  void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  boolean isLenient() { throw new RuntimeException("Stub!"); }
public  void setCalendarLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  boolean isCalendarLenient() { throw new RuntimeException("Stub!"); }
public  android.icu.text.DateFormat setBooleanAttribute(android.icu.text.DateFormat.BooleanAttribute key, boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getBooleanAttribute(android.icu.text.DateFormat.BooleanAttribute key) { throw new RuntimeException("Stub!"); }
public  void setContext(android.icu.text.DisplayContext context) { throw new RuntimeException("Stub!"); }
public  android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type type) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance(android.icu.util.Calendar cal, int dateStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance(android.icu.util.Calendar cal, int dateStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance(android.icu.util.Calendar cal, int timeStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance(android.icu.util.Calendar cal, int timeStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance(android.icu.util.Calendar cal, int dateStyle, int timeStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance(android.icu.util.Calendar cal, int dateStyle, int timeStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstance(android.icu.util.Calendar cal, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstance(android.icu.util.Calendar cal) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateInstance(android.icu.util.Calendar cal, int dateStyle) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getTimeInstance(android.icu.util.Calendar cal, int timeStyle) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getDateTimeInstance(android.icu.util.Calendar cal, int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String skeleton) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstanceForSkeleton(android.icu.util.Calendar cal, java.lang.String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getInstanceForSkeleton(android.icu.util.Calendar cal, java.lang.String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getPatternInstance(java.lang.String skeleton) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getPatternInstance(java.lang.String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getPatternInstance(java.lang.String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getPatternInstance(android.icu.util.Calendar cal, java.lang.String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.DateFormat getPatternInstance(android.icu.util.Calendar cal, java.lang.String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ABBR_GENERIC_TZ = "v";
public static final java.lang.String ABBR_MONTH = "MMM";
public static final java.lang.String ABBR_MONTH_DAY = "MMMd";
public static final java.lang.String ABBR_MONTH_WEEKDAY_DAY = "MMMEd";
public static final java.lang.String ABBR_QUARTER = "QQQ";
public static final java.lang.String ABBR_SPECIFIC_TZ = "z";
public static final java.lang.String ABBR_UTC_TZ = "ZZZZ";
public static final java.lang.String ABBR_WEEKDAY = "E";
public static final int AM_PM_FIELD = 14;
public static final int AM_PM_MIDNIGHT_NOON_FIELD = 35;
public static final int DATE_FIELD = 3;
public static final java.lang.String DAY = "d";
public static final int DAY_OF_WEEK_FIELD = 9;
public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
public static final int DAY_OF_YEAR_FIELD = 10;
public static final int DEFAULT = 2;
public static final int DOW_LOCAL_FIELD = 19;
public static final int ERA_FIELD = 0;
public static final int EXTENDED_YEAR_FIELD = 20;
public static final int FLEXIBLE_DAY_PERIOD_FIELD = 36;
public static final int FRACTIONAL_SECOND_FIELD = 8;
public static final int FULL = 0;
public static final java.lang.String GENERIC_TZ = "vvvv";
public static final java.lang.String HOUR = "j";
public static final int HOUR0_FIELD = 16;
public static final int HOUR1_FIELD = 15;
public static final java.lang.String HOUR24 = "H";
public static final java.lang.String HOUR24_MINUTE = "Hm";
public static final java.lang.String HOUR24_MINUTE_SECOND = "Hms";
public static final java.lang.String HOUR_MINUTE = "jm";
public static final java.lang.String HOUR_MINUTE_SECOND = "jms";
public static final int HOUR_OF_DAY0_FIELD = 5;
public static final int HOUR_OF_DAY1_FIELD = 4;
public static final int JULIAN_DAY_FIELD = 21;
public static final java.lang.String LOCATION_TZ = "VVVV";
public static final int LONG = 1;
public static final int MEDIUM = 2;
public static final int MILLISECONDS_IN_DAY_FIELD = 22;
public static final int MILLISECOND_FIELD = 8;
public static final java.lang.String MINUTE = "m";
public static final int MINUTE_FIELD = 6;
public static final java.lang.String MINUTE_SECOND = "ms";
public static final java.lang.String MONTH = "MMMM";
public static final java.lang.String MONTH_DAY = "MMMMd";
public static final int MONTH_FIELD = 2;
public static final java.lang.String MONTH_WEEKDAY_DAY = "MMMMEEEEd";
public static final int NONE = -1;
public static final java.lang.String NUM_MONTH = "M";
public static final java.lang.String NUM_MONTH_DAY = "Md";
public static final java.lang.String NUM_MONTH_WEEKDAY_DAY = "MEd";
public static final java.lang.String QUARTER = "QQQQ";
public static final int QUARTER_FIELD = 27;
public static final int RELATIVE = 128;
public static final int RELATIVE_DEFAULT = 130;
public static final int RELATIVE_FULL = 128;
public static final int RELATIVE_LONG = 129;
public static final int RELATIVE_MEDIUM = 130;
public static final int RELATIVE_SHORT = 131;
public static final java.lang.String SECOND = "s";
public static final int SECOND_FIELD = 7;
public static final int SHORT = 3;
public static final java.lang.String SPECIFIC_TZ = "zzzz";
public static final int STANDALONE_DAY_FIELD = 25;
public static final int STANDALONE_MONTH_FIELD = 26;
public static final int STANDALONE_QUARTER_FIELD = 28;
public static final int TIMEZONE_FIELD = 17;
public static final int TIMEZONE_GENERIC_FIELD = 24;
public static final int TIMEZONE_ISO_FIELD = 32;
public static final int TIMEZONE_ISO_LOCAL_FIELD = 33;
public static final int TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD = 31;
public static final int TIMEZONE_RFC_FIELD = 23;
public static final int TIMEZONE_SPECIAL_FIELD = 29;
public static final java.lang.String WEEKDAY = "EEEE";
public static final int WEEK_OF_MONTH_FIELD = 13;
public static final int WEEK_OF_YEAR_FIELD = 12;
public static final java.lang.String YEAR = "y";
public static final java.lang.String YEAR_ABBR_MONTH = "yMMM";
public static final java.lang.String YEAR_ABBR_MONTH_DAY = "yMMMd";
public static final java.lang.String YEAR_ABBR_MONTH_WEEKDAY_DAY = "yMMMEd";
public static final java.lang.String YEAR_ABBR_QUARTER = "yQQQ";
public static final int YEAR_FIELD = 1;
public static final java.lang.String YEAR_MONTH = "yMMMM";
public static final java.lang.String YEAR_MONTH_DAY = "yMMMMd";
public static final java.lang.String YEAR_MONTH_WEEKDAY_DAY = "yMMMMEEEEd";
public static final int YEAR_NAME_FIELD = 30;
public static final java.lang.String YEAR_NUM_MONTH = "yM";
public static final java.lang.String YEAR_NUM_MONTH_DAY = "yMd";
public static final java.lang.String YEAR_NUM_MONTH_WEEKDAY_DAY = "yMEd";
public static final java.lang.String YEAR_QUARTER = "yQQQQ";
public static final int YEAR_WOY_FIELD = 18;
protected android.icu.util.Calendar calendar;
protected android.icu.text.NumberFormat numberFormat;
}
