/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/params/HttpConnectionParams.java $
* $Revision: 576089 $
* $Date: 2007-09-16 05:39:56 -0700 (Sun, 16 Sep 2007) $
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
public final class HttpConnectionParams
  implements org.apache.http.params.CoreConnectionPNames
{
HttpConnectionParams() { throw new RuntimeException("Stub!"); }
public static  int getSoTimeout(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setSoTimeout(org.apache.http.params.HttpParams params, int timeout) { throw new RuntimeException("Stub!"); }
public static  boolean getTcpNoDelay(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setTcpNoDelay(org.apache.http.params.HttpParams params, boolean value) { throw new RuntimeException("Stub!"); }
public static  int getSocketBufferSize(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setSocketBufferSize(org.apache.http.params.HttpParams params, int size) { throw new RuntimeException("Stub!"); }
public static  int getLinger(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setLinger(org.apache.http.params.HttpParams params, int value) { throw new RuntimeException("Stub!"); }
public static  int getConnectionTimeout(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setConnectionTimeout(org.apache.http.params.HttpParams params, int timeout) { throw new RuntimeException("Stub!"); }
public static  boolean isStaleCheckingEnabled(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setStaleCheckingEnabled(org.apache.http.params.HttpParams params, boolean value) { throw new RuntimeException("Stub!"); }
}
