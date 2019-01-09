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

package android.net;
public class NetworkRequest
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest build() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest.Builder addCapability(int capability) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest.Builder removeCapability(int capability) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest.Builder addTransportType(int transportType) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest.Builder removeTransportType(int transportType) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest.Builder setNetworkSpecifier(java.lang.String networkSpecifier) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest.Builder setNetworkSpecifier(android.net.NetworkSpecifier networkSpecifier) { throw new RuntimeException("Stub!"); }
}
NetworkRequest() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean hasCapability(int capability) { throw new RuntimeException("Stub!"); }
public  boolean hasTransport(int transportType) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.NetworkRequest> CREATOR;
static { CREATOR = null; }
}
