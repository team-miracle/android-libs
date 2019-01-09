/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicLineFormatter.java $
* $Revision: 574185 $
* $Date: 2007-09-10 02:19:47 -0700 (Mon, 10 Sep 2007) $
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
public class BasicLineFormatter
  implements org.apache.http.message.LineFormatter
{
public  BasicLineFormatter() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.util.CharArrayBuffer initBuffer(org.apache.http.util.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatProtocolVersion(org.apache.http.ProtocolVersion version, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer appendProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.ProtocolVersion version) { throw new RuntimeException("Stub!"); }
protected  int estimateProtocolVersionLen(org.apache.http.ProtocolVersion version) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatRequestLine(org.apache.http.RequestLine reqline, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.RequestLine reqline) { throw new RuntimeException("Stub!"); }
protected  void doFormatRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.RequestLine reqline) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatStatusLine(org.apache.http.StatusLine statline, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.StatusLine statline) { throw new RuntimeException("Stub!"); }
protected  void doFormatStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.StatusLine statline) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatHeader(org.apache.http.Header header, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatHeader(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
protected  void doFormatHeader(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicLineFormatter DEFAULT;
static { DEFAULT = null; }
}
