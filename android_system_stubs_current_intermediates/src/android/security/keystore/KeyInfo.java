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
public class KeyInfo
  implements java.security.spec.KeySpec
{
KeyInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKeystoreAlias() { throw new RuntimeException("Stub!"); }
public  boolean isInsideSecureHardware() { throw new RuntimeException("Stub!"); }
public  int getOrigin() { throw new RuntimeException("Stub!"); }
public  int getKeySize() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityStart() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityForConsumptionEnd() { throw new RuntimeException("Stub!"); }
public  java.util.Date getKeyValidityForOriginationEnd() { throw new RuntimeException("Stub!"); }
public  int getPurposes() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getBlockModes() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getEncryptionPaddings() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getSignaturePaddings() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getDigests() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationRequired() { throw new RuntimeException("Stub!"); }
public  boolean isUserConfirmationRequired() { throw new RuntimeException("Stub!"); }
public  int getUserAuthenticationValidityDurationSeconds() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationRequirementEnforcedBySecureHardware() { throw new RuntimeException("Stub!"); }
public  boolean isUserAuthenticationValidWhileOnBody() { throw new RuntimeException("Stub!"); }
public  boolean isInvalidatedByBiometricEnrollment() { throw new RuntimeException("Stub!"); }
public  boolean isTrustedUserPresenceRequired() { throw new RuntimeException("Stub!"); }
}
