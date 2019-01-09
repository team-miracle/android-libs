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
public class Network
  implements android.os.Parcelable
{
Network() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress[] getAllByName(java.lang.String host) throws java.net.UnknownHostException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getByName(java.lang.String host) throws java.net.UnknownHostException { throw new RuntimeException("Stub!"); }
public  javax.net.SocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
public  java.net.URLConnection openConnection(java.net.URL url) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bindSocket(java.net.DatagramSocket socket) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bindSocket(java.net.Socket socket) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bindSocket(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.net.Network fromNetworkHandle(long networkHandle) { throw new RuntimeException("Stub!"); }
public  long getNetworkHandle() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.Network> CREATOR;
static { CREATOR = null; }
}
