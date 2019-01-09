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
* (C) Copyright Taligent, Inc. 1996 - All Rights Reserved
* (C) Copyright IBM Corp. 1996 - All Rights Reserved
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
public abstract class DateFormat
  extends java.text.Format
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String name, int calendarField) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public static  java.text.DateFormat.Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!"); }
public  int getCalendarField() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.DateFormat.Field AM_PM;
public static final java.text.DateFormat.Field DAY_OF_MONTH;
public static final java.text.DateFormat.Field DAY_OF_WEEK;
public static final java.text.DateFormat.Field DAY_OF_WEEK_IN_MONTH;
public static final java.text.DateFormat.Field DAY_OF_YEAR;
public static final java.text.DateFormat.Field ERA;
public static final java.text.DateFormat.Field HOUR0;
public static final java.text.DateFormat.Field HOUR1;
public static final java.text.DateFormat.Field HOUR_OF_DAY0;
public static final java.text.DateFormat.Field HOUR_OF_DAY1;
public static final java.text.DateFormat.Field MILLISECOND;
public static final java.text.DateFormat.Field MINUTE;
public static final java.text.DateFormat.Field MONTH;
public static final java.text.DateFormat.Field SECOND;
public static final java.text.DateFormat.Field TIME_ZONE;
public static final java.text.DateFormat.Field WEEK_OF_MONTH;
public static final java.text.DateFormat.Field WEEK_OF_YEAR;
public static final java.text.DateFormat.Field YEAR;
static { AM_PM = null; DAY_OF_MONTH = null; DAY_OF_WEEK = null; DAY_OF_WEEK_IN_MONTH = null; DAY_OF_YEAR = null; ERA = null; HOUR0 = null; HOUR1 = null; HOUR_OF_DAY0 = null; HOUR_OF_DAY1 = null; MILLISECOND = null; MINUTE = null; MONTH = null; SECOND = null; TIME_ZONE = null; WEEK_OF_MONTH = null; WEEK_OF_YEAR = null; YEAR = null; }
}
protected  DateFormat() { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer toAppendTo, java.text.FieldPosition fieldPosition);
public final  java.lang.String format(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  java.util.Date parse(java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public abstract  java.util.Date parse(java.lang.String source, java.text.ParsePosition pos);
public  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getTimeInstance(int style, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateInstance() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateInstance(int style, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static final  java.text.DateFormat getInstance() { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public  void setCalendar(java.util.Calendar newCalendar) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar getCalendar() { throw new RuntimeException("Stub!"); }
public  void setNumberFormat(java.text.NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }
public  java.text.NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
public  java.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
public  void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  boolean isLenient() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public static final int AM_PM_FIELD = 14;
public static final int DATE_FIELD = 3;
public static final int DAY_OF_WEEK_FIELD = 9;
public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
public static final int DAY_OF_YEAR_FIELD = 10;
public static final int DEFAULT = 2;
public static final int ERA_FIELD = 0;
public static final int FULL = 0;
public static final int HOUR0_FIELD = 16;
public static final int HOUR1_FIELD = 15;
public static final int HOUR_OF_DAY0_FIELD = 5;
public static final int HOUR_OF_DAY1_FIELD = 4;
public static final int LONG = 1;
public static final int MEDIUM = 2;
public static final int MILLISECOND_FIELD = 8;
public static final int MINUTE_FIELD = 6;
public static final int MONTH_FIELD = 2;
public static final int SECOND_FIELD = 7;
public static final int SHORT = 3;
public static final int TIMEZONE_FIELD = 17;
public static final int WEEK_OF_MONTH_FIELD = 13;
public static final int WEEK_OF_YEAR_FIELD = 12;
public static final int YEAR_FIELD = 1;
protected java.util.Calendar calendar;
protected java.text.NumberFormat numberFormat;
}
