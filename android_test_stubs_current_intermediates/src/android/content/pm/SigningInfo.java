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

package android.content.pm;
public final class SigningInfo
  implements android.os.Parcelable
{
public  SigningInfo() { throw new RuntimeException("Stub!"); }
public  SigningInfo(android.content.pm.SigningInfo orig) { throw new RuntimeException("Stub!"); }
public  boolean hasMultipleSigners() { throw new RuntimeException("Stub!"); }
public  boolean hasPastSigningCertificates() { throw new RuntimeException("Stub!"); }
public  android.content.pm.Signature[] getSigningCertificateHistory() { throw new RuntimeException("Stub!"); }
public  android.content.pm.Signature[] getApkContentsSigners() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.SigningInfo> CREATOR;
static { CREATOR = null; }
}
