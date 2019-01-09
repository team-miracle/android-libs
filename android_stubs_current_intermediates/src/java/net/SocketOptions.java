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

package java.net;
public interface SocketOptions
{
public abstract  void setOption(int optID, java.lang.Object value) throws java.net.SocketException;
public abstract  java.lang.Object getOption(int optID) throws java.net.SocketException;
@java.lang.annotation.Native()
public static final int IP_MULTICAST_IF = 16;
@java.lang.annotation.Native()
public static final int IP_MULTICAST_IF2 = 31;
@java.lang.annotation.Native()
public static final int IP_MULTICAST_LOOP = 18;
@java.lang.annotation.Native()
public static final int IP_TOS = 3;
@java.lang.annotation.Native()
public static final int SO_BINDADDR = 15;
@java.lang.annotation.Native()
public static final int SO_BROADCAST = 32;
@java.lang.annotation.Native()
public static final int SO_KEEPALIVE = 8;
@java.lang.annotation.Native()
public static final int SO_LINGER = 128;
@java.lang.annotation.Native()
public static final int SO_OOBINLINE = 4099;
@java.lang.annotation.Native()
public static final int SO_RCVBUF = 4098;
@java.lang.annotation.Native()
public static final int SO_REUSEADDR = 4;
@java.lang.annotation.Native()
public static final int SO_SNDBUF = 4097;
@java.lang.annotation.Native()
public static final int SO_TIMEOUT = 4102;
@java.lang.annotation.Native()
public static final int TCP_NODELAY = 1;
}
