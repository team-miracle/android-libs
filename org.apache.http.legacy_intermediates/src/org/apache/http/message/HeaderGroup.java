/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/HeaderGroup.java $
* $Revision: 659185 $
* $Date: 2008-05-22 11:07:36 -0700 (Thu, 22 May 2008) $
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
public class HeaderGroup
{
public  HeaderGroup() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  void addHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void removeHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void updateHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void setHeaders(org.apache.http.Header[] headers) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getCondensedHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header[] getHeaders(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getFirstHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getLastHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header[] getAllHeaders() { throw new RuntimeException("Stub!"); }
public  boolean containsHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderIterator iterator() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderIterator iterator(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.message.HeaderGroup copy() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
