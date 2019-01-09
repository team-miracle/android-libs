/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/tsccm/RefQueueWorker.java $
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
public class RefQueueWorker
  implements java.lang.Runnable
{
public  RefQueueWorker(java.lang.ref.ReferenceQueue<?> queue, org.apache.http.impl.conn.tsccm.RefQueueHandler handler) { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected final org.apache.http.impl.conn.tsccm.RefQueueHandler refHandler;
protected final java.lang.ref.ReferenceQueue<?> refQueue;
protected volatile java.lang.Thread workerThread;
}
