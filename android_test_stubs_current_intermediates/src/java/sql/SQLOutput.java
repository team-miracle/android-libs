/*
* Copyright (c) 1998, 2006, Oracle and/or its affiliates. All rights reserved.
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
public interface SQLOutput
{
public abstract  void writeString(java.lang.String x) throws java.sql.SQLException;
public abstract  void writeBoolean(boolean x) throws java.sql.SQLException;
public abstract  void writeByte(byte x) throws java.sql.SQLException;
public abstract  void writeShort(short x) throws java.sql.SQLException;
public abstract  void writeInt(int x) throws java.sql.SQLException;
public abstract  void writeLong(long x) throws java.sql.SQLException;
public abstract  void writeFloat(float x) throws java.sql.SQLException;
public abstract  void writeDouble(double x) throws java.sql.SQLException;
public abstract  void writeBigDecimal(java.math.BigDecimal x) throws java.sql.SQLException;
public abstract  void writeBytes(byte[] x) throws java.sql.SQLException;
public abstract  void writeDate(java.sql.Date x) throws java.sql.SQLException;
public abstract  void writeTime(java.sql.Time x) throws java.sql.SQLException;
public abstract  void writeTimestamp(java.sql.Timestamp x) throws java.sql.SQLException;
public abstract  void writeCharacterStream(java.io.Reader x) throws java.sql.SQLException;
public abstract  void writeAsciiStream(java.io.InputStream x) throws java.sql.SQLException;
public abstract  void writeBinaryStream(java.io.InputStream x) throws java.sql.SQLException;
public abstract  void writeObject(java.sql.SQLData x) throws java.sql.SQLException;
public abstract  void writeRef(java.sql.Ref x) throws java.sql.SQLException;
public abstract  void writeBlob(java.sql.Blob x) throws java.sql.SQLException;
public abstract  void writeClob(java.sql.Clob x) throws java.sql.SQLException;
public abstract  void writeStruct(java.sql.Struct x) throws java.sql.SQLException;
public abstract  void writeArray(java.sql.Array x) throws java.sql.SQLException;
public abstract  void writeURL(java.net.URL x) throws java.sql.SQLException;
public abstract  void writeNString(java.lang.String x) throws java.sql.SQLException;
public abstract  void writeNClob(java.sql.NClob x) throws java.sql.SQLException;
public abstract  void writeRowId(java.sql.RowId x) throws java.sql.SQLException;
public abstract  void writeSQLXML(java.sql.SQLXML x) throws java.sql.SQLException;
}
