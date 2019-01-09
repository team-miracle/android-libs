/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/DefaultRequestDirector.java $
* $Revision: 676023 $
* $Date: 2008-07-11 09:40:56 -0700 (Fri, 11 Jul 2008) $
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

package org.apache.http.impl.client;
@java.lang.Deprecated()
public class DefaultRequestDirector
  implements org.apache.http.client.RequestDirector
{
public  DefaultRequestDirector(org.apache.http.protocol.HttpRequestExecutor requestExec, org.apache.http.conn.ClientConnectionManager conman, org.apache.http.ConnectionReuseStrategy reustrat, org.apache.http.conn.ConnectionKeepAliveStrategy kastrat, org.apache.http.conn.routing.HttpRoutePlanner rouplan, org.apache.http.protocol.HttpProcessor httpProcessor, org.apache.http.client.HttpRequestRetryHandler retryHandler, org.apache.http.client.RedirectHandler redirectHandler, org.apache.http.client.AuthenticationHandler targetAuthHandler, org.apache.http.client.AuthenticationHandler proxyAuthHandler, org.apache.http.client.UserTokenHandler userTokenHandler, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void rewriteRequestURI(org.apache.http.impl.client.RequestWrapper request, org.apache.http.conn.routing.HttpRoute route) throws org.apache.http.ProtocolException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void releaseConnection() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.routing.HttpRoute determineRoute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  void establishRoute(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean createTunnelToTarget(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean createTunnelToProxy(org.apache.http.conn.routing.HttpRoute route, int hop, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpRequest createConnectRequest(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.client.RoutedRequest handleResponse(org.apache.http.impl.client.RoutedRequest roureq, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected final org.apache.http.conn.ClientConnectionManager connManager;
protected final org.apache.http.protocol.HttpProcessor httpProcessor;
protected final org.apache.http.conn.ConnectionKeepAliveStrategy keepAliveStrategy;
protected org.apache.http.conn.ManagedClientConnection managedConn;
protected final org.apache.http.params.HttpParams params;
protected final org.apache.http.client.RedirectHandler redirectHandler;
protected final org.apache.http.protocol.HttpRequestExecutor requestExec;
protected final org.apache.http.client.HttpRequestRetryHandler retryHandler;
protected final org.apache.http.ConnectionReuseStrategy reuseStrategy;
protected final org.apache.http.conn.routing.HttpRoutePlanner routePlanner;
}
