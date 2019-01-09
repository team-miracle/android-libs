/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/params/AbstractHttpParams.java $
* $Revision: 542224 $
* $Date: 2007-05-28 06:34:04 -0700 (Mon, 28 May 2007) $
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
public abstract class AbstractHttpParams
  implements org.apache.http.params.HttpParams
{
protected  AbstractHttpParams() { throw new RuntimeException("Stub!"); }
public  long getLongParameter(java.lang.String name, long defaultValue) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams setLongParameter(java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public  int getIntParameter(java.lang.String name, int defaultValue) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams setIntParameter(java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public  double getDoubleParameter(java.lang.String name, double defaultValue) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams setDoubleParameter(java.lang.String name, double value) { throw new RuntimeException("Stub!"); }
public  boolean getBooleanParameter(java.lang.String name, boolean defaultValue) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams setBooleanParameter(java.lang.String name, boolean value) { throw new RuntimeException("Stub!"); }
public  boolean isParameterTrue(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean isParameterFalse(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
