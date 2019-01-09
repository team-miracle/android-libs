/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/SingleClientConnManager.java $
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
public class SingleClientConnManager
  implements org.apache.http.conn.ClientConnectionManager
{
protected class PoolEntry
  extends org.apache.http.impl.conn.AbstractPoolEntry
{
protected  PoolEntry() { super((org.apache.http.conn.ClientConnectionOperator)null,(org.apache.http.conn.routing.HttpRoute)null); throw new RuntimeException("Stub!"); }
protected  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
protected class ConnAdapter
  extends org.apache.http.impl.conn.AbstractPooledConnAdapter
{
protected  ConnAdapter(org.apache.http.impl.conn.SingleClientConnManager.PoolEntry entry, org.apache.http.conn.routing.HttpRoute route) { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.impl.conn.AbstractPoolEntry)null); throw new RuntimeException("Stub!"); }
}
public  SingleClientConnManager(org.apache.http.params.HttpParams params, org.apache.http.conn.scheme.SchemeRegistry schreg) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.scheme.SchemeRegistry getSchemeRegistry() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ClientConnectionOperator createConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry schreg) { throw new RuntimeException("Stub!"); }
protected final  void assertStillUp() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.ManagedClientConnection getConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  void releaseConnection(org.apache.http.conn.ManagedClientConnection conn, long validDuration, java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }
public  void closeExpiredConnections() { throw new RuntimeException("Stub!"); }
public  void closeIdleConnections(long idletime, java.util.concurrent.TimeUnit tunit) { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
protected  void revokeConnection() { throw new RuntimeException("Stub!"); }
public static final java.lang.String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
protected boolean alwaysShutDown;
protected org.apache.http.conn.ClientConnectionOperator connOperator;
protected long connectionExpiresTime;
protected volatile boolean isShutDown;
protected long lastReleaseTime;
protected org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter managedConn;
protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;
protected org.apache.http.impl.conn.SingleClientConnManager.PoolEntry uniquePoolEntry;
}
