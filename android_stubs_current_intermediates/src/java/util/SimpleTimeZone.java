/*
* Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
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

package java.util;
public class SimpleTimeZone
  extends java.util.TimeZone
{
public  SimpleTimeZone(int rawOffset, java.lang.String ID) { throw new RuntimeException("Stub!"); }
public  SimpleTimeZone(int rawOffset, java.lang.String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime) { throw new RuntimeException("Stub!"); }
public  SimpleTimeZone(int rawOffset, java.lang.String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime, int dstSavings) { throw new RuntimeException("Stub!"); }
public  SimpleTimeZone(int rawOffset, java.lang.String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int startTimeMode, int endMonth, int endDay, int endDayOfWeek, int endTime, int endTimeMode, int dstSavings) { throw new RuntimeException("Stub!"); }
public  void setStartYear(int year) { throw new RuntimeException("Stub!"); }
public  void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime) { throw new RuntimeException("Stub!"); }
public  void setStartRule(int startMonth, int startDay, int startTime) { throw new RuntimeException("Stub!"); }
public  void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime, boolean after) { throw new RuntimeException("Stub!"); }
public  void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime) { throw new RuntimeException("Stub!"); }
public  void setEndRule(int endMonth, int endDay, int endTime) { throw new RuntimeException("Stub!"); }
public  void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime, boolean after) { throw new RuntimeException("Stub!"); }
public  int getOffset(long date) { throw new RuntimeException("Stub!"); }
public  int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) { throw new RuntimeException("Stub!"); }
public  int getRawOffset() { throw new RuntimeException("Stub!"); }
public  void setRawOffset(int offsetMillis) { throw new RuntimeException("Stub!"); }
public  void setDSTSavings(int millisSavedDuringDST) { throw new RuntimeException("Stub!"); }
public  int getDSTSavings() { throw new RuntimeException("Stub!"); }
public  boolean useDaylightTime() { throw new RuntimeException("Stub!"); }
public  boolean observesDaylightTime() { throw new RuntimeException("Stub!"); }
public  boolean inDaylightTime(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public synchronized  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  boolean hasSameRules(java.util.TimeZone other) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int STANDARD_TIME = 1;
public static final int UTC_TIME = 2;
public static final int WALL_TIME = 0;
}
