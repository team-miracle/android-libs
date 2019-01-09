/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/cookie/SetCookie.java $
* $Revision: 617193 $
* $Date: 2008-01-31 11:26:47 -0800 (Thu, 31 Jan 2008) $
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

package org.apache.http.cookie;
@java.lang.Deprecated()
public interface SetCookie
  extends org.apache.http.cookie.Cookie
{
public abstract  void setValue(java.lang.String value);
public abstract  void setComment(java.lang.String comment);
public abstract  void setExpiryDate(java.util.Date expiryDate);
public abstract  void setDomain(java.lang.String domain);
public abstract  void setPath(java.lang.String path);
public abstract  void setSecure(boolean secure);
public abstract  void setVersion(int version);
}
