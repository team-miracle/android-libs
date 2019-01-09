/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/DefaultRedirectHandler.java $
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
public class DefaultRedirectHandler
  implements org.apache.http.client.RedirectHandler
{
public  DefaultRedirectHandler() { throw new RuntimeException("Stub!"); }
public  boolean isRedirectRequested(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
public  java.net.URI getLocationURI(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.ProtocolException { throw new RuntimeException("Stub!"); }
}
