/*
* Copyright (C) 2011 The Android Open Source Project
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
package android.security;
public final class KeyChain
{
public  KeyChain() { throw new RuntimeException("Stub!"); }
public static  android.content.Intent createInstallIntent() { throw new RuntimeException("Stub!"); }
public static  void choosePrivateKeyAlias(android.app.Activity activity, android.security.KeyChainAliasCallback response, java.lang.String[] keyTypes, java.security.Principal[] issuers, java.lang.String host, int port, java.lang.String alias) { throw new RuntimeException("Stub!"); }
public static  void choosePrivateKeyAlias(android.app.Activity activity, android.security.KeyChainAliasCallback response, java.lang.String[] keyTypes, java.security.Principal[] issuers, android.net.Uri uri, java.lang.String alias) { throw new RuntimeException("Stub!"); }
public static  java.security.PrivateKey getPrivateKey(android.content.Context context, java.lang.String alias) throws android.security.KeyChainException, java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.X509Certificate[] getCertificateChain(android.content.Context context, java.lang.String alias) throws android.security.KeyChainException, java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public static  boolean isKeyAlgorithmSupported(java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isBoundKeyAlgorithm(java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_KEYCHAIN_CHANGED = "android.security.action.KEYCHAIN_CHANGED";
public static final java.lang.String ACTION_KEY_ACCESS_CHANGED = "android.security.action.KEY_ACCESS_CHANGED";
@Deprecated
public static final java.lang.String ACTION_STORAGE_CHANGED = "android.security.STORAGE_CHANGED";
public static final java.lang.String ACTION_TRUST_STORE_CHANGED = "android.security.action.TRUST_STORE_CHANGED";
public static final java.lang.String EXTRA_CERTIFICATE = "CERT";
public static final java.lang.String EXTRA_KEY_ACCESSIBLE = "android.security.extra.KEY_ACCESSIBLE";
public static final java.lang.String EXTRA_KEY_ALIAS = "android.security.extra.KEY_ALIAS";
public static final java.lang.String EXTRA_NAME = "name";
public static final java.lang.String EXTRA_PKCS12 = "PKCS12";
}
