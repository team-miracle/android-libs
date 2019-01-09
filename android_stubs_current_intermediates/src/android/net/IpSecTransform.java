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
public final class IpSecTransform
  implements java.lang.AutoCloseable
{
public static class Builder
{
public  Builder(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.net.IpSecTransform.Builder setEncryption(android.net.IpSecAlgorithm algo) { throw new RuntimeException("Stub!"); }
public  android.net.IpSecTransform.Builder setAuthentication(android.net.IpSecAlgorithm algo) { throw new RuntimeException("Stub!"); }
public  android.net.IpSecTransform.Builder setAuthenticatedEncryption(android.net.IpSecAlgorithm algo) { throw new RuntimeException("Stub!"); }
public  android.net.IpSecTransform.Builder setIpv4Encapsulation(android.net.IpSecManager.UdpEncapsulationSocket localSocket, int remotePort) { throw new RuntimeException("Stub!"); }
public  android.net.IpSecTransform buildTransportModeTransform(java.net.InetAddress sourceAddress, android.net.IpSecManager.SecurityParameterIndex spi) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
IpSecTransform() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
