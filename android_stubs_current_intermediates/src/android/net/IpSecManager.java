/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class IpSecManager
{
public static final class SpiUnavailableException
  extends android.util.AndroidException
{
SpiUnavailableException() { throw new RuntimeException("Stub!"); }
public  int getSpi() { throw new RuntimeException("Stub!"); }
}
public static final class ResourceUnavailableException
  extends android.util.AndroidException
{
ResourceUnavailableException() { throw new RuntimeException("Stub!"); }
}
public static final class SecurityParameterIndex
  implements java.lang.AutoCloseable
{
SecurityParameterIndex() { throw new RuntimeException("Stub!"); }
public  int getSpi() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class UdpEncapsulationSocket
  implements java.lang.AutoCloseable
{
UdpEncapsulationSocket() { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
IpSecManager() { throw new RuntimeException("Stub!"); }
public  android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress destinationAddress) throws android.net.IpSecManager.ResourceUnavailableException { throw new RuntimeException("Stub!"); }
public  android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress destinationAddress, int requestedSpi) throws android.net.IpSecManager.SpiUnavailableException, android.net.IpSecManager.ResourceUnavailableException { throw new RuntimeException("Stub!"); }
public  void applyTransportModeTransform(java.net.Socket socket, int direction, android.net.IpSecTransform transform) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTransportModeTransform(java.net.DatagramSocket socket, int direction, android.net.IpSecTransform transform) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTransportModeTransform(java.io.FileDescriptor socket, int direction, android.net.IpSecTransform transform) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void removeTransportModeTransforms(java.net.Socket socket) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void removeTransportModeTransforms(java.net.DatagramSocket socket) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void removeTransportModeTransforms(java.io.FileDescriptor socket) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket(int port) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { throw new RuntimeException("Stub!"); }
public  android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket() throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { throw new RuntimeException("Stub!"); }
public static final int DIRECTION_IN = 0;
public static final int DIRECTION_OUT = 1;
}
