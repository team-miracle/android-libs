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
public interface CallableStatement
  extends java.sql.PreparedStatement
{
public abstract  void registerOutParameter(int parameterIndex, int sqlType) throws java.sql.SQLException;
public abstract  void registerOutParameter(int parameterIndex, int sqlType, int scale) throws java.sql.SQLException;
public abstract  boolean wasNull() throws java.sql.SQLException;
public abstract  java.lang.String getString(int parameterIndex) throws java.sql.SQLException;
public abstract  boolean getBoolean(int parameterIndex) throws java.sql.SQLException;
public abstract  byte getByte(int parameterIndex) throws java.sql.SQLException;
public abstract  short getShort(int parameterIndex) throws java.sql.SQLException;
public abstract  int getInt(int parameterIndex) throws java.sql.SQLException;
public abstract  long getLong(int parameterIndex) throws java.sql.SQLException;
public abstract  float getFloat(int parameterIndex) throws java.sql.SQLException;
public abstract  double getDouble(int parameterIndex) throws java.sql.SQLException;
@java.lang.Deprecated()
public abstract  java.math.BigDecimal getBigDecimal(int parameterIndex, int scale) throws java.sql.SQLException;
public abstract  byte[] getBytes(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(int parameterIndex) throws java.sql.SQLException;
public abstract  java.lang.Object getObject(int parameterIndex) throws java.sql.SQLException;
public abstract  java.math.BigDecimal getBigDecimal(int parameterIndex) throws java.sql.SQLException;
public abstract  java.lang.Object getObject(int parameterIndex, java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  java.sql.Ref getRef(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Blob getBlob(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Clob getClob(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Array getArray(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(int parameterIndex, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(int parameterIndex, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(int parameterIndex, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void registerOutParameter(int parameterIndex, int sqlType, java.lang.String typeName) throws java.sql.SQLException;
public abstract  void registerOutParameter(java.lang.String parameterName, int sqlType) throws java.sql.SQLException;
public abstract  void registerOutParameter(java.lang.String parameterName, int sqlType, int scale) throws java.sql.SQLException;
public abstract  void registerOutParameter(java.lang.String parameterName, int sqlType, java.lang.String typeName) throws java.sql.SQLException;
public abstract  java.net.URL getURL(int parameterIndex) throws java.sql.SQLException;
public abstract  void setURL(java.lang.String parameterName, java.net.URL val) throws java.sql.SQLException;
public abstract  void setNull(java.lang.String parameterName, int sqlType) throws java.sql.SQLException;
public abstract  void setBoolean(java.lang.String parameterName, boolean x) throws java.sql.SQLException;
public abstract  void setByte(java.lang.String parameterName, byte x) throws java.sql.SQLException;
public abstract  void setShort(java.lang.String parameterName, short x) throws java.sql.SQLException;
public abstract  void setInt(java.lang.String parameterName, int x) throws java.sql.SQLException;
public abstract  void setLong(java.lang.String parameterName, long x) throws java.sql.SQLException;
public abstract  void setFloat(java.lang.String parameterName, float x) throws java.sql.SQLException;
public abstract  void setDouble(java.lang.String parameterName, double x) throws java.sql.SQLException;
public abstract  void setBigDecimal(java.lang.String parameterName, java.math.BigDecimal x) throws java.sql.SQLException;
public abstract  void setString(java.lang.String parameterName, java.lang.String x) throws java.sql.SQLException;
public abstract  void setBytes(java.lang.String parameterName, byte[] x) throws java.sql.SQLException;
public abstract  void setDate(java.lang.String parameterName, java.sql.Date x) throws java.sql.SQLException;
public abstract  void setTime(java.lang.String parameterName, java.sql.Time x) throws java.sql.SQLException;
public abstract  void setTimestamp(java.lang.String parameterName, java.sql.Timestamp x) throws java.sql.SQLException;
public abstract  void setAsciiStream(java.lang.String parameterName, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void setBinaryStream(java.lang.String parameterName, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void setObject(java.lang.String parameterName, java.lang.Object x, int targetSqlType, int scale) throws java.sql.SQLException;
public abstract  void setObject(java.lang.String parameterName, java.lang.Object x, int targetSqlType) throws java.sql.SQLException;
public abstract  void setObject(java.lang.String parameterName, java.lang.Object x) throws java.sql.SQLException;
public abstract  void setCharacterStream(java.lang.String parameterName, java.io.Reader reader, int length) throws java.sql.SQLException;
public abstract  void setDate(java.lang.String parameterName, java.sql.Date x, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setTime(java.lang.String parameterName, java.sql.Time x, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setTimestamp(java.lang.String parameterName, java.sql.Timestamp x, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setNull(java.lang.String parameterName, int sqlType, java.lang.String typeName) throws java.sql.SQLException;
public abstract  java.lang.String getString(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  boolean getBoolean(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  byte getByte(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  short getShort(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  int getInt(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  long getLong(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  float getFloat(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  double getDouble(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  byte[] getBytes(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.lang.Object getObject(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.math.BigDecimal getBigDecimal(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.lang.Object getObject(java.lang.String parameterName, java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  java.sql.Ref getRef(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Blob getBlob(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Clob getClob(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Array getArray(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(java.lang.String parameterName, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(java.lang.String parameterName, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(java.lang.String parameterName, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.net.URL getURL(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.sql.RowId getRowId(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.RowId getRowId(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  void setRowId(java.lang.String parameterName, java.sql.RowId x) throws java.sql.SQLException;
public abstract  void setNString(java.lang.String parameterName, java.lang.String value) throws java.sql.SQLException;
public abstract  void setNCharacterStream(java.lang.String parameterName, java.io.Reader value, long length) throws java.sql.SQLException;
public abstract  void setNClob(java.lang.String parameterName, java.sql.NClob value) throws java.sql.SQLException;
public abstract  void setClob(java.lang.String parameterName, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void setBlob(java.lang.String parameterName, java.io.InputStream inputStream, long length) throws java.sql.SQLException;
public abstract  void setNClob(java.lang.String parameterName, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  java.sql.NClob getNClob(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.NClob getNClob(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  void setSQLXML(java.lang.String parameterName, java.sql.SQLXML xmlObject) throws java.sql.SQLException;
public abstract  java.sql.SQLXML getSQLXML(int parameterIndex) throws java.sql.SQLException;
public abstract  java.sql.SQLXML getSQLXML(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.lang.String getNString(int parameterIndex) throws java.sql.SQLException;
public abstract  java.lang.String getNString(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.io.Reader getNCharacterStream(int parameterIndex) throws java.sql.SQLException;
public abstract  java.io.Reader getNCharacterStream(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream(int parameterIndex) throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream(java.lang.String parameterName) throws java.sql.SQLException;
public abstract  void setBlob(java.lang.String parameterName, java.sql.Blob x) throws java.sql.SQLException;
public abstract  void setClob(java.lang.String parameterName, java.sql.Clob x) throws java.sql.SQLException;
public abstract  void setAsciiStream(java.lang.String parameterName, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void setBinaryStream(java.lang.String parameterName, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void setCharacterStream(java.lang.String parameterName, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void setAsciiStream(java.lang.String parameterName, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void setBinaryStream(java.lang.String parameterName, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void setCharacterStream(java.lang.String parameterName, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void setNCharacterStream(java.lang.String parameterName, java.io.Reader value) throws java.sql.SQLException;
public abstract  void setClob(java.lang.String parameterName, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void setBlob(java.lang.String parameterName, java.io.InputStream inputStream) throws java.sql.SQLException;
public abstract  void setNClob(java.lang.String parameterName, java.io.Reader reader) throws java.sql.SQLException;
}
