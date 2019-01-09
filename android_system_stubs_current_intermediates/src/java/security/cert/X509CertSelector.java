/*
* Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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
public class X509CertSelector
  implements java.security.cert.CertSelector
{
public  X509CertSelector() { throw new RuntimeException("Stub!"); }
public  void setCertificate(java.security.cert.X509Certificate cert) { throw new RuntimeException("Stub!"); }
public  void setSerialNumber(java.math.BigInteger serial) { throw new RuntimeException("Stub!"); }
public  void setIssuer(javax.security.auth.x500.X500Principal issuer) { throw new RuntimeException("Stub!"); }
public  void setIssuer(java.lang.String issuerDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setIssuer(byte[] issuerDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSubject(javax.security.auth.x500.X500Principal subject) { throw new RuntimeException("Stub!"); }
public  void setSubject(java.lang.String subjectDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSubject(byte[] subjectDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSubjectKeyIdentifier(byte[] subjectKeyID) { throw new RuntimeException("Stub!"); }
public  void setAuthorityKeyIdentifier(byte[] authorityKeyID) { throw new RuntimeException("Stub!"); }
public  void setCertificateValid(java.util.Date certValid) { throw new RuntimeException("Stub!"); }
public  void setPrivateKeyValid(java.util.Date privateKeyValid) { throw new RuntimeException("Stub!"); }
public  void setSubjectPublicKeyAlgID(java.lang.String oid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSubjectPublicKey(java.security.PublicKey key) { throw new RuntimeException("Stub!"); }
public  void setSubjectPublicKey(byte[] key) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setKeyUsage(boolean[] keyUsage) { throw new RuntimeException("Stub!"); }
public  void setExtendedKeyUsage(java.util.Set<java.lang.String> keyPurposeSet) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setMatchAllSubjectAltNames(boolean matchAllNames) { throw new RuntimeException("Stub!"); }
public  void setSubjectAlternativeNames(java.util.Collection<java.util.List<?>> names) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addSubjectAlternativeName(int type, java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addSubjectAlternativeName(int type, byte[] name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setNameConstraints(byte[] bytes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setBasicConstraints(int minMaxPathLen) { throw new RuntimeException("Stub!"); }
public  void setPolicy(java.util.Set<java.lang.String> certPolicySet) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setPathToNames(java.util.Collection<java.util.List<?>> names) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addPathToName(int type, java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addPathToName(int type, byte[] name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate getCertificate() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); }
public  javax.security.auth.x500.X500Principal getIssuer() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIssuerAsString() { throw new RuntimeException("Stub!"); }
public  byte[] getIssuerAsBytes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  javax.security.auth.x500.X500Principal getSubject() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubjectAsString() { throw new RuntimeException("Stub!"); }
public  byte[] getSubjectAsBytes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] getSubjectKeyIdentifier() { throw new RuntimeException("Stub!"); }
public  byte[] getAuthorityKeyIdentifier() { throw new RuntimeException("Stub!"); }
public  java.util.Date getCertificateValid() { throw new RuntimeException("Stub!"); }
public  java.util.Date getPrivateKeyValid() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubjectPublicKeyAlgID() { throw new RuntimeException("Stub!"); }
public  java.security.PublicKey getSubjectPublicKey() { throw new RuntimeException("Stub!"); }
public  boolean[] getKeyUsage() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getExtendedKeyUsage() { throw new RuntimeException("Stub!"); }
public  boolean getMatchAllSubjectAltNames() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() { throw new RuntimeException("Stub!"); }
public  byte[] getNameConstraints() { throw new RuntimeException("Stub!"); }
public  int getBasicConstraints() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getPolicy() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.util.List<?>> getPathToNames() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean match(java.security.cert.Certificate cert) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
}
