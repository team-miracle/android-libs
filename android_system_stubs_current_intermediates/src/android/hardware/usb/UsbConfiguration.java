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

package android.hardware.usb;
public class UsbConfiguration
  implements android.os.Parcelable
{
UsbConfiguration() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  boolean isSelfPowered() { throw new RuntimeException("Stub!"); }
public  boolean isRemoteWakeup() { throw new RuntimeException("Stub!"); }
public  int getMaxPower() { throw new RuntimeException("Stub!"); }
public  int getInterfaceCount() { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbInterface getInterface(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.usb.UsbConfiguration> CREATOR;
static { CREATOR = null; }
}
