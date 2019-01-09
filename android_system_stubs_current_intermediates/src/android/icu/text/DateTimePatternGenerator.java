/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
********************************************************************************
* Copyright (C) 2006-2016, Google, International Business Machines Corporation
* and others. All Rights Reserved.
********************************************************************************
*/
package android.icu.text;
public class DateTimePatternGenerator
  implements android.icu.util.Freezable<android.icu.text.DateTimePatternGenerator>, java.lang.Cloneable
{
public static final class PatternInfo
{
public  PatternInfo() { throw new RuntimeException("Stub!"); }
public static final int BASE_CONFLICT = 1;
public static final int CONFLICT = 2;
public static final int OK = 0;
public java.lang.String conflictingPattern;
public int status;
}
protected  DateTimePatternGenerator() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.DateTimePatternGenerator getEmptyInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.DateTimePatternGenerator getInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.DateTimePatternGenerator getInstance(android.icu.util.ULocale uLocale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.DateTimePatternGenerator getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getBestPattern(java.lang.String skeleton) { throw new RuntimeException("Stub!"); }
public  java.lang.String getBestPattern(java.lang.String skeleton, int options) { throw new RuntimeException("Stub!"); }
public  android.icu.text.DateTimePatternGenerator addPattern(java.lang.String pattern, boolean override, android.icu.text.DateTimePatternGenerator.PatternInfo returnInfo) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSkeleton(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String getBaseSkeleton(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getSkeletons(java.util.Map<java.lang.String, java.lang.String> result) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getBaseSkeletons(java.util.Set<java.lang.String> result) { throw new RuntimeException("Stub!"); }
public  java.lang.String replaceFieldTypes(java.lang.String pattern, java.lang.String skeleton) { throw new RuntimeException("Stub!"); }
public  java.lang.String replaceFieldTypes(java.lang.String pattern, java.lang.String skeleton, int options) { throw new RuntimeException("Stub!"); }
public  void setDateTimeFormat(java.lang.String dateTimeFormat) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDateTimeFormat() { throw new RuntimeException("Stub!"); }
public  void setDecimal(java.lang.String decimal) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDecimal() { throw new RuntimeException("Stub!"); }
public  void setAppendItemFormat(int field, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAppendItemFormat(int field) { throw new RuntimeException("Stub!"); }
public  void setAppendItemName(int field, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAppendItemName(int field) { throw new RuntimeException("Stub!"); }
public  boolean isFrozen() { throw new RuntimeException("Stub!"); }
public  android.icu.text.DateTimePatternGenerator freeze() { throw new RuntimeException("Stub!"); }
public  android.icu.text.DateTimePatternGenerator cloneAsThawed() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public static final int DAY = 7;
public static final int DAYPERIOD = 10;
public static final int DAY_OF_WEEK_IN_MONTH = 9;
public static final int DAY_OF_YEAR = 8;
public static final int ERA = 0;
public static final int FRACTIONAL_SECOND = 14;
public static final int HOUR = 11;
public static final int MATCH_ALL_FIELDS_LENGTH = 65535;
public static final int MATCH_HOUR_FIELD_LENGTH = 2048;
public static final int MATCH_NO_OPTIONS = 0;
public static final int MINUTE = 12;
public static final int MONTH = 3;
public static final int QUARTER = 2;
public static final int SECOND = 13;
public static final int WEEKDAY = 6;
public static final int WEEK_OF_MONTH = 5;
public static final int WEEK_OF_YEAR = 4;
public static final int YEAR = 1;
public static final int ZONE = 15;
}
