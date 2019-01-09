/*
* Copyright (c) 2000, 2005, Oracle and/or its affiliates. All rights reserved.
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

package javax.sql;
public interface RowSetMetaData
  extends java.sql.ResultSetMetaData
{
public abstract  void setColumnCount(int columnCount) throws java.sql.SQLException;
public abstract  void setAutoIncrement(int columnIndex, boolean property) throws java.sql.SQLException;
public abstract  void setCaseSensitive(int columnIndex, boolean property) throws java.sql.SQLException;
public abstract  void setSearchable(int columnIndex, boolean property) throws java.sql.SQLException;
public abstract  void setCurrency(int columnIndex, boolean property) throws java.sql.SQLException;
public abstract  void setNullable(int columnIndex, int property) throws java.sql.SQLException;
public abstract  void setSigned(int columnIndex, boolean property) throws java.sql.SQLException;
public abstract  void setColumnDisplaySize(int columnIndex, int size) throws java.sql.SQLException;
public abstract  void setColumnLabel(int columnIndex, java.lang.String label) throws java.sql.SQLException;
public abstract  void setColumnName(int columnIndex, java.lang.String columnName) throws java.sql.SQLException;
public abstract  void setSchemaName(int columnIndex, java.lang.String schemaName) throws java.sql.SQLException;
public abstract  void setPrecision(int columnIndex, int precision) throws java.sql.SQLException;
public abstract  void setScale(int columnIndex, int scale) throws java.sql.SQLException;
public abstract  void setTableName(int columnIndex, java.lang.String tableName) throws java.sql.SQLException;
public abstract  void setCatalogName(int columnIndex, java.lang.String catalogName) throws java.sql.SQLException;
public abstract  void setColumnType(int columnIndex, int SQLType) throws java.sql.SQLException;
public abstract  void setColumnTypeName(int columnIndex, java.lang.String typeName) throws java.sql.SQLException;
}
