/*
* Copyright (C) 2011 The Android Open Source Project
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
public final class HttpResponseCache
  extends java.net.ResponseCache
  implements java.io.Closeable
{
HttpResponseCache() { throw new RuntimeException("Stub!"); }
public static  android.net.http.HttpResponseCache getInstalled() { throw new RuntimeException("Stub!"); }
public static synchronized  android.net.http.HttpResponseCache install(java.io.File directory, long maxSize) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.CacheResponse get(java.net.URI uri, java.lang.String requestMethod, java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestHeaders) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.CacheRequest put(java.net.URI uri, java.net.URLConnection urlConnection) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long size() { throw new RuntimeException("Stub!"); }
public  long maxSize() { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  int getNetworkCount() { throw new RuntimeException("Stub!"); }
public  int getHitCount() { throw new RuntimeException("Stub!"); }
public  int getRequestCount() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void delete() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
