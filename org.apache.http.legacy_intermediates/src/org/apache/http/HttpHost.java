/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/HttpHost.java $
* $Revision: 653058 $
* $Date: 2008-05-03 05:01:10 -0700 (Sat, 03 May 2008) $
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
public final class HttpHost
{
public  HttpHost(java.lang.String hostname, int port, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public  HttpHost(java.lang.String hostname, int port) { throw new RuntimeException("Stub!"); }
public  HttpHost(java.lang.String hostname) { throw new RuntimeException("Stub!"); }
public  HttpHost(org.apache.http.HttpHost httphost) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHostName() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSchemeName() { throw new RuntimeException("Stub!"); }
public  java.lang.String toURI() { throw new RuntimeException("Stub!"); }
public  java.lang.String toHostString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFAULT_SCHEME_NAME = "http";
protected final java.lang.String hostname;
protected final java.lang.String lcHostname;
protected final int port;
protected final java.lang.String schemeName;
}
