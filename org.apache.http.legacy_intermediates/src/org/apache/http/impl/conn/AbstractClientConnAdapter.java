/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/AbstractClientConnAdapter.java $
* $Revision: 672969 $
* $Date: 2008-06-30 18:09:50 -0700 (Mon, 30 Jun 2008) $
*
* ====================================================================
*
*  Licensed to the Apache Software Foundation (ASF) under one or more
*  contributor license agreements.  See the NOTICE file distributed with
*  this work for additional information regarding copyright ownership.
*  The ASF licenses this file to You under the Apache License, Version 2.0
*  (the "License"); you may not use this file except in compliance with
*  the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
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
public abstract class AbstractClientConnAdapter
  implements org.apache.http.conn.ManagedClientConnection
{
protected  AbstractClientConnAdapter(org.apache.http.conn.ClientConnectionManager mgr, org.apache.http.conn.OperatedClientConnection conn) { throw new RuntimeException("Stub!"); }
protected  void detach() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.OperatedClientConnection getWrappedConnection() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ClientConnectionManager getManager() { throw new RuntimeException("Stub!"); }
protected final  void assertNotAborted() throws java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
protected final  void assertValid(org.apache.http.conn.OperatedClientConnection wrappedConn) { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  boolean isStale() { throw new RuntimeException("Stub!"); }
public  void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getSocketTimeout() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isResponseAvailable(int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void receiveResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
public  int getRemotePort() { throw new RuntimeException("Stub!"); }
public  boolean isSecure() { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLSession getSSLSession() { throw new RuntimeException("Stub!"); }
public  void markReusable() { throw new RuntimeException("Stub!"); }
public  void unmarkReusable() { throw new RuntimeException("Stub!"); }
public  boolean isMarkedReusable() { throw new RuntimeException("Stub!"); }
public  void setIdleDuration(long duration, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  void releaseConnection() { throw new RuntimeException("Stub!"); }
public  void abortConnection() { throw new RuntimeException("Stub!"); }
}
