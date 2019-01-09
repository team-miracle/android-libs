/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/HttpMessage.java $
* $Revision: 610823 $
* $Date: 2008-01-10 07:53:53 -0800 (Thu, 10 Jan 2008) $
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

package org.apache.http;
@java.lang.Deprecated()
public interface HttpMessage
{
public abstract  org.apache.http.ProtocolVersion getProtocolVersion();
public abstract  boolean containsHeader(java.lang.String name);
public abstract  org.apache.http.Header[] getHeaders(java.lang.String name);
public abstract  org.apache.http.Header getFirstHeader(java.lang.String name);
public abstract  org.apache.http.Header getLastHeader(java.lang.String name);
public abstract  org.apache.http.Header[] getAllHeaders();
public abstract  void addHeader(org.apache.http.Header header);
public abstract  void addHeader(java.lang.String name, java.lang.String value);
public abstract  void setHeader(org.apache.http.Header header);
public abstract  void setHeader(java.lang.String name, java.lang.String value);
public abstract  void setHeaders(org.apache.http.Header[] headers);
public abstract  void removeHeader(org.apache.http.Header header);
public abstract  void removeHeaders(java.lang.String name);
public abstract  org.apache.http.HeaderIterator headerIterator();
public abstract  org.apache.http.HeaderIterator headerIterator(java.lang.String name);
public abstract  org.apache.http.params.HttpParams getParams();
public abstract  void setParams(org.apache.http.params.HttpParams params);
}
