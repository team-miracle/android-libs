/*
* Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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
public abstract class HttpURLConnection
  extends java.net.URLConnection
{
protected  HttpURLConnection(java.net.URL u) { super((java.net.URL)null); throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderFieldKey(int n) { throw new RuntimeException("Stub!"); }
public  void setFixedLengthStreamingMode(int contentLength) { throw new RuntimeException("Stub!"); }
public  void setFixedLengthStreamingMode(long contentLength) { throw new RuntimeException("Stub!"); }
public  void setChunkedStreamingMode(int chunklen) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderField(int n) { throw new RuntimeException("Stub!"); }
public static  void setFollowRedirects(boolean set) { throw new RuntimeException("Stub!"); }
public static  boolean getFollowRedirects() { throw new RuntimeException("Stub!"); }
public  void setInstanceFollowRedirects(boolean followRedirects) { throw new RuntimeException("Stub!"); }
public  boolean getInstanceFollowRedirects() { throw new RuntimeException("Stub!"); }
public  void setRequestMethod(java.lang.String method) throws java.net.ProtocolException { throw new RuntimeException("Stub!"); }
public  java.lang.String getRequestMethod() { throw new RuntimeException("Stub!"); }
public  int getResponseCode() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getResponseMessage() throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  long getHeaderFieldDate(java.lang.String name, long Default) { throw new RuntimeException("Stub!"); }
public abstract  void disconnect();
public abstract  boolean usingProxy();
public  java.security.Permission getPermission() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getErrorStream() { throw new RuntimeException("Stub!"); }
public static final int HTTP_ACCEPTED = 202;
public static final int HTTP_BAD_GATEWAY = 502;
public static final int HTTP_BAD_METHOD = 405;
public static final int HTTP_BAD_REQUEST = 400;
public static final int HTTP_CLIENT_TIMEOUT = 408;
public static final int HTTP_CONFLICT = 409;
public static final int HTTP_CREATED = 201;
public static final int HTTP_ENTITY_TOO_LARGE = 413;
public static final int HTTP_FORBIDDEN = 403;
public static final int HTTP_GATEWAY_TIMEOUT = 504;
public static final int HTTP_GONE = 410;
public static final int HTTP_INTERNAL_ERROR = 500;
public static final int HTTP_LENGTH_REQUIRED = 411;
public static final int HTTP_MOVED_PERM = 301;
public static final int HTTP_MOVED_TEMP = 302;
public static final int HTTP_MULT_CHOICE = 300;
public static final int HTTP_NOT_ACCEPTABLE = 406;
public static final int HTTP_NOT_AUTHORITATIVE = 203;
public static final int HTTP_NOT_FOUND = 404;
public static final int HTTP_NOT_IMPLEMENTED = 501;
public static final int HTTP_NOT_MODIFIED = 304;
public static final int HTTP_NO_CONTENT = 204;
public static final int HTTP_OK = 200;
public static final int HTTP_PARTIAL = 206;
public static final int HTTP_PAYMENT_REQUIRED = 402;
public static final int HTTP_PRECON_FAILED = 412;
public static final int HTTP_PROXY_AUTH = 407;
public static final int HTTP_REQ_TOO_LONG = 414;
public static final int HTTP_RESET = 205;
public static final int HTTP_SEE_OTHER = 303;
@java.lang.Deprecated()
public static final int HTTP_SERVER_ERROR = 500;
public static final int HTTP_UNAUTHORIZED = 401;
public static final int HTTP_UNAVAILABLE = 503;
public static final int HTTP_UNSUPPORTED_TYPE = 415;
public static final int HTTP_USE_PROXY = 305;
public static final int HTTP_VERSION = 505;
protected int chunkLength;
protected int fixedContentLength;
protected long fixedContentLengthLong;
protected boolean instanceFollowRedirects;
protected java.lang.String method;
protected int responseCode;
protected java.lang.String responseMessage;
}
