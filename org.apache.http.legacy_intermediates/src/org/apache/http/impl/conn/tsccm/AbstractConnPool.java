/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/tsccm/AbstractConnPool.java $
* $Revision: 673450 $
* $Date: 2008-07-02 10:35:05 -0700 (Wed, 02 Jul 2008) $
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
public abstract class AbstractConnPool
  implements org.apache.http.impl.conn.tsccm.RefQueueHandler
{
protected  AbstractConnPool() { throw new RuntimeException("Stub!"); }
public  void enableConnectionGC() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.impl.conn.tsccm.BasicPoolEntry getEntry(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state, long timeout, java.util.concurrent.TimeUnit tunit) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public abstract  org.apache.http.impl.conn.tsccm.PoolEntryRequest requestPoolEntry(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state);
public abstract  void freeEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry, boolean reusable, long validDuration, java.util.concurrent.TimeUnit timeUnit);
public  void handleReference(java.lang.ref.Reference ref) { throw new RuntimeException("Stub!"); }
protected abstract  void handleLostEntry(org.apache.http.conn.routing.HttpRoute route);
public  void closeIdleConnections(long idletime, java.util.concurrent.TimeUnit tunit) { throw new RuntimeException("Stub!"); }
public  void closeExpiredConnections() { throw new RuntimeException("Stub!"); }
public abstract  void deleteClosedConnections();
public  void shutdown() { throw new RuntimeException("Stub!"); }
protected  void closeConnection(org.apache.http.conn.OperatedClientConnection conn) { throw new RuntimeException("Stub!"); }
protected org.apache.http.impl.conn.IdleConnectionHandler idleConnHandler;
protected volatile boolean isShutDown;
protected java.util.Set<org.apache.http.impl.conn.tsccm.BasicPoolEntryRef> issuedConnections;
protected int numConnections;
protected final java.util.concurrent.locks.Lock poolLock;
protected java.lang.ref.ReferenceQueue<java.lang.Object> refQueue;
}
