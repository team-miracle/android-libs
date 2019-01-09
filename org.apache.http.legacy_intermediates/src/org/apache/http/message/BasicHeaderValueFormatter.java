/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicHeaderValueFormatter.java $
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
public class BasicHeaderValueFormatter
  implements org.apache.http.message.HeaderValueFormatter
{
public  BasicHeaderValueFormatter() { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatElements(org.apache.http.HeaderElement[] elems, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatElements(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.HeaderElement[] elems, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateElementsLen(org.apache.http.HeaderElement[] elems) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatHeaderElement(org.apache.http.HeaderElement elem, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatHeaderElement(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.HeaderElement elem, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateHeaderElementLen(org.apache.http.HeaderElement elem) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatParameters(org.apache.http.NameValuePair[] nvps, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatParameters(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.NameValuePair[] nvps, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateParametersLen(org.apache.http.NameValuePair[] nvps) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatNameValuePair(org.apache.http.NameValuePair nvp, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.NameValuePair nvp, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateNameValuePairLen(org.apache.http.NameValuePair nvp) { throw new RuntimeException("Stub!"); }
protected  void doFormatValue(org.apache.http.util.CharArrayBuffer buffer, java.lang.String value, boolean quote) { throw new RuntimeException("Stub!"); }
protected  boolean isSeparator(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isUnsafe(char ch) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicHeaderValueFormatter DEFAULT;
public static final java.lang.String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
public static final java.lang.String UNSAFE_CHARS = "\"\\";
static { DEFAULT = null; }
}
