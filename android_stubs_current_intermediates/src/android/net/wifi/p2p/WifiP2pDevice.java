/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.net.wifi.p2p;
public class WifiP2pDevice
  implements android.os.Parcelable
{
public  WifiP2pDevice() { throw new RuntimeException("Stub!"); }
public  WifiP2pDevice(android.net.wifi.p2p.WifiP2pDevice source) { throw new RuntimeException("Stub!"); }
public  boolean wpsPbcSupported() { throw new RuntimeException("Stub!"); }
public  boolean wpsKeypadSupported() { throw new RuntimeException("Stub!"); }
public  boolean wpsDisplaySupported() { throw new RuntimeException("Stub!"); }
public  boolean isServiceDiscoveryCapable() { throw new RuntimeException("Stub!"); }
public  boolean isGroupOwner() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int AVAILABLE = 3;
public static final int CONNECTED = 0;
public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pDevice> CREATOR;
public static final int FAILED = 2;
public static final int INVITED = 1;
public static final int UNAVAILABLE = 4;
public java.lang.String deviceAddress;
public java.lang.String deviceName;
public java.lang.String primaryDeviceType;
public java.lang.String secondaryDeviceType;
public int status;
static { CREATOR = null; }
}
