/*
* Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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
public abstract class SSLEngine
{
protected  SSLEngine() { throw new RuntimeException("Stub!"); }
protected  SSLEngine(java.lang.String peerHost, int peerPort) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPeerHost() { throw new RuntimeException("Stub!"); }
public  int getPeerPort() { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer src, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] srcs, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public abstract  javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] srcs, int offset, int length, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException;
public  javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer src, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer src, java.nio.ByteBuffer[] dsts) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public abstract  javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer src, java.nio.ByteBuffer[] dsts, int offset, int length) throws javax.net.ssl.SSLException;
public abstract  java.lang.Runnable getDelegatedTask();
public abstract  void closeInbound() throws javax.net.ssl.SSLException;
public abstract  boolean isInboundDone();
public abstract  void closeOutbound();
public abstract  boolean isOutboundDone();
public abstract  java.lang.String[] getSupportedCipherSuites();
public abstract  java.lang.String[] getEnabledCipherSuites();
public abstract  void setEnabledCipherSuites(java.lang.String[] suites);
public abstract  java.lang.String[] getSupportedProtocols();
public abstract  java.lang.String[] getEnabledProtocols();
public abstract  void setEnabledProtocols(java.lang.String[] protocols);
public abstract  javax.net.ssl.SSLSession getSession();
public  javax.net.ssl.SSLSession getHandshakeSession() { throw new RuntimeException("Stub!"); }
public abstract  void beginHandshake() throws javax.net.ssl.SSLException;
public abstract  javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus();
public abstract  void setUseClientMode(boolean mode);
public abstract  boolean getUseClientMode();
public abstract  void setNeedClientAuth(boolean need);
public abstract  boolean getNeedClientAuth();
public abstract  void setWantClientAuth(boolean want);
public abstract  boolean getWantClientAuth();
public abstract  void setEnableSessionCreation(boolean flag);
public abstract  boolean getEnableSessionCreation();
public  javax.net.ssl.SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
public  void setSSLParameters(javax.net.ssl.SSLParameters params) { throw new RuntimeException("Stub!"); }
}
