/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/auth/AuthScheme.java $
* $Revision: 537144 $
* $Date: 2007-05-11 02:30:13 -0700 (Fri, 11 May 2007) $
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
public interface AuthScheme
{
public abstract  void processChallenge(org.apache.http.Header header) throws org.apache.http.auth.MalformedChallengeException;
public abstract  java.lang.String getSchemeName();
public abstract  java.lang.String getParameter(java.lang.String name);
public abstract  java.lang.String getRealm();
public abstract  boolean isConnectionBased();
public abstract  boolean isComplete();
public abstract  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, org.apache.http.HttpRequest request) throws org.apache.http.auth.AuthenticationException;
}
