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
 abstract class Connection
{
protected  Connection(android.content.Context context, org.apache.http.HttpHost host, android.net.http.RequestFeeder requestFeeder) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected android.net.http.SslCertificate mCertificate;
protected android.net.http.AndroidHttpClientConnection mHttpClientConnection;
}
