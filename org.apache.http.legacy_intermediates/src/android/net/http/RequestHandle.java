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
public class RequestHandle
{
public  RequestHandle(android.net.http.RequestQueue requestQueue, java.lang.String url, android.net.compatibility.WebAddress uri, java.lang.String method, java.util.Map<java.lang.String, java.lang.String> headers, java.io.InputStream bodyProvider, int bodyLength, android.net.http.Request request) { throw new RuntimeException("Stub!"); }
public  RequestHandle(android.net.http.RequestQueue requestQueue, java.lang.String url, android.net.compatibility.WebAddress uri, java.lang.String method, java.util.Map<java.lang.String, java.lang.String> headers, java.io.InputStream bodyProvider, int bodyLength, android.net.http.Request request, android.net.http.Connection conn) { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void pauseRequest(boolean pause) { throw new RuntimeException("Stub!"); }
public  void handleSslErrorResponse(boolean proceed) { throw new RuntimeException("Stub!"); }
public  boolean isRedirectMax() { throw new RuntimeException("Stub!"); }
public  int getRedirectCount() { throw new RuntimeException("Stub!"); }
public  void setRedirectCount(int count) { throw new RuntimeException("Stub!"); }
public  boolean setupRedirect(java.lang.String redirectTo, int statusCode, java.util.Map<java.lang.String, java.lang.String> cacheHeaders) { throw new RuntimeException("Stub!"); }
public  void setupBasicAuthResponse(boolean isProxy, java.lang.String username, java.lang.String password) { throw new RuntimeException("Stub!"); }
public  void setupDigestAuthResponse(boolean isProxy, java.lang.String username, java.lang.String password, java.lang.String realm, java.lang.String nonce, java.lang.String QOP, java.lang.String algorithm, java.lang.String opaque) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMethod() { throw new RuntimeException("Stub!"); }
public static  java.lang.String computeBasicAuthResponse(java.lang.String username, java.lang.String password) { throw new RuntimeException("Stub!"); }
public  void waitUntilComplete() { throw new RuntimeException("Stub!"); }
public  void processRequest() { throw new RuntimeException("Stub!"); }
public static  java.lang.String authorizationHeader(boolean isProxy) { throw new RuntimeException("Stub!"); }
public static final int MAX_REDIRECT_COUNT = 16;
}
