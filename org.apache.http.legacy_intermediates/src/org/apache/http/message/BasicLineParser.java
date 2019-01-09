/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicLineParser.java $
* $Revision: 591798 $
* $Date: 2007-11-04 08:19:29 -0800 (Sun, 04 Nov 2007) $
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

package org.apache.http.message;
@java.lang.Deprecated()
public class BasicLineParser
  implements org.apache.http.message.LineParser
{
public  BasicLineParser(org.apache.http.ProtocolVersion proto) { throw new RuntimeException("Stub!"); }
public  BasicLineParser() { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.ProtocolVersion parseProtocolVersion(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.ProtocolVersion parseProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.ProtocolVersion createProtocolVersion(int major, int minor) { throw new RuntimeException("Stub!"); }
public  boolean hasProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.RequestLine parseRequestLine(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.RequestLine parseRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.RequestLine createRequestLine(java.lang.String method, java.lang.String uri, org.apache.http.ProtocolVersion ver) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.StatusLine parseStatusLine(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.StatusLine createStatusLine(org.apache.http.ProtocolVersion ver, int status, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.Header parseHeader(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header parseHeader(org.apache.http.util.CharArrayBuffer buffer) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  void skipWhitespace(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicLineParser DEFAULT;
protected final org.apache.http.ProtocolVersion protocol;
static { DEFAULT = null; }
}
