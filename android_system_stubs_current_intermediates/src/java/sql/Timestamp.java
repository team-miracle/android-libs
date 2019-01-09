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

package java.sql;
public class Timestamp
  extends java.util.Date
{
@java.lang.Deprecated()
public  Timestamp(int year, int month, int date, int hour, int minute, int second, int nano) { throw new RuntimeException("Stub!"); }
public  Timestamp(long time) { throw new RuntimeException("Stub!"); }
public  void setTime(long time) { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public static  java.sql.Timestamp valueOf(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getNanos() { throw new RuntimeException("Stub!"); }
public  void setNanos(int n) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.sql.Timestamp ts) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ts) { throw new RuntimeException("Stub!"); }
public  boolean before(java.sql.Timestamp ts) { throw new RuntimeException("Stub!"); }
public  boolean after(java.sql.Timestamp ts) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.sql.Timestamp ts) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.util.Date o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
