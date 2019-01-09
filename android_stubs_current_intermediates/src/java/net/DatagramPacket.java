/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1995, 2013, Oracle and/or its affiliates. All rights reserved.
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
public final class DatagramPacket
{
public  DatagramPacket(byte[] buf, int offset, int length) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] buf, int length) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] buf, int offset, int length, java.net.InetAddress address, int port) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] buf, int offset, int length, java.net.SocketAddress address) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] buf, int length, java.net.InetAddress address, int port) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] buf, int length, java.net.SocketAddress address) { throw new RuntimeException("Stub!"); }
public synchronized  java.net.InetAddress getAddress() { throw new RuntimeException("Stub!"); }
public synchronized  int getPort() { throw new RuntimeException("Stub!"); }
public synchronized  byte[] getData() { throw new RuntimeException("Stub!"); }
public synchronized  int getOffset() { throw new RuntimeException("Stub!"); }
public synchronized  int getLength() { throw new RuntimeException("Stub!"); }
public synchronized  void setData(byte[] buf, int offset, int length) { throw new RuntimeException("Stub!"); }
public synchronized  void setAddress(java.net.InetAddress iaddr) { throw new RuntimeException("Stub!"); }
public synchronized  void setPort(int iport) { throw new RuntimeException("Stub!"); }
public synchronized  void setSocketAddress(java.net.SocketAddress address) { throw new RuntimeException("Stub!"); }
public synchronized  java.net.SocketAddress getSocketAddress() { throw new RuntimeException("Stub!"); }
public synchronized  void setData(byte[] buf) { throw new RuntimeException("Stub!"); }
public synchronized  void setLength(int length) { throw new RuntimeException("Stub!"); }
}
