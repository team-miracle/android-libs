/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/EofSensorInputStream.java $
* $Revision: 672367 $
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
public class EofSensorInputStream
  extends java.io.InputStream
  implements org.apache.http.conn.ConnectionReleaseTrigger
{
public  EofSensorInputStream(java.io.InputStream in, org.apache.http.conn.EofSensorWatcher watcher) { throw new RuntimeException("Stub!"); }
protected  boolean isReadAllowed() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void checkEOF(int eof) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void checkClose() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void checkAbort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void releaseConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void abortConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.io.InputStream wrappedStream;
}
