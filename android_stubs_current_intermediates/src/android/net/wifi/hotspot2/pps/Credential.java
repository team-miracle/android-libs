/**
* Copyright (c) 2016, The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.net.wifi.hotspot2.pps;
public final class Credential
  implements android.os.Parcelable
{
public static final class UserCredential
  implements android.os.Parcelable
{
public  UserCredential() { throw new RuntimeException("Stub!"); }
public  UserCredential(android.net.wifi.hotspot2.pps.Credential.UserCredential source) { throw new RuntimeException("Stub!"); }
public  void setUsername(java.lang.String username) { throw new RuntimeException("Stub!"); }
public  java.lang.String getUsername() { throw new RuntimeException("Stub!"); }
public  void setPassword(java.lang.String password) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPassword() { throw new RuntimeException("Stub!"); }
public  void setEapType(int eapType) { throw new RuntimeException("Stub!"); }
public  int getEapType() { throw new RuntimeException("Stub!"); }
public  void setNonEapInnerMethod(java.lang.String nonEapInnerMethod) { throw new RuntimeException("Stub!"); }
public  java.lang.String getNonEapInnerMethod() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object thatObject) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.UserCredential> CREATOR;
static { CREATOR = null; }
}
public static final class CertificateCredential
  implements android.os.Parcelable
{
public  CertificateCredential() { throw new RuntimeException("Stub!"); }
public  CertificateCredential(android.net.wifi.hotspot2.pps.Credential.CertificateCredential source) { throw new RuntimeException("Stub!"); }
public  void setCertType(java.lang.String certType) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCertType() { throw new RuntimeException("Stub!"); }
public  void setCertSha256Fingerprint(byte[] certSha256Fingerprint) { throw new RuntimeException("Stub!"); }
public  byte[] getCertSha256Fingerprint() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object thatObject) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.CertificateCredential> CREATOR;
static { CREATOR = null; }
}
public static final class SimCredential
  implements android.os.Parcelable
{
public  SimCredential() { throw new RuntimeException("Stub!"); }
public  SimCredential(android.net.wifi.hotspot2.pps.Credential.SimCredential source) { throw new RuntimeException("Stub!"); }
public  void setImsi(java.lang.String imsi) { throw new RuntimeException("Stub!"); }
public  java.lang.String getImsi() { throw new RuntimeException("Stub!"); }
public  void setEapType(int eapType) { throw new RuntimeException("Stub!"); }
public  int getEapType() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object thatObject) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.SimCredential> CREATOR;
static { CREATOR = null; }
}
public  Credential() { throw new RuntimeException("Stub!"); }
public  Credential(android.net.wifi.hotspot2.pps.Credential source) { throw new RuntimeException("Stub!"); }
public  void setRealm(java.lang.String realm) { throw new RuntimeException("Stub!"); }
public  java.lang.String getRealm() { throw new RuntimeException("Stub!"); }
public  void setUserCredential(android.net.wifi.hotspot2.pps.Credential.UserCredential userCredential) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.hotspot2.pps.Credential.UserCredential getUserCredential() { throw new RuntimeException("Stub!"); }
public  void setCertCredential(android.net.wifi.hotspot2.pps.Credential.CertificateCredential certCredential) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.hotspot2.pps.Credential.CertificateCredential getCertCredential() { throw new RuntimeException("Stub!"); }
public  void setSimCredential(android.net.wifi.hotspot2.pps.Credential.SimCredential simCredential) { throw new RuntimeException("Stub!"); }
public  android.net.wifi.hotspot2.pps.Credential.SimCredential getSimCredential() { throw new RuntimeException("Stub!"); }
public  void setCaCertificate(java.security.cert.X509Certificate caCertificate) { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate getCaCertificate() { throw new RuntimeException("Stub!"); }
public  void setClientCertificateChain(java.security.cert.X509Certificate[] certificateChain) { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate[] getClientCertificateChain() { throw new RuntimeException("Stub!"); }
public  void setClientPrivateKey(java.security.PrivateKey clientPrivateKey) { throw new RuntimeException("Stub!"); }
public  java.security.PrivateKey getClientPrivateKey() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object thatObject) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential> CREATOR;
static { CREATOR = null; }
}
