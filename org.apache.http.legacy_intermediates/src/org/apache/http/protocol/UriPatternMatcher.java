/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/protocol/UriPatternMatcher.java $
* $Revision: 630662 $
* $Date: 2008-02-24 11:40:51 -0800 (Sun, 24 Feb 2008) $
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
public class UriPatternMatcher
{
public  UriPatternMatcher() { throw new RuntimeException("Stub!"); }
public  void register(java.lang.String pattern, java.lang.Object handler) { throw new RuntimeException("Stub!"); }
public  void unregister(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  void setHandlers(java.util.Map map) { throw new RuntimeException("Stub!"); }
public  java.lang.Object lookup(java.lang.String requestURI) { throw new RuntimeException("Stub!"); }
protected  boolean matchUriRequestPattern(java.lang.String pattern, java.lang.String requestUri) { throw new RuntimeException("Stub!"); }
}
