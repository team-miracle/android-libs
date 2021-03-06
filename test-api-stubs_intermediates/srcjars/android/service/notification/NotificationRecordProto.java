// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/notification.proto

package android.service.notification;

/** @hide */
// message NotificationRecordProto
public final class NotificationRecordProto {

    // enum State
    public static final int ENQUEUED = 0;
    public static final int POSTED = 1;
    public static final int SNOOZED = 2;

    // optional string key = 1;
    public static final long KEY = 0x0000010900000001L;

    // optional .android.service.notification.NotificationRecordProto.State state = 2;
    public static final long STATE = 0x0000010e00000002L;

    // optional int32 flags = 3;
    public static final long FLAGS = 0x0000010500000003L;

    // optional string channelId = 4;
    public static final long CHANNEL_ID = 0x0000010900000004L;

    // optional string sound = 5;
    public static final long SOUND = 0x0000010900000005L;

    // optional .android.media.AudioAttributesProto audio_attributes = 6;
    public static final long AUDIO_ATTRIBUTES = 0x0000010b00000006L;

    // optional bool can_vibrate = 7;
    public static final long CAN_VIBRATE = 0x0000010800000007L;

    // optional bool can_show_light = 8;
    public static final long CAN_SHOW_LIGHT = 0x0000010800000008L;

    // optional string group_key = 9;
    public static final long GROUP_KEY = 0x0000010900000009L;

    // optional sint32 importance = 10;
    public static final long IMPORTANCE = 0x000001110000000aL;

}

