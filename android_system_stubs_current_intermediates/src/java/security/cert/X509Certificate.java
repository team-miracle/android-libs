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
public abstract class X509Certificate
  extends java.security.cert.Certificate
  implements java.security.cert.X509Extension
{
protected  X509Certificate() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public abstract  void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
public abstract  void checkValidity(java.util.Date date) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
public abstract  int getVersion();
public abstract  java.math.BigInteger getSerialNumber();
public abstract  java.security.Principal getIssuerDN();
public  javax.security.auth.x500.X500Principal getIssuerX500Principal() { throw new RuntimeException("Stub!"); }
public abstract  java.security.Principal getSubjectDN();
public  javax.security.auth.x500.X500Principal getSubjectX500Principal() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Date getNotBefore();
public abstract  java.util.Date getNotAfter();
public abstract  byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException;
public abstract  byte[] getSignature();
public abstract  java.lang.String getSigAlgName();
public abstract  java.lang.String getSigAlgOID();
public abstract  byte[] getSigAlgParams();
public abstract  boolean[] getIssuerUniqueID();
public abstract  boolean[] getSubjectUniqueID();
public abstract  boolean[] getKeyUsage();
public  java.util.List<java.lang.String> getExtendedKeyUsage() throws java.security.cert.CertificateParsingException { throw new RuntimeException("Stub!"); }
public abstract  int getBasicConstraints();
public  java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.util.List<?>> getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException { throw new RuntimeException("Stub!"); }
public  void verify(java.security.PublicKey key, java.security.Provider sigProvider) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException { throw new RuntimeException("Stub!"); }
}
