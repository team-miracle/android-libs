/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/routing/RouteInfo.java $
* $Revision: 652200 $
* $Date: 2008-04-29 17:22:43 -0700 (Tue, 29 Apr 2008) $
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

package org.apache.http.conn.routing;
@java.lang.Deprecated()
public interface RouteInfo
{
public static enum TunnelType
{
PLAIN(),
TUNNELLED();
}
public static enum LayerType
{
LAYERED(),
PLAIN();
}
public abstract  org.apache.http.HttpHost getTargetHost();
public abstract  java.net.InetAddress getLocalAddress();
public abstract  int getHopCount();
public abstract  org.apache.http.HttpHost getHopTarget(int hop);
public abstract  org.apache.http.HttpHost getProxyHost();
public abstract  org.apache.http.conn.routing.RouteInfo.TunnelType getTunnelType();
public abstract  boolean isTunnelled();
public abstract  org.apache.http.conn.routing.RouteInfo.LayerType getLayerType();
public abstract  boolean isLayered();
public abstract  boolean isSecure();
}
