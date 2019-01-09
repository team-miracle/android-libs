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
public class SimpleLog
  implements org.apache.commons.logging.Log, java.io.Serializable
{
public  SimpleLog(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setLevel(int currentLogLevel) { throw new RuntimeException("Stub!"); }
public  int getLevel() { throw new RuntimeException("Stub!"); }
protected  void log(int type, java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
protected  void write(java.lang.StringBuffer buffer) { throw new RuntimeException("Stub!"); }
protected  boolean isLevelEnabled(int logLevel) { throw new RuntimeException("Stub!"); }
public final  void debug(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public final  void debug(java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public final  void trace(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public final  void trace(java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public final  void info(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public final  void info(java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public final  void warn(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public final  void warn(java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public final  void error(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public final  void error(java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public final  void fatal(java.lang.Object message) { throw new RuntimeException("Stub!"); }
public final  void fatal(java.lang.Object message, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public final  boolean isDebugEnabled() { throw new RuntimeException("Stub!"); }
public final  boolean isErrorEnabled() { throw new RuntimeException("Stub!"); }
public final  boolean isFatalEnabled() { throw new RuntimeException("Stub!"); }
public final  boolean isInfoEnabled() { throw new RuntimeException("Stub!"); }
public final  boolean isTraceEnabled() { throw new RuntimeException("Stub!"); }
public final  boolean isWarnEnabled() { throw new RuntimeException("Stub!"); }
protected static final java.lang.String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
public static final int LOG_LEVEL_ALL = 0;
public static final int LOG_LEVEL_DEBUG = 2;
public static final int LOG_LEVEL_ERROR = 5;
public static final int LOG_LEVEL_FATAL = 6;
public static final int LOG_LEVEL_INFO = 3;
public static final int LOG_LEVEL_OFF = 7;
public static final int LOG_LEVEL_TRACE = 1;
public static final int LOG_LEVEL_WARN = 4;
protected int currentLogLevel;
protected static java.text.DateFormat dateFormatter;
protected static java.lang.String dateTimeFormat;
protected java.lang.String logName;
protected static boolean showDateTime;
protected static boolean showLogName;
protected static boolean showShortName;
protected static final java.util.Properties simpleLogProps;
protected static final java.lang.String systemPrefix = "org.apache.commons.logging.simplelog.";
static { simpleLogProps = null; }
}
