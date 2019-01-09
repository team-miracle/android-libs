/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2010, Oracle and/or its affiliates. All rights reserved.
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
public interface PreparedStatement
  extends java.sql.Statement
{
public abstract  java.sql.ResultSet executeQuery() throws java.sql.SQLException;
public abstract  int executeUpdate() throws java.sql.SQLException;
public abstract  void setNull(int parameterIndex, int sqlType) throws java.sql.SQLException;
public abstract  void setBoolean(int parameterIndex, boolean x) throws java.sql.SQLException;
public abstract  void setByte(int parameterIndex, byte x) throws java.sql.SQLException;
public abstract  void setShort(int parameterIndex, short x) throws java.sql.SQLException;
public abstract  void setInt(int parameterIndex, int x) throws java.sql.SQLException;
public abstract  void setLong(int parameterIndex, long x) throws java.sql.SQLException;
public abstract  void setFloat(int parameterIndex, float x) throws java.sql.SQLException;
public abstract  void setDouble(int parameterIndex, double x) throws java.sql.SQLException;
public abstract  void setBigDecimal(int parameterIndex, java.math.BigDecimal x) throws java.sql.SQLException;
public abstract  void setString(int parameterIndex, java.lang.String x) throws java.sql.SQLException;
public abstract  void setBytes(int parameterIndex, byte[] x) throws java.sql.SQLException;
public abstract  void setDate(int parameterIndex, java.sql.Date x) throws java.sql.SQLException;
public abstract  void setTime(int parameterIndex, java.sql.Time x) throws java.sql.SQLException;
public abstract  void setTimestamp(int parameterIndex, java.sql.Timestamp x) throws java.sql.SQLException;
public abstract  void setAsciiStream(int parameterIndex, java.io.InputStream x, int length) throws java.sql.SQLException;
@java.lang.Deprecated()
public abstract  void setUnicodeStream(int parameterIndex, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void setBinaryStream(int parameterIndex, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void clearParameters() throws java.sql.SQLException;
public abstract  void setObject(int parameterIndex, java.lang.Object x, int targetSqlType) throws java.sql.SQLException;
public abstract  void setObject(int parameterIndex, java.lang.Object x) throws java.sql.SQLException;
public abstract  boolean execute() throws java.sql.SQLException;
public abstract  void addBatch() throws java.sql.SQLException;
public abstract  void setCharacterStream(int parameterIndex, java.io.Reader reader, int length) throws java.sql.SQLException;
public abstract  void setRef(int parameterIndex, java.sql.Ref x) throws java.sql.SQLException;
public abstract  void setBlob(int parameterIndex, java.sql.Blob x) throws java.sql.SQLException;
public abstract  void setClob(int parameterIndex, java.sql.Clob x) throws java.sql.SQLException;
public abstract  void setArray(int parameterIndex, java.sql.Array x) throws java.sql.SQLException;
public abstract  java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException;
public abstract  void setDate(int parameterIndex, java.sql.Date x, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setTime(int parameterIndex, java.sql.Time x, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setTimestamp(int parameterIndex, java.sql.Timestamp x, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setNull(int parameterIndex, int sqlType, java.lang.String typeName) throws java.sql.SQLException;
public abstract  void setURL(int parameterIndex, java.net.URL x) throws java.sql.SQLException;
public abstract  java.sql.ParameterMetaData getParameterMetaData() throws java.sql.SQLException;
public abstract  void setRowId(int parameterIndex, java.sql.RowId x) throws java.sql.SQLException;
public abstract  void setNString(int parameterIndex, java.lang.String value) throws java.sql.SQLException;
public abstract  void setNCharacterStream(int parameterIndex, java.io.Reader value, long length) throws java.sql.SQLException;
public abstract  void setNClob(int parameterIndex, java.sql.NClob value) throws java.sql.SQLException;
public abstract  void setClob(int parameterIndex, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void setBlob(int parameterIndex, java.io.InputStream inputStream, long length) throws java.sql.SQLException;
public abstract  void setNClob(int parameterIndex, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void setSQLXML(int parameterIndex, java.sql.SQLXML xmlObject) throws java.sql.SQLException;
public abstract  void setObject(int parameterIndex, java.lang.Object x, int targetSqlType, int scaleOrLength) throws java.sql.SQLException;
public abstract  void setAsciiStream(int parameterIndex, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void setBinaryStream(int parameterIndex, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void setCharacterStream(int parameterIndex, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void setAsciiStream(int parameterIndex, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void setBinaryStream(int parameterIndex, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void setCharacterStream(int parameterIndex, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void setNCharacterStream(int parameterIndex, java.io.Reader value) throws java.sql.SQLException;
public abstract  void setClob(int parameterIndex, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void setBlob(int parameterIndex, java.io.InputStream inputStream) throws java.sql.SQLException;
public abstract  void setNClob(int parameterIndex, java.io.Reader reader) throws java.sql.SQLException;
}
