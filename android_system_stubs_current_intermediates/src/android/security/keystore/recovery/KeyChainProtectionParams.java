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
public final class KeyChainProtectionParams
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyChainProtectionParams.Builder setUserSecretType(int userSecretType) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyChainProtectionParams.Builder setLockScreenUiFormat(int lockScreenUiFormat) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyChainProtectionParams.Builder setKeyDerivationParams(android.security.keystore.recovery.KeyDerivationParams keyDerivationParams) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyChainProtectionParams.Builder setSecret(byte[] secret) { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyChainProtectionParams build() { throw new RuntimeException("Stub!"); }
}
KeyChainProtectionParams() { throw new RuntimeException("Stub!"); }
public  int getUserSecretType() { throw new RuntimeException("Stub!"); }
public  int getLockScreenUiFormat() { throw new RuntimeException("Stub!"); }
public  android.security.keystore.recovery.KeyDerivationParams getKeyDerivationParams() { throw new RuntimeException("Stub!"); }
public  byte[] getSecret() { throw new RuntimeException("Stub!"); }
public  void clearSecret() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyChainProtectionParams> CREATOR;
public static final int TYPE_LOCKSCREEN = 100;
public static final int UI_FORMAT_PASSWORD = 2;
public static final int UI_FORMAT_PATTERN = 3;
public static final int UI_FORMAT_PIN = 1;
static { CREATOR = null; }
}
