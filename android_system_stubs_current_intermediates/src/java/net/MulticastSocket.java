/*
* Copyright (c) 1995, 2014, Oracle and/or its affiliates. All rights reserved.
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
public class MulticastSocket
  extends java.net.DatagramSocket
{
public  MulticastSocket() throws java.io.IOException { super((java.net.DatagramSocketImpl)null); throw new RuntimeException("Stub!"); }
public  MulticastSocket(int port) throws java.io.IOException { super((java.net.DatagramSocketImpl)null); throw new RuntimeException("Stub!"); }
public  MulticastSocket(java.net.SocketAddress bindaddr) throws java.io.IOException { super((java.net.DatagramSocketImpl)null); throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setTTL(byte ttl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setTimeToLive(int ttl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  byte getTTL() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getTimeToLive() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void joinGroup(java.net.InetAddress mcastaddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void leaveGroup(java.net.InetAddress mcastaddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void joinGroup(java.net.SocketAddress mcastaddr, java.net.NetworkInterface netIf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void leaveGroup(java.net.SocketAddress mcastaddr, java.net.NetworkInterface netIf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setInterface(java.net.InetAddress inf) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getInterface() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setNetworkInterface(java.net.NetworkInterface netIf) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.net.NetworkInterface getNetworkInterface() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setLoopbackMode(boolean disable) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getLoopbackMode() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void send(java.net.DatagramPacket p, byte ttl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
