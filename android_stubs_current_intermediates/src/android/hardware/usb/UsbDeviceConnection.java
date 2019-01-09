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

package android.hardware.usb;
public class UsbDeviceConnection
{
UsbDeviceConnection() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  int getFileDescriptor() { throw new RuntimeException("Stub!"); }
public  byte[] getRawDescriptors() { throw new RuntimeException("Stub!"); }
public  boolean claimInterface(android.hardware.usb.UsbInterface intf, boolean force) { throw new RuntimeException("Stub!"); }
public  boolean releaseInterface(android.hardware.usb.UsbInterface intf) { throw new RuntimeException("Stub!"); }
public  boolean setInterface(android.hardware.usb.UsbInterface intf) { throw new RuntimeException("Stub!"); }
public  boolean setConfiguration(android.hardware.usb.UsbConfiguration configuration) { throw new RuntimeException("Stub!"); }
public  int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int length, int timeout) { throw new RuntimeException("Stub!"); }
public  int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int offset, int length, int timeout) { throw new RuntimeException("Stub!"); }
public  int bulkTransfer(android.hardware.usb.UsbEndpoint endpoint, byte[] buffer, int length, int timeout) { throw new RuntimeException("Stub!"); }
public  int bulkTransfer(android.hardware.usb.UsbEndpoint endpoint, byte[] buffer, int offset, int length, int timeout) { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbRequest requestWait() { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbRequest requestWait(long timeout) throws java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public  java.lang.String getSerial() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
