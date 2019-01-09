/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1995, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.lang;
public class Runtime
{
Runtime() { throw new RuntimeException("Stub!"); }
public static  java.lang.Runtime getRuntime() { throw new RuntimeException("Stub!"); }
public  void exit(int status) { throw new RuntimeException("Stub!"); }
public  void addShutdownHook(java.lang.Thread hook) { throw new RuntimeException("Stub!"); }
public  boolean removeShutdownHook(java.lang.Thread hook) { throw new RuntimeException("Stub!"); }
public  void halt(int status) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void runFinalizersOnExit(boolean value) { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String command) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String command, java.lang.String[] envp) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String command, java.lang.String[] envp, java.io.File dir) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String[] cmdarray) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String[] cmdarray, java.lang.String[] envp) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String[] cmdarray, java.lang.String[] envp, java.io.File dir) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int availableProcessors() { throw new RuntimeException("Stub!"); }
public native  long freeMemory();
public native  long totalMemory();
public native  long maxMemory();
public native  void gc();
public  void runFinalization() { throw new RuntimeException("Stub!"); }
public  void traceInstructions(boolean on) { throw new RuntimeException("Stub!"); }
public  void traceMethodCalls(boolean on) { throw new RuntimeException("Stub!"); }
public  void load(java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  void loadLibrary(java.lang.String libname) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.io.InputStream getLocalizedInputStream(java.io.InputStream in) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.io.OutputStream getLocalizedOutputStream(java.io.OutputStream out) { throw new RuntimeException("Stub!"); }
}
