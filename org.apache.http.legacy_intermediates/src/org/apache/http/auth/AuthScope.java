/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/auth/AuthScope.java $
* $Revision: 652950 $
* $Date: 2008-05-02 16:49:48 -0700 (Fri, 02 May 2008) $
*
* ====================================================================
*
*  Licensed to the Apache Software Foundation (ASF) under one or more
*  contributor license agreements.  See the NOTICE file distributed with
*  this work for additional information regarding copyright ownership.
*  The ASF licenses this file to You under the Apache License, Version 2.0
*  (the "License"); you may not use this file except in compliance with
*  the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http.auth;
@java.lang.Deprecated()
public class AuthScope
{
public  AuthScope(java.lang.String host, int port, java.lang.String realm, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public  AuthScope(java.lang.String host, int port, java.lang.String realm) { throw new RuntimeException("Stub!"); }
public  AuthScope(java.lang.String host, int port) { throw new RuntimeException("Stub!"); }
public  AuthScope(org.apache.http.auth.AuthScope authscope) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHost() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRealm() { throw new RuntimeException("Stub!"); }
public  java.lang.String getScheme() { throw new RuntimeException("Stub!"); }
public  int match(org.apache.http.auth.AuthScope that) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final org.apache.http.auth.AuthScope ANY;
public static final java.lang.String ANY_HOST;
public static final int ANY_PORT = -1;
public static final java.lang.String ANY_REALM;
public static final java.lang.String ANY_SCHEME;
static { ANY = null; ANY_HOST = null; ANY_REALM = null; ANY_SCHEME = null; }
}
