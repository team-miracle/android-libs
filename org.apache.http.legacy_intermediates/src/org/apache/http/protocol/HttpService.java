/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/protocol/HttpService.java $
* $Revision: 610763 $
* $Date: 2008-01-10 04:01:13 -0800 (Thu, 10 Jan 2008) $
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
public class HttpService
{
public  HttpService(org.apache.http.protocol.HttpProcessor proc, org.apache.http.ConnectionReuseStrategy connStrategy, org.apache.http.HttpResponseFactory responseFactory) { throw new RuntimeException("Stub!"); }
public  void setHttpProcessor(org.apache.http.protocol.HttpProcessor processor) { throw new RuntimeException("Stub!"); }
public  void setConnReuseStrategy(org.apache.http.ConnectionReuseStrategy connStrategy) { throw new RuntimeException("Stub!"); }
public  void setResponseFactory(org.apache.http.HttpResponseFactory responseFactory) { throw new RuntimeException("Stub!"); }
public  void setHandlerResolver(org.apache.http.protocol.HttpRequestHandlerResolver handlerResolver) { throw new RuntimeException("Stub!"); }
public  void setExpectationVerifier(org.apache.http.protocol.HttpExpectationVerifier expectationVerifier) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams getParams() { throw new RuntimeException("Stub!"); }
public  void setParams(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  void handleRequest(org.apache.http.HttpServerConnection conn, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  void handleException(org.apache.http.HttpException ex, org.apache.http.HttpResponse response) { throw new RuntimeException("Stub!"); }
protected  void doService(org.apache.http.HttpRequest request, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
