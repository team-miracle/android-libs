// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/jobscheduler.proto

package com.android.server.job;

/** @hide */
// message JobPackageHistoryProto
public final class JobPackageHistoryProto {

    // enum Event
    public static final int UNKNOWN = 0;
    public static final int START_JOB = 1;
    public static final int STOP_JOB = 2;
    public static final int START_PERIODIC_JOB = 3;
    public static final int STOP_PERIODIC_JOB = 4;

    // message HistoryEvent
    public final class HistoryEvent {

        // optional .com.android.server.job.JobPackageHistoryProto.Event event = 1;
        public static final long EVENT = 0x0000010e00000001L;

        // optional int64 time_since_event_ms = 2;
        public static final long TIME_SINCE_EVENT_MS = 0x0000010300000002L;

        // optional int32 uid = 3;
        public static final long UID = 0x0000010500000003L;

        // optional int32 job_id = 4;
        public static final long JOB_ID = 0x0000010500000004L;

        // optional string tag = 5;
        public static final long TAG = 0x0000010900000005L;

        // optional .android.app.job.StopReasonEnum stop_reason = 6;
        public static final long STOP_REASON = 0x0000010e00000006L;

    }

    // repeated .com.android.server.job.JobPackageHistoryProto.HistoryEvent history_event = 1;
    public static final long HISTORY_EVENT = 0x0000020b00000001L;

}

