// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/app/notification.proto

package android.app;

/** @hide */
// message NotificationProto
public final class NotificationProto {

    // enum Visibility
    public static final int VISIBILITY_SECRET = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;

    // optional string channel_id = 1;
    public static final long CHANNEL_ID = 0x0000010900000001L;

    // optional bool has_ticker_text = 2;
    public static final long HAS_TICKER_TEXT = 0x0000010800000002L;

    // optional int32 flags = 3;
    public static final long FLAGS = 0x0000010500000003L;

    // optional int32 color = 4;
    public static final long COLOR = 0x0000010500000004L;

    // optional string category = 5;
    public static final long CATEGORY = 0x0000010900000005L;

    // optional string group_key = 6;
    public static final long GROUP_KEY = 0x0000010900000006L;

    // optional string sort_key = 7;
    public static final long SORT_KEY = 0x0000010900000007L;

    // optional int32 action_length = 8;
    public static final long ACTION_LENGTH = 0x0000010500000008L;

    // optional .android.app.NotificationProto.Visibility visibility = 9;
    public static final long VISIBILITY = 0x0000010e00000009L;

    // optional .android.app.NotificationProto public_version = 10;
    public static final long PUBLIC_VERSION = 0x0000010b0000000aL;

}

