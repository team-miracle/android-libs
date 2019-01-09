/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/SocketHttpServerConnection.java $
* $Revision: 561083 $
* $Date: 2007-07-30 11:31:17 -0700 (Mon, 30 Jul 2007) $
*
* ====================================================================
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http.impl;
@java.lang.Deprecated()
public class SocketHttpServerConnection
  extends org.apache.http.impl.AbstractHttpServerConnection
  implements org.apache.http.HttpInetConnection
{
public  SocketHttpServerConnection() { throw new RuntimeException("Stub!"); }
protected  void assertNotOpen() { throw new RuntimeException("Stub!"); }
protected  void assertOpen() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionInputBuffer createHttpDataReceiver(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionOutputBuffer createHttpDataTransmitter(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void bind(java.net.Socket socket, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  java.net.Socket getSocket() { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
public  int getRemotePort() { throw new RuntimeException("Stub!"); }
public  void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getSocketTimeout() { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
