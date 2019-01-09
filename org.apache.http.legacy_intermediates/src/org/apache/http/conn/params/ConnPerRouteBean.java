/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/params/ConnPerRouteBean.java $
* $Revision: 652947 $
* $Date: 2008-05-02 16:15:40 -0700 (Fri, 02 May 2008) $
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
public final class ConnPerRouteBean
  implements org.apache.http.conn.params.ConnPerRoute
{
public  ConnPerRouteBean(int defaultMax) { throw new RuntimeException("Stub!"); }
public  ConnPerRouteBean() { throw new RuntimeException("Stub!"); }
public  int getDefaultMax() { throw new RuntimeException("Stub!"); }
public  void setDefaultMaxPerRoute(int max) { throw new RuntimeException("Stub!"); }
public  void setMaxForRoute(org.apache.http.conn.routing.HttpRoute route, int max) { throw new RuntimeException("Stub!"); }
public  int getMaxForRoute(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public  void setMaxForRoutes(java.util.Map<org.apache.http.conn.routing.HttpRoute, java.lang.Integer> map) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
}
