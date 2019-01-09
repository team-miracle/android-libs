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
public class GregorianCalendar
  extends java.util.Calendar
{
public  GregorianCalendar() { throw new RuntimeException("Stub!"); }
public  GregorianCalendar(java.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
public  GregorianCalendar(java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public  GregorianCalendar(java.util.TimeZone zone, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
public  GregorianCalendar(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); }
public  GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); }
public  void setGregorianChange(java.util.Date date) { throw new RuntimeException("Stub!"); }
public final  java.util.Date getGregorianChange() { throw new RuntimeException("Stub!"); }
public  boolean isLeapYear(int year) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCalendarType() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void add(int field, int amount) { throw new RuntimeException("Stub!"); }
public  void roll(int field, boolean up) { throw new RuntimeException("Stub!"); }
public  void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
public  int getMinimum(int field) { throw new RuntimeException("Stub!"); }
public  int getMaximum(int field) { throw new RuntimeException("Stub!"); }
public  int getGreatestMinimum(int field) { throw new RuntimeException("Stub!"); }
public  int getLeastMaximum(int field) { throw new RuntimeException("Stub!"); }
public  int getActualMinimum(int field) { throw new RuntimeException("Stub!"); }
public  int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
public final  boolean isWeekDateSupported() { throw new RuntimeException("Stub!"); }
public  int getWeekYear() { throw new RuntimeException("Stub!"); }
public  void setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) { throw new RuntimeException("Stub!"); }
public  int getWeeksInWeekYear() { throw new RuntimeException("Stub!"); }
protected  void computeFields() { throw new RuntimeException("Stub!"); }
protected  void computeTime() { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime toZonedDateTime() { throw new RuntimeException("Stub!"); }
public static  java.util.GregorianCalendar from(java.time.ZonedDateTime zdt) { throw new RuntimeException("Stub!"); }
public static final int AD = 1;
public static final int BC = 0;
}
