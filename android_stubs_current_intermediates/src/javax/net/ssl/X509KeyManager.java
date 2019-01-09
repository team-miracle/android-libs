/*
* Copyright (c) 1999, 2013, Oracle and/or its affiliates. All rights reserved.
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
public interface X509KeyManager
  extends javax.net.ssl.KeyManager
{
public abstract  java.lang.String[] getClientAliases(java.lang.String keyType, java.security.Principal[] issuers);
public abstract  java.lang.String chooseClientAlias(java.lang.String[] keyType, java.security.Principal[] issuers, java.net.Socket socket);
public abstract  java.lang.String[] getServerAliases(java.lang.String keyType, java.security.Principal[] issuers);
public abstract  java.lang.String chooseServerAlias(java.lang.String keyType, java.security.Principal[] issuers, java.net.Socket socket);
public abstract  java.security.cert.X509Certificate[] getCertificateChain(java.lang.String alias);
public abstract  java.security.PrivateKey getPrivateKey(java.lang.String alias);
}
