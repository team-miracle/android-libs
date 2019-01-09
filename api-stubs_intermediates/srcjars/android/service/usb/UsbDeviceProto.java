// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/usb.proto

package android.service.usb;

/** @hide */
// message UsbDeviceProto
public final class UsbDeviceProto {

    // optional string name = 1;
    public static final long NAME = 0x0000010900000001L;

    // optional int32 vendor_id = 2;
    public static final long VENDOR_ID = 0x0000010500000002L;

    // optional int32 product_id = 3;
    public static final long PRODUCT_ID = 0x0000010500000003L;

    // optional int32 class = 4;
    public static final long CLASS = 0x0000010500000004L;

    // optional int32 subclass = 5;
    public static final long SUBCLASS = 0x0000010500000005L;

    // optional int32 protocol = 6;
    public static final long PROTOCOL = 0x0000010500000006L;

    // optional string manufacturer_name = 7;
    public static final long MANUFACTURER_NAME = 0x0000010900000007L;

    // optional string product_name = 8;
    public static final long PRODUCT_NAME = 0x0000010900000008L;

    // optional string version = 9;
    public static final long VERSION = 0x0000010900000009L;

    // optional string serial_number = 10;
    public static final long SERIAL_NUMBER = 0x000001090000000aL;

    // repeated .android.service.usb.UsbConfigurationProto configurations = 11;
    public static final long CONFIGURATIONS = 0x0000020b0000000bL;

}
