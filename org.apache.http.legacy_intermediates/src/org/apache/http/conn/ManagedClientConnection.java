/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/ManagedClientConnection.java $
* $Revision: 672969 $
* $Date: 2008-06-30 18:09:50 -0700 (Mon, 30 Jun 2008) $
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

package org.apache.http.conn;
@java.lang.Deprecated()
public interface ManagedClientConnection
  extends org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection, org.apache.http.conn.ConnectionReleaseTrigger
{
public abstract  boolean isSecure();
public abstract  org.apache.http.conn.routing.HttpRoute getRoute();
public abstract  javax.net.ssl.SSLSession getSSLSession();
public abstract  void open(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void tunnelTarget(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void tunnelProxy(org.apache.http.HttpHost next, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void layerProtocol(org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void markReusable();
public abstract  void unmarkReusable();
public abstract  boolean isMarkedReusable();
public abstract  void setState(java.lang.Object state);
public abstract  java.lang.Object getState();
public abstract  void setIdleDuration(long duration, java.util.concurrent.TimeUnit unit);
}
