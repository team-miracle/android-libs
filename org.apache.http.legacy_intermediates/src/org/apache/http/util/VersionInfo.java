/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/util/VersionInfo.java $
* $Revision: 554888 $
* $Date: 2007-07-10 02:46:36 -0700 (Tue, 10 Jul 2007) $
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

package org.apache.http.util;
@java.lang.Deprecated()
public class VersionInfo
{
protected  VersionInfo(java.lang.String pckg, java.lang.String module, java.lang.String release, java.lang.String time, java.lang.String clsldr) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getPackage() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getModule() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getRelease() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getTimestamp() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getClassloader() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.util.VersionInfo[] loadVersionInfo(java.lang.String[] pckgs, java.lang.ClassLoader clsldr) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String pckg, java.lang.ClassLoader clsldr) { throw new RuntimeException("Stub!"); }
protected static final  org.apache.http.util.VersionInfo fromMap(java.lang.String pckg, java.util.Map info, java.lang.ClassLoader clsldr) { throw new RuntimeException("Stub!"); }
public static final java.lang.String PROPERTY_MODULE = "info.module";
public static final java.lang.String PROPERTY_RELEASE = "info.release";
public static final java.lang.String PROPERTY_TIMESTAMP = "info.timestamp";
public static final java.lang.String UNAVAILABLE = "UNAVAILABLE";
public static final java.lang.String VERSION_PROPERTY_FILE = "version.properties";
}
