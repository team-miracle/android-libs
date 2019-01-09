/*
* Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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
public abstract class PKIXRevocationChecker
  extends java.security.cert.PKIXCertPathChecker
{
public static enum Option
{
NO_FALLBACK(),
ONLY_END_ENTITY(),
PREFER_CRLS(),
SOFT_FAIL();
}
protected  PKIXRevocationChecker() { throw new RuntimeException("Stub!"); }
public  void setOcspResponder(java.net.URI uri) { throw new RuntimeException("Stub!"); }
public  java.net.URI getOcspResponder() { throw new RuntimeException("Stub!"); }
public  void setOcspResponderCert(java.security.cert.X509Certificate cert) { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate getOcspResponderCert() { throw new RuntimeException("Stub!"); }
public  void setOcspExtensions(java.util.List<java.security.cert.Extension> extensions) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.security.cert.Extension> getOcspExtensions() { throw new RuntimeException("Stub!"); }
public  void setOcspResponses(java.util.Map<java.security.cert.X509Certificate, byte[]> responses) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.security.cert.X509Certificate, byte[]> getOcspResponses() { throw new RuntimeException("Stub!"); }
public  void setOptions(java.util.Set<java.security.cert.PKIXRevocationChecker.Option> options) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.security.cert.PKIXRevocationChecker.Option> getOptions() { throw new RuntimeException("Stub!"); }
public abstract  java.util.List<java.security.cert.CertPathValidatorException> getSoftFailExceptions();
public  java.security.cert.PKIXRevocationChecker clone() { throw new RuntimeException("Stub!"); }
}
