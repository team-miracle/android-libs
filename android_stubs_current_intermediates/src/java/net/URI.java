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

package java.net;
public final class URI
  implements java.lang.Comparable<java.net.URI>, java.io.Serializable
{
public  URI(java.lang.String str) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  URI(java.lang.String scheme, java.lang.String userInfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  URI(java.lang.String scheme, java.lang.String authority, java.lang.String path, java.lang.String query, java.lang.String fragment) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  URI(java.lang.String scheme, java.lang.String host, java.lang.String path, java.lang.String fragment) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  URI(java.lang.String scheme, java.lang.String ssp, java.lang.String fragment) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  java.net.URI create(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.net.URI parseServerAuthority() throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  java.net.URI normalize() { throw new RuntimeException("Stub!"); }
public  java.net.URI resolve(java.net.URI uri) { throw new RuntimeException("Stub!"); }
public  java.net.URI resolve(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.net.URI relativize(java.net.URI uri) { throw new RuntimeException("Stub!"); }
public  java.net.URL toURL() throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  java.lang.String getScheme() { throw new RuntimeException("Stub!"); }
public  boolean isAbsolute() { throw new RuntimeException("Stub!"); }
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRawSchemeSpecificPart() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSchemeSpecificPart() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRawAuthority() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAuthority() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRawUserInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getHost() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRawPath() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRawQuery() { throw new RuntimeException("Stub!"); }
public  java.lang.String getQuery() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRawFragment() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFragment() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ob) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int compareTo(java.net.URI that) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toASCIIString() { throw new RuntimeException("Stub!"); }
}
