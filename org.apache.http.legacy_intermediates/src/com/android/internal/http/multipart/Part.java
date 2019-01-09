/*
* $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//httpclient/src/java/org/apache/commons/httpclient/methods/multipart/Part.java,v 1.16 2005/01/14 21:16:40 olegk Exp $
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
public abstract class Part
{
public  Part() { throw new RuntimeException("Stub!"); }
@Deprecated
public static  java.lang.String getBoundary() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getName();
public abstract  java.lang.String getContentType();
public abstract  java.lang.String getCharSet();
public abstract  java.lang.String getTransferEncoding();
protected  byte[] getPartBoundary() { throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
protected  void sendStart(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void sendDispositionHeader(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void sendContentTypeHeader(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void sendTransferEncodingHeader(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void sendEndOfHeader(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  void sendData(java.io.OutputStream out) throws java.io.IOException;
protected abstract  long lengthOfData() throws java.io.IOException;
protected  void sendEnd(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void send(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long length() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  void sendParts(java.io.OutputStream out, com.android.internal.http.multipart.Part[] parts) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void sendParts(java.io.OutputStream out, com.android.internal.http.multipart.Part[] parts, byte[] partBoundary) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  long getLengthOfParts(com.android.internal.http.multipart.Part[] parts) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  long getLengthOfParts(com.android.internal.http.multipart.Part[] parts, byte[] partBoundary) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@Deprecated
protected static final java.lang.String BOUNDARY = "----------------314159265358979323846";
@Deprecated
protected static final byte[] BOUNDARY_BYTES = null;
protected static final java.lang.String CHARSET = "; charset=";
protected static final byte[] CHARSET_BYTES = null;
protected static final java.lang.String CONTENT_DISPOSITION = "Content-Disposition: form-data; name=";
protected static final byte[] CONTENT_DISPOSITION_BYTES = null;
protected static final java.lang.String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding: ";
protected static final byte[] CONTENT_TRANSFER_ENCODING_BYTES = null;
protected static final java.lang.String CONTENT_TYPE = "Content-Type: ";
protected static final byte[] CONTENT_TYPE_BYTES = null;
protected static final java.lang.String CRLF = "\r\n";
protected static final byte[] CRLF_BYTES = null;
protected static final java.lang.String EXTRA = "--";
protected static final byte[] EXTRA_BYTES = null;
protected static final java.lang.String QUOTE = "\"";
protected static final byte[] QUOTE_BYTES = null;
}
