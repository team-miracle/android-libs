/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/HttpEntity.java $
* $Revision: 645824 $
* $Date: 2008-04-08 03:12:41 -0700 (Tue, 08 Apr 2008) $
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

package org.apache.http;
@java.lang.Deprecated()
public interface HttpEntity
{
public abstract  boolean isRepeatable();
public abstract  boolean isChunked();
public abstract  long getContentLength();
public abstract  org.apache.http.Header getContentType();
public abstract  org.apache.http.Header getContentEncoding();
public abstract  java.io.InputStream getContent() throws java.io.IOException, java.lang.IllegalStateException;
public abstract  void writeTo(java.io.OutputStream outstream) throws java.io.IOException;
public abstract  boolean isStreaming();
public abstract  void consumeContent() throws java.io.IOException;
}
