/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.util;
public class Date
  implements java.io.Serializable, java.lang.Cloneable, java.lang.Comparable<java.util.Date>
{
public  Date() { throw new RuntimeException("Stub!"); }
public  Date(long date) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  Date(int year, int month, int date) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  Date(int year, int month, int date, int hrs, int min) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  Date(int year, int month, int date, int hrs, int min, int sec) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  Date(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long UTC(int year, int month, int date, int hrs, int min, int sec) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long parse(java.lang.String s) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getYear() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setYear(int year) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getMonth() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setMonth(int month) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getDate() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setDate(int date) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getDay() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getHours() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setHours(int hours) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getMinutes() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setMinutes(int minutes) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getSeconds() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setSeconds(int seconds) { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public  void setTime(long time) { throw new RuntimeException("Stub!"); }
public  boolean before(java.util.Date when) { throw new RuntimeException("Stub!"); }
public  boolean after(java.util.Date when) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.util.Date anotherDate) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String toLocaleString() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String toGMTString() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getTimezoneOffset() { throw new RuntimeException("Stub!"); }
public static  java.util.Date from(java.time.Instant instant) { throw new RuntimeException("Stub!"); }
public  java.time.Instant toInstant() { throw new RuntimeException("Stub!"); }
}
