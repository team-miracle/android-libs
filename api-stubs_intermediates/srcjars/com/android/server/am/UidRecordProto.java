// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/activitymanagerservice.proto

package com.android.server.am;

/** @hide */
// message UidRecordProto
public final class UidRecordProto {

    // enum Change
    public static final int CHANGE_GONE = 0;
    public static final int CHANGE_IDLE = 1;
    public static final int CHANGE_ACTIVE = 2;
    public static final int CHANGE_CACHED = 3;
    public static final int CHANGE_UNCACHED = 4;

    // message ProcStateSequence
    public final class ProcStateSequence {

        // optional int64 cururent = 1;
        public static final long CURURENT = 0x0000010300000001L;

        // optional int64 last_network_updated = 2;
        public static final long LAST_NETWORK_UPDATED = 0x0000010300000002L;

        // optional int64 last_dispatched = 3;
        public static final long LAST_DISPATCHED = 0x0000010300000003L;

    }

    // optional int32 uid = 1;
    public static final long UID = 0x0000010500000001L;

    // optional .android.app.ProcessStateEnum current = 2;
    public static final long CURRENT = 0x0000010e00000002L;

    // optional bool ephemeral = 3;
    public static final long EPHEMERAL = 0x0000010800000003L;

    // optional bool fg_services = 4;
    public static final long FG_SERVICES = 0x0000010800000004L;

    // optional bool whilelist = 5;
    public static final long WHILELIST = 0x0000010800000005L;

    // optional .android.util.Duration last_background_time = 6;
    public static final long LAST_BACKGROUND_TIME = 0x0000010b00000006L;

    // optional bool idle = 7;
    public static final long IDLE = 0x0000010800000007L;

    // repeated .com.android.server.am.UidRecordProto.Change last_reported_changes = 8;
    public static final long LAST_REPORTED_CHANGES = 0x0000020e00000008L;

    // optional int32 num_procs = 9;
    public static final long NUM_PROCS = 0x0000010500000009L;

    // optional .com.android.server.am.UidRecordProto.ProcStateSequence network_state_update = 10;
    public static final long NETWORK_STATE_UPDATE = 0x0000010b0000000aL;

}

