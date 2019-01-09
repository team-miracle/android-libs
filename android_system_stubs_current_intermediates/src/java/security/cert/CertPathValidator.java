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
public class CertPathValidator
{
protected  CertPathValidator(java.security.cert.CertPathValidatorSpi validatorSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertPathValidator getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertPathValidator getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertPathValidator getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertPathValidatorResult validate(java.security.cert.CertPath certPath, java.security.cert.CertPathParameters params) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public static final  java.lang.String getDefaultType() { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertPathChecker getRevocationChecker() { throw new RuntimeException("Stub!"); }
}
