/*
* Copyright 2001-2006 The Apache Software Foundation.
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

package org.apache.commons.logging;
@java.lang.Deprecated()
public abstract class LogFactory
{
protected  LogFactory() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object getAttribute(java.lang.String name);
public abstract  java.lang.String[] getAttributeNames();
public abstract  org.apache.commons.logging.Log getInstance(java.lang.Class clazz) throws org.apache.commons.logging.LogConfigurationException;
public abstract  org.apache.commons.logging.Log getInstance(java.lang.String name) throws org.apache.commons.logging.LogConfigurationException;
public abstract  void release();
public abstract  void removeAttribute(java.lang.String name);
public abstract  void setAttribute(java.lang.String name, java.lang.Object value);
public static  org.apache.commons.logging.LogFactory getFactory() throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
public static  org.apache.commons.logging.Log getLog(java.lang.Class clazz) throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
public static  org.apache.commons.logging.Log getLog(java.lang.String name) throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
public static  void release(java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
public static  void releaseAll() { throw new RuntimeException("Stub!"); }
protected static  java.lang.ClassLoader getClassLoader(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
protected static  java.lang.ClassLoader getContextClassLoader() throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
protected static  java.lang.ClassLoader directGetContextClassLoader() throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
protected static  org.apache.commons.logging.LogFactory newFactory(java.lang.String factoryClass, java.lang.ClassLoader classLoader, java.lang.ClassLoader contextClassLoader) throws org.apache.commons.logging.LogConfigurationException { throw new RuntimeException("Stub!"); }
protected static  org.apache.commons.logging.LogFactory newFactory(java.lang.String factoryClass, java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
protected static  java.lang.Object createFactory(java.lang.String factoryClass, java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
protected static  boolean isDiagnosticsEnabled() { throw new RuntimeException("Stub!"); }
protected static final  void logRawDiagnostic(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  java.lang.String objectId(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
public static final java.lang.String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
public static final java.lang.String FACTORY_PROPERTIES = "commons-logging.properties";
public static final java.lang.String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
public static final java.lang.String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
public static final java.lang.String PRIORITY_KEY = "priority";
protected static final java.lang.String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
public static final java.lang.String TCCL_KEY = "use_tccl";
protected static java.util.Hashtable factories;
protected static org.apache.commons.logging.LogFactory nullClassLoaderFactory;
}
