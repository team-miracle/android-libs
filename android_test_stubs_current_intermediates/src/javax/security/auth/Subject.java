/*
* Copyright (c) 1998, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javax.security.auth;
public final class Subject
  implements java.io.Serializable
{
public  Subject() { throw new RuntimeException("Stub!"); }
public  Subject(boolean readOnly, java.util.Set<? extends java.security.Principal> principals, java.util.Set<?> pubCredentials, java.util.Set<?> privCredentials) { throw new RuntimeException("Stub!"); }
public  void setReadOnly() { throw new RuntimeException("Stub!"); }
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public static  javax.security.auth.Subject getSubject(java.security.AccessControlContext acc) { throw new RuntimeException("Stub!"); }
public static <T> T doAs(javax.security.auth.Subject subject, java.security.PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
public static <T> T doAs(javax.security.auth.Subject subject, java.security.PrivilegedExceptionAction<T> action) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static <T> T doAsPrivileged(javax.security.auth.Subject subject, java.security.PrivilegedAction<T> action, java.security.AccessControlContext acc) { throw new RuntimeException("Stub!"); }
public static <T> T doAsPrivileged(javax.security.auth.Subject subject, java.security.PrivilegedExceptionAction<T> action, java.security.AccessControlContext acc) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.security.Principal> getPrincipals() { throw new RuntimeException("Stub!"); }
public <T extends java.security.Principal> java.util.Set<T> getPrincipals(java.lang.Class<T> c) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Object> getPublicCredentials() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Object> getPrivateCredentials() { throw new RuntimeException("Stub!"); }
public <T> java.util.Set<T> getPublicCredentials(java.lang.Class<T> c) { throw new RuntimeException("Stub!"); }
public <T> java.util.Set<T> getPrivateCredentials(java.lang.Class<T> c) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
