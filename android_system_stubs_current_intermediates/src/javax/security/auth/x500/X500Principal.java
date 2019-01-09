/*
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

package javax.security.auth.x500;
public final class X500Principal
  implements java.security.Principal, java.io.Serializable
{
public  X500Principal(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  X500Principal(java.lang.String name, java.util.Map<java.lang.String, java.lang.String> keywordMap) { throw new RuntimeException("Stub!"); }
public  X500Principal(byte[] name) { throw new RuntimeException("Stub!"); }
public  X500Principal(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName(java.lang.String format) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName(java.lang.String format, java.util.Map<java.lang.String, java.lang.String> oidMap) { throw new RuntimeException("Stub!"); }
public  byte[] getEncoded() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CANONICAL = "CANONICAL";
public static final java.lang.String RFC1779 = "RFC1779";
public static final java.lang.String RFC2253 = "RFC2253";
}
