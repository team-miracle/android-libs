/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
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


package javax.security.cert;
public abstract class X509Certificate
  extends javax.security.cert.Certificate
{
public  X509Certificate() { throw new RuntimeException("Stub!"); }
public static final  javax.security.cert.X509Certificate getInstance(java.io.InputStream inStream) throws javax.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public static final  javax.security.cert.X509Certificate getInstance(byte[] certData) throws javax.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public abstract  void checkValidity() throws javax.security.cert.CertificateExpiredException, javax.security.cert.CertificateNotYetValidException;
public abstract  void checkValidity(java.util.Date date) throws javax.security.cert.CertificateExpiredException, javax.security.cert.CertificateNotYetValidException;
public abstract  int getVersion();
public abstract  java.math.BigInteger getSerialNumber();
public abstract  java.security.Principal getIssuerDN();
public abstract  java.security.Principal getSubjectDN();
public abstract  java.util.Date getNotBefore();
public abstract  java.util.Date getNotAfter();
public abstract  java.lang.String getSigAlgName();
public abstract  java.lang.String getSigAlgOID();
public abstract  byte[] getSigAlgParams();
}
