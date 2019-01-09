/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/client/methods/HttpUriRequest.java $
* $Revision: 659191 $
* $Date: 2008-05-22 11:26:53 -0700 (Thu, 22 May 2008) $
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

package org.apache.http.client.methods;
@java.lang.Deprecated()
public interface HttpUriRequest
  extends org.apache.http.HttpRequest
{
public abstract  java.lang.String getMethod();
public abstract  java.net.URI getURI();
public abstract  void abort() throws java.lang.UnsupportedOperationException;
public abstract  boolean isAborted();
}
