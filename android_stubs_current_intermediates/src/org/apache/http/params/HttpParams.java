/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/params/HttpParams.java $
* $Revision: 610763 $
* $Date: 2008-01-10 04:01:13 -0800 (Thu, 10 Jan 2008) $
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
public interface HttpParams
{
public abstract  java.lang.Object getParameter(java.lang.String name);
public abstract  org.apache.http.params.HttpParams setParameter(java.lang.String name, java.lang.Object value);
public abstract  org.apache.http.params.HttpParams copy();
public abstract  boolean removeParameter(java.lang.String name);
public abstract  long getLongParameter(java.lang.String name, long defaultValue);
public abstract  org.apache.http.params.HttpParams setLongParameter(java.lang.String name, long value);
public abstract  int getIntParameter(java.lang.String name, int defaultValue);
public abstract  org.apache.http.params.HttpParams setIntParameter(java.lang.String name, int value);
public abstract  double getDoubleParameter(java.lang.String name, double defaultValue);
public abstract  org.apache.http.params.HttpParams setDoubleParameter(java.lang.String name, double value);
public abstract  boolean getBooleanParameter(java.lang.String name, boolean defaultValue);
public abstract  org.apache.http.params.HttpParams setBooleanParameter(java.lang.String name, boolean value);
public abstract  boolean isParameterTrue(java.lang.String name);
public abstract  boolean isParameterFalse(java.lang.String name);
}
