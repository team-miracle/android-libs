/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/io/AbstractSessionInputBuffer.java $
* $Revision: 576077 $
* $Date: 2007-09-16 04:50:22 -0700 (Sun, 16 Sep 2007) $
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

package org.apache.http.impl.io;
@java.lang.Deprecated()
public abstract class AbstractSessionInputBuffer
  implements org.apache.http.io.SessionInputBuffer
{
public  AbstractSessionInputBuffer() { throw new RuntimeException("Stub!"); }
protected  void init(java.io.InputStream instream, int buffersize, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  int fillBuffer() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean hasBufferedData() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readLine(org.apache.http.util.CharArrayBuffer charbuffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readLine() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.io.HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
