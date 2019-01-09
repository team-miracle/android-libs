/*
* Copyright (C) 2006 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.text.format;
@java.lang.Deprecated()
public class Time
{
public  Time(java.lang.String timezoneId) { throw new RuntimeException("Stub!"); }
public  Time() { throw new RuntimeException("Stub!"); }
public  Time(android.text.format.Time other) { throw new RuntimeException("Stub!"); }
public  long normalize(boolean ignoreDst) { throw new RuntimeException("Stub!"); }
public  void switchTimezone(java.lang.String timezone) { throw new RuntimeException("Stub!"); }
public  int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
public  void clear(java.lang.String timezoneId) { throw new RuntimeException("Stub!"); }
public static  int compare(android.text.format.Time a, android.text.format.Time b) { throw new RuntimeException("Stub!"); }
public  java.lang.String format(java.lang.String format) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean parse(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  boolean parse3339(java.lang.String s) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCurrentTimezone() { throw new RuntimeException("Stub!"); }
public  void setToNow() { throw new RuntimeException("Stub!"); }
public  long toMillis(boolean ignoreDst) { throw new RuntimeException("Stub!"); }
public  void set(long millis) { throw new RuntimeException("Stub!"); }
public  java.lang.String format2445() { throw new RuntimeException("Stub!"); }
public  void set(android.text.format.Time that) { throw new RuntimeException("Stub!"); }
public  void set(int second, int minute, int hour, int monthDay, int month, int year) { throw new RuntimeException("Stub!"); }
public  void set(int monthDay, int month, int year) { throw new RuntimeException("Stub!"); }
public  boolean before(android.text.format.Time that) { throw new RuntimeException("Stub!"); }
public  boolean after(android.text.format.Time that) { throw new RuntimeException("Stub!"); }
public  int getWeekNumber() { throw new RuntimeException("Stub!"); }
public  java.lang.String format3339(boolean allDay) { throw new RuntimeException("Stub!"); }
public static  boolean isEpoch(android.text.format.Time time) { throw new RuntimeException("Stub!"); }
public static  int getJulianDay(long millis, long gmtoff) { throw new RuntimeException("Stub!"); }
public  long setJulianDay(int julianDay) { throw new RuntimeException("Stub!"); }
public static  int getWeeksSinceEpochFromJulianDay(int julianDay, int firstDayOfWeek) { throw new RuntimeException("Stub!"); }
public static  int getJulianMondayFromWeeksSinceEpoch(int week) { throw new RuntimeException("Stub!"); }
public static final int EPOCH_JULIAN_DAY = 2440588;
public static final int FRIDAY = 5;
public static final int HOUR = 3;
public static final int MINUTE = 2;
public static final int MONDAY = 1;
public static final int MONDAY_BEFORE_JULIAN_EPOCH = 2440585;
public static final int MONTH = 5;
public static final int MONTH_DAY = 4;
public static final int SATURDAY = 6;
public static final int SECOND = 1;
public static final int SUNDAY = 0;
public static final int THURSDAY = 4;
public static final java.lang.String TIMEZONE_UTC = "UTC";
public static final int TUESDAY = 2;
public static final int WEDNESDAY = 3;
public static final int WEEK_DAY = 7;
public static final int WEEK_NUM = 9;
public static final int YEAR = 6;
public static final int YEAR_DAY = 8;
public boolean allDay;
public long gmtoff;
public int hour;
public int isDst;
public int minute;
public int month;
public int monthDay;
public int second;
public java.lang.String timezone;
public int weekDay;
public int year;
public int yearDay;
}
