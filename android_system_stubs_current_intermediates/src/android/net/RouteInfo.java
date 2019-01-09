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

package android.net;
public final class RouteInfo
  implements android.os.Parcelable
{
RouteInfo() { throw new RuntimeException("Stub!"); }
public  android.net.IpPrefix getDestination() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getGateway() { throw new RuntimeException("Stub!"); }
public  java.lang.String getInterface() { throw new RuntimeException("Stub!"); }
public  boolean isDefaultRoute() { throw new RuntimeException("Stub!"); }
public  boolean matches(java.net.InetAddress destination) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.RouteInfo> CREATOR;
static { CREATOR = null; }
}
