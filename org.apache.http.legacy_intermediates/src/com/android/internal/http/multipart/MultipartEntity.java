/*
* $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//httpclient/src/java/org/apache/commons/httpclient/methods/multipart/MultipartRequestEntity.java,v 1.1 2004/10/06 03:39:59 mbecke Exp $
* $Revision: 502647 $
* $Date: 2007-02-02 17:22:54 +0100 (Fri, 02 Feb 2007) $
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

package com.android.internal.http.multipart;
public class MultipartEntity
  extends org.apache.http.entity.AbstractHttpEntity
{
public  MultipartEntity(com.android.internal.http.multipart.Part[] parts, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  MultipartEntity(com.android.internal.http.multipart.Part[] parts) { throw new RuntimeException("Stub!"); }
protected  byte[] getMultipartBoundary() { throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentType() { throw new RuntimeException("Stub!"); }
public  long getContentLength() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getContent() throws java.io.IOException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  boolean isStreaming() { throw new RuntimeException("Stub!"); }
public static final java.lang.String MULTIPART_BOUNDARY = "http.method.multipart.boundary";
protected com.android.internal.http.multipart.Part[] parts = null;
}
