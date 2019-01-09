/*
* Copyright (C) 2008 The Android Open Source Project
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
public class AndroidHttpClientConnection
  implements org.apache.http.HttpInetConnection, org.apache.http.HttpConnection
{
public  AndroidHttpClientConnection() { throw new RuntimeException("Stub!"); }
public  void bind(java.net.Socket socket, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
public  int getRemotePort() { throw new RuntimeException("Stub!"); }
public  void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getSocketTimeout() { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void doFlush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.StatusLine parseResponseHeader(android.net.http.Headers headers) throws java.io.IOException, org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpEntity receiveResponseEntity(android.net.http.Headers headers) { throw new RuntimeException("Stub!"); }
public  boolean isStale() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
