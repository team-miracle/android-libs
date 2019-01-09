/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/cookie/BasicClientCookie.java $
* $Revision: 659191 $
* $Date: 2008-05-22 11:26:53 -0700 (Thu, 22 May 2008) $
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

package org.apache.http.impl.cookie;
@java.lang.Deprecated()
public class BasicClientCookie
  implements org.apache.http.cookie.SetCookie, org.apache.http.cookie.ClientCookie
{
public  BasicClientCookie(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue() { throw new RuntimeException("Stub!"); }
public  void setValue(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getComment() { throw new RuntimeException("Stub!"); }
public  void setComment(java.lang.String comment) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCommentURL() { throw new RuntimeException("Stub!"); }
public  java.util.Date getExpiryDate() { throw new RuntimeException("Stub!"); }
public  void setExpiryDate(java.util.Date expiryDate) { throw new RuntimeException("Stub!"); }
public  boolean isPersistent() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDomain() { throw new RuntimeException("Stub!"); }
public  void setDomain(java.lang.String domain) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  void setPath(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  boolean isSecure() { throw new RuntimeException("Stub!"); }
public  void setSecure(boolean secure) { throw new RuntimeException("Stub!"); }
public  int[] getPorts() { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  void setVersion(int version) { throw new RuntimeException("Stub!"); }
public  boolean isExpired(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  void setAttribute(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAttribute(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean containsAttribute(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
