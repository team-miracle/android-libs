/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/params/ConnRouteParams.java $
* $Revision: 658785 $
* $Date: 2008-05-21 10:47:40 -0700 (Wed, 21 May 2008) $
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

package org.apache.http.conn.params;
@java.lang.Deprecated()
public class ConnRouteParams
  implements org.apache.http.conn.params.ConnRoutePNames
{
ConnRouteParams() { throw new RuntimeException("Stub!"); }
public static  org.apache.http.HttpHost getDefaultProxy(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setDefaultProxy(org.apache.http.params.HttpParams params, org.apache.http.HttpHost proxy) { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.routing.HttpRoute getForcedRoute(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setForcedRoute(org.apache.http.params.HttpParams params, org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public static  java.net.InetAddress getLocalAddress(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setLocalAddress(org.apache.http.params.HttpParams params, java.net.InetAddress local) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.HttpHost NO_HOST;
public static final org.apache.http.conn.routing.HttpRoute NO_ROUTE;
static { NO_HOST = null; NO_ROUTE = null; }
}
