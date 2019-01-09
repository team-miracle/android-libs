/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1995, 2006, Oracle and/or its affiliates. All rights reserved.
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
public class SecurityManager
{
public  SecurityManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean getInCheck() { throw new RuntimeException("Stub!"); }
protected  java.lang.Class[] getClassContext() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  java.lang.ClassLoader currentClassLoader() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  java.lang.Class<?> currentLoadedClass() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  int classDepth(java.lang.String name) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  int classLoaderDepth() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  boolean inClass(java.lang.String name) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  boolean inClassLoader() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getSecurityContext() { throw new RuntimeException("Stub!"); }
public  void checkPermission(java.security.Permission perm) { throw new RuntimeException("Stub!"); }
public  void checkPermission(java.security.Permission perm, java.lang.Object context) { throw new RuntimeException("Stub!"); }
public  void checkCreateClassLoader() { throw new RuntimeException("Stub!"); }
public  void checkAccess(java.lang.Thread t) { throw new RuntimeException("Stub!"); }
public  void checkAccess(java.lang.ThreadGroup g) { throw new RuntimeException("Stub!"); }
public  void checkExit(int status) { throw new RuntimeException("Stub!"); }
public  void checkExec(java.lang.String cmd) { throw new RuntimeException("Stub!"); }
public  void checkLink(java.lang.String lib) { throw new RuntimeException("Stub!"); }
public  void checkRead(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  void checkRead(java.lang.String file) { throw new RuntimeException("Stub!"); }
public  void checkRead(java.lang.String file, java.lang.Object context) { throw new RuntimeException("Stub!"); }
public  void checkWrite(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  void checkWrite(java.lang.String file) { throw new RuntimeException("Stub!"); }
public  void checkDelete(java.lang.String file) { throw new RuntimeException("Stub!"); }
public  void checkConnect(java.lang.String host, int port) { throw new RuntimeException("Stub!"); }
public  void checkConnect(java.lang.String host, int port, java.lang.Object context) { throw new RuntimeException("Stub!"); }
public  void checkListen(int port) { throw new RuntimeException("Stub!"); }
public  void checkAccept(java.lang.String host, int port) { throw new RuntimeException("Stub!"); }
public  void checkMulticast(java.net.InetAddress maddr) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void checkMulticast(java.net.InetAddress maddr, byte ttl) { throw new RuntimeException("Stub!"); }
public  void checkPropertiesAccess() { throw new RuntimeException("Stub!"); }
public  void checkPropertyAccess(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  boolean checkTopLevelWindow(java.lang.Object window) { throw new RuntimeException("Stub!"); }
public  void checkPrintJobAccess() { throw new RuntimeException("Stub!"); }
public  void checkSystemClipboardAccess() { throw new RuntimeException("Stub!"); }
public  void checkAwtEventQueueAccess() { throw new RuntimeException("Stub!"); }
public  void checkPackageAccess(java.lang.String pkg) { throw new RuntimeException("Stub!"); }
public  void checkPackageDefinition(java.lang.String pkg) { throw new RuntimeException("Stub!"); }
public  void checkSetFactory() { throw new RuntimeException("Stub!"); }
public  void checkMemberAccess(java.lang.Class<?> clazz, int which) { throw new RuntimeException("Stub!"); }
public  void checkSecurityAccess(java.lang.String target) { throw new RuntimeException("Stub!"); }
public  java.lang.ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected boolean inCheck;
}
