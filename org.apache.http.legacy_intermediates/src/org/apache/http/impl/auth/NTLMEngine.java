/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/impl/auth/NTLMEngine.java $
* $Revision: 659788 $
* $Date: 2008-05-24 03:42:23 -0700 (Sat, 24 May 2008) $
*
* ====================================================================
*
*  Licensed to the Apache Software Foundation (ASF) under one or more
*  contributor license agreements.  See the NOTICE file distributed with
*  this work for additional information regarding copyright ownership.
*  The ASF licenses this file to You under the Apache License, Version 2.0
*  (the "License"); you may not use this file except in compliance with
*  the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http.impl.auth;
@java.lang.Deprecated()
public interface NTLMEngine
{
public abstract  java.lang.String generateType1Msg(java.lang.String domain, java.lang.String workstation) throws org.apache.http.impl.auth.NTLMEngineException;
public abstract  java.lang.String generateType3Msg(java.lang.String username, java.lang.String password, java.lang.String domain, java.lang.String workstation, java.lang.String challenge) throws org.apache.http.impl.auth.NTLMEngineException;
}
