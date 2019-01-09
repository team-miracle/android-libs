/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.hardware.hdmi;
public class HdmiDeviceInfo
  implements android.os.Parcelable
{
public  HdmiDeviceInfo() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public static  int idForCecDevice(int address) { throw new RuntimeException("Stub!"); }
public static  int idForMhlDevice(int portId) { throw new RuntimeException("Stub!"); }
public static  int idForHardware(int portId) { throw new RuntimeException("Stub!"); }
public  int getLogicalAddress() { throw new RuntimeException("Stub!"); }
public  int getPhysicalAddress() { throw new RuntimeException("Stub!"); }
public  int getPortId() { throw new RuntimeException("Stub!"); }
public  int getDeviceType() { throw new RuntimeException("Stub!"); }
public  int getDevicePowerStatus() { throw new RuntimeException("Stub!"); }
public  int getDeviceId() { throw new RuntimeException("Stub!"); }
public  int getAdopterId() { throw new RuntimeException("Stub!"); }
public  boolean isSourceType() { throw new RuntimeException("Stub!"); }
public  boolean isCecDevice() { throw new RuntimeException("Stub!"); }
public  boolean isMhlDevice() { throw new RuntimeException("Stub!"); }
public  boolean isInactivated() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName() { throw new RuntimeException("Stub!"); }
public  int getVendorId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final int ADDR_INTERNAL = 0;
public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiDeviceInfo> CREATOR;
public static final int DEVICE_AUDIO_SYSTEM = 5;
public static final int DEVICE_INACTIVE = -1;
public static final int DEVICE_PLAYBACK = 4;
public static final int DEVICE_RECORDER = 1;
public static final int DEVICE_RESERVED = 2;
public static final int DEVICE_TUNER = 3;
public static final int DEVICE_TV = 0;
public static final int ID_INVALID = 65535;
public static final android.hardware.hdmi.HdmiDeviceInfo INACTIVE_DEVICE;
public static final int PATH_INTERNAL = 0;
public static final int PATH_INVALID = 65535;
public static final int PORT_INVALID = -1;
static { CREATOR = null; INACTIVE_DEVICE = null; }
}
