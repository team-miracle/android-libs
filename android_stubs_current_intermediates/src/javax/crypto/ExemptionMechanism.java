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

package javax.crypto;
public class ExemptionMechanism
{
protected  ExemptionMechanism(javax.crypto.ExemptionMechanismSpi exmechSpi, java.security.Provider provider, java.lang.String mechanism) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.ExemptionMechanism getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.ExemptionMechanism getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.ExemptionMechanism getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  boolean isCryptoAllowed(java.security.Key key) throws javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  int getOutputSize(int inputLen) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key) throws java.security.InvalidKeyException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.AlgorithmParameters params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  byte[] genExemptionBlob() throws java.lang.IllegalStateException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  int genExemptionBlob(byte[] output) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  int genExemptionBlob(byte[] output, int outputOffset) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
}
