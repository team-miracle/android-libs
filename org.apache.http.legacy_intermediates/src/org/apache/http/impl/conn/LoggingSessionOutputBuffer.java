/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/LoggingSessionOutputBuffer.java $
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

package org.apache.http.impl.conn;
@java.lang.Deprecated()
public class LoggingSessionOutputBuffer
  implements org.apache.http.io.SessionOutputBuffer
{
public  LoggingSessionOutputBuffer(org.apache.http.io.SessionOutputBuffer out, org.apache.http.impl.conn.Wire wire) { throw new RuntimeException("Stub!"); }
public  void write(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLine(org.apache.http.util.CharArrayBuffer buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLine(java.lang.String s) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.io.HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
