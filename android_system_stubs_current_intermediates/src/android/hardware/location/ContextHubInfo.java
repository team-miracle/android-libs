/*
* Copyright (C) 2016 The Android Open Source Project
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
public class ContextHubInfo
  implements android.os.Parcelable
{
public  ContextHubInfo() { throw new RuntimeException("Stub!"); }
public  int getMaxPacketLengthBytes() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getVendor() { throw new RuntimeException("Stub!"); }
public  java.lang.String getToolchain() { throw new RuntimeException("Stub!"); }
public  int getPlatformVersion() { throw new RuntimeException("Stub!"); }
public  int getStaticSwVersion() { throw new RuntimeException("Stub!"); }
public  int getToolchainVersion() { throw new RuntimeException("Stub!"); }
public  float getPeakMips() { throw new RuntimeException("Stub!"); }
public  float getStoppedPowerDrawMw() { throw new RuntimeException("Stub!"); }
public  float getSleepPowerDrawMw() { throw new RuntimeException("Stub!"); }
public  float getPeakPowerDrawMw() { throw new RuntimeException("Stub!"); }
public  int[] getSupportedSensors() { throw new RuntimeException("Stub!"); }
public  android.hardware.location.MemoryRegion[] getMemoryRegions() { throw new RuntimeException("Stub!"); }
public  long getChrePlatformId() { throw new RuntimeException("Stub!"); }
public  byte getChreApiMajorVersion() { throw new RuntimeException("Stub!"); }
public  byte getChreApiMinorVersion() { throw new RuntimeException("Stub!"); }
public  short getChrePatchVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.location.ContextHubInfo> CREATOR;
static { CREATOR = null; }
}
