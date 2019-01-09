/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/io/AbstractMessageParser.java $
* $Revision: 576077 $
* $Date: 2007-09-16 04:50:22 -0700 (Sun, 16 Sep 2007) $
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

package org.apache.http.impl.io;
@java.lang.Deprecated()
public abstract class AbstractMessageParser
  implements org.apache.http.io.HttpMessageParser
{
public  AbstractMessageParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.message.LineParser parser, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  org.apache.http.Header[] parseHeaders(org.apache.http.io.SessionInputBuffer inbuffer, int maxHeaderCount, int maxLineLen, org.apache.http.message.LineParser parser) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  org.apache.http.HttpMessage parseHead(org.apache.http.io.SessionInputBuffer sessionBuffer) throws java.io.IOException, org.apache.http.HttpException, org.apache.http.ParseException;
public  org.apache.http.HttpMessage parse() throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected final org.apache.http.message.LineParser lineParser;
}
