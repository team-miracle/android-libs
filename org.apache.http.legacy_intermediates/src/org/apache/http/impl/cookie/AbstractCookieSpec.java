/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/cookie/AbstractCookieSpec.java $
* $Revision: 617207 $
* $Date: 2008-01-31 12:14:12 -0800 (Thu, 31 Jan 2008) $
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

package org.apache.http.impl.cookie;
@java.lang.Deprecated()
public abstract class AbstractCookieSpec
  implements org.apache.http.cookie.CookieSpec
{
public  AbstractCookieSpec() { throw new RuntimeException("Stub!"); }
public  void registerAttribHandler(java.lang.String name, org.apache.http.cookie.CookieAttributeHandler handler) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.cookie.CookieAttributeHandler findAttribHandler(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.cookie.CookieAttributeHandler getAttribHandler(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<org.apache.http.cookie.CookieAttributeHandler> getAttribHandlers() { throw new RuntimeException("Stub!"); }
}
