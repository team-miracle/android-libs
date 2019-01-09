/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2000, 2014, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/


package java.util.logging;
public class Logger
{
protected  Logger(java.lang.String name, java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public static final  java.util.logging.Logger getGlobal() { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getLogger(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getLogger(java.lang.String name, java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getAnonymousLogger() { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getAnonymousLogger(java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public  java.util.ResourceBundle getResourceBundle() { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceBundleName() { throw new RuntimeException("Stub!"); }
public  void setFilter(java.util.logging.Filter newFilter) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.logging.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.LogRecord record) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level level, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level level, java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level level, java.lang.String msg, java.lang.Object param1) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level level, java.lang.String msg, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level level, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level level, java.lang.Throwable thrown, java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg, java.lang.Object param1) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Throwable thrown, java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void logrb(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void logrb(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg, java.lang.Object param1) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void logrb(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void logrb(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.util.ResourceBundle bundle, java.lang.String msg, java.lang.Object... params) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void logrb(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void logrb(java.util.logging.Level level, java.lang.String sourceClass, java.lang.String sourceMethod, java.util.ResourceBundle bundle, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void entering(java.lang.String sourceClass, java.lang.String sourceMethod) { throw new RuntimeException("Stub!"); }
public  void entering(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Object param1) { throw new RuntimeException("Stub!"); }
public  void entering(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void exiting(java.lang.String sourceClass, java.lang.String sourceMethod) { throw new RuntimeException("Stub!"); }
public  void exiting(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Object result) { throw new RuntimeException("Stub!"); }
public  void throwing(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void severe(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void warning(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void info(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void config(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void fine(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void finer(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void finest(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void severe(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void warning(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void info(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void config(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void fine(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void finer(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void finest(java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }
public  void setLevel(java.util.logging.Level newLevel) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.logging.Level getLevel() { throw new RuntimeException("Stub!"); }
public  boolean isLoggable(java.util.logging.Level level) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  void addHandler(java.util.logging.Handler handler) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void removeHandler(java.util.logging.Handler handler) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.logging.Handler[] getHandlers() { throw new RuntimeException("Stub!"); }
public  void setUseParentHandlers(boolean useParentHandlers) { throw new RuntimeException("Stub!"); }
public  boolean getUseParentHandlers() { throw new RuntimeException("Stub!"); }
public  void setResourceBundle(java.util.ResourceBundle bundle) { throw new RuntimeException("Stub!"); }
public  java.util.logging.Logger getParent() { throw new RuntimeException("Stub!"); }
public  void setParent(java.util.logging.Logger parent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String GLOBAL_LOGGER_NAME = "global";
@java.lang.Deprecated()
public static final java.util.logging.Logger global;
static { global = null; }
}
