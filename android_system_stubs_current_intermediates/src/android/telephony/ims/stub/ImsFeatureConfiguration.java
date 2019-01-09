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

package android.telephony.ims.stub;
public final class ImsFeatureConfiguration
  implements android.os.Parcelable
{
public static final class FeatureSlotPair
{
public  FeatureSlotPair(int slotId, int featureType) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final int featureType;
public final int slotId;
}
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsFeatureConfiguration.Builder addFeature(int slotId, int featureType) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsFeatureConfiguration build() { throw new RuntimeException("Stub!"); }
}
ImsFeatureConfiguration() { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> getServiceFeatures() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.stub.ImsFeatureConfiguration> CREATOR;
static { CREATOR = null; }
}
