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

package java.sql;
public class DriverManager
{
DriverManager() { throw new RuntimeException("Stub!"); }
public static  java.io.PrintWriter getLogWriter() { throw new RuntimeException("Stub!"); }
public static  void setLogWriter(java.io.PrintWriter out) { throw new RuntimeException("Stub!"); }
public static  java.sql.Connection getConnection(java.lang.String url, java.util.Properties info) throws java.sql.SQLException { throw new RuntimeException("Stub!"); }
public static  java.sql.Connection getConnection(java.lang.String url, java.lang.String user, java.lang.String password) throws java.sql.SQLException { throw new RuntimeException("Stub!"); }
public static  java.sql.Connection getConnection(java.lang.String url) throws java.sql.SQLException { throw new RuntimeException("Stub!"); }
public static  java.sql.Driver getDriver(java.lang.String url) throws java.sql.SQLException { throw new RuntimeException("Stub!"); }
public static synchronized  void registerDriver(java.sql.Driver driver) throws java.sql.SQLException { throw new RuntimeException("Stub!"); }
public static synchronized  void deregisterDriver(java.sql.Driver driver) throws java.sql.SQLException { throw new RuntimeException("Stub!"); }
public static  java.util.Enumeration<java.sql.Driver> getDrivers() { throw new RuntimeException("Stub!"); }
public static  void setLoginTimeout(int seconds) { throw new RuntimeException("Stub!"); }
public static  int getLoginTimeout() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void setLogStream(java.io.PrintStream out) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.io.PrintStream getLogStream() { throw new RuntimeException("Stub!"); }
public static  void println(java.lang.String message) { throw new RuntimeException("Stub!"); }
}
