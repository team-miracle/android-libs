/*
* Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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
public abstract class CipherSpi
{
public  CipherSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineSetMode(java.lang.String mode) throws java.security.NoSuchAlgorithmException;
protected abstract  void engineSetPadding(java.lang.String padding) throws javax.crypto.NoSuchPaddingException;
protected abstract  int engineGetBlockSize();
protected abstract  int engineGetOutputSize(int inputLen);
protected abstract  byte[] engineGetIV();
protected abstract  java.security.AlgorithmParameters engineGetParameters();
protected abstract  void engineInit(int opmode, java.security.Key key, java.security.SecureRandom random) throws java.security.InvalidKeyException;
protected abstract  void engineInit(int opmode, java.security.Key key, java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
protected abstract  void engineInit(int opmode, java.security.Key key, java.security.AlgorithmParameters params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
protected abstract  byte[] engineUpdate(byte[] input, int inputOffset, int inputLen);
protected abstract  int engineUpdate(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws javax.crypto.ShortBufferException;
protected  int engineUpdate(java.nio.ByteBuffer input, java.nio.ByteBuffer output) throws javax.crypto.ShortBufferException { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineDoFinal(byte[] input, int inputOffset, int inputLen) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;
protected abstract  int engineDoFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;
protected  int engineDoFinal(java.nio.ByteBuffer input, java.nio.ByteBuffer output) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
protected  byte[] engineWrap(java.security.Key key) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected  java.security.Key engineUnwrap(byte[] wrappedKey, java.lang.String wrappedKeyAlgorithm, int wrappedKeyType) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
protected  int engineGetKeySize(java.security.Key key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected  void engineUpdateAAD(byte[] src, int offset, int len) { throw new RuntimeException("Stub!"); }
protected  void engineUpdateAAD(java.nio.ByteBuffer src) { throw new RuntimeException("Stub!"); }
}
