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

package android.security.keystore.recovery;
public class RecoveryController
{
RecoveryController() { throw new RuntimeException("Stub!"); }
public static  android.security.keystore.recovery.RecoveryController getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  boolean isRecoverableKeyStoreEnabled(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void initRecoveryService(java.lang.String rootCertificateAlias, byte[] certificateFile, byte[] signatureFile) throws java.security.cert.CertificateException, android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyChainSnapshot getKeyChainSnapshot() throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  void setSnapshotCreatedPendingIntent(android.app.PendingIntent intent) throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  void setServerParams(byte[] serverParams) throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getAliases() throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  void setRecoveryStatus(java.lang.String alias, int status) throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  int getRecoveryStatus(java.lang.String alias) throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  void setRecoverySecretTypes(int[] secretTypes) throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  int[] getRecoverySecretTypes() throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  java.security.Key generateKey(java.lang.String alias) throws android.security.keystore.recovery.InternalRecoveryServiceException, android.security.keystore.recovery.LockScreenRequiredException { throw new RuntimeException("Stub!"); }
public  java.security.Key importKey(java.lang.String alias, byte[] keyBytes) throws android.security.keystore.recovery.InternalRecoveryServiceException, android.security.keystore.recovery.LockScreenRequiredException { throw new RuntimeException("Stub!"); }
public  java.security.Key getKey(java.lang.String alias) throws android.security.keystore.recovery.InternalRecoveryServiceException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  void removeKey(java.lang.String alias) throws android.security.keystore.recovery.InternalRecoveryServiceException { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.RecoverySession createRecoverySession() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.security.cert.X509Certificate> getRootCertificates() { throw new RuntimeException("Stub!"); }
public static final int RECOVERY_STATUS_PERMANENT_FAILURE = 3;
public static final int RECOVERY_STATUS_SYNCED = 0;
public static final int RECOVERY_STATUS_SYNC_IN_PROGRESS = 1;
}
