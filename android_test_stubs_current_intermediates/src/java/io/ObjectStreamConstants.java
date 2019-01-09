/*
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

package java.io;
public interface ObjectStreamConstants
{
public static final int PROTOCOL_VERSION_1 = 1;
public static final int PROTOCOL_VERSION_2 = 2;
public static final byte SC_BLOCK_DATA = 8;
public static final byte SC_ENUM = 16;
public static final byte SC_EXTERNALIZABLE = 4;
public static final byte SC_SERIALIZABLE = 2;
public static final byte SC_WRITE_METHOD = 1;
public static final short STREAM_MAGIC = -21267;
public static final short STREAM_VERSION = 5;
public static final java.io.SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION = null;
public static final java.io.SerializablePermission SUBSTITUTION_PERMISSION = null;
public static final byte TC_ARRAY = 117;
public static final byte TC_BASE = 112;
public static final byte TC_BLOCKDATA = 119;
public static final byte TC_BLOCKDATALONG = 122;
public static final byte TC_CLASS = 118;
public static final byte TC_CLASSDESC = 114;
public static final byte TC_ENDBLOCKDATA = 120;
public static final byte TC_ENUM = 126;
public static final byte TC_EXCEPTION = 123;
public static final byte TC_LONGSTRING = 124;
public static final byte TC_MAX = 126;
public static final byte TC_NULL = 112;
public static final byte TC_OBJECT = 115;
public static final byte TC_PROXYCLASSDESC = 125;
public static final byte TC_REFERENCE = 113;
public static final byte TC_RESET = 121;
public static final byte TC_STRING = 116;
public static final int baseWireHandle = 8257536;
}
