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
public class UsbManager
{
UsbManager() { throw new RuntimeException("Stub!"); }
public  java.util.HashMap<java.lang.String, android.hardware.usb.UsbDevice> getDeviceList() { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbDeviceConnection openDevice(android.hardware.usb.UsbDevice device) { throw new RuntimeException("Stub!"); }
public  android.hardware.usb.UsbAccessory[] getAccessoryList() { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory accessory) { throw new RuntimeException("Stub!"); }
public  boolean hasPermission(android.hardware.usb.UsbDevice device) { throw new RuntimeException("Stub!"); }
public  boolean hasPermission(android.hardware.usb.UsbAccessory accessory) { throw new RuntimeException("Stub!"); }
public  void requestPermission(android.hardware.usb.UsbDevice device, android.app.PendingIntent pi) { throw new RuntimeException("Stub!"); }
public  void requestPermission(android.hardware.usb.UsbAccessory accessory, android.app.PendingIntent pi) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";
public static final java.lang.String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
public static final java.lang.String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
public static final java.lang.String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
public static final java.lang.String EXTRA_ACCESSORY = "accessory";
public static final java.lang.String EXTRA_DEVICE = "device";
public static final java.lang.String EXTRA_PERMISSION_GRANTED = "permission";
}
