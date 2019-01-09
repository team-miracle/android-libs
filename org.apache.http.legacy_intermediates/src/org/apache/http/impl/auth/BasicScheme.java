/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/auth/BasicScheme.java $
* $Revision: 658430 $
* $Date: 2008-05-20 14:04:27 -0700 (Tue, 20 May 2008) $
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

package org.apache.http.impl.auth;
@java.lang.Deprecated()
public class BasicScheme
  extends org.apache.http.impl.auth.RFC2617Scheme
{
public  BasicScheme() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSchemeName() { throw new RuntimeException("Stub!"); }
public  void processChallenge(org.apache.http.Header header) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
public  boolean isComplete() { throw new RuntimeException("Stub!"); }
public  boolean isConnectionBased() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, org.apache.http.HttpRequest request) throws org.apache.http.auth.AuthenticationException { throw new RuntimeException("Stub!"); }
public static  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, java.lang.String charset, boolean proxy) { throw new RuntimeException("Stub!"); }
}
