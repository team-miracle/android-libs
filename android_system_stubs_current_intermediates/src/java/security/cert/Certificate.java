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

package java.security.cert;
public abstract class Certificate
  implements java.io.Serializable
{
protected static class CertificateRep
  implements java.io.Serializable
{
protected  CertificateRep(java.lang.String type, byte[] data) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
protected  Certificate(java.lang.String type) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  byte[] getEncoded() throws java.security.cert.CertificateEncodingException;
public abstract  void verify(java.security.PublicKey key) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  void verify(java.security.PublicKey key, java.lang.String sigProvider) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public  void verify(java.security.PublicKey key, java.security.Provider sigProvider) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String toString();
public abstract  java.security.PublicKey getPublicKey();
protected  java.lang.Object writeReplace() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
