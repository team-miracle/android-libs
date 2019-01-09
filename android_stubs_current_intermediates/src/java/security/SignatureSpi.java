/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1997, 2006, Oracle and/or its affiliates. All rights reserved.
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
public abstract class SignatureSpi
{
public  SignatureSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException;
protected abstract  void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException;
protected  void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom random) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected abstract  void engineUpdate(byte b) throws java.security.SignatureException;
protected abstract  void engineUpdate(byte[] b, int off, int len) throws java.security.SignatureException;
protected  void engineUpdate(java.nio.ByteBuffer input) { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineSign() throws java.security.SignatureException;
protected  int engineSign(byte[] outbuf, int offset, int len) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
protected abstract  boolean engineVerify(byte[] sigBytes) throws java.security.SignatureException;
protected  boolean engineVerify(byte[] sigBytes, int offset, int length) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected abstract  void engineSetParameter(java.lang.String param, java.lang.Object value) throws java.security.InvalidParameterException;
protected  void engineSetParameter(java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
protected  java.security.AlgorithmParameters engineGetParameters() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected abstract  java.lang.Object engineGetParameter(java.lang.String param) throws java.security.InvalidParameterException;
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected java.security.SecureRandom appRandom;
}
