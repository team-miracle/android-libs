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

package org.apache.commons.logging;
@java.lang.Deprecated()
public class LogSource
{
LogSource() { throw new RuntimeException("Stub!"); }
public static  void setLogImplementation(java.lang.String classname) throws java.lang.LinkageError, java.lang.ExceptionInInitializerError, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public static  void setLogImplementation(java.lang.Class logclass) throws java.lang.LinkageError, java.lang.ExceptionInInitializerError, java.lang.NoSuchMethodException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public static  org.apache.commons.logging.Log getInstance(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  org.apache.commons.logging.Log getInstance(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
public static  org.apache.commons.logging.Log makeNewLogInstance(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getLogNames() { throw new RuntimeException("Stub!"); }
protected static boolean jdk14IsAvailable;
protected static boolean log4jIsAvailable;
protected static java.lang.reflect.Constructor logImplctor;
protected static java.util.Hashtable logs;
}
