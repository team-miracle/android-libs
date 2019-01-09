/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/io/HttpRequestWriter.java $
* $Revision: 569673 $
* $Date: 2007-08-25 06:58:51 -0700 (Sat, 25 Aug 2007) $
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
public class HttpRequestWriter
  extends org.apache.http.impl.io.AbstractMessageWriter
{
public  HttpRequestWriter(org.apache.http.io.SessionOutputBuffer buffer, org.apache.http.message.LineFormatter formatter, org.apache.http.params.HttpParams params) { super((org.apache.http.io.SessionOutputBuffer)null,(org.apache.http.message.LineFormatter)null,(org.apache.http.params.HttpParams)null); throw new RuntimeException("Stub!"); }
protected  void writeHeadLine(org.apache.http.HttpMessage message) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
