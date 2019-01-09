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

package android.mtp;
public final class MtpDevice
{
public  MtpDevice(android.hardware.usb.UsbDevice device) { throw new RuntimeException("Stub!"); }
public  boolean open(android.hardware.usb.UsbDeviceConnection connection) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceName() { throw new RuntimeException("Stub!"); }
public  int getDeviceId() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  android.mtp.MtpDeviceInfo getDeviceInfo() { throw new RuntimeException("Stub!"); }
public  int[] getStorageIds() { throw new RuntimeException("Stub!"); }
public  int[] getObjectHandles(int storageId, int format, int objectHandle) { throw new RuntimeException("Stub!"); }
public  byte[] getObject(int objectHandle, int objectSize) { throw new RuntimeException("Stub!"); }
public  long getPartialObject(int objectHandle, long offset, long size, byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long getPartialObject64(int objectHandle, long offset, long size, byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] getThumbnail(int objectHandle) { throw new RuntimeException("Stub!"); }
public  android.mtp.MtpStorageInfo getStorageInfo(int storageId) { throw new RuntimeException("Stub!"); }
public  android.mtp.MtpObjectInfo getObjectInfo(int objectHandle) { throw new RuntimeException("Stub!"); }
public  boolean deleteObject(int objectHandle) { throw new RuntimeException("Stub!"); }
public  long getParent(int objectHandle) { throw new RuntimeException("Stub!"); }
public  long getStorageId(int objectHandle) { throw new RuntimeException("Stub!"); }
public  boolean importFile(int objectHandle, java.lang.String destPath) { throw new RuntimeException("Stub!"); }
public  boolean importFile(int objectHandle, android.os.ParcelFileDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  boolean sendObject(int objectHandle, long size, android.os.ParcelFileDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  android.mtp.MtpObjectInfo sendObjectInfo(android.mtp.MtpObjectInfo info) { throw new RuntimeException("Stub!"); }
public  android.mtp.MtpEvent readEvent(android.os.CancellationSignal signal) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
