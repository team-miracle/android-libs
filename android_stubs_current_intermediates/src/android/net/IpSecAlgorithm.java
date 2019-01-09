/*
* Copyright (C) 2017 The Android Open Source Project
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
package android.net;
public final class IpSecAlgorithm
  implements android.os.Parcelable
{
public  IpSecAlgorithm(java.lang.String algorithm, byte[] key) { throw new RuntimeException("Stub!"); }
public  IpSecAlgorithm(java.lang.String algorithm, byte[] key, int truncLenBits) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  byte[] getKey() { throw new RuntimeException("Stub!"); }
public  int getTruncationLengthBits() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTH_CRYPT_AES_GCM = "rfc4106(gcm(aes))";
public static final java.lang.String AUTH_HMAC_MD5 = "hmac(md5)";
public static final java.lang.String AUTH_HMAC_SHA1 = "hmac(sha1)";
public static final java.lang.String AUTH_HMAC_SHA256 = "hmac(sha256)";
public static final java.lang.String AUTH_HMAC_SHA384 = "hmac(sha384)";
public static final java.lang.String AUTH_HMAC_SHA512 = "hmac(sha512)";
public static final android.os.Parcelable.Creator<android.net.IpSecAlgorithm> CREATOR;
public static final java.lang.String CRYPT_AES_CBC = "cbc(aes)";
static { CREATOR = null; }
}
