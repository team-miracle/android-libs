/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/auth/RFC2617Scheme.java $
* $Revision: 659595 $
* $Date: 2008-05-23 09:47:14 -0700 (Fri, 23 May 2008) $
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
public abstract class RFC2617Scheme
  extends org.apache.http.impl.auth.AuthSchemeBase
{
public  RFC2617Scheme() { throw new RuntimeException("Stub!"); }
protected  void parseChallenge(org.apache.http.util.CharArrayBuffer buffer, int pos, int len) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
protected  java.util.Map<java.lang.String, java.lang.String> getParameters() { throw new RuntimeException("Stub!"); }
public  java.lang.String getParameter(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getRealm() { throw new RuntimeException("Stub!"); }
}
