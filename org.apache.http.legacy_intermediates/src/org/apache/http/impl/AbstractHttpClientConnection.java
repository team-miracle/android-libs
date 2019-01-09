/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/AbstractHttpClientConnection.java $
* $Revision: 627457 $
* $Date: 2008-02-13 07:14:19 -0800 (Wed, 13 Feb 2008) $
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

package org.apache.http.impl;
@java.lang.Deprecated()
public abstract class AbstractHttpClientConnection
  implements org.apache.http.HttpClientConnection
{
public  AbstractHttpClientConnection() { throw new RuntimeException("Stub!"); }
protected abstract  void assertOpen() throws java.lang.IllegalStateException;
protected  org.apache.http.impl.entity.EntityDeserializer createEntityDeserializer() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.entity.EntitySerializer createEntitySerializer() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpResponseFactory createHttpResponseFactory() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageParser createResponseParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.HttpResponseFactory responseFactory, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageWriter createRequestWriter(org.apache.http.io.SessionOutputBuffer buffer, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void init(org.apache.http.io.SessionInputBuffer inbuffer, org.apache.http.io.SessionOutputBuffer outbuffer, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  boolean isResponseAvailable(int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void doFlush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void receiveResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isStale() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
