/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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
public class MemoryHandler
  extends java.util.logging.Handler
{
public  MemoryHandler() { throw new RuntimeException("Stub!"); }
public  MemoryHandler(java.util.logging.Handler target, int size, java.util.logging.Level pushLevel) { throw new RuntimeException("Stub!"); }
public synchronized  void publish(java.util.logging.LogRecord record) { throw new RuntimeException("Stub!"); }
public synchronized  void push() { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  void close() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public synchronized  void setPushLevel(java.util.logging.Level newLevel) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.logging.Level getPushLevel() { throw new RuntimeException("Stub!"); }
public  boolean isLoggable(java.util.logging.LogRecord record) { throw new RuntimeException("Stub!"); }
}
