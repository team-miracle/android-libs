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
public class CertPathValidatorException
  extends java.security.GeneralSecurityException
{
public static interface Reason
  extends java.io.Serializable
{
}
public static enum BasicReason
  implements java.security.cert.CertPathValidatorException.Reason
{
ALGORITHM_CONSTRAINED(),
EXPIRED(),
INVALID_SIGNATURE(),
NOT_YET_VALID(),
REVOKED(),
UNDETERMINED_REVOCATION_STATUS(),
UNSPECIFIED();
}
public  CertPathValidatorException() { throw new RuntimeException("Stub!"); }
public  CertPathValidatorException(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  CertPathValidatorException(java.lang.Throwable cause) { throw new RuntimeException("Stub!"); }
public  CertPathValidatorException(java.lang.String msg, java.lang.Throwable cause) { throw new RuntimeException("Stub!"); }
public  CertPathValidatorException(java.lang.String msg, java.lang.Throwable cause, java.security.cert.CertPath certPath, int index) { throw new RuntimeException("Stub!"); }
public  CertPathValidatorException(java.lang.String msg, java.lang.Throwable cause, java.security.cert.CertPath certPath, int index, java.security.cert.CertPathValidatorException.Reason reason) { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPath getCertPath() { throw new RuntimeException("Stub!"); }
public  int getIndex() { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPathValidatorException.Reason getReason() { throw new RuntimeException("Stub!"); }
}
