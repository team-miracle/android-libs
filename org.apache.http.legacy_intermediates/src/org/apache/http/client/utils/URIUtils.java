/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/client/utils/URIUtils.java $
* $Revision: 653041 $
* $Date: 2008-05-03 03:39:28 -0700 (Sat, 03 May 2008) $
*
* ====================================================================
*
*  Licensed to the Apache Software Foundation (ASF) under one or more
*  contributor license agreements.  See the NOTICE file distributed with
*  this work for additional information regarding copyright ownership.
*  The ASF licenses this file to You under the Apache License, Version 2.0
*  (the "License"); you may not use this file except in compliance with
*  the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
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
public class URIUtils
{
URIUtils() { throw new RuntimeException("Stub!"); }
public static  java.net.URI createURI(java.lang.String scheme, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  java.net.URI rewriteURI(java.net.URI uri, org.apache.http.HttpHost target, boolean dropFragment) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  java.net.URI rewriteURI(java.net.URI uri, org.apache.http.HttpHost target) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  java.net.URI resolve(java.net.URI baseURI, java.lang.String reference) { throw new RuntimeException("Stub!"); }
public static  java.net.URI resolve(java.net.URI baseURI, java.net.URI reference) { throw new RuntimeException("Stub!"); }
}
