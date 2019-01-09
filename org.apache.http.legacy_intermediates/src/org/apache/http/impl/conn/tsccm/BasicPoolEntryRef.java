/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/tsccm/BasicPoolEntryRef.java $
* $Revision: 674186 $
* $Date: 2008-07-05 05:18:54 -0700 (Sat, 05 Jul 2008) $
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
public class BasicPoolEntryRef
  extends java.lang.ref.WeakReference<org.apache.http.impl.conn.tsccm.BasicPoolEntry>
{
public  BasicPoolEntryRef(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry, java.lang.ref.ReferenceQueue<java.lang.Object> queue) { super(null,(java.lang.ref.ReferenceQueue)null); throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.HttpRoute getRoute() { throw new RuntimeException("Stub!"); }
}
