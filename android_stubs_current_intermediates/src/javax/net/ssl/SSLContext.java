/*
* Copyright (c) 1999, 2012, Oracle and/or its affiliates. All rights reserved.
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

package javax.net.ssl;
public class SSLContext
{
protected  SSLContext(javax.net.ssl.SSLContextSpi contextSpi, java.security.Provider provider, java.lang.String protocol) { throw new RuntimeException("Stub!"); }
public static synchronized  javax.net.ssl.SSLContext getDefault() throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static synchronized  void setDefault(javax.net.ssl.SSLContext context) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getInstance(java.lang.String protocol) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getInstance(java.lang.String protocol, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getInstance(java.lang.String protocol, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.lang.String getProtocol() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  void init(javax.net.ssl.KeyManager[] km, javax.net.ssl.TrustManager[] tm, java.security.SecureRandom random) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLServerSocketFactory getServerSocketFactory() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLEngine createSSLEngine() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLEngine createSSLEngine(java.lang.String peerHost, int peerPort) { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLSessionContext getServerSessionContext() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLSessionContext getClientSessionContext() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLParameters getDefaultSSLParameters() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLParameters getSupportedSSLParameters() { throw new RuntimeException("Stub!"); }
}
