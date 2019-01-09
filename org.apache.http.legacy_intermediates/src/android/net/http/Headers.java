/*
* Copyright (C) 2006 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.net.http;
public final class Headers
{
public static interface HeaderCallback
{
public abstract  void header(java.lang.String name, java.lang.String value);
}
public  Headers() { throw new RuntimeException("Stub!"); }
public  void parseHeader(org.apache.http.util.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public  long getTransferEncoding() { throw new RuntimeException("Stub!"); }
public  long getContentLength() { throw new RuntimeException("Stub!"); }
public  int getConnectionType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentEncoding() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWwwAuthenticate() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProxyAuthenticate() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentDisposition() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAcceptRanges() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExpires() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCacheControl() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLastModified() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEtag() { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> getSetCookie() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPragma() { throw new RuntimeException("Stub!"); }
public  java.lang.String getRefresh() { throw new RuntimeException("Stub!"); }
public  java.lang.String getXPermittedCrossDomainPolicies() { throw new RuntimeException("Stub!"); }
public  void setContentLength(long value) { throw new RuntimeException("Stub!"); }
public  void setContentType(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setContentEncoding(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setLocation(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setWwwAuthenticate(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setProxyAuthenticate(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setContentDisposition(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setAcceptRanges(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setExpires(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setCacheControl(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setLastModified(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setEtag(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setXPermittedCrossDomainPolicies(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void getHeaders(android.net.http.Headers.HeaderCallback hcb) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACCEPT_RANGES = "accept-ranges";
public static final java.lang.String CACHE_CONTROL = "cache-control";
public static final int CONN_CLOSE = 1;
public static final java.lang.String CONN_DIRECTIVE = "connection";
public static final int CONN_KEEP_ALIVE = 2;
public static final java.lang.String CONTENT_DISPOSITION = "content-disposition";
public static final java.lang.String CONTENT_ENCODING = "content-encoding";
public static final java.lang.String CONTENT_LEN = "content-length";
public static final java.lang.String CONTENT_TYPE = "content-type";
public static final java.lang.String ETAG = "etag";
public static final java.lang.String EXPIRES = "expires";
public static final java.lang.String LAST_MODIFIED = "last-modified";
public static final java.lang.String LOCATION = "location";
public static final int NO_CONN_TYPE = 0;
public static final long NO_CONTENT_LENGTH = -1L;
public static final long NO_TRANSFER_ENCODING = 0L;
public static final java.lang.String PRAGMA = "pragma";
public static final java.lang.String PROXY_AUTHENTICATE = "proxy-authenticate";
public static final java.lang.String PROXY_CONNECTION = "proxy-connection";
public static final java.lang.String REFRESH = "refresh";
public static final java.lang.String SET_COOKIE = "set-cookie";
public static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";
public static final java.lang.String WWW_AUTHENTICATE = "www-authenticate";
public static final java.lang.String X_PERMITTED_CROSS_DOMAIN_POLICIES = "x-permitted-cross-domain-policies";
}
