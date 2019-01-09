/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/scheme/SchemeRegistry.java $
* $Revision: 648356 $
* $Date: 2008-04-15 10:57:53 -0700 (Tue, 15 Apr 2008) $
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
package org.apache.http.conn.scheme;
@java.lang.Deprecated()
public final class SchemeRegistry
{
public  SchemeRegistry() { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.conn.scheme.Scheme getScheme(java.lang.String name) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.conn.scheme.Scheme getScheme(org.apache.http.HttpHost host) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.conn.scheme.Scheme get(java.lang.String name) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.conn.scheme.Scheme register(org.apache.http.conn.scheme.Scheme sch) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.conn.scheme.Scheme unregister(java.lang.String name) { throw new RuntimeException("Stub!"); }
public synchronized  java.util.List<java.lang.String> getSchemeNames() { throw new RuntimeException("Stub!"); }
public synchronized  void setItems(java.util.Map<java.lang.String, org.apache.http.conn.scheme.Scheme> map) { throw new RuntimeException("Stub!"); }
}
