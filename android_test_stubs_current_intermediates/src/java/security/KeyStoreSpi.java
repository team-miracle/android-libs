/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1998, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.security;
public abstract class KeyStoreSpi
{
public  KeyStoreSpi() { throw new RuntimeException("Stub!"); }
public abstract  java.security.Key engineGetKey(java.lang.String alias, char[] password) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException;
public abstract  java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String alias);
public abstract  java.security.cert.Certificate engineGetCertificate(java.lang.String alias);
public abstract  java.util.Date engineGetCreationDate(java.lang.String alias);
public abstract  void engineSetKeyEntry(java.lang.String alias, java.security.Key key, char[] password, java.security.cert.Certificate[] chain) throws java.security.KeyStoreException;
public abstract  void engineSetKeyEntry(java.lang.String alias, byte[] key, java.security.cert.Certificate[] chain) throws java.security.KeyStoreException;
public abstract  void engineSetCertificateEntry(java.lang.String alias, java.security.cert.Certificate cert) throws java.security.KeyStoreException;
public abstract  void engineDeleteEntry(java.lang.String alias) throws java.security.KeyStoreException;
public abstract  java.util.Enumeration<java.lang.String> engineAliases();
public abstract  boolean engineContainsAlias(java.lang.String alias);
public abstract  int engineSize();
public abstract  boolean engineIsKeyEntry(java.lang.String alias);
public abstract  boolean engineIsCertificateEntry(java.lang.String alias);
public abstract  java.lang.String engineGetCertificateAlias(java.security.cert.Certificate cert);
public abstract  void engineStore(java.io.OutputStream stream, char[] password) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException;
public  void engineStore(java.security.KeyStore.LoadStoreParameter param) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public abstract  void engineLoad(java.io.InputStream stream, char[] password) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException;
public  void engineLoad(java.security.KeyStore.LoadStoreParameter param) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.security.KeyStore.Entry engineGetEntry(java.lang.String alias, java.security.KeyStore.ProtectionParameter protParam) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableEntryException { throw new RuntimeException("Stub!"); }
public  void engineSetEntry(java.lang.String alias, java.security.KeyStore.Entry entry, java.security.KeyStore.ProtectionParameter protParam) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public  boolean engineEntryInstanceOf(java.lang.String alias, java.lang.Class<? extends java.security.KeyStore.Entry> entryClass) { throw new RuntimeException("Stub!"); }
}
