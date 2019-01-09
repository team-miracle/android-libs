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
public interface ResultSet
  extends java.sql.Wrapper, java.lang.AutoCloseable
{
public abstract  boolean next() throws java.sql.SQLException;
public abstract  void close() throws java.sql.SQLException;
public abstract  boolean wasNull() throws java.sql.SQLException;
public abstract  java.lang.String getString(int columnIndex) throws java.sql.SQLException;
public abstract  boolean getBoolean(int columnIndex) throws java.sql.SQLException;
public abstract  byte getByte(int columnIndex) throws java.sql.SQLException;
public abstract  short getShort(int columnIndex) throws java.sql.SQLException;
public abstract  int getInt(int columnIndex) throws java.sql.SQLException;
public abstract  long getLong(int columnIndex) throws java.sql.SQLException;
public abstract  float getFloat(int columnIndex) throws java.sql.SQLException;
public abstract  double getDouble(int columnIndex) throws java.sql.SQLException;
@java.lang.Deprecated()
public abstract  java.math.BigDecimal getBigDecimal(int columnIndex, int scale) throws java.sql.SQLException;
public abstract  byte[] getBytes(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(int columnIndex) throws java.sql.SQLException;
public abstract  java.io.InputStream getAsciiStream(int columnIndex) throws java.sql.SQLException;
@java.lang.Deprecated()
public abstract  java.io.InputStream getUnicodeStream(int columnIndex) throws java.sql.SQLException;
public abstract  java.io.InputStream getBinaryStream(int columnIndex) throws java.sql.SQLException;
public abstract  java.lang.String getString(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  boolean getBoolean(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  byte getByte(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  short getShort(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  int getInt(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  long getLong(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  float getFloat(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  double getDouble(java.lang.String columnLabel) throws java.sql.SQLException;
@java.lang.Deprecated()
public abstract  java.math.BigDecimal getBigDecimal(java.lang.String columnLabel, int scale) throws java.sql.SQLException;
public abstract  byte[] getBytes(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.io.InputStream getAsciiStream(java.lang.String columnLabel) throws java.sql.SQLException;
@java.lang.Deprecated()
public abstract  java.io.InputStream getUnicodeStream(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.io.InputStream getBinaryStream(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.SQLWarning getWarnings() throws java.sql.SQLException;
public abstract  void clearWarnings() throws java.sql.SQLException;
public abstract  java.lang.String getCursorName() throws java.sql.SQLException;
public abstract  java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException;
public abstract  java.lang.Object getObject(int columnIndex) throws java.sql.SQLException;
public abstract  java.lang.Object getObject(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  int findColumn(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream(int columnIndex) throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.math.BigDecimal getBigDecimal(int columnIndex) throws java.sql.SQLException;
public abstract  java.math.BigDecimal getBigDecimal(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  boolean isBeforeFirst() throws java.sql.SQLException;
public abstract  boolean isAfterLast() throws java.sql.SQLException;
public abstract  boolean isFirst() throws java.sql.SQLException;
public abstract  boolean isLast() throws java.sql.SQLException;
public abstract  void beforeFirst() throws java.sql.SQLException;
public abstract  void afterLast() throws java.sql.SQLException;
public abstract  boolean first() throws java.sql.SQLException;
public abstract  boolean last() throws java.sql.SQLException;
public abstract  int getRow() throws java.sql.SQLException;
public abstract  boolean absolute(int row) throws java.sql.SQLException;
public abstract  boolean relative(int rows) throws java.sql.SQLException;
public abstract  boolean previous() throws java.sql.SQLException;
public abstract  void setFetchDirection(int direction) throws java.sql.SQLException;
public abstract  int getFetchDirection() throws java.sql.SQLException;
public abstract  void setFetchSize(int rows) throws java.sql.SQLException;
public abstract  int getFetchSize() throws java.sql.SQLException;
public abstract  int getType() throws java.sql.SQLException;
public abstract  int getConcurrency() throws java.sql.SQLException;
public abstract  boolean rowUpdated() throws java.sql.SQLException;
public abstract  boolean rowInserted() throws java.sql.SQLException;
public abstract  boolean rowDeleted() throws java.sql.SQLException;
public abstract  void updateNull(int columnIndex) throws java.sql.SQLException;
public abstract  void updateBoolean(int columnIndex, boolean x) throws java.sql.SQLException;
public abstract  void updateByte(int columnIndex, byte x) throws java.sql.SQLException;
public abstract  void updateShort(int columnIndex, short x) throws java.sql.SQLException;
public abstract  void updateInt(int columnIndex, int x) throws java.sql.SQLException;
public abstract  void updateLong(int columnIndex, long x) throws java.sql.SQLException;
public abstract  void updateFloat(int columnIndex, float x) throws java.sql.SQLException;
public abstract  void updateDouble(int columnIndex, double x) throws java.sql.SQLException;
public abstract  void updateBigDecimal(int columnIndex, java.math.BigDecimal x) throws java.sql.SQLException;
public abstract  void updateString(int columnIndex, java.lang.String x) throws java.sql.SQLException;
public abstract  void updateBytes(int columnIndex, byte[] x) throws java.sql.SQLException;
public abstract  void updateDate(int columnIndex, java.sql.Date x) throws java.sql.SQLException;
public abstract  void updateTime(int columnIndex, java.sql.Time x) throws java.sql.SQLException;
public abstract  void updateTimestamp(int columnIndex, java.sql.Timestamp x) throws java.sql.SQLException;
public abstract  void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void updateCharacterStream(int columnIndex, java.io.Reader x, int length) throws java.sql.SQLException;
public abstract  void updateObject(int columnIndex, java.lang.Object x, int scaleOrLength) throws java.sql.SQLException;
public abstract  void updateObject(int columnIndex, java.lang.Object x) throws java.sql.SQLException;
public abstract  void updateNull(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  void updateBoolean(java.lang.String columnLabel, boolean x) throws java.sql.SQLException;
public abstract  void updateByte(java.lang.String columnLabel, byte x) throws java.sql.SQLException;
public abstract  void updateShort(java.lang.String columnLabel, short x) throws java.sql.SQLException;
public abstract  void updateInt(java.lang.String columnLabel, int x) throws java.sql.SQLException;
public abstract  void updateLong(java.lang.String columnLabel, long x) throws java.sql.SQLException;
public abstract  void updateFloat(java.lang.String columnLabel, float x) throws java.sql.SQLException;
public abstract  void updateDouble(java.lang.String columnLabel, double x) throws java.sql.SQLException;
public abstract  void updateBigDecimal(java.lang.String columnLabel, java.math.BigDecimal x) throws java.sql.SQLException;
public abstract  void updateString(java.lang.String columnLabel, java.lang.String x) throws java.sql.SQLException;
public abstract  void updateBytes(java.lang.String columnLabel, byte[] x) throws java.sql.SQLException;
public abstract  void updateDate(java.lang.String columnLabel, java.sql.Date x) throws java.sql.SQLException;
public abstract  void updateTime(java.lang.String columnLabel, java.sql.Time x) throws java.sql.SQLException;
public abstract  void updateTimestamp(java.lang.String columnLabel, java.sql.Timestamp x) throws java.sql.SQLException;
public abstract  void updateAsciiStream(java.lang.String columnLabel, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void updateBinaryStream(java.lang.String columnLabel, java.io.InputStream x, int length) throws java.sql.SQLException;
public abstract  void updateCharacterStream(java.lang.String columnLabel, java.io.Reader reader, int length) throws java.sql.SQLException;
public abstract  void updateObject(java.lang.String columnLabel, java.lang.Object x, int scaleOrLength) throws java.sql.SQLException;
public abstract  void updateObject(java.lang.String columnLabel, java.lang.Object x) throws java.sql.SQLException;
public abstract  void insertRow() throws java.sql.SQLException;
public abstract  void updateRow() throws java.sql.SQLException;
public abstract  void deleteRow() throws java.sql.SQLException;
public abstract  void refreshRow() throws java.sql.SQLException;
public abstract  void cancelRowUpdates() throws java.sql.SQLException;
public abstract  void moveToInsertRow() throws java.sql.SQLException;
public abstract  void moveToCurrentRow() throws java.sql.SQLException;
public abstract  java.sql.Statement getStatement() throws java.sql.SQLException;
public abstract  java.lang.Object getObject(int columnIndex, java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  java.sql.Ref getRef(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.Blob getBlob(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.Clob getClob(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.Array getArray(int columnIndex) throws java.sql.SQLException;
public abstract  java.lang.Object getObject(java.lang.String columnLabel, java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  java.sql.Ref getRef(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Blob getBlob(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Clob getClob(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Array getArray(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(int columnIndex, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Date getDate(java.lang.String columnLabel, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(int columnIndex, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Time getTime(java.lang.String columnLabel, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(int columnIndex, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.sql.Timestamp getTimestamp(java.lang.String columnLabel, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  java.net.URL getURL(int columnIndex) throws java.sql.SQLException;
public abstract  java.net.URL getURL(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  void updateRef(int columnIndex, java.sql.Ref x) throws java.sql.SQLException;
public abstract  void updateRef(java.lang.String columnLabel, java.sql.Ref x) throws java.sql.SQLException;
public abstract  void updateBlob(int columnIndex, java.sql.Blob x) throws java.sql.SQLException;
public abstract  void updateBlob(java.lang.String columnLabel, java.sql.Blob x) throws java.sql.SQLException;
public abstract  void updateClob(int columnIndex, java.sql.Clob x) throws java.sql.SQLException;
public abstract  void updateClob(java.lang.String columnLabel, java.sql.Clob x) throws java.sql.SQLException;
public abstract  void updateArray(int columnIndex, java.sql.Array x) throws java.sql.SQLException;
public abstract  void updateArray(java.lang.String columnLabel, java.sql.Array x) throws java.sql.SQLException;
public abstract  java.sql.RowId getRowId(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.RowId getRowId(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  void updateRowId(int columnIndex, java.sql.RowId x) throws java.sql.SQLException;
public abstract  void updateRowId(java.lang.String columnLabel, java.sql.RowId x) throws java.sql.SQLException;
public abstract  int getHoldability() throws java.sql.SQLException;
public abstract  boolean isClosed() throws java.sql.SQLException;
public abstract  void updateNString(int columnIndex, java.lang.String nString) throws java.sql.SQLException;
public abstract  void updateNString(java.lang.String columnLabel, java.lang.String nString) throws java.sql.SQLException;
public abstract  void updateNClob(int columnIndex, java.sql.NClob nClob) throws java.sql.SQLException;
public abstract  void updateNClob(java.lang.String columnLabel, java.sql.NClob nClob) throws java.sql.SQLException;
public abstract  java.sql.NClob getNClob(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.NClob getNClob(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.sql.SQLXML getSQLXML(int columnIndex) throws java.sql.SQLException;
public abstract  java.sql.SQLXML getSQLXML(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  void updateSQLXML(int columnIndex, java.sql.SQLXML xmlObject) throws java.sql.SQLException;
public abstract  void updateSQLXML(java.lang.String columnLabel, java.sql.SQLXML xmlObject) throws java.sql.SQLException;
public abstract  java.lang.String getNString(int columnIndex) throws java.sql.SQLException;
public abstract  java.lang.String getNString(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  java.io.Reader getNCharacterStream(int columnIndex) throws java.sql.SQLException;
public abstract  java.io.Reader getNCharacterStream(java.lang.String columnLabel) throws java.sql.SQLException;
public abstract  void updateNCharacterStream(int columnIndex, java.io.Reader x, long length) throws java.sql.SQLException;
public abstract  void updateNCharacterStream(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void updateCharacterStream(int columnIndex, java.io.Reader x, long length) throws java.sql.SQLException;
public abstract  void updateAsciiStream(java.lang.String columnLabel, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void updateBinaryStream(java.lang.String columnLabel, java.io.InputStream x, long length) throws java.sql.SQLException;
public abstract  void updateCharacterStream(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void updateBlob(int columnIndex, java.io.InputStream inputStream, long length) throws java.sql.SQLException;
public abstract  void updateBlob(java.lang.String columnLabel, java.io.InputStream inputStream, long length) throws java.sql.SQLException;
public abstract  void updateClob(int columnIndex, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void updateClob(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void updateNClob(int columnIndex, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void updateNClob(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;
public abstract  void updateNCharacterStream(int columnIndex, java.io.Reader x) throws java.sql.SQLException;
public abstract  void updateNCharacterStream(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void updateAsciiStream(int columnIndex, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void updateBinaryStream(int columnIndex, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void updateCharacterStream(int columnIndex, java.io.Reader x) throws java.sql.SQLException;
public abstract  void updateAsciiStream(java.lang.String columnLabel, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void updateBinaryStream(java.lang.String columnLabel, java.io.InputStream x) throws java.sql.SQLException;
public abstract  void updateCharacterStream(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void updateBlob(int columnIndex, java.io.InputStream inputStream) throws java.sql.SQLException;
public abstract  void updateBlob(java.lang.String columnLabel, java.io.InputStream inputStream) throws java.sql.SQLException;
public abstract  void updateClob(int columnIndex, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void updateClob(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void updateNClob(int columnIndex, java.io.Reader reader) throws java.sql.SQLException;
public abstract  void updateNClob(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;
public static final int CLOSE_CURSORS_AT_COMMIT = 2;
public static final int CONCUR_READ_ONLY = 1007;
public static final int CONCUR_UPDATABLE = 1008;
public static final int FETCH_FORWARD = 1000;
public static final int FETCH_REVERSE = 1001;
public static final int FETCH_UNKNOWN = 1002;
public static final int HOLD_CURSORS_OVER_COMMIT = 1;
public static final int TYPE_FORWARD_ONLY = 1003;
public static final int TYPE_SCROLL_INSENSITIVE = 1004;
public static final int TYPE_SCROLL_SENSITIVE = 1005;
}
