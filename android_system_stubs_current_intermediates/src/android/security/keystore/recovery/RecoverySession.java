/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.security.keystore.recovery;
public class RecoverySession
  implements java.lang.AutoCloseable
{
RecoverySession() { throw new RuntimeException("Stub!"); }
public  byte[] start(java.lang.String rootCertificateAlias, java.security.cert.CertPath verifierCertPath, byte[] vaultParams, byte[] vaultChallenge, java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> secrets) throws java.security.cert.CertificateException, android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.security.Key> recoverKeyChainSnapshot(byte[] recoveryKeyBlob, java.util.List<android.security.keystore.recovery.WrappedApplicationKey> applicationKeys) throws android.security.keystore.recovery.SessionExpiredException, android.security.keystore.recovery.DecryptionFailedException, android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
}
