/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/tsccm/ConnPoolByRoute.java $
* $Revision: 677240 $
* $Date: 2008-07-16 04:25:47 -0700 (Wed, 16 Jul 2008) $
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

package org.apache.http.impl.conn.tsccm;
@java.lang.Deprecated()
public class ConnPoolByRoute
  extends org.apache.http.impl.conn.tsccm.AbstractConnPool
{
public  ConnPoolByRoute(org.apache.http.conn.ClientConnectionOperator operator, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  java.util.Queue<org.apache.http.impl.conn.tsccm.BasicPoolEntry> createFreeConnQueue() { throw new RuntimeException("Stub!"); }
protected  java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> createWaitingThreadQueue() { throw new RuntimeException("Stub!"); }
protected  java.util.Map<org.apache.http.conn.routing.HttpRoute, org.apache.http.impl.conn.tsccm.RouteSpecificPool> createRouteToPoolMap() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.RouteSpecificPool newRouteSpecificPool(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.WaitingThread newWaitingThread(java.util.concurrent.locks.Condition cond, org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.RouteSpecificPool getRoutePool(org.apache.http.conn.routing.HttpRoute route, boolean create) { throw new RuntimeException("Stub!"); }
public  int getConnectionsInPool(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public  org.apache.http.impl.conn.tsccm.PoolEntryRequest requestPoolEntry(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.BasicPoolEntry getEntryBlocking(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state, long timeout, java.util.concurrent.TimeUnit tunit, org.apache.http.impl.conn.tsccm.WaitingThreadAborter aborter) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void freeEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry, boolean reusable, long validDuration, java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.BasicPoolEntry getFreeEntry(org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl, java.lang.Object state) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.BasicPoolEntry createEntry(org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl, org.apache.http.conn.ClientConnectionOperator op) { throw new RuntimeException("Stub!"); }
protected  void deleteEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry) { throw new RuntimeException("Stub!"); }
protected  void deleteLeastUsedEntry() { throw new RuntimeException("Stub!"); }
protected  void handleLostEntry(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
protected  void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl) { throw new RuntimeException("Stub!"); }
public  void deleteClosedConnections() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
protected java.util.Queue<org.apache.http.impl.conn.tsccm.BasicPoolEntry> freeConnections;
protected final int maxTotalConnections;
protected final org.apache.http.conn.ClientConnectionOperator operator;
protected final java.util.Map<org.apache.http.conn.routing.HttpRoute, org.apache.http.impl.conn.tsccm.RouteSpecificPool> routeToPool;
protected java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> waitingThreads;
}
