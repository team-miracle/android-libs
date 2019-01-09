/*
* Copyright (C) 2007 The Android Open Source Project
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
public final class AndroidHttpClient
  implements org.apache.http.client.HttpClient
{
AndroidHttpClient() { throw new RuntimeException("Stub!"); }
public static  android.net.http.AndroidHttpClient newInstance(java.lang.String userAgent, android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  android.net.http.AndroidHttpClient newInstance(java.lang.String userAgent) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static  void modifyRequestToAcceptGzipResponse(org.apache.http.HttpRequest request) { throw new RuntimeException("Stub!"); }
public static  java.io.InputStream getUngzippedContent(org.apache.http.HttpEntity entity) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams getParams() { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.ClientConnectionManager getConnectionManager() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest request) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public static  org.apache.http.entity.AbstractHttpEntity getCompressedEntity(byte[] data, android.content.ContentResolver resolver) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  long getMinGzipSize(android.content.ContentResolver resolver) { throw new RuntimeException("Stub!"); }
public  void enableCurlLogging(java.lang.String name, int level) { throw new RuntimeException("Stub!"); }
public  void disableCurlLogging() { throw new RuntimeException("Stub!"); }
public static  long parseDate(java.lang.String dateString) { throw new RuntimeException("Stub!"); }
public static long DEFAULT_SYNC_MIN_GZIP_BYTES;
}
