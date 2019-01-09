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
public final class KeyDerivationParams
  implements android.os.Parcelable
{
KeyDerivationParams() { throw new RuntimeException("Stub!"); }
public static  android.security.keystore.recovery.KeyDerivationParams createSha256Params(byte[] salt) { throw new RuntimeException("Stub!"); }
public static  android.security.keystore.recovery.KeyDerivationParams createScryptParams(byte[] salt, int memoryDifficulty) { throw new RuntimeException("Stub!"); }
public  int getAlgorithm() { throw new RuntimeException("Stub!"); }
public  byte[] getSalt() { throw new RuntimeException("Stub!"); }
public  int getMemoryDifficulty() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final int ALGORITHM_SCRYPT = 2;
public static final int ALGORITHM_SHA256 = 1;
public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyDerivationParams> CREATOR;
static { CREATOR = null; }
}
