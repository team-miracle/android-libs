/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.net.wifi;
public class WifiInfo
  implements android.os.Parcelable
{
WifiInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSSID() { throw new RuntimeException("Stub!"); }
public  java.lang.String getBSSID() { throw new RuntimeException("Stub!"); }
public  int getRssi() { throw new RuntimeException("Stub!"); }
public  int getLinkSpeed() { throw new RuntimeException("Stub!"); }
public  int getFrequency() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMacAddress() { throw new RuntimeException("Stub!"); }
public  int getNetworkId() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.SupplicantState getSupplicantState() { throw new RuntimeException("Stub!"); }
public  int getIpAddress() { throw new RuntimeException("Stub!"); }
public  boolean getHiddenSSID() { throw new RuntimeException("Stub!"); }
public static  android.net.NetworkInfo.DetailedState getDetailedStateOf(android.net.wifi.SupplicantState suppState) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final java.lang.String FREQUENCY_UNITS = "MHz";
public static final java.lang.String LINK_SPEED_UNITS = "Mbps";
}
