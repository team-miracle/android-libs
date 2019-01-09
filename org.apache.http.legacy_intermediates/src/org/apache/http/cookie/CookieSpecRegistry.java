/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/cookie/CookieSpecRegistry.java $
* $Revision: 652950 $
* $Date: 2008-05-02 16:49:48 -0700 (Fri, 02 May 2008) $
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

package org.apache.http.cookie;
@java.lang.Deprecated()
public final class CookieSpecRegistry
{
public  CookieSpecRegistry() { throw new RuntimeException("Stub!"); }
public synchronized  void register(java.lang.String name, org.apache.http.cookie.CookieSpecFactory factory) { throw new RuntimeException("Stub!"); }
public synchronized  void unregister(java.lang.String id) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.cookie.CookieSpec getCookieSpec(java.lang.String name, org.apache.http.params.HttpParams params) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.cookie.CookieSpec getCookieSpec(java.lang.String name) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public synchronized  java.util.List<java.lang.String> getSpecNames() { throw new RuntimeException("Stub!"); }
public synchronized  void setItems(java.util.Map<java.lang.String, org.apache.http.cookie.CookieSpecFactory> map) { throw new RuntimeException("Stub!"); }
}
