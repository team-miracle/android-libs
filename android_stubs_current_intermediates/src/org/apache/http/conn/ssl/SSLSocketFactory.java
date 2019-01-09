/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpclient/trunk/module-client/src/main/java/org/apache/http/conn/ssl/SSLSocketFactory.java $
* $Revision: 659194 $
* $Date: 2008-05-22 11:33:47 -0700 (Thu, 22 May 2008) $
*
* ====================================================================
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http.conn.ssl;
@java.lang.Deprecated()
public class SSLSocketFactory
  implements org.apache.http.conn.scheme.LayeredSocketFactory
{
public  SSLSocketFactory(java.lang.String algorithm, java.security.KeyStore keystore, java.lang.String keystorePassword, java.security.KeyStore truststore, java.security.SecureRandom random, org.apache.http.conn.scheme.HostNameResolver nameResolver) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  SSLSocketFactory(java.security.KeyStore keystore, java.lang.String keystorePassword, java.security.KeyStore truststore) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  SSLSocketFactory(java.security.KeyStore keystore, java.lang.String keystorePassword) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  SSLSocketFactory(java.security.KeyStore truststore) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.ssl.SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket connectSocket(java.net.Socket sock, java.lang.String host, int port, java.net.InetAddress localAddress, int localPort, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isSecure(java.net.Socket sock) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.net.Socket socket, java.lang.String host, int port, boolean autoClose) throws java.io.IOException, java.net.UnknownHostException { throw new RuntimeException("Stub!"); }
public  void setHostnameVerifier(org.apache.http.conn.ssl.X509HostnameVerifier hostnameVerifier) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.ssl.X509HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!"); }
public static final org.apache.http.conn.ssl.X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER;
public static final org.apache.http.conn.ssl.X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
public static final java.lang.String SSL = "SSL";
public static final java.lang.String SSLV2 = "SSLv2";
public static final org.apache.http.conn.ssl.X509HostnameVerifier STRICT_HOSTNAME_VERIFIER;
public static final java.lang.String TLS = "TLS";
static { ALLOW_ALL_HOSTNAME_VERIFIER = null; BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null; STRICT_HOSTNAME_VERIFIER = null; }
}
