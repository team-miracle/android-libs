// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/usb.proto

package android.service.usb;

/** @hide */
// message UsbHandlerProto
public final class UsbHandlerProto {

    // enum Function
    public static final int FUNCTION_ADB = 1;
    public static final int FUNCTION_ACCESSORY = 2;
    public static final int FUNCTION_MTP = 4;
    public static final int FUNCTION_MIDI = 8;
    public static final int FUNCTION_PTP = 16;
    public static final int FUNCTION_RNDIS = 32;
    public static final int FUNCTION_AUDIO_SOURCE = 64;

    // repeated .android.service.usb.UsbHandlerProto.Function current_functions = 1;
    public static final long CURRENT_FUNCTIONS = 0x0000020e00000001L;

    // optional bool current_functions_applied = 2;
    public static final long CURRENT_FUNCTIONS_APPLIED = 0x0000010800000002L;

    // repeated .android.service.usb.UsbHandlerProto.Function screen_unlocked_functions = 3;
    public static final long SCREEN_UNLOCKED_FUNCTIONS = 0x0000020e00000003L;

    // optional bool screen_locked = 4;
    public static final long SCREEN_LOCKED = 0x0000010800000004L;

    // optional bool connected = 5;
    public static final long CONNECTED = 0x0000010800000005L;

    // optional bool configured = 6;
    public static final long CONFIGURED = 0x0000010800000006L;

    // optional .android.service.usb.UsbAccessoryProto current_accessory = 7;
    public static final long CURRENT_ACCESSORY = 0x0000010b00000007L;

    // optional bool host_connected = 8;
    public static final long HOST_CONNECTED = 0x0000010800000008L;

    // optional bool source_power = 9;
    public static final long SOURCE_POWER = 0x0000010800000009L;

    // optional bool sink_power = 10;
    public static final long SINK_POWER = 0x000001080000000aL;

    // optional bool usb_charging = 11;
    public static final long USB_CHARGING = 0x000001080000000bL;

    // optional bool hide_usb_notification = 12;
    public static final long HIDE_USB_NOTIFICATION = 0x000001080000000cL;

    // optional bool audio_accessory_connected = 13;
    public static final long AUDIO_ACCESSORY_CONNECTED = 0x000001080000000dL;

    // optional bool adb_enabled = 14;
    public static final long ADB_ENABLED = 0x000001080000000eL;

    // optional string kernel_state = 15;
    public static final long KERNEL_STATE = 0x000001090000000fL;

    // optional string kernel_function_list = 16;
    public static final long KERNEL_FUNCTION_LIST = 0x0000010900000010L;

}

