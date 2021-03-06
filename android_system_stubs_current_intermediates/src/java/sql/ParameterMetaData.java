/*
* Copyright (c) 2000, 2006, Oracle and/or its affiliates. All rights reserved.
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
public interface ParameterMetaData
  extends java.sql.Wrapper
{
public abstract  int getParameterCount() throws java.sql.SQLException;
public abstract  int isNullable(int param) throws java.sql.SQLException;
public abstract  boolean isSigned(int param) throws java.sql.SQLException;
public abstract  int getPrecision(int param) throws java.sql.SQLException;
public abstract  int getScale(int param) throws java.sql.SQLException;
public abstract  int getParameterType(int param) throws java.sql.SQLException;
public abstract  java.lang.String getParameterTypeName(int param) throws java.sql.SQLException;
public abstract  java.lang.String getParameterClassName(int param) throws java.sql.SQLException;
public abstract  int getParameterMode(int param) throws java.sql.SQLException;
public static final int parameterModeIn = 1;
public static final int parameterModeInOut = 2;
public static final int parameterModeOut = 4;
public static final int parameterModeUnknown = 0;
public static final int parameterNoNulls = 0;
public static final int parameterNullable = 1;
public static final int parameterNullableUnknown = 2;
}
