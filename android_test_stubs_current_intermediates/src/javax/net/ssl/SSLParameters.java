/*
* Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
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
public class SSLParameters
{
public  SSLParameters() { throw new RuntimeException("Stub!"); }
public  SSLParameters(java.lang.String[] cipherSuites) { throw new RuntimeException("Stub!"); }
public  SSLParameters(java.lang.String[] cipherSuites, java.lang.String[] protocols) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getCipherSuites() { throw new RuntimeException("Stub!"); }
public  void setCipherSuites(java.lang.String[] cipherSuites) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getProtocols() { throw new RuntimeException("Stub!"); }
public  void setProtocols(java.lang.String[] protocols) { throw new RuntimeException("Stub!"); }
public  boolean getWantClientAuth() { throw new RuntimeException("Stub!"); }
public  void setWantClientAuth(boolean wantClientAuth) { throw new RuntimeException("Stub!"); }
public  boolean getNeedClientAuth() { throw new RuntimeException("Stub!"); }
public  void setNeedClientAuth(boolean needClientAuth) { throw new RuntimeException("Stub!"); }
public  java.security.AlgorithmConstraints getAlgorithmConstraints() { throw new RuntimeException("Stub!"); }
public  void setAlgorithmConstraints(java.security.AlgorithmConstraints constraints) { throw new RuntimeException("Stub!"); }
public  java.lang.String getEndpointIdentificationAlgorithm() { throw new RuntimeException("Stub!"); }
public  void setEndpointIdentificationAlgorithm(java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  void setServerNames(java.util.List<javax.net.ssl.SNIServerName> serverNames) { throw new RuntimeException("Stub!"); }
public final  java.util.List<javax.net.ssl.SNIServerName> getServerNames() { throw new RuntimeException("Stub!"); }
public final  void setSNIMatchers(java.util.Collection<javax.net.ssl.SNIMatcher> matchers) { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<javax.net.ssl.SNIMatcher> getSNIMatchers() { throw new RuntimeException("Stub!"); }
public final  void setUseCipherSuitesOrder(boolean honorOrder) { throw new RuntimeException("Stub!"); }
public final  boolean getUseCipherSuitesOrder() { throw new RuntimeException("Stub!"); }
}
