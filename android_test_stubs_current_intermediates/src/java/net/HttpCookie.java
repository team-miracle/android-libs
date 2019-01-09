/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.net;
public final class HttpCookie
  implements java.lang.Cloneable
{
public  HttpCookie(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  java.util.List<java.net.HttpCookie> parse(java.lang.String header) { throw new RuntimeException("Stub!"); }
public  boolean hasExpired() { throw new RuntimeException("Stub!"); }
public  void setComment(java.lang.String purpose) { throw new RuntimeException("Stub!"); }
public  java.lang.String getComment() { throw new RuntimeException("Stub!"); }
public  void setCommentURL(java.lang.String purpose) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCommentURL() { throw new RuntimeException("Stub!"); }
public  void setDiscard(boolean discard) { throw new RuntimeException("Stub!"); }
public  boolean getDiscard() { throw new RuntimeException("Stub!"); }
public  void setPortlist(java.lang.String ports) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPortlist() { throw new RuntimeException("Stub!"); }
public  void setDomain(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDomain() { throw new RuntimeException("Stub!"); }
public  void setMaxAge(long expiry) { throw new RuntimeException("Stub!"); }
public  long getMaxAge() { throw new RuntimeException("Stub!"); }
public  void setPath(java.lang.String uri) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  void setSecure(boolean flag) { throw new RuntimeException("Stub!"); }
public  boolean getSecure() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  void setValue(java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue() { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  void setVersion(int v) { throw new RuntimeException("Stub!"); }
public  boolean isHttpOnly() { throw new RuntimeException("Stub!"); }
public  void setHttpOnly(boolean httpOnly) { throw new RuntimeException("Stub!"); }
public static  boolean domainMatches(java.lang.String domain, java.lang.String host) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
}
