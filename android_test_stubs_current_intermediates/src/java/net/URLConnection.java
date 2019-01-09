/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1995, 2016, Oracle and/or its affiliates. All rights reserved.
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
public abstract class URLConnection
{
protected  URLConnection(java.net.URL url) { throw new RuntimeException("Stub!"); }
public static synchronized  java.net.FileNameMap getFileNameMap() { throw new RuntimeException("Stub!"); }
public static  void setFileNameMap(java.net.FileNameMap map) { throw new RuntimeException("Stub!"); }
public abstract  void connect() throws java.io.IOException;
public  void setConnectTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getConnectTimeout() { throw new RuntimeException("Stub!"); }
public  void setReadTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getReadTimeout() { throw new RuntimeException("Stub!"); }
public  java.net.URL getURL() { throw new RuntimeException("Stub!"); }
public  int getContentLength() { throw new RuntimeException("Stub!"); }
public  long getContentLengthLong() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentEncoding() { throw new RuntimeException("Stub!"); }
public  long getExpiration() { throw new RuntimeException("Stub!"); }
public  long getDate() { throw new RuntimeException("Stub!"); }
public  long getLastModified() { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderField(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() { throw new RuntimeException("Stub!"); }
public  int getHeaderFieldInt(java.lang.String name, int Default) { throw new RuntimeException("Stub!"); }
public  long getHeaderFieldLong(java.lang.String name, long Default) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  long getHeaderFieldDate(java.lang.String name, long Default) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderFieldKey(int n) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderField(int n) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getContent(java.lang.Class[] classes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.security.Permission getPermission() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setDoInput(boolean doinput) { throw new RuntimeException("Stub!"); }
public  boolean getDoInput() { throw new RuntimeException("Stub!"); }
public  void setDoOutput(boolean dooutput) { throw new RuntimeException("Stub!"); }
public  boolean getDoOutput() { throw new RuntimeException("Stub!"); }
public  void setAllowUserInteraction(boolean allowuserinteraction) { throw new RuntimeException("Stub!"); }
public  boolean getAllowUserInteraction() { throw new RuntimeException("Stub!"); }
public static  void setDefaultAllowUserInteraction(boolean defaultallowuserinteraction) { throw new RuntimeException("Stub!"); }
public static  boolean getDefaultAllowUserInteraction() { throw new RuntimeException("Stub!"); }
public  void setUseCaches(boolean usecaches) { throw new RuntimeException("Stub!"); }
public  boolean getUseCaches() { throw new RuntimeException("Stub!"); }
public  void setIfModifiedSince(long ifmodifiedsince) { throw new RuntimeException("Stub!"); }
public  long getIfModifiedSince() { throw new RuntimeException("Stub!"); }
public  boolean getDefaultUseCaches() { throw new RuntimeException("Stub!"); }
public  void setDefaultUseCaches(boolean defaultusecaches) { throw new RuntimeException("Stub!"); }
public  void setRequestProperty(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void addRequestProperty(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getRequestProperty(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void setDefaultRequestProperty(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.String getDefaultRequestProperty(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static synchronized  void setContentHandlerFactory(java.net.ContentHandlerFactory fac) { throw new RuntimeException("Stub!"); }
public static  java.lang.String guessContentTypeFromName(java.lang.String fname) { throw new RuntimeException("Stub!"); }
public static  java.lang.String guessContentTypeFromStream(java.io.InputStream is) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected boolean allowUserInteraction;
protected boolean connected;
protected boolean doInput;
protected boolean doOutput;
protected long ifModifiedSince;
protected java.net.URL url;
protected boolean useCaches;
}
