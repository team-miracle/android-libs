// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/jobscheduler.proto

package com.android.server.job;

/** @hide */
// message DataSetProto
public final class DataSetProto {

    // message PackageEntryProto
    public final class PackageEntryProto {

        // message State
        public final class State {

            // optional int64 duration_ms = 1;
            public static final long DURATION_MS = 0x0000010300000001L;

            // optional int32 count = 2;
            public static final long COUNT = 0x0000010500000002L;

        }

        // message StopReasonCount
        public final class StopReasonCount {

            // optional .android.app.job.StopReasonEnum reason = 1;
            public static final long REASON = 0x0000010e00000001L;

            // optional int32 count = 2;
            public static final long COUNT = 0x0000010500000002L;

        }

        // optional int32 uid = 1;
        public static final long UID = 0x0000010500000001L;

        // optional string package_name = 2;
        public static final long PACKAGE_NAME = 0x0000010900000002L;

        // optional .com.android.server.job.DataSetProto.PackageEntryProto.State pending_state = 3;
        public static final long PENDING_STATE = 0x0000010b00000003L;

        // optional .com.android.server.job.DataSetProto.PackageEntryProto.State active_state = 4;
        public static final long ACTIVE_STATE = 0x0000010b00000004L;

        // optional .com.android.server.job.DataSetProto.PackageEntryProto.State active_top_state = 5;
        public static final long ACTIVE_TOP_STATE = 0x0000010b00000005L;

        // optional bool pending = 6;
        public static final long PENDING = 0x0000010800000006L;

        // optional bool active = 7;
        public static final long ACTIVE = 0x0000010800000007L;

        // optional bool active_top = 8;
        public static final long ACTIVE_TOP = 0x0000010800000008L;

        // repeated .com.android.server.job.DataSetProto.PackageEntryProto.StopReasonCount stop_reasons = 9;
        public static final long STOP_REASONS = 0x0000020b00000009L;

    }

    // optional int64 start_clock_time_ms = 1;
    public static final long START_CLOCK_TIME_MS = 0x0000010300000001L;

    // optional int64 elapsed_time_ms = 2;
    public static final long ELAPSED_TIME_MS = 0x0000010300000002L;

    // optional int64 period_ms = 3;
    public static final long PERIOD_MS = 0x0000010300000003L;

    // repeated .com.android.server.job.DataSetProto.PackageEntryProto package_entries = 4;
    public static final long PACKAGE_ENTRIES = 0x0000020b00000004L;

    // optional int32 max_concurrency = 5;
    public static final long MAX_CONCURRENCY = 0x0000010500000005L;

    // optional int32 max_foreground_concurrency = 6;
    public static final long MAX_FOREGROUND_CONCURRENCY = 0x0000010500000006L;

}

