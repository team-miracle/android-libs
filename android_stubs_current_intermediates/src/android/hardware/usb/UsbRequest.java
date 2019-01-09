/*
* Copyright (C) 2010 The Android Open Source Project
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
public class UsbRequest
{
public  UsbRequest() { throw new RuntimeException("Stub!"); }
public  boolean initialize(android.hardware.usb.UsbDeviceConnection connection, android.hardware.usb.UsbEndpoint endpoint) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbEndpoint getEndpoint() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getClientData() { throw new RuntimeException("Stub!"); }
public  void setClientData(java.lang.Object data) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean queue(java.nio.ByteBuffer buffer, int length) { throw new RuntimeException("Stub!"); }
public  boolean queue(java.nio.ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
public  boolean cancel() { throw new RuntimeException("Stub!"); }
}
