/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/tsccm/RouteSpecificPool.java $
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
public class RouteSpecificPool
{
public  RouteSpecificPool(org.apache.http.conn.routing.HttpRoute route, int maxEntries) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.HttpRoute getRoute() { throw new RuntimeException("Stub!"); }
public final  int getMaxEntries() { throw new RuntimeException("Stub!"); }
public  boolean isUnused() { throw new RuntimeException("Stub!"); }
public  int getCapacity() { throw new RuntimeException("Stub!"); }
public final  int getEntryCount() { throw new RuntimeException("Stub!"); }
public  org.apache.http.impl.conn.tsccm.BasicPoolEntry allocEntry(java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  void freeEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry) { throw new RuntimeException("Stub!"); }
public  void createdEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry) { throw new RuntimeException("Stub!"); }
public  boolean deleteEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry) { throw new RuntimeException("Stub!"); }
public  void dropEntry() { throw new RuntimeException("Stub!"); }
public  void queueThread(org.apache.http.impl.conn.tsccm.WaitingThread wt) { throw new RuntimeException("Stub!"); }
public  boolean hasThread() { throw new RuntimeException("Stub!"); }
public  org.apache.http.impl.conn.tsccm.WaitingThread nextThread() { throw new RuntimeException("Stub!"); }
public  void removeThread(org.apache.http.impl.conn.tsccm.WaitingThread wt) { throw new RuntimeException("Stub!"); }
protected final java.util.LinkedList<org.apache.http.impl.conn.tsccm.BasicPoolEntry> freeEntries;
protected final int maxEntries;
protected int numEntries;
protected final org.apache.http.conn.routing.HttpRoute route;
protected final java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> waitingThreads;
}
