// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/activitymanagerservice.proto

package com.android.server.am;

/** @hide */
// message ConnectionRecordProto
public final class ConnectionRecordProto {

    // enum Flag
    public static final int AUTO_CREATE = 0;
    public static final int DEBUG_UNBIND = 1;
    public static final int NOT_FG = 2;
    public static final int IMPORTANT_BG = 3;
    public static final int ABOVE_CLIENT = 4;
    public static final int ALLOW_OOM_MANAGEMENT = 5;
    public static final int WAIVE_PRIORITY = 6;
    public static final int IMPORTANT = 7;
    public static final int ADJUST_WITH_ACTIVITY = 8;
    public static final int FG_SERVICE_WHILE_AWAKE = 9;
    public static final int FG_SERVICE = 10;
    public static final int TREAT_LIKE_ACTIVITY = 11;
    public static final int VISIBLE = 12;
    public static final int SHOWING_UI = 13;
    public static final int NOT_VISIBLE = 14;
    public static final int DEAD = 15;

    // optional string hex_hash = 1;
    public static final long HEX_HASH = 0x0000010900000001L;

    // optional int32 user_id = 2;
    public static final long USER_ID = 0x0000010500000002L;

    // repeated .com.android.server.am.ConnectionRecordProto.Flag flags = 3;
    public static final long FLAGS = 0x0000020e00000003L;

    // optional string service_name = 4;
    public static final long SERVICE_NAME = 0x0000010900000004L;

}
