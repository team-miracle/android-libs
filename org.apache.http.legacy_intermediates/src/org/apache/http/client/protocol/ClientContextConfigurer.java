/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/client/protocol/ClientContextConfigurer.java $
* $Revision: 654886 $
* $Date: 2008-05-09 10:06:12 -0700 (Fri, 09 May 2008) $
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

package org.apache.http.client.protocol;
@java.lang.Deprecated()
public class ClientContextConfigurer
  implements org.apache.http.client.protocol.ClientContext
{
public  ClientContextConfigurer(org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
public  void setCookieSpecRegistry(org.apache.http.cookie.CookieSpecRegistry registry) { throw new RuntimeException("Stub!"); }
public  void setAuthSchemeRegistry(org.apache.http.auth.AuthSchemeRegistry registry) { throw new RuntimeException("Stub!"); }
public  void setCookieStore(org.apache.http.client.CookieStore store) { throw new RuntimeException("Stub!"); }
public  void setCredentialsProvider(org.apache.http.client.CredentialsProvider provider) { throw new RuntimeException("Stub!"); }
public  void setAuthSchemePref(java.util.List<java.lang.String> list) { throw new RuntimeException("Stub!"); }
}
