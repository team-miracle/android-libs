/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/params/ConnManagerParams.java $
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
public final class ConnManagerParams
  implements org.apache.http.conn.params.ConnManagerPNames
{
public  ConnManagerParams() { throw new RuntimeException("Stub!"); }
public static  long getTimeout(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setTimeout(org.apache.http.params.HttpParams params, long timeout) { throw new RuntimeException("Stub!"); }
public static  void setMaxConnectionsPerRoute(org.apache.http.params.HttpParams params, org.apache.http.conn.params.ConnPerRoute connPerRoute) { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.params.ConnPerRoute getMaxConnectionsPerRoute(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setMaxTotalConnections(org.apache.http.params.HttpParams params, int maxTotalConnections) { throw new RuntimeException("Stub!"); }
public static  int getMaxTotalConnections(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;
}
