/*
* Copyright 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.net.http;
public class DelegatingSSLSession
  implements javax.net.ssl.SSLSession
{
public static class CertificateWrap
  extends android.net.http.DelegatingSSLSession
{
public  CertificateWrap(java.security.cert.Certificate certificate) { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
}
protected  DelegatingSSLSession() { throw new RuntimeException("Stub!"); }
public  int getApplicationBufferSize() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCipherSuite() { throw new RuntimeException("Stub!"); }
public  long getCreationTime() { throw new RuntimeException("Stub!"); }
public  byte[] getId() { throw new RuntimeException("Stub!"); }
public  long getLastAccessedTime() { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getLocalCertificates() { throw new RuntimeException("Stub!"); }
public  java.security.Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); }
public  int getPacketBufferSize() { throw new RuntimeException("Stub!"); }
public  javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  java.lang.String getPeerHost() { throw new RuntimeException("Stub!"); }
public  int getPeerPort() { throw new RuntimeException("Stub!"); }
public  java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  java.lang.String getProtocol() { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLSessionContext getSessionContext() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getValue(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getValueNames() { throw new RuntimeException("Stub!"); }
public  void invalidate() { throw new RuntimeException("Stub!"); }
public  boolean isValid() { throw new RuntimeException("Stub!"); }
public  void putValue(java.lang.String name, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  void removeValue(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
