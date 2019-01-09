/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/tsccm/WaitingThread.java $
* $Revision: 649217 $
* $Date: 2008-04-17 11:32:32 -0700 (Thu, 17 Apr 2008) $
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
public class WaitingThread
{
public  WaitingThread(java.util.concurrent.locks.Condition cond, org.apache.http.impl.conn.tsccm.RouteSpecificPool pool) { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.locks.Condition getCondition() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.impl.conn.tsccm.RouteSpecificPool getPool() { throw new RuntimeException("Stub!"); }
public final  java.lang.Thread getThread() { throw new RuntimeException("Stub!"); }
public  boolean await(java.util.Date deadline) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void wakeup() { throw new RuntimeException("Stub!"); }
public  void interrupt() { throw new RuntimeException("Stub!"); }
}
