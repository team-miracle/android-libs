/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/DefaultProxyAuthenticationHandler.java $
* $Revision: 603615 $
* $Date: 2007-12-12 06:03:21 -0800 (Wed, 12 Dec 2007) $
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

package org.apache.http.impl.client;
@java.lang.Deprecated()
public class DefaultProxyAuthenticationHandler
  extends org.apache.http.impl.client.AbstractAuthenticationHandler
{
public  DefaultProxyAuthenticationHandler() { throw new RuntimeException("Stub!"); }
public  boolean isAuthenticationRequested(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, org.apache.http.Header> getChallenges(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
}
