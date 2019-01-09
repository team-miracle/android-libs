/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicHeaderValueParser.java $
* $Revision: 595670 $
* $Date: 2007-11-16 06:15:01 -0800 (Fri, 16 Nov 2007) $
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
public class BasicHeaderValueParser
  implements org.apache.http.message.HeaderValueParser
{
public  BasicHeaderValueParser() { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.HeaderElement[] parseElements(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderElement[] parseElements(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.HeaderElement parseHeaderElement(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderElement parseHeaderElement(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HeaderElement createHeaderElement(java.lang.String name, java.lang.String value, org.apache.http.NameValuePair[] params) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.NameValuePair[] parseParameters(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.NameValuePair[] parseParameters(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.NameValuePair parseNameValuePair(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public  org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor, char[] delimiters) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.NameValuePair createNameValuePair(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicHeaderValueParser DEFAULT;
static { DEFAULT = null; }
}
