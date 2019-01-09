/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/protocol/BasicHttpProcessor.java $
* $Revision: 613298 $
* $Date: 2008-01-18 14:09:22 -0800 (Fri, 18 Jan 2008) $
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
public final class BasicHttpProcessor
  implements org.apache.http.protocol.HttpProcessor, org.apache.http.protocol.HttpRequestInterceptorList, org.apache.http.protocol.HttpResponseInterceptorList
{
public  BasicHttpProcessor() { throw new RuntimeException("Stub!"); }
public  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp) { throw new RuntimeException("Stub!"); }
public  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp, int index) { throw new RuntimeException("Stub!"); }
public  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp, int index) { throw new RuntimeException("Stub!"); }
public  void removeRequestInterceptorByClass(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
public  void removeResponseInterceptorByClass(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
public  void addInterceptor(org.apache.http.HttpRequestInterceptor interceptor) { throw new RuntimeException("Stub!"); }
public  void addInterceptor(org.apache.http.HttpRequestInterceptor interceptor, int index) { throw new RuntimeException("Stub!"); }
public  int getRequestInterceptorCount() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpRequestInterceptor getRequestInterceptor(int index) { throw new RuntimeException("Stub!"); }
public  void clearRequestInterceptors() { throw new RuntimeException("Stub!"); }
public  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp) { throw new RuntimeException("Stub!"); }
public  void addInterceptor(org.apache.http.HttpResponseInterceptor interceptor) { throw new RuntimeException("Stub!"); }
public  void addInterceptor(org.apache.http.HttpResponseInterceptor interceptor, int index) { throw new RuntimeException("Stub!"); }
public  int getResponseInterceptorCount() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponseInterceptor getResponseInterceptor(int index) { throw new RuntimeException("Stub!"); }
public  void clearResponseInterceptors() { throw new RuntimeException("Stub!"); }
public  void setInterceptors(java.util.List list) { throw new RuntimeException("Stub!"); }
public  void clearInterceptors() { throw new RuntimeException("Stub!"); }
public  void process(org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
public  void process(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  void copyInterceptors(org.apache.http.protocol.BasicHttpProcessor target) { throw new RuntimeException("Stub!"); }
public  org.apache.http.protocol.BasicHttpProcessor copy() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected java.util.List requestInterceptors;
protected java.util.List responseInterceptors;
}
