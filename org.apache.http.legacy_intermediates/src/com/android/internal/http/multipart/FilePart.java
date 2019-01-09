/*
* $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//httpclient/src/java/org/apache/commons/httpclient/methods/multipart/FilePart.java,v 1.19 2004/04/18 23:51:37 jsdever Exp $
* $Revision: 480424 $
* $Date: 2006-11-29 06:56:49 +0100 (Wed, 29 Nov 2006) $
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
public class FilePart
  extends com.android.internal.http.multipart.PartBase
{
public  FilePart(java.lang.String name, com.android.internal.http.multipart.PartSource partSource, java.lang.String contentType, java.lang.String charset) { super((java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public  FilePart(java.lang.String name, com.android.internal.http.multipart.PartSource partSource) { super((java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public  FilePart(java.lang.String name, java.io.File file) throws java.io.FileNotFoundException { super((java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public  FilePart(java.lang.String name, java.io.File file, java.lang.String contentType, java.lang.String charset) throws java.io.FileNotFoundException { super((java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public  FilePart(java.lang.String name, java.lang.String fileName, java.io.File file) throws java.io.FileNotFoundException { super((java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public  FilePart(java.lang.String name, java.lang.String fileName, java.io.File file, java.lang.String contentType, java.lang.String charset) throws java.io.FileNotFoundException { super((java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  void sendDispositionHeader(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void sendData(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  com.android.internal.http.multipart.PartSource getSource() { throw new RuntimeException("Stub!"); }
protected  long lengthOfData() { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFAULT_CHARSET = "ISO-8859-1";
public static final java.lang.String DEFAULT_CONTENT_TYPE = "application/octet-stream";
public static final java.lang.String DEFAULT_TRANSFER_ENCODING = "binary";
protected static final java.lang.String FILE_NAME = "; filename=";
}
