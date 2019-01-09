/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/cookie/CookieSpec.java $
* $Revision: 603563 $
* $Date: 2007-12-12 03:17:55 -0800 (Wed, 12 Dec 2007) $
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
public interface CookieSpec
{
public abstract  int getVersion();
public abstract  java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header header, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException;
public abstract  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException;
public abstract  boolean match(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin);
public abstract  java.util.List<org.apache.http.Header> formatCookies(java.util.List<org.apache.http.cookie.Cookie> cookies);
public abstract  org.apache.http.Header getVersionHeader();
}
