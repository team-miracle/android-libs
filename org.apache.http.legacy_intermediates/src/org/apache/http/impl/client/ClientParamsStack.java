/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/client/ClientParamsStack.java $
* $Revision: 673450 $
* $Date: 2008-07-02 10:35:05 -0700 (Wed, 02 Jul 2008) $
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

package org.apache.http.impl.client;
@java.lang.Deprecated()
public class ClientParamsStack
  extends org.apache.http.params.AbstractHttpParams
{
public  ClientParamsStack(org.apache.http.params.HttpParams aparams, org.apache.http.params.HttpParams cparams, org.apache.http.params.HttpParams rparams, org.apache.http.params.HttpParams oparams) { throw new RuntimeException("Stub!"); }
public  ClientParamsStack(org.apache.http.impl.client.ClientParamsStack stack) { throw new RuntimeException("Stub!"); }
public  ClientParamsStack(org.apache.http.impl.client.ClientParamsStack stack, org.apache.http.params.HttpParams aparams, org.apache.http.params.HttpParams cparams, org.apache.http.params.HttpParams rparams, org.apache.http.params.HttpParams oparams) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getApplicationParams() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getClientParams() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getRequestParams() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getOverrideParams() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getParameter(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams setParameter(java.lang.String name, java.lang.Object value) throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  boolean removeParameter(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams copy() { throw new RuntimeException("Stub!"); }
protected final org.apache.http.params.HttpParams applicationParams;
protected final org.apache.http.params.HttpParams clientParams;
protected final org.apache.http.params.HttpParams overrideParams;
protected final org.apache.http.params.HttpParams requestParams;
}
