/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/BasicManagedEntity.java $
* $Revision $
* $Date: 2008-06-27 12:49:20 -0700 (Fri, 27 Jun 2008) $
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

package org.apache.http.conn;
@java.lang.Deprecated()
public class BasicManagedEntity
  extends org.apache.http.entity.HttpEntityWrapper
  implements org.apache.http.conn.ConnectionReleaseTrigger, org.apache.http.conn.EofSensorWatcher
{
public  BasicManagedEntity(org.apache.http.HttpEntity entity, org.apache.http.conn.ManagedClientConnection conn, boolean reuse) { super((org.apache.http.HttpEntity)null); throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void consumeContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.OutputStream outstream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void releaseConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void abortConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean eofDetected(java.io.InputStream wrapped) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean streamClosed(java.io.InputStream wrapped) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean streamAbort(java.io.InputStream wrapped) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void releaseManagedConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected final boolean attemptReuse;
protected org.apache.http.conn.ManagedClientConnection managedConn;
}
