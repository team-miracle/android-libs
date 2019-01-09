/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/DefaultHttpRequestRetryHandler.java $
* $Revision: 652726 $
* $Date: 2008-05-01 18:16:51 -0700 (Thu, 01 May 2008) $
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
public class DefaultHttpRequestRetryHandler
  implements org.apache.http.client.HttpRequestRetryHandler
{
public  DefaultHttpRequestRetryHandler(int retryCount, boolean requestSentRetryEnabled) { throw new RuntimeException("Stub!"); }
public  DefaultHttpRequestRetryHandler() { throw new RuntimeException("Stub!"); }
public  boolean retryRequest(java.io.IOException exception, int executionCount, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
public  boolean isRequestSentRetryEnabled() { throw new RuntimeException("Stub!"); }
public  int getRetryCount() { throw new RuntimeException("Stub!"); }
}
