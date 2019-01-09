/*
* Copyright (C) 2012 The Android Open Source Project
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

package android.net.nsd;
public final class NsdServiceInfo
  implements android.os.Parcelable
{
public  NsdServiceInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceName() { throw new RuntimeException("Stub!"); }
public  void setServiceName(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceType() { throw new RuntimeException("Stub!"); }
public  void setServiceType(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getHost() { throw new RuntimeException("Stub!"); }
public  void setHost(java.net.InetAddress s) { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  void setPort(int p) { throw new RuntimeException("Stub!"); }
public  void setAttribute(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void removeAttribute(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, byte[]> getAttributes() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.nsd.NsdServiceInfo> CREATOR;
static { CREATOR = null; }
}
