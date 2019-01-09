/*
* Copyright (C) 2010 The Android Open Source Project
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
public class UsbInterface
  implements android.os.Parcelable
{
UsbInterface() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getAlternateSetting() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int getInterfaceClass() { throw new RuntimeException("Stub!"); }
public  int getInterfaceSubclass() { throw new RuntimeException("Stub!"); }
public  int getInterfaceProtocol() { throw new RuntimeException("Stub!"); }
public  int getEndpointCount() { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbEndpoint getEndpoint(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.usb.UsbInterface> CREATOR;
static { CREATOR = null; }
}
