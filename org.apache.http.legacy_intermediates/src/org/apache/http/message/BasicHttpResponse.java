/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicHttpResponse.java $
* $Revision: 573864 $
* $Date: 2007-09-08 08:53:25 -0700 (Sat, 08 Sep 2007) $
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
public class BasicHttpResponse
  extends org.apache.http.message.AbstractHttpMessage
  implements org.apache.http.HttpResponse
{
public  BasicHttpResponse(org.apache.http.StatusLine statusline, org.apache.http.ReasonPhraseCatalog catalog, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  BasicHttpResponse(org.apache.http.StatusLine statusline) { throw new RuntimeException("Stub!"); }
public  BasicHttpResponse(org.apache.http.ProtocolVersion ver, int code, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  org.apache.http.ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); }
public  org.apache.http.StatusLine getStatusLine() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpEntity getEntity() { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public  void setStatusLine(org.apache.http.StatusLine statusline) { throw new RuntimeException("Stub!"); }
public  void setStatusLine(org.apache.http.ProtocolVersion ver, int code) { throw new RuntimeException("Stub!"); }
public  void setStatusLine(org.apache.http.ProtocolVersion ver, int code, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  void setStatusCode(int code) { throw new RuntimeException("Stub!"); }
public  void setReasonPhrase(java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  void setEntity(org.apache.http.HttpEntity entity) { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
protected  java.lang.String getReason(int code) { throw new RuntimeException("Stub!"); }
}
