/*
* Copyright (C) 2012 The Android Open Source Project
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
public final class KeyGenParameterSpec
  implements java.security.spec.AlgorithmParameterSpec
{
public static final class Builder
{
public  Builder(java.lang.String keystoreAlias, int purposes) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setKeySize(int keySize) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec spec) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setCertificateSubject(javax.security.auth.x500.X500Principal subject) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setCertificateSerialNumber(java.math.BigInteger serialNumber) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotBefore(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotAfter(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityStart(java.util.Date startDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityEnd(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForOriginationEnd(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForConsumptionEnd(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setDigests(java.lang.String... digests) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setEncryptionPaddings(java.lang.String... paddings) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setSignaturePaddings(java.lang.String... paddings) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setBlockModes(java.lang.String... blockModes) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setRandomizedEncryptionRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUserConfirmationRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidityDurationSeconds(int seconds) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUserPresenceRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setAttestationChallenge(byte[] attestationChallenge) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUniqueIdIncluded(boolean uniqueIdIncluded) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidWhileOnBody(boolean remainsValid) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setInvalidatedByBiometricEnrollment(boolean invalidateKey) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setIsStrongBoxBacked(boolean isStrongBoxBacked) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec.Builder setUnlockedDeviceRequired(boolean unlockedDeviceRequired) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyGenParameterSpec build() { throw new RuntimeException("Stub!"); }
}
KeyGenParameterSpec() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKeystoreAlias() { throw new RuntimeException("Stub!"); }
public  int getKeySize() { throw new RuntimeException("Stub!"); }
public  java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { throw new RuntimeException("Stub!"); }
public  javax.security.auth.x500.X500Principal getCertificateSubject() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getCertificateSerialNumber() { throw new RuntimeException("Stub!"); }
public  java.util.Date getCertificateNotBefore() { throw new RuntimeException("Stub!"); }
public  java.util.Date getCertificateNotAfter() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityStart() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityForConsumptionEnd() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityForOriginationEnd() { throw new RuntimeException("Stub!"); }
public  int getPurposes() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getDigests() { throw new RuntimeException("Stub!"); }
public  boolean isDigestsSpecified() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getEncryptionPaddings() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSignaturePaddings() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getBlockModes() { throw new RuntimeException("Stub!"); }
public  boolean isRandomizedEncryptionRequired() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationRequired() { throw new RuntimeException("Stub!"); }
public  boolean isUserConfirmationRequired() { throw new RuntimeException("Stub!"); }
public  int getUserAuthenticationValidityDurationSeconds() { throw new RuntimeException("Stub!"); }
public  boolean isUserPresenceRequired() { throw new RuntimeException("Stub!"); }
public  byte[] getAttestationChallenge() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationValidWhileOnBody() { throw new RuntimeException("Stub!"); }
public  boolean isInvalidatedByBiometricEnrollment() { throw new RuntimeException("Stub!"); }
public  boolean isStrongBoxBacked() { throw new RuntimeException("Stub!"); }
public  boolean isUnlockedDeviceRequired() { throw new RuntimeException("Stub!"); }
}
