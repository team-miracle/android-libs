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
public class Jdk14Logger
  implements org.apache.commons.logging.Log, java.io.Serializable
{
public  Jdk14Logger(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void debug(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public  void debug(java.lang.Object message, java.lang.Throwable exception) { throw new RuntimeException("Stub!"); }
public  void error(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public  void error(java.lang.Object message, java.lang.Throwable exception) { throw new RuntimeException("Stub!"); }
public  void fatal(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public  void fatal(java.lang.Object message, java.lang.Throwable exception) { throw new RuntimeException("Stub!"); }
public  java.util.logging.Logger getLogger() { throw new RuntimeException("Stub!"); }
public  void info(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public  void info(java.lang.Object message, java.lang.Throwable exception) { throw new RuntimeException("Stub!"); }
public  boolean isDebugEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isErrorEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isFatalEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isInfoEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isTraceEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isWarnEnabled() { throw new RuntimeException("Stub!"); }
public  void trace(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public  void trace(java.lang.Object message, java.lang.Throwable exception) { throw new RuntimeException("Stub!"); }
public  void warn(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public  void warn(java.lang.Object message, java.lang.Throwable exception) { throw new RuntimeException("Stub!"); }
protected static final java.util.logging.Level dummyLevel;
protected transient java.util.logging.Logger logger;
protected java.lang.String name;
static { dummyLevel = null; }
}
