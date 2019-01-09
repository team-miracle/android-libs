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
* limitations under the License
*/

package android.telephony.ims.feature;
public final class CapabilityChangeRequest
  implements android.os.Parcelable
{
public static class CapabilityPair
{
public  CapabilityPair(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capability, int radioTech) { throw new RuntimeException("Stub!"); }
@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
public  int getCapability() { throw new RuntimeException("Stub!"); }
public  int getRadioTech() { throw new RuntimeException("Stub!"); }
}
CapabilityChangeRequest() { throw new RuntimeException("Stub!"); }
public  void addCapabilitiesToEnableForTech(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capabilities, int radioTech) { throw new RuntimeException("Stub!"); }
public  void addCapabilitiesToDisableForTech(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capabilities, int radioTech) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> getCapabilitiesToEnable() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> getCapabilitiesToDisable() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.feature.CapabilityChangeRequest> CREATOR;
static { CREATOR = null; }
}
