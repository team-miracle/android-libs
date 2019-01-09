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
public abstract class PKIXCertPathChecker
  implements java.security.cert.CertPathChecker, java.lang.Cloneable
{
protected  PKIXCertPathChecker() { throw new RuntimeException("Stub!"); }
public abstract  void init(boolean forward) throws java.security.cert.CertPathValidatorException;
public abstract  boolean isForwardCheckingSupported();
public abstract  java.util.Set<java.lang.String> getSupportedExtensions();
public abstract  void check(java.security.cert.Certificate cert, java.util.Collection<java.lang.String> unresolvedCritExts) throws java.security.cert.CertPathValidatorException;
public  void check(java.security.cert.Certificate cert) throws java.security.cert.CertPathValidatorException { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
}
