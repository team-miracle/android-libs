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
public final class KeyChainSnapshot
  implements android.os.Parcelable
{
KeyChainSnapshot() { throw new RuntimeException("Stub!"); }
public  int getSnapshotVersion() { throw new RuntimeException("Stub!"); }
public  int getMaxAttempts() { throw new RuntimeException("Stub!"); }
public  long getCounterId() { throw new RuntimeException("Stub!"); }
public  byte[] getServerParams() { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPath getTrustedHardwareCertPath() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> getKeyChainProtectionParams() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.security.keystore.recovery.WrappedApplicationKey> getWrappedApplicationKeys() { throw new RuntimeException("Stub!"); }
public  byte[] getEncryptedRecoveryKeyBlob() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyChainSnapshot> CREATOR;
static { CREATOR = null; }
}
