/*
* Copyright 2001-2004 The Apache Software Foundation.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.commons.logging.impl;
@java.lang.Deprecated()
public class LogFactoryImpl
  extends org.apache.commons.logging.LogFactory
{
public  LogFactoryImpl() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getAttribute(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getAttributeNames() { throw new RuntimeException("Stub!"); }
public  org.apache.commons.logging.Log getInstance(java.lang.Class clazz) throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
public  org.apache.commons.logging.Log getInstance(java.lang.String name) throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void removeAttribute(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setAttribute(java.lang.String name, java.lang.Object value) { throw new RuntimeException("Stub!"); }
protected static  java.lang.ClassLoader getContextClassLoader() throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
protected static  boolean isDiagnosticsEnabled() { throw new RuntimeException("Stub!"); }
protected static  java.lang.ClassLoader getClassLoader(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
protected  void logDiagnostic(java.lang.String msg) { throw new RuntimeException("Stub!"); }
@Deprecated
protected  java.lang.String getLogClassName() { throw new RuntimeException("Stub!"); }
@Deprecated
protected  java.lang.reflect.Constructor getLogConstructor() throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
@Deprecated
protected  boolean isJdk13LumberjackAvailable() { throw new RuntimeException("Stub!"); }
@Deprecated
protected  boolean isJdk14Available() { throw new RuntimeException("Stub!"); }
@Deprecated
protected  boolean isLog4JAvailable() { throw new RuntimeException("Stub!"); }
protected  org.apache.commons.logging.Log newInstance(java.lang.String name) throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
public static final java.lang.String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
public static final java.lang.String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
public static final java.lang.String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
public static final java.lang.String LOG_PROPERTY = "org.apache.commons.logging.Log";
protected static final java.lang.String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
protected java.util.Hashtable attributes;
protected java.util.Hashtable instances;
protected java.lang.reflect.Constructor logConstructor;
protected java.lang.Class[] logConstructorSignature = null;
protected java.lang.reflect.Method logMethod;
protected java.lang.Class[] logMethodSignature = null;
}
