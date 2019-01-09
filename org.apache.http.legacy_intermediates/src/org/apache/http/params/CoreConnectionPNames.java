/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/params/CoreConnectionPNames.java $
* $Revision: 576077 $
* $Date: 2007-09-16 04:50:22 -0700 (Sun, 16 Sep 2007) $
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

package org.apache.http.params;
@java.lang.Deprecated()
public interface CoreConnectionPNames
{
public static final java.lang.String CONNECTION_TIMEOUT = "http.connection.timeout";
public static final java.lang.String MAX_HEADER_COUNT = "http.connection.max-header-count";
public static final java.lang.String MAX_LINE_LENGTH = "http.connection.max-line-length";
public static final java.lang.String SOCKET_BUFFER_SIZE = "http.socket.buffer-size";
public static final java.lang.String SO_LINGER = "http.socket.linger";
public static final java.lang.String SO_TIMEOUT = "http.socket.timeout";
public static final java.lang.String STALE_CONNECTION_CHECK = "http.connection.stalecheck";
public static final java.lang.String TCP_NODELAY = "http.tcp.nodelay";
}
