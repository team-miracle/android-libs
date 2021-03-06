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
public interface Clob
{
public abstract  long length() throws java.sql.SQLException;
public abstract  java.lang.String getSubString(long pos, int length) throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream() throws java.sql.SQLException;
public abstract  java.io.InputStream getAsciiStream() throws java.sql.SQLException;
public abstract  long position(java.lang.String searchstr, long start) throws java.sql.SQLException;
public abstract  long position(java.sql.Clob searchstr, long start) throws java.sql.SQLException;
public abstract  int setString(long pos, java.lang.String str) throws java.sql.SQLException;
public abstract  int setString(long pos, java.lang.String str, int offset, int len) throws java.sql.SQLException;
public abstract  java.io.OutputStream setAsciiStream(long pos) throws java.sql.SQLException;
public abstract  java.io.Writer setCharacterStream(long pos) throws java.sql.SQLException;
public abstract  void truncate(long len) throws java.sql.SQLException;
public abstract  void free() throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream(long pos, long length) throws java.sql.SQLException;
}
