/*
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
public interface Statement
  extends java.sql.Wrapper, java.lang.AutoCloseable
{
public abstract  java.sql.ResultSet executeQuery(java.lang.String sql) throws java.sql.SQLException;
public abstract  int executeUpdate(java.lang.String sql) throws java.sql.SQLException;
public abstract  void close() throws java.sql.SQLException;
public abstract  int getMaxFieldSize() throws java.sql.SQLException;
public abstract  void setMaxFieldSize(int max) throws java.sql.SQLException;
public abstract  int getMaxRows() throws java.sql.SQLException;
public abstract  void setMaxRows(int max) throws java.sql.SQLException;
public abstract  void setEscapeProcessing(boolean enable) throws java.sql.SQLException;
public abstract  int getQueryTimeout() throws java.sql.SQLException;
public abstract  void setQueryTimeout(int seconds) throws java.sql.SQLException;
public abstract  void cancel() throws java.sql.SQLException;
public abstract  java.sql.SQLWarning getWarnings() throws java.sql.SQLException;
public abstract  void clearWarnings() throws java.sql.SQLException;
public abstract  void setCursorName(java.lang.String name) throws java.sql.SQLException;
public abstract  boolean execute(java.lang.String sql) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getResultSet() throws java.sql.SQLException;
public abstract  int getUpdateCount() throws java.sql.SQLException;
public abstract  boolean getMoreResults() throws java.sql.SQLException;
public abstract  void setFetchDirection(int direction) throws java.sql.SQLException;
public abstract  int getFetchDirection() throws java.sql.SQLException;
public abstract  void setFetchSize(int rows) throws java.sql.SQLException;
public abstract  int getFetchSize() throws java.sql.SQLException;
public abstract  int getResultSetConcurrency() throws java.sql.SQLException;
public abstract  int getResultSetType() throws java.sql.SQLException;
public abstract  void addBatch(java.lang.String sql) throws java.sql.SQLException;
public abstract  void clearBatch() throws java.sql.SQLException;
public abstract  int[] executeBatch() throws java.sql.SQLException;
public abstract  java.sql.Connection getConnection() throws java.sql.SQLException;
public abstract  boolean getMoreResults(int current) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getGeneratedKeys() throws java.sql.SQLException;
public abstract  int executeUpdate(java.lang.String sql, int autoGeneratedKeys) throws java.sql.SQLException;
public abstract  int executeUpdate(java.lang.String sql, int[] columnIndexes) throws java.sql.SQLException;
public abstract  int executeUpdate(java.lang.String sql, java.lang.String[] columnNames) throws java.sql.SQLException;
public abstract  boolean execute(java.lang.String sql, int autoGeneratedKeys) throws java.sql.SQLException;
public abstract  boolean execute(java.lang.String sql, int[] columnIndexes) throws java.sql.SQLException;
public abstract  boolean execute(java.lang.String sql, java.lang.String[] columnNames) throws java.sql.SQLException;
public abstract  int getResultSetHoldability() throws java.sql.SQLException;
public abstract  boolean isClosed() throws java.sql.SQLException;
public abstract  void setPoolable(boolean poolable) throws java.sql.SQLException;
public abstract  boolean isPoolable() throws java.sql.SQLException;
public static final int CLOSE_ALL_RESULTS = 3;
public static final int CLOSE_CURRENT_RESULT = 1;
public static final int EXECUTE_FAILED = -3;
public static final int KEEP_CURRENT_RESULT = 2;
public static final int NO_GENERATED_KEYS = 2;
public static final int RETURN_GENERATED_KEYS = 1;
public static final int SUCCESS_NO_INFO = -2;
}
