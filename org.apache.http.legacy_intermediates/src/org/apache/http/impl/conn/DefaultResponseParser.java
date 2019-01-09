/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/conn/DefaultResponseParser.java $
* $Revision: 617638 $
* $Date: 2008-02-01 12:49:26 -0800 (Fri, 01 Feb 2008) $
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

package org.apache.http.impl.conn;
@java.lang.Deprecated()
public class DefaultResponseParser
  extends org.apache.http.impl.io.AbstractMessageParser
{
public  DefaultResponseParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.message.LineParser parser, org.apache.http.HttpResponseFactory responseFactory, org.apache.http.params.HttpParams params) { super((org.apache.http.io.SessionInputBuffer)null,(org.apache.http.message.LineParser)null,(org.apache.http.params.HttpParams)null); throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpMessage parseHead(org.apache.http.io.SessionInputBuffer sessionBuffer) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
}
