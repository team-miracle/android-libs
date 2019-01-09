/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/DefaultHttpClient.java $
* $Revision: 677250 $
* $Date: 2008-07-16 04:45:47 -0700 (Wed, 16 Jul 2008) $
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
public class DefaultHttpClient
  extends org.apache.http.impl.client.AbstractHttpClient
{
public  DefaultHttpClient(org.apache.http.conn.ClientConnectionManager conman, org.apache.http.params.HttpParams params) { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.params.HttpParams)null); throw new RuntimeException("Stub!"); }
public  DefaultHttpClient(org.apache.http.params.HttpParams params) { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.params.HttpParams)null); throw new RuntimeException("Stub!"); }
public  DefaultHttpClient() { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.params.HttpParams)null); throw new RuntimeException("Stub!"); }
protected  org.apache.http.params.HttpParams createHttpParams() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.protocol.HttpRequestExecutor createRequestExecutor() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ClientConnectionManager createClientConnectionManager() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.protocol.HttpContext createHttpContext() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.ConnectionReuseStrategy createConnectionReuseStrategy() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.auth.AuthSchemeRegistry createAuthSchemeRegistry() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.cookie.CookieSpecRegistry createCookieSpecRegistry() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.protocol.BasicHttpProcessor createHttpProcessor() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.HttpRequestRetryHandler createHttpRequestRetryHandler() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.RedirectHandler createRedirectHandler() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.AuthenticationHandler createTargetAuthenticationHandler() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.AuthenticationHandler createProxyAuthenticationHandler() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.CookieStore createCookieStore() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.CredentialsProvider createCredentialsProvider() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.routing.HttpRoutePlanner createHttpRoutePlanner() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.UserTokenHandler createUserTokenHandler() { throw new RuntimeException("Stub!"); }
}
