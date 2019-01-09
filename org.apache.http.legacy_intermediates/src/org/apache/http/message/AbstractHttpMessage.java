/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/AbstractHttpMessage.java $
* $Revision: 620287 $
* $Date: 2008-02-10 07:15:53 -0800 (Sun, 10 Feb 2008) $
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

package org.apache.http.message;
@java.lang.Deprecated()
public abstract class AbstractHttpMessage
  implements org.apache.http.HttpMessage
{
protected  AbstractHttpMessage(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  AbstractHttpMessage() { throw new RuntimeException("Stub!"); }
public  boolean containsHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header[] getHeaders(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getFirstHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getLastHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header[] getAllHeaders() { throw new RuntimeException("Stub!"); }
public  void addHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void addHeader(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void setHeader(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setHeaders(org.apache.http.Header[] headers) { throw new RuntimeException("Stub!"); }
public  void removeHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void removeHeaders(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderIterator headerIterator() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderIterator headerIterator(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams getParams() { throw new RuntimeException("Stub!"); }
public  void setParams(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected org.apache.http.message.HeaderGroup headergroup;
protected org.apache.http.params.HttpParams params;
}
