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
public final class KeyProtection
  implements java.security.KeyStore.ProtectionParameter
{
public static final class Builder
{
public  Builder(int purposes) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setKeyValidityStart(java.util.Date startDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setKeyValidityEnd(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setKeyValidityForOriginationEnd(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setKeyValidityForConsumptionEnd(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setEncryptionPaddings(java.lang.String... paddings) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setSignaturePaddings(java.lang.String... paddings) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setDigests(java.lang.String... digests) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setBlockModes(java.lang.String... blockModes) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setRandomizedEncryptionRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setUserAuthenticationRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setUserConfirmationRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setUserAuthenticationValidityDurationSeconds(int seconds) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setUserPresenceRequired(boolean required) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setUserAuthenticationValidWhileOnBody(boolean remainsValid) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setInvalidatedByBiometricEnrollment(boolean invalidateKey) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection.Builder setUnlockedDeviceRequired(boolean unlockedDeviceRequired) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.KeyProtection build() { throw new RuntimeException("Stub!"); }
}
KeyProtection() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityStart() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityForConsumptionEnd() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityForOriginationEnd() { throw new RuntimeException("Stub!"); }
public  int getPurposes() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getEncryptionPaddings() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSignaturePaddings() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getDigests() { throw new RuntimeException("Stub!"); }
public  boolean isDigestsSpecified() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getBlockModes() { throw new RuntimeException("Stub!"); }
public  boolean isRandomizedEncryptionRequired() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationRequired() { throw new RuntimeException("Stub!"); }
public  boolean isUserConfirmationRequired() { throw new RuntimeException("Stub!"); }
public  int getUserAuthenticationValidityDurationSeconds() { throw new RuntimeException("Stub!"); }
public  boolean isUserPresenceRequired() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationValidWhileOnBody() { throw new RuntimeException("Stub!"); }
public  boolean isInvalidatedByBiometricEnrollment() { throw new RuntimeException("Stub!"); }
public  boolean isUnlockedDeviceRequired() { throw new RuntimeException("Stub!"); }
}
