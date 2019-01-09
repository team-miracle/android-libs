/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/DefaultConnectionReuseStrategy.java $
* $Revision: 602537 $
* $Date: 2007-12-08 11:42:06 -0800 (Sat, 08 Dec 2007) $
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

package org.apache.http.impl;
@java.lang.Deprecated()
public class DefaultConnectionReuseStrategy
  implements org.apache.http.ConnectionReuseStrategy
{
public  DefaultConnectionReuseStrategy() { throw new RuntimeException("Stub!"); }
public  boolean keepAlive(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.TokenIterator createTokenIterator(org.apache.http.HeaderIterator hit) { throw new RuntimeException("Stub!"); }
}
