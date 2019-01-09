/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1995, 2015, Oracle and/or its affiliates. All rights reserved.
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
public final class URL
  implements java.io.Serializable
{
public  URL(java.lang.String protocol, java.lang.String host, int port, java.lang.String file) throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  URL(java.lang.String protocol, java.lang.String host, java.lang.String file) throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  URL(java.lang.String protocol, java.lang.String host, int port, java.lang.String file, java.net.URLStreamHandler handler) throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  URL(java.lang.String spec) throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  URL(java.net.URL context, java.lang.String spec) throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  URL(java.net.URL context, java.lang.String spec, java.net.URLStreamHandler handler) throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  java.lang.String getQuery() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAuthority() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  int getDefaultPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProtocol() { throw new RuntimeException("Stub!"); }
public  java.lang.String getHost() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFile() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRef() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public synchronized  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean sameFile(java.net.URL other) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toExternalForm() { throw new RuntimeException("Stub!"); }
public  java.net.URI toURI() throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  java.net.URLConnection openConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.URLConnection openConnection(java.net.Proxy proxy) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream openStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getContent(java.lang.Class[] classes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void setURLStreamHandlerFactory(java.net.URLStreamHandlerFactory fac) { throw new RuntimeException("Stub!"); }
}
