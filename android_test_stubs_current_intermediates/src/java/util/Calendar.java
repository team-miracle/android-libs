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
* (C) Copyright Taligent, Inc. 1996-1998 - All Rights Reserved
* (C) Copyright IBM Corp. 1996-1998 - All Rights Reserved
*
*   The original version of this source code and documentation is copyrighted
* and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
* materials are provided under terms of a License Agreement between Taligent
* and Sun. This technology is protected by multiple US and International
* patents. This notice and attribution to Taligent may not be removed.
*   Taligent is a registered trademark of Taligent, Inc.
*
*/

package java.util;
public abstract class Calendar
  implements java.io.Serializable, java.lang.Cloneable, java.lang.Comparable<java.util.Calendar>
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setInstant(long instant) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setInstant(java.util.Date instant) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder set(int field, int value) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setFields(int... fieldValuePairs) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setDate(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setTimeOfDay(int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setTimeOfDay(int hourOfDay, int minute, int second, int millis) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setTimeZone(java.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setCalendarType(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar.Builder setWeekDefinition(int firstDayOfWeek, int minimalDaysInFirstWeek) { throw new RuntimeException("Stub!"); }
public  java.util.Calendar build() { throw new RuntimeException("Stub!"); }
}
protected  Calendar() { throw new RuntimeException("Stub!"); }
protected  Calendar(java.util.TimeZone zone, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static  java.util.Calendar getInstance() { throw new RuntimeException("Stub!"); }
public static  java.util.Calendar getInstance(java.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
public static  java.util.Calendar getInstance(java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static  java.util.Calendar getInstance(java.util.TimeZone zone, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public static synchronized  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
protected abstract  void computeTime();
protected abstract  void computeFields();
public final  java.util.Date getTime() { throw new RuntimeException("Stub!"); }
public final  void setTime(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  long getTimeInMillis() { throw new RuntimeException("Stub!"); }
public  void setTimeInMillis(long millis) { throw new RuntimeException("Stub!"); }
public  int get(int field) { throw new RuntimeException("Stub!"); }
protected final  int internalGet(int field) { throw new RuntimeException("Stub!"); }
public  void set(int field, int value) { throw new RuntimeException("Stub!"); }
public final  void set(int year, int month, int date) { throw new RuntimeException("Stub!"); }
public final  void set(int year, int month, int date, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); }
public final  void set(int year, int month, int date, int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); }
public final  void clear() { throw new RuntimeException("Stub!"); }
public final  void clear(int field) { throw new RuntimeException("Stub!"); }
public final  boolean isSet(int field) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName(int field, int style, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.Integer> getDisplayNames(int field, int style, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
protected  void complete() { throw new RuntimeException("Stub!"); }
public static  java.util.Set<java.lang.String> getAvailableCalendarTypes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCalendarType() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"EqualsWhichDoesntCheckParameterClass"})
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean before(java.lang.Object when) { throw new RuntimeException("Stub!"); }
public  boolean after(java.lang.Object when) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.util.Calendar anotherCalendar) { throw new RuntimeException("Stub!"); }
public abstract  void add(int field, int amount);
public abstract  void roll(int field, boolean up);
public  void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.util.TimeZone value) { throw new RuntimeException("Stub!"); }
public  java.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
public  void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  boolean isLenient() { throw new RuntimeException("Stub!"); }
public  void setFirstDayOfWeek(int value) { throw new RuntimeException("Stub!"); }
public  int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); }
public  void setMinimalDaysInFirstWeek(int value) { throw new RuntimeException("Stub!"); }
public  int getMinimalDaysInFirstWeek() { throw new RuntimeException("Stub!"); }
public  boolean isWeekDateSupported() { throw new RuntimeException("Stub!"); }
public  int getWeekYear() { throw new RuntimeException("Stub!"); }
public  void setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) { throw new RuntimeException("Stub!"); }
public  int getWeeksInWeekYear() { throw new RuntimeException("Stub!"); }
public abstract  int getMinimum(int field);
public abstract  int getMaximum(int field);
public abstract  int getGreatestMinimum(int field);
public abstract  int getLeastMaximum(int field);
public  int getActualMinimum(int field) { throw new RuntimeException("Stub!"); }
public  int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  java.time.Instant toInstant() { throw new RuntimeException("Stub!"); }
public static final int ALL_STYLES = 0;
public static final int AM = 0;
public static final int AM_PM = 9;
public static final int APRIL = 3;
public static final int AUGUST = 7;
public static final int DATE = 5;
public static final int DAY_OF_MONTH = 5;
public static final int DAY_OF_WEEK = 7;
public static final int DAY_OF_WEEK_IN_MONTH = 8;
public static final int DAY_OF_YEAR = 6;
public static final int DECEMBER = 11;
public static final int DST_OFFSET = 16;
public static final int ERA = 0;
public static final int FEBRUARY = 1;
public static final int FIELD_COUNT = 17;
public static final int FRIDAY = 6;
public static final int HOUR = 10;
public static final int HOUR_OF_DAY = 11;
public static final int JANUARY = 0;
public static final int JULY = 6;
public static final int JUNE = 5;
public static final int LONG = 2;
public static final int LONG_FORMAT = 2;
public static final int LONG_STANDALONE = 32770;
public static final int MARCH = 2;
public static final int MAY = 4;
public static final int MILLISECOND = 14;
public static final int MINUTE = 12;
public static final int MONDAY = 2;
public static final int MONTH = 2;
public static final int NARROW_FORMAT = 4;
public static final int NARROW_STANDALONE = 32772;
public static final int NOVEMBER = 10;
public static final int OCTOBER = 9;
public static final int PM = 1;
public static final int SATURDAY = 7;
public static final int SECOND = 13;
public static final int SEPTEMBER = 8;
public static final int SHORT = 1;
public static final int SHORT_FORMAT = 1;
public static final int SHORT_STANDALONE = 32769;
public static final int SUNDAY = 1;
public static final int THURSDAY = 5;
public static final int TUESDAY = 3;
public static final int UNDECIMBER = 12;
public static final int WEDNESDAY = 4;
public static final int WEEK_OF_MONTH = 4;
public static final int WEEK_OF_YEAR = 3;
public static final int YEAR = 1;
public static final int ZONE_OFFSET = 15;
@java.lang.SuppressWarnings(value={"ProtectedField"})
protected boolean areFieldsSet;
@java.lang.SuppressWarnings(value={"ProtectedField"})
protected int[] fields = null;
@java.lang.SuppressWarnings(value={"ProtectedField"})
protected boolean[] isSet = null;
@java.lang.SuppressWarnings(value={"ProtectedField"})
protected boolean isTimeSet;
@java.lang.SuppressWarnings(value={"ProtectedField"})
protected long time;
}
