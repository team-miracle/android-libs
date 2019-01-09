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

package java.net;
public abstract class URLStreamHandler
{
public  URLStreamHandler() { throw new RuntimeException("Stub!"); }
protected abstract  java.net.URLConnection openConnection(java.net.URL u) throws java.io.IOException;
protected  java.net.URLConnection openConnection(java.net.URL u, java.net.Proxy p) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void parseURL(java.net.URL u, java.lang.String spec, int start, int limit) { throw new RuntimeException("Stub!"); }
protected  int getDefaultPort() { throw new RuntimeException("Stub!"); }
protected  boolean equals(java.net.URL u1, java.net.URL u2) { throw new RuntimeException("Stub!"); }
protected  int hashCode(java.net.URL u) { throw new RuntimeException("Stub!"); }
protected  boolean sameFile(java.net.URL u1, java.net.URL u2) { throw new RuntimeException("Stub!"); }
protected synchronized  java.net.InetAddress getHostAddress(java.net.URL u) { throw new RuntimeException("Stub!"); }
protected  boolean hostsEqual(java.net.URL u1, java.net.URL u2) { throw new RuntimeException("Stub!"); }
protected  java.lang.String toExternalForm(java.net.URL u) { throw new RuntimeException("Stub!"); }
protected  void setURL(java.net.URL u, java.lang.String protocol, java.lang.String host, int port, java.lang.String authority, java.lang.String userInfo, java.lang.String path, java.lang.String query, java.lang.String ref) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  void setURL(java.net.URL u, java.lang.String protocol, java.lang.String host, int port, java.lang.String file, java.lang.String ref) { throw new RuntimeException("Stub!"); }
}
