/*
* Copyright (c) 1998, 2013, Oracle and/or its affiliates. All rights reserved.
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
public abstract class CertificateFactorySpi
{
public  CertificateFactorySpi() { throw new RuntimeException("Stub!"); }
public abstract  java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream inStream) throws java.security.cert.CertificateException;
public  java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream inStream) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream inStream, java.lang.String encoding) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPath engineGenerateCertPath(java.util.List<? extends java.security.cert.Certificate> certificates) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.String> engineGetCertPathEncodings() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Collection<? extends java.security.cert.Certificate> engineGenerateCertificates(java.io.InputStream inStream) throws java.security.cert.CertificateException;
public abstract  java.security.cert.CRL engineGenerateCRL(java.io.InputStream inStream) throws java.security.cert.CRLException;
public abstract  java.util.Collection<? extends java.security.cert.CRL> engineGenerateCRLs(java.io.InputStream inStream) throws java.security.cert.CRLException;
}
