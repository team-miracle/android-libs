/*
* Copyright (c) 2000, 2015, Oracle and/or its affiliates. All rights reserved.
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
public class X509CRLSelector
  implements java.security.cert.CRLSelector
{
public  X509CRLSelector() { throw new RuntimeException("Stub!"); }
public  void setIssuers(java.util.Collection<javax.security.auth.x500.X500Principal> issuers) { throw new RuntimeException("Stub!"); }
public  void setIssuerNames(java.util.Collection<?> names) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addIssuer(javax.security.auth.x500.X500Principal issuer) { throw new RuntimeException("Stub!"); }
public  void addIssuerName(java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addIssuerName(byte[] name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setMinCRLNumber(java.math.BigInteger minCRL) { throw new RuntimeException("Stub!"); }
public  void setMaxCRLNumber(java.math.BigInteger maxCRL) { throw new RuntimeException("Stub!"); }
public  void setDateAndTime(java.util.Date dateAndTime) { throw new RuntimeException("Stub!"); }
public  void setCertificateChecking(java.security.cert.X509Certificate cert) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<javax.security.auth.x500.X500Principal> getIssuers() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.Object> getIssuerNames() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getMinCRL() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getMaxCRL() { throw new RuntimeException("Stub!"); }
public  java.util.Date getDateAndTime() { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate getCertificateChecking() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean match(java.security.cert.CRL crl) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
}
