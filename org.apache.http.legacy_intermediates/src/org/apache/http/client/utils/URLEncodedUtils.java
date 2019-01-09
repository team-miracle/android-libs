/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/client/utils/URLEncodedUtils.java $
* $Revision: 655107 $
* $Date: 2008-05-10 08:20:42 -0700 (Sat, 10 May 2008) $
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

package org.apache.http.client.utils;
@java.lang.Deprecated()
public class URLEncodedUtils
{
public  URLEncodedUtils() { throw new RuntimeException("Stub!"); }
public static  java.util.List<org.apache.http.NameValuePair> parse(java.net.URI uri, java.lang.String encoding) { throw new RuntimeException("Stub!"); }
public static  java.util.List<org.apache.http.NameValuePair> parse(org.apache.http.HttpEntity entity) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  boolean isEncoded(org.apache.http.HttpEntity entity) { throw new RuntimeException("Stub!"); }
public static  void parse(java.util.List<org.apache.http.NameValuePair> parameters, java.util.Scanner scanner, java.lang.String encoding) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.util.List<? extends org.apache.http.NameValuePair> parameters, java.lang.String encoding) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "application/x-www-form-urlencoded";
}
