/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/AbstractAuthenticationHandler.java $
* $Revision: 673450 $
* $Date: 2008-07-02 10:35:05 -0700 (Wed, 02 Jul 2008) $
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
public abstract class AbstractAuthenticationHandler
  implements org.apache.http.client.AuthenticationHandler
{
public  AbstractAuthenticationHandler() { throw new RuntimeException("Stub!"); }
protected  java.util.Map<java.lang.String, org.apache.http.Header> parseChallenges(org.apache.http.Header[] headers) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
protected  java.util.List<java.lang.String> getAuthPreferences() { throw new RuntimeException("Stub!"); }
public  org.apache.http.auth.AuthScheme selectScheme(java.util.Map<java.lang.String, org.apache.http.Header> challenges, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.auth.AuthenticationException { throw new RuntimeException("Stub!"); }
}
