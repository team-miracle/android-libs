/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.security.keystore;
public abstract class KeyProperties
{
KeyProperties() { throw new RuntimeException("Stub!"); }
public static final java.lang.String BLOCK_MODE_CBC = "CBC";
public static final java.lang.String BLOCK_MODE_CTR = "CTR";
public static final java.lang.String BLOCK_MODE_ECB = "ECB";
public static final java.lang.String BLOCK_MODE_GCM = "GCM";
public static final java.lang.String DIGEST_MD5 = "MD5";
public static final java.lang.String DIGEST_NONE = "NONE";
public static final java.lang.String DIGEST_SHA1 = "SHA-1";
public static final java.lang.String DIGEST_SHA224 = "SHA-224";
public static final java.lang.String DIGEST_SHA256 = "SHA-256";
public static final java.lang.String DIGEST_SHA384 = "SHA-384";
public static final java.lang.String DIGEST_SHA512 = "SHA-512";
public static final java.lang.String ENCRYPTION_PADDING_NONE = "NoPadding";
public static final java.lang.String ENCRYPTION_PADDING_PKCS7 = "PKCS7Padding";
public static final java.lang.String ENCRYPTION_PADDING_RSA_OAEP = "OAEPPadding";
public static final java.lang.String ENCRYPTION_PADDING_RSA_PKCS1 = "PKCS1Padding";
@java.lang.Deprecated()
public static final java.lang.String KEY_ALGORITHM_3DES = "DESede";
public static final java.lang.String KEY_ALGORITHM_AES = "AES";
public static final java.lang.String KEY_ALGORITHM_EC = "EC";
public static final java.lang.String KEY_ALGORITHM_HMAC_SHA1 = "HmacSHA1";
public static final java.lang.String KEY_ALGORITHM_HMAC_SHA224 = "HmacSHA224";
public static final java.lang.String KEY_ALGORITHM_HMAC_SHA256 = "HmacSHA256";
public static final java.lang.String KEY_ALGORITHM_HMAC_SHA384 = "HmacSHA384";
public static final java.lang.String KEY_ALGORITHM_HMAC_SHA512 = "HmacSHA512";
public static final java.lang.String KEY_ALGORITHM_RSA = "RSA";
public static final int ORIGIN_GENERATED = 1;
public static final int ORIGIN_IMPORTED = 2;
public static final int ORIGIN_SECURELY_IMPORTED = 8;
public static final int ORIGIN_UNKNOWN = 4;
public static final int PURPOSE_DECRYPT = 2;
public static final int PURPOSE_ENCRYPT = 1;
public static final int PURPOSE_SIGN = 4;
public static final int PURPOSE_VERIFY = 8;
public static final int PURPOSE_WRAP_KEY = 32;
public static final java.lang.String SIGNATURE_PADDING_RSA_PKCS1 = "PKCS1";
public static final java.lang.String SIGNATURE_PADDING_RSA_PSS = "PSS";
}
