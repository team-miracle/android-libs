/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/AbstractPooledConnAdapter.java $
* $Revision: 658775 $
* $Date: 2008-05-21 10:30:45 -0700 (Wed, 21 May 2008) $
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
public abstract class AbstractPooledConnAdapter
  extends org.apache.http.impl.conn.AbstractClientConnAdapter
{
protected  AbstractPooledConnAdapter(org.apache.http.conn.ClientConnectionManager manager, org.apache.http.impl.conn.AbstractPoolEntry entry) { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.conn.OperatedClientConnection)null); throw new RuntimeException("Stub!"); }
protected final  void assertAttached() { throw new RuntimeException("Stub!"); }
protected  void detach() { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.routing.HttpRoute getRoute() { throw new RuntimeException("Stub!"); }
public  void open(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void tunnelTarget(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void tunnelProxy(org.apache.http.HttpHost next, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void layerProtocol(org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getState() { throw new RuntimeException("Stub!"); }
public  void setState(java.lang.Object state) { throw new RuntimeException("Stub!"); }
protected volatile org.apache.http.impl.conn.AbstractPoolEntry poolEntry;
}
