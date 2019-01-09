/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/DefaultClientConnection.java $
* $Revision: 673450 $
* $Date: 2008-07-02 10:35:05 -0700 (Wed, 02 Jul 2008) $
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

package org.apache.http.impl.conn;
@java.lang.Deprecated()
public class DefaultClientConnection
  extends org.apache.http.impl.SocketHttpClientConnection
  implements org.apache.http.conn.OperatedClientConnection
{
public  DefaultClientConnection() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getTargetHost() { throw new RuntimeException("Stub!"); }
public final  boolean isSecure() { throw new RuntimeException("Stub!"); }
public final  java.net.Socket getSocket() { throw new RuntimeException("Stub!"); }
public  void opening(java.net.Socket sock, org.apache.http.HttpHost target) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void openCompleted(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionInputBuffer createSessionInputBuffer(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionOutputBuffer createSessionOutputBuffer(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageParser createResponseParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.HttpResponseFactory responseFactory, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  void update(java.net.Socket sock, org.apache.http.HttpHost target, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
