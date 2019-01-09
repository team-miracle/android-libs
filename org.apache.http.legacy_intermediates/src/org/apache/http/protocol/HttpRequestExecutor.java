/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/protocol/HttpRequestExecutor.java $
* $Revision: 576073 $
* $Date: 2007-09-16 03:53:13 -0700 (Sun, 16 Sep 2007) $
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

package org.apache.http.protocol;
@java.lang.Deprecated()
public class HttpRequestExecutor
{
public  HttpRequestExecutor() { throw new RuntimeException("Stub!"); }
protected  boolean canResponseHaveBody(org.apache.http.HttpRequest request, org.apache.http.HttpResponse response) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.HttpRequest request, org.apache.http.HttpClientConnection conn, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
public  void preProcess(org.apache.http.HttpRequest request, org.apache.http.protocol.HttpProcessor processor, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpResponse doSendRequest(org.apache.http.HttpRequest request, org.apache.http.HttpClientConnection conn, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpResponse doReceiveResponse(org.apache.http.HttpRequest request, org.apache.http.HttpClientConnection conn, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void postProcess(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpProcessor processor, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
