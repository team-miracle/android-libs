/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/entity/AbstractHttpEntity.java $
* $Revision: 496070 $
* $Date: 2007-01-14 04:18:34 -0800 (Sun, 14 Jan 2007) $
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
public abstract class AbstractHttpEntity
  implements org.apache.http.HttpEntity
{
protected  AbstractHttpEntity() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentType() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentEncoding() { throw new RuntimeException("Stub!"); }
public  boolean isChunked() { throw new RuntimeException("Stub!"); }
public  void setContentType(org.apache.http.Header contentType) { throw new RuntimeException("Stub!"); }
public  void setContentType(java.lang.String ctString) { throw new RuntimeException("Stub!"); }
public  void setContentEncoding(org.apache.http.Header contentEncoding) { throw new RuntimeException("Stub!"); }
public  void setContentEncoding(java.lang.String ceString) { throw new RuntimeException("Stub!"); }
public  void setChunked(boolean b) { throw new RuntimeException("Stub!"); }
public  void consumeContent() throws java.io.IOException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
protected boolean chunked;
protected org.apache.http.Header contentEncoding;
protected org.apache.http.Header contentType;
}
