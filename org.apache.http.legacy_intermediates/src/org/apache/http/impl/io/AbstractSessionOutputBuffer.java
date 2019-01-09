/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/io/AbstractSessionOutputBuffer.java $
* $Revision: 652091 $
* $Date: 2008-04-29 13:41:07 -0700 (Tue, 29 Apr 2008) $
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
public abstract class AbstractSessionOutputBuffer
  implements org.apache.http.io.SessionOutputBuffer
{
public  AbstractSessionOutputBuffer() { throw new RuntimeException("Stub!"); }
protected  void init(java.io.OutputStream outstream, int buffersize, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void flushBuffer() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLine(java.lang.String s) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLine(org.apache.http.util.CharArrayBuffer s) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.io.HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
