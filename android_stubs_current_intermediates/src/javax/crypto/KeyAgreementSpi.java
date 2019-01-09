/*
* Copyright (c) 1997, 2007, Oracle and/or its affiliates. All rights reserved.
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
public abstract class KeyAgreementSpi
{
public  KeyAgreementSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInit(java.security.Key key, java.security.SecureRandom random) throws java.security.InvalidKeyException;
protected abstract  void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
protected abstract  java.security.Key engineDoPhase(java.security.Key key, boolean lastPhase) throws java.security.InvalidKeyException, java.lang.IllegalStateException;
protected abstract  byte[] engineGenerateSecret() throws java.lang.IllegalStateException;
protected abstract  int engineGenerateSecret(byte[] sharedSecret, int offset) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException;
protected abstract  javax.crypto.SecretKey engineGenerateSecret(java.lang.String algorithm) throws java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException;
}
