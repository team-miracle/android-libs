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

package android.net;
public final class MacAddress
  implements android.os.Parcelable
{
MacAddress() { throw new RuntimeException("Stub!"); }
public  int getAddressType() { throw new RuntimeException("Stub!"); }
public  boolean isLocallyAssigned() { throw new RuntimeException("Stub!"); }
public  byte[] toByteArray() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toOuiString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  android.net.MacAddress fromString(java.lang.String addr) { throw new RuntimeException("Stub!"); }
public static  android.net.MacAddress fromBytes(byte[] addr) { throw new RuntimeException("Stub!"); }
public static final android.net.MacAddress BROADCAST_ADDRESS;
public static final android.os.Parcelable.Creator<android.net.MacAddress> CREATOR;
public static final int TYPE_BROADCAST = 3;
public static final int TYPE_MULTICAST = 2;
public static final int TYPE_UNICAST = 1;
static { BROADCAST_ADDRESS = null; CREATOR = null; }
}
