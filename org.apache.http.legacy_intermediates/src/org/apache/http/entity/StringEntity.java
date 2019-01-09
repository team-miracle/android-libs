/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/entity/StringEntity.java $
* $Revision: 618367 $
* $Date: 2008-02-04 10:26:06 -0800 (Mon, 04 Feb 2008) $
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

package org.apache.http.entity;
@java.lang.Deprecated()
public class StringEntity
  extends org.apache.http.entity.AbstractHttpEntity
{
public  StringEntity(java.lang.String s, java.lang.String charset) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  StringEntity(java.lang.String s) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
public  long getContentLength() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.OutputStream outstream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isStreaming() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected final byte[] content = null;
}
