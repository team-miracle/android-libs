/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/protocol/DefaultedHttpContext.java $
* $Revision: 654882 $
* $Date: 2008-05-09 09:58:59 -0700 (Fri, 09 May 2008) $
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

package org.apache.http.protocol;
@java.lang.Deprecated()
public final class DefaultedHttpContext
  implements org.apache.http.protocol.HttpContext
{
public  DefaultedHttpContext(org.apache.http.protocol.HttpContext local, org.apache.http.protocol.HttpContext defaults) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getAttribute(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  java.lang.Object removeAttribute(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  void setAttribute(java.lang.String id, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  org.apache.http.protocol.HttpContext getDefaults() { throw new RuntimeException("Stub!"); }
}
