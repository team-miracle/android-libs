// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/usb.proto

package android.service.usb;

/** @hide */
// message UsbInterfaceProto
public final class UsbInterfaceProto {

    // optional int32 id = 1;
    public static final long ID = 0x0000010500000001L;

    // optional int32 alternate_settings = 2;
    public static final long ALTERNATE_SETTINGS = 0x0000010500000002L;

    // optional string name = 3;
    public static final long NAME = 0x0000010900000003L;

    // optional int32 class = 4;
    public static final long CLASS = 0x0000010500000004L;

    // optional int32 subclass = 5;
    public static final long SUBCLASS = 0x0000010500000005L;

    // optional int32 protocol = 6;
    public static final long PROTOCOL = 0x0000010500000006L;

    // repeated .android.service.usb.UsbEndPointProto endpoints = 7;
    public static final long ENDPOINTS = 0x0000020b00000007L;

}

