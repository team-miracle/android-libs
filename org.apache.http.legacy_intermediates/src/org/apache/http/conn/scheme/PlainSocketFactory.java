/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/scheme/PlainSocketFactory.java $
* $Revision: 659194 $
* $Date: 2008-05-22 11:33:47 -0700 (Thu, 22 May 2008) $
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

package org.apache.http.conn.scheme;
@java.lang.Deprecated()
public final class PlainSocketFactory
  implements org.apache.http.conn.scheme.SocketFactory
{
public  PlainSocketFactory(org.apache.http.conn.scheme.HostNameResolver nameResolver) { throw new RuntimeException("Stub!"); }
public  PlainSocketFactory() { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.scheme.PlainSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket() { throw new RuntimeException("Stub!"); }
public  java.net.Socket connectSocket(java.net.Socket sock, java.lang.String host, int port, java.net.InetAddress localAddress, int localPort, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isSecure(java.net.Socket sock) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
