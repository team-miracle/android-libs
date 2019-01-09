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
public abstract class DatagramSocketImpl
  implements java.net.SocketOptions
{
public  DatagramSocketImpl() { throw new RuntimeException("Stub!"); }
protected abstract  void create() throws java.net.SocketException;
protected abstract  void bind(int lport, java.net.InetAddress laddr) throws java.net.SocketException;
protected abstract  void send(java.net.DatagramPacket p) throws java.io.IOException;
protected  void connect(java.net.InetAddress address, int port) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
protected  void disconnect() { throw new RuntimeException("Stub!"); }
protected abstract  int peek(java.net.InetAddress i) throws java.io.IOException;
protected abstract  int peekData(java.net.DatagramPacket p) throws java.io.IOException;
protected abstract  void receive(java.net.DatagramPacket p) throws java.io.IOException;
@java.lang.Deprecated()
protected abstract  void setTTL(byte ttl) throws java.io.IOException;
@java.lang.Deprecated()
protected abstract  byte getTTL() throws java.io.IOException;
protected abstract  void setTimeToLive(int ttl) throws java.io.IOException;
protected abstract  int getTimeToLive() throws java.io.IOException;
protected abstract  void join(java.net.InetAddress inetaddr) throws java.io.IOException;
protected abstract  void leave(java.net.InetAddress inetaddr) throws java.io.IOException;
protected abstract  void joinGroup(java.net.SocketAddress mcastaddr, java.net.NetworkInterface netIf) throws java.io.IOException;
protected abstract  void leaveGroup(java.net.SocketAddress mcastaddr, java.net.NetworkInterface netIf) throws java.io.IOException;
protected abstract  void close();
protected  int getLocalPort() { throw new RuntimeException("Stub!"); }
protected  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
protected java.io.FileDescriptor fd;
protected int localPort;
}
