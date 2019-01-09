/*
* Copyright (c) 2001, 2011, Oracle and/or its affiliates. All rights reserved.
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

package javax.crypto;
public class EncryptedPrivateKeyInfo
{
public  EncryptedPrivateKeyInfo(byte[] encoded) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  EncryptedPrivateKeyInfo(java.lang.String algName, byte[] encryptedData) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  EncryptedPrivateKeyInfo(java.security.AlgorithmParameters algParams, byte[] encryptedData) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlgName() { throw new RuntimeException("Stub!"); }
public  java.security.AlgorithmParameters getAlgParameters() { throw new RuntimeException("Stub!"); }
public  byte[] getEncryptedData() { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(javax.crypto.Cipher cipher) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key decryptKey) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key decryptKey, java.lang.String providerName) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key decryptKey, java.security.Provider provider) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public  byte[] getEncoded() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
