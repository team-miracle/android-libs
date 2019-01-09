/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/HttpServerConnection.java $
* $Revision: 542199 $
* $Date: 2007-05-28 04:23:46 -0700 (Mon, 28 May 2007) $
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

package org.apache.http;
@java.lang.Deprecated()
public interface HttpServerConnection
  extends org.apache.http.HttpConnection
{
public abstract  org.apache.http.HttpRequest receiveRequestHeader() throws org.apache.http.HttpException, java.io.IOException;
public abstract  void receiveRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void sendResponseHeader(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void sendResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void flush() throws java.io.IOException;
}
