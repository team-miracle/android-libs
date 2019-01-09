/*
* Copyright 2017 The Android Open Source Project
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
package android.hardware.location;
public final class NanoAppBinary
  implements android.os.Parcelable
{
public  NanoAppBinary(byte[] appBinary) { throw new RuntimeException("Stub!"); }
public  byte[] getBinary() { throw new RuntimeException("Stub!"); }
public  byte[] getBinaryNoHeader() { throw new RuntimeException("Stub!"); }
public  boolean hasValidHeader() { throw new RuntimeException("Stub!"); }
public  int getHeaderVersion() { throw new RuntimeException("Stub!"); }
public  long getNanoAppId() { throw new RuntimeException("Stub!"); }
public  int getNanoAppVersion() { throw new RuntimeException("Stub!"); }
public  long getHwHubType() { throw new RuntimeException("Stub!"); }
public  byte getTargetChreApiMajorVersion() { throw new RuntimeException("Stub!"); }
public  byte getTargetChreApiMinorVersion() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  boolean isSigned() { throw new RuntimeException("Stub!"); }
public  boolean isEncrypted() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppBinary> CREATOR;
static { CREATOR = null; }
}
