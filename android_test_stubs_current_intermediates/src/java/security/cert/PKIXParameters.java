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
public class PKIXParameters
  implements java.security.cert.CertPathParameters
{
public  PKIXParameters(java.util.Set<java.security.cert.TrustAnchor> trustAnchors) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public  PKIXParameters(java.security.KeyStore keystore) throws java.security.KeyStoreException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.security.cert.TrustAnchor> getTrustAnchors() { throw new RuntimeException("Stub!"); }
public  void setTrustAnchors(java.util.Set<java.security.cert.TrustAnchor> trustAnchors) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getInitialPolicies() { throw new RuntimeException("Stub!"); }
public  void setInitialPolicies(java.util.Set<java.lang.String> initialPolicies) { throw new RuntimeException("Stub!"); }
public  void setCertStores(java.util.List<java.security.cert.CertStore> stores) { throw new RuntimeException("Stub!"); }
public  void addCertStore(java.security.cert.CertStore store) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.security.cert.CertStore> getCertStores() { throw new RuntimeException("Stub!"); }
public  void setRevocationEnabled(boolean val) { throw new RuntimeException("Stub!"); }
public  boolean isRevocationEnabled() { throw new RuntimeException("Stub!"); }
public  void setExplicitPolicyRequired(boolean val) { throw new RuntimeException("Stub!"); }
public  boolean isExplicitPolicyRequired() { throw new RuntimeException("Stub!"); }
public  void setPolicyMappingInhibited(boolean val) { throw new RuntimeException("Stub!"); }
public  boolean isPolicyMappingInhibited() { throw new RuntimeException("Stub!"); }
public  void setAnyPolicyInhibited(boolean val) { throw new RuntimeException("Stub!"); }
public  boolean isAnyPolicyInhibited() { throw new RuntimeException("Stub!"); }
public  void setPolicyQualifiersRejected(boolean qualifiersRejected) { throw new RuntimeException("Stub!"); }
public  boolean getPolicyQualifiersRejected() { throw new RuntimeException("Stub!"); }
public  java.util.Date getDate() { throw new RuntimeException("Stub!"); }
public  void setDate(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  void setCertPathCheckers(java.util.List<java.security.cert.PKIXCertPathChecker> checkers) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.security.cert.PKIXCertPathChecker> getCertPathCheckers() { throw new RuntimeException("Stub!"); }
public  void addCertPathChecker(java.security.cert.PKIXCertPathChecker checker) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSigProvider() { throw new RuntimeException("Stub!"); }
public  void setSigProvider(java.lang.String sigProvider) { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertSelector getTargetCertConstraints() { throw new RuntimeException("Stub!"); }
public  void setTargetCertConstraints(java.security.cert.CertSelector selector) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
