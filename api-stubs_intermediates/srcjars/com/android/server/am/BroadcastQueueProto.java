// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/activitymanagerservice.proto

package com.android.server.am;

/** @hide */
// message BroadcastQueueProto
public final class BroadcastQueueProto {

    // message BroadcastSummary
    public final class BroadcastSummary {

        // optional .android.content.IntentProto intent = 1;
        public static final long INTENT = 0x0000010b00000001L;

        // optional int64 enqueue_clock_time_ms = 2;
        public static final long ENQUEUE_CLOCK_TIME_MS = 0x0000010300000002L;

        // optional int64 dispatch_clock_time_ms = 3;
        public static final long DISPATCH_CLOCK_TIME_MS = 0x0000010300000003L;

        // optional int64 finish_clock_time_ms = 4;
        public static final long FINISH_CLOCK_TIME_MS = 0x0000010300000004L;

    }

    // optional string queue_name = 1;
    public static final long QUEUE_NAME = 0x0000010900000001L;

    // repeated .com.android.server.am.BroadcastRecordProto parallel_broadcasts = 2;
    public static final long PARALLEL_BROADCASTS = 0x0000020b00000002L;

    // repeated .com.android.server.am.BroadcastRecordProto ordered_broadcasts = 3;
    public static final long ORDERED_BROADCASTS = 0x0000020b00000003L;

    // optional .com.android.server.am.BroadcastRecordProto pending_broadcast = 4;
    public static final long PENDING_BROADCAST = 0x0000010b00000004L;

    // repeated .com.android.server.am.BroadcastRecordProto historical_broadcasts = 5;
    public static final long HISTORICAL_BROADCASTS = 0x0000020b00000005L;

    // repeated .com.android.server.am.BroadcastQueueProto.BroadcastSummary historical_broadcasts_summary = 6;
    public static final long HISTORICAL_BROADCASTS_SUMMARY = 0x0000020b00000006L;

}
