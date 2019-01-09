/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/DefaultClientConnectionOperator.java $
* $Revision: 652193 $
* $Date: 2008-04-29 17:10:36 -0700 (Tue, 29 Apr 2008) $
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
public class DefaultClientConnectionOperator
  implements org.apache.http.conn.ClientConnectionOperator
{
public  DefaultClientConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry schemes) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.OperatedClientConnection createConnection() { throw new RuntimeException("Stub!"); }
public  void openConnection(org.apache.http.conn.OperatedClientConnection conn, org.apache.http.HttpHost target, java.net.InetAddress local, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void updateSecureConnection(org.apache.http.conn.OperatedClientConnection conn, org.apache.http.HttpHost target, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void prepareSocket(java.net.Socket sock, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;
}
