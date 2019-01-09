/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/BasicCookieStore.java $
* $Revision: 653041 $
* $Date: 2008-05-03 03:39:28 -0700 (Sat, 03 May 2008) $
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

package org.apache.http.impl.client;
@java.lang.Deprecated()
public class BasicCookieStore
  implements org.apache.http.client.CookieStore
{
public  BasicCookieStore() { throw new RuntimeException("Stub!"); }
public synchronized  void addCookie(org.apache.http.cookie.Cookie cookie) { throw new RuntimeException("Stub!"); }
public synchronized  void addCookies(org.apache.http.cookie.Cookie[] cookies) { throw new RuntimeException("Stub!"); }
public synchronized  java.util.List<org.apache.http.cookie.Cookie> getCookies() { throw new RuntimeException("Stub!"); }
public synchronized  boolean clearExpired(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public synchronized  void clear() { throw new RuntimeException("Stub!"); }
}
